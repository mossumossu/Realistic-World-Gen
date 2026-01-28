# Climate Bands Implementation

## Overview
Z-coordinate based climate bands that create semi-realistic latitude-based biome distribution. The world has symmetric climate zones radiating from spawn (0,0) as the equator.

## Status
**Implemented** - Build compiles successfully. Feature is disabled by default for backward compatibility.

## Band Layout (Symmetric from Z=0)
```
SNOW <- COLD <- HOT <- WET (0,0) -> HOT -> COLD -> SNOW
        |        |       |          |       |
    -17500   -7500   -2500   0   +2500  +7500  +17500
```

With default settings:
- **WET (tropical)**: Z = -2500 to +2500 (5,000 blocks total, centered at spawn)
- **HOT (savanna/desert)**: 5,000 blocks each side (Z = -7500 to -2500, and +2500 to +7500)
- **COLD (temperate)**: 10,000 blocks each side (Z = -17500 to -7500, and +7500 to +17500)
- **SNOW (polar)**: 5,000+ blocks (extends to world edge beyond cold zone)

## Configuration Options

All settings are in the `Climate Bands` config category:

| Setting | Default | Range | Description |
|---------|---------|-------|-------------|
| `Enable Climate Bands` | false | - | Master toggle for the feature |
| `Wet Band Size` | 5000 | 1000-50000 | Size of tropical zone centered at Z=0 |
| `Hot Band Size` | 5000 | 1000-50000 | Size of hot zone on each side of wet |
| `Cold Band Size` | 10000 | 1000-50000 | Size of cold zone on each side of hot |
| `Snow Band Size` | 5000 | 1000-50000 | Minimum size of polar zone |
| `Transition Width` | 500 | 0-2000 | Blend zone width between bands (0 = sharp) |

## Files Modified

### `src/main/java/rwg/config/ConfigRWG.java`
- Added 6 static fields for climate band settings (lines 29-35)
- Added config loading with descriptions in `init()` method (lines 230-269)

### `src/main/java/rwg/world/ChunkManagerRealistic.java`
- Added `getClimateBandCategoryNoise(int z, float existingNoise)` method (lines 199-287)
- Integrated into `getBiomeDataAt()` after base noise calculation (lines 413-414)

## Algorithm Details

### Category Noise Mapping
The existing biome system uses noise values 0.0-1.0 mapped to categories:
- SNOW: 0.0 - 0.25 (midpoint: 0.125)
- COLD: 0.25 - 0.50 (midpoint: 0.375)
- HOT: 0.50 - 0.75 (midpoint: 0.625)
- WET: 0.75 - 1.0 (midpoint: 0.875)

The climate band system overrides the noise value based on Z-position, returning the midpoint value for each zone.

### Transition Blending
When `transitionWidth > 0`, linear interpolation creates smooth transitions between zones. At band boundaries, the category value smoothly transitions over the configured width.

### Noise Variation
A small noise variation (+/- 0.05) is applied to the category value for natural feel, using the original noise as a seed. This keeps biome selection within the correct category while adding variety.

## Testing

### In-Game Verification
1. Set `enableClimateBands=true` in config
2. Create new world
3. Teleport to test coordinates:
   - `/tp @p 0 100 0` - Should be WET biomes
   - `/tp @p 0 100 -5000` - Should be HOT biomes
   - `/tp @p 0 100 -15000` - Should be COLD biomes
   - `/tp @p 0 100 -25000` - Should be SNOW biomes
   - `/tp @p 0 100 5000` - Should be HOT (symmetric)
4. Walk across transitions to verify smooth blending
5. Check F3 debug screen for correct biome names

### Edge Cases Handled
- **Disabled categories**: If user disables a category (e.g., `enableHotBiomes=false`), the existing `calculateThresholds()` redistributes biomes
- **Small biomes**: Small biome spawning happens before category selection, unaffected by climate bands
- **Rivers/Oceans**: Automatically inherit climate from surrounding terrain

## Future Improvements (Not Implemented)

Potential enhancements for future work:
- Per-world seed offset for climate band center
- X-axis climate variation (east-west temperature gradients)
- Altitude-based temperature modifier
- Ocean biome climate integration
- Config GUI support
