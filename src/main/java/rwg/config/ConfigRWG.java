package rwg.config;

import net.minecraftforge.common.config.Configuration;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import rwg.biomes.realistic.RealisticBiomeBase;

public class ConfigRWG {

    public static Configuration config;
    public static int[] biomeIDs = new int[25];

    public static boolean generateEmeralds = true;
    public static boolean enableCobblestoneBoulders = true;
    public static boolean generateCaves = true;
    public static boolean generateMineshafts = true;
    public static boolean generateVillages = true;
    public static boolean generateUndergroundLakes = true;
    public static boolean generateUndergroundLavaLakes = true;
    public static boolean generateLargeThaumcraftBiomes = false;

    // Biome Category Toggles
    public static boolean enableSnowBiomes = true;
    public static boolean enableColdBiomes = true;
    public static boolean enableHotBiomes = true;
    public static boolean enableWetBiomes = true;
    public static boolean enableSmallBiomes = true;

    // Core Biomes - Snow
    public static boolean biomePolar = true;
    public static boolean biomeSnowHills = true;
    public static boolean biomeSnowRivers = true;
    public static boolean biomeSnowLakes = true;
    public static boolean biomeRedwoodSnow = true;

    // Core Biomes - Cold
    public static boolean biomeTundraHills = true;
    public static boolean biomeTundraPlains = true;
    public static boolean biomeTaigaHills = true;
    public static boolean biomeTaigaPlains = true;
    public static boolean biomeRedwood = true;
    public static boolean biomeDarkRedwood = true;
    public static boolean biomeDarkRedwoodPlains = true;
    public static boolean biomeWoodHills = true;
    public static boolean biomeWoodMountains = true;

    // Core Biomes - Hot
    public static boolean biomeDuneValleyForest = true;
    public static boolean biomeSavanna = true;
    public static boolean biomeSavannaForest = true;
    public static boolean biomeSavannaDunes = true;
    public static boolean biomeStoneMountains = true;
    public static boolean biomeStoneMountainsCactus = true;
    public static boolean biomeHotForest = true;
    public static boolean biomeHotRedwood = true;
    public static boolean biomeCanyonForest = true;
    public static boolean biomeMesaPlains = true;
    public static boolean biomeDesert = true;
    public static boolean biomeDesertMountains = true;
    public static boolean biomeDuneValley = true;
    public static boolean biomeOasis = true;
    public static boolean biomeRedDesertMountains = true;
    public static boolean biomeRedDesertOasis = true;
    public static boolean biomeCanyon = true;
    public static boolean biomeMesa = true;

    // BOP Biomes - Snow
    public static boolean bopSnowyConiferousForest = true;
    public static boolean bopFrostForest = true;
    public static boolean bopTundra = true;

    // BOP Biomes - Cold
    public static boolean bopBorealForest = true;
    public static boolean bopCherryBlossomGrove = true;
    public static boolean bopConiferousForest = true;
    public static boolean bopDeadForest = true;
    public static boolean bopGarden = true;
    public static boolean bopGrove = true;
    public static boolean bopHighland = true;
    public static boolean bopLavenderFields = true;
    public static boolean bopMapleWoods = true;
    public static boolean bopMeadow = true;
    public static boolean bopRedwoodForest = true;
    public static boolean bopSeasonalForest = true;
    public static boolean bopShield = true;
    public static boolean bopWoodland = true;

    // BOP Biomes - Hot
    public static boolean bopBog = true;
    public static boolean bopBrushland = true;
    public static boolean bopCanyon = true;
    public static boolean bopChaparral = true;
    public static boolean bopDeciduousForest = true;
    public static boolean bopFen = true;
    public static boolean bopHeathland = true;
    public static boolean bopJadeCliffs = true;
    public static boolean bopLushDesert = true;
    public static boolean bopMountain = true;
    public static boolean bopOutback = true;
    public static boolean bopPrairie = true;
    public static boolean bopShrubland = true;

    // BOP Biomes - Wet
    public static boolean bopBambooForest = true;
    public static boolean bopBayou = true;
    public static boolean bopDeadSwamp = true;
    public static boolean bopFungiForest = true;
    public static boolean bopLushSwamp = true;
    public static boolean bopMysticGrove = true;
    public static boolean bopRainforest = true;
    public static boolean bopSacredSprings = true;
    public static boolean bopSludgepit = true;
    public static boolean bopTemperateRainforest = true;
    public static boolean bopTropicalRainforest = true;
    public static boolean bopWetland = true;

    // EBXL Biomes - Snow
    public static boolean ebxlAlpine = true;
    public static boolean ebxlGlacier = true;
    public static boolean ebxlIcewasteland = true;
    public static boolean ebxlMountaintaiga = true;
    public static boolean ebxlSnowforest = true;
    public static boolean ebxlSnowyrainforest = true;

    // EBXL Biomes - Cold
    public static boolean ebxlAutumnwoods = true;
    public static boolean ebxlBirchforest = true;
    public static boolean ebxlForestedisland = true;
    public static boolean ebxlForestedhills = true;
    public static boolean ebxlGreenhills = true;
    public static boolean ebxlMeadow = true;
    public static boolean ebxlPineforest = true;
    public static boolean ebxlRedwoodforest = true;
    public static boolean ebxlShrubland = true;
    public static boolean ebxlTundra = true;
    public static boolean ebxlWoodlands = true;

    // EBXL Biomes - Hot
    public static boolean ebxlMountaindesert = true;
    public static boolean ebxlMountainridge = true;
    public static boolean ebxlSavanna = true;
    public static boolean ebxlWasteland = true;

    // EBXL Biomes - Wet
    public static boolean ebxlExtremejungle = true;
    public static boolean ebxlGreenswamp = true;
    public static boolean ebxlMarsh = true;
    public static boolean ebxlMinijungle = true;
    public static boolean ebxlRainforest = true;
    public static boolean ebxlRedwoodlush = true;
    public static boolean ebxlTemperaterainforest = true;

    // TC Biomes
    public static boolean tcTaintedLand = true;
    public static boolean tcMagicalForest = true;

    // CC Biomes
    public static boolean ccEnderForest = true;
    public static boolean ccRainbowForest = true;
    public static boolean ccLuminousCliffs = true;
    public static boolean ccLuminousCliffsShores = true;

    public static void init(FMLPreInitializationEvent event) {
        config = new Configuration(event.getSuggestedConfigurationFile());
        for (int c = 0; c < biomeIDs.length; c++) {
            biomeIDs[c] = 200 + c;
        }

        try {
            config.load();
            renameOldProperties();
            biomeIDs[0] = config.get("biome ids", "00 Ice River", 200, "Ice River").getInt();
            biomeIDs[1] = config.get("biome ids", "01 Cold River", 201, "Cold River").getInt();
            biomeIDs[2] = config.get("biome ids", "02 Temperate River", 202, "Temperate River").getInt();
            biomeIDs[3] = config.get("biome ids", "03 Hot River", 203, "Hot River").getInt();
            biomeIDs[4] = config.get("biome ids", "04 Wet River", 204, "Wet River").getInt();
            biomeIDs[5] = config.get("biome ids", "05 River Oasis", 205, "River Oasis").getInt();
            biomeIDs[6] = config.get("biome ids", "06 Ice Ocean", 206, "Ice Ocean").getInt();
            biomeIDs[7] = config.get("biome ids", "07 Cold Ocean", 207, "Cold Ocean").getInt();
            biomeIDs[8] = config.get("biome ids", "08 Temperate Ocean", 208, "Temperate Ocean").getInt();
            biomeIDs[9] = config.get("biome ids", "09 Hot Ocean", 209, "Hot Ocean").getInt();
            biomeIDs[10] = config.get("biome ids", "10 Wet Ocean", 210, "Wet Ocean").getInt();
            biomeIDs[11] = config.get("biome ids", "11 Ocean Oasis", 211, "Ocean Oasis").getInt();
            biomeIDs[12] = config.get("biome ids", "12 Snow Desert", 212, "Snow Desert").getInt();
            biomeIDs[13] = config.get("biome ids", "13 Snow Forest", 213, "Snow Forest").getInt();
            biomeIDs[14] = config.get("biome ids", "14 Cold Plains", 214, "Cold Plains").getInt();
            biomeIDs[15] = config.get("biome ids", "15 Cold Forest", 215, "Cold Forest").getInt();
            biomeIDs[16] = config.get("biome ids", "16 Hot Plains", 216, "Hot Plains").getInt();
            biomeIDs[17] = config.get("biome ids", "17 Hot Forest", 217, "Hot Forest").getInt();
            biomeIDs[18] = config.get("biome ids", "18 Hot Desert", 218, "Hot Desert").getInt();
            biomeIDs[19] = config.get("biome ids", "19 Plains (RWG)", 219, "Plains").getInt();
            biomeIDs[20] = config.get("biome ids", "20 Tropical Island", 220, "Tropical Island").getInt();
            biomeIDs[21] = config.get("biome ids", "21 Redwood", 221, "Redwood").getInt();
            biomeIDs[22] = config.get("biome ids", "22 Jungle (RWG)", 222, "Jungle").getInt();
            biomeIDs[23] = config.get("biome ids", "23 Oasis", 223, "Oasis").getInt();
            biomeIDs[24] = config.get("biome ids", "24 Temperate Forest", 224, "Temperate Forest").getInt();

            generateEmeralds = config.getBoolean("Generate Emeralds", "Settings", true, "");
            enableCobblestoneBoulders = config.getBoolean("Enable Cobblestone Boulders", "Settings", true, "");
            generateCaves = config.getBoolean("Generate Caves", "Settings", true, "");
            generateMineshafts = config.getBoolean("Generate Mineshafts", "Settings", true, "");
            generateVillages = config.getBoolean("Generate Villages", "Settings", true, "");
            generateUndergroundLakes = config.getBoolean("Generate Underground Lakes", "Settings", true, "");
            generateUndergroundLavaLakes = config.getBoolean("Generate Underground Lava Lakes", "Settings", true, "");
            generateLargeThaumcraftBiomes = config
                    .getBoolean("Generate large Thaumcraft biomes", "Settings", false, "");

            // Biome Category Toggles
            enableSnowBiomes = config.getBoolean("Enable Snow Biomes", "Biome Categories", true, "");
            enableColdBiomes = config.getBoolean("Enable Cold Biomes", "Biome Categories", true, "");
            enableHotBiomes = config.getBoolean("Enable Hot Biomes", "Biome Categories", true, "");
            enableWetBiomes = config.getBoolean("Enable Wet Biomes", "Biome Categories", true, "");
            enableSmallBiomes = config.getBoolean("Enable Small Biomes", "Biome Categories", true, "");

            // Core Biomes - Snow
            biomePolar = config.getBoolean("Polar", "Biomes - Snow", true, "");
            biomeSnowHills = config.getBoolean("Snow Hills", "Biomes - Snow", true, "");
            biomeSnowRivers = config.getBoolean("Snow Rivers", "Biomes - Snow", true, "");
            biomeSnowLakes = config.getBoolean("Snow Lakes", "Biomes - Snow", true, "");
            biomeRedwoodSnow = config.getBoolean("Redwood Snow", "Biomes - Snow", true, "");

            // Core Biomes - Cold
            biomeTundraHills = config.getBoolean("Tundra Hills", "Biomes - Cold", true, "");
            biomeTundraPlains = config.getBoolean("Tundra Plains", "Biomes - Cold", true, "");
            biomeTaigaHills = config.getBoolean("Taiga Hills", "Biomes - Cold", true, "");
            biomeTaigaPlains = config.getBoolean("Taiga Plains", "Biomes - Cold", true, "");
            biomeRedwood = config.getBoolean("Redwood", "Biomes - Cold", true, "");
            biomeDarkRedwood = config.getBoolean("Dark Redwood", "Biomes - Cold", true, "");
            biomeDarkRedwoodPlains = config.getBoolean("Dark Redwood Plains", "Biomes - Cold", true, "");
            biomeWoodHills = config.getBoolean("Wood Hills", "Biomes - Cold", true, "");
            biomeWoodMountains = config.getBoolean("Wood Mountains", "Biomes - Cold", true, "");

            // Core Biomes - Hot
            biomeDuneValleyForest = config.getBoolean("Dune Valley Forest", "Biomes - Hot", true, "");
            biomeSavanna = config.getBoolean("Savanna", "Biomes - Hot", true, "");
            biomeSavannaForest = config.getBoolean("Savanna Forest", "Biomes - Hot", true, "");
            biomeSavannaDunes = config.getBoolean("Savanna Dunes", "Biomes - Hot", true, "");
            biomeStoneMountains = config.getBoolean("Stone Mountains", "Biomes - Hot", true, "");
            biomeStoneMountainsCactus = config.getBoolean("Stone Mountains Cactus", "Biomes - Hot", true, "");
            biomeHotForest = config.getBoolean("Hot Forest", "Biomes - Hot", true, "");
            biomeHotRedwood = config.getBoolean("Hot Redwood", "Biomes - Hot", true, "");
            biomeCanyonForest = config.getBoolean("Canyon Forest", "Biomes - Hot", true, "");
            biomeMesaPlains = config.getBoolean("Mesa Plains", "Biomes - Hot", true, "");
            biomeDesert = config.getBoolean("Desert", "Biomes - Hot", true, "");
            biomeDesertMountains = config.getBoolean("Desert Mountains", "Biomes - Hot", true, "");
            biomeDuneValley = config.getBoolean("Dune Valley", "Biomes - Hot", true, "");
            biomeOasis = config.getBoolean("Oasis", "Biomes - Hot", true, "");
            biomeRedDesertMountains = config.getBoolean("Red Desert Mountains", "Biomes - Hot", true, "");
            biomeRedDesertOasis = config.getBoolean("Red Desert Oasis", "Biomes - Hot", true, "");
            biomeCanyon = config.getBoolean("Canyon", "Biomes - Hot", true, "");
            biomeMesa = config.getBoolean("Mesa", "Biomes - Hot", true, "");

            // BOP Biomes - Snow
            bopSnowyConiferousForest = config.getBoolean("Snowy Coniferous Forest", "BOP Biomes - Snow", true, "");
            bopFrostForest = config.getBoolean("Frost Forest", "BOP Biomes - Snow", true, "");
            bopTundra = config.getBoolean("Tundra", "BOP Biomes - Snow", true, "");

            // BOP Biomes - Cold
            bopBorealForest = config.getBoolean("Boreal Forest", "BOP Biomes - Cold", true, "");
            bopCherryBlossomGrove = config.getBoolean("Cherry Blossom Grove", "BOP Biomes - Cold", true, "");
            bopConiferousForest = config.getBoolean("Coniferous Forest", "BOP Biomes - Cold", true, "");
            bopDeadForest = config.getBoolean("Dead Forest", "BOP Biomes - Cold", true, "");
            bopGarden = config.getBoolean("Garden", "BOP Biomes - Cold", true, "");
            bopGrove = config.getBoolean("Grove", "BOP Biomes - Cold", true, "");
            bopHighland = config.getBoolean("Highland", "BOP Biomes - Cold", true, "");
            bopLavenderFields = config.getBoolean("Lavender Fields", "BOP Biomes - Cold", true, "");
            bopMapleWoods = config.getBoolean("Maple Woods", "BOP Biomes - Cold", true, "");
            bopMeadow = config.getBoolean("Meadow", "BOP Biomes - Cold", true, "");
            bopRedwoodForest = config.getBoolean("Redwood Forest", "BOP Biomes - Cold", true, "");
            bopSeasonalForest = config.getBoolean("Seasonal Forest", "BOP Biomes - Cold", true, "");
            bopShield = config.getBoolean("Shield", "BOP Biomes - Cold", true, "");
            bopWoodland = config.getBoolean("Woodland", "BOP Biomes - Cold", true, "");

            // BOP Biomes - Hot
            bopBog = config.getBoolean("Bog", "BOP Biomes - Hot", true, "");
            bopBrushland = config.getBoolean("Brushland", "BOP Biomes - Hot", true, "");
            bopCanyon = config.getBoolean("Canyon", "BOP Biomes - Hot", true, "");
            bopChaparral = config.getBoolean("Chaparral", "BOP Biomes - Hot", true, "");
            bopDeciduousForest = config.getBoolean("Deciduous Forest", "BOP Biomes - Hot", true, "");
            bopFen = config.getBoolean("Fen", "BOP Biomes - Hot", true, "");
            bopHeathland = config.getBoolean("Heathland", "BOP Biomes - Hot", true, "");
            bopJadeCliffs = config.getBoolean("Jade Cliffs", "BOP Biomes - Hot", true, "");
            bopLushDesert = config.getBoolean("Lush Desert", "BOP Biomes - Hot", true, "");
            bopMountain = config.getBoolean("Mountain", "BOP Biomes - Hot", true, "");
            bopOutback = config.getBoolean("Outback", "BOP Biomes - Hot", true, "");
            bopPrairie = config.getBoolean("Prairie", "BOP Biomes - Hot", true, "");
            bopShrubland = config.getBoolean("Shrubland", "BOP Biomes - Hot", true, "");

            // BOP Biomes - Wet
            bopBambooForest = config.getBoolean("Bamboo Forest", "BOP Biomes - Wet", true, "");
            bopBayou = config.getBoolean("Bayou", "BOP Biomes - Wet", true, "");
            bopDeadSwamp = config.getBoolean("Dead Swamp", "BOP Biomes - Wet", true, "");
            bopFungiForest = config.getBoolean("Fungi Forest", "BOP Biomes - Wet", true, "");
            bopLushSwamp = config.getBoolean("Lush Swamp", "BOP Biomes - Wet", true, "");
            bopMysticGrove = config.getBoolean("Mystic Grove", "BOP Biomes - Wet", true, "");
            bopRainforest = config.getBoolean("Rainforest", "BOP Biomes - Wet", true, "");
            bopSacredSprings = config.getBoolean("Sacred Springs", "BOP Biomes - Wet", true, "");
            bopSludgepit = config.getBoolean("Sludgepit", "BOP Biomes - Wet", true, "");
            bopTemperateRainforest = config.getBoolean("Temperate Rainforest", "BOP Biomes - Wet", true, "");
            bopTropicalRainforest = config.getBoolean("Tropical Rainforest", "BOP Biomes - Wet", true, "");
            bopWetland = config.getBoolean("Wetland", "BOP Biomes - Wet", true, "");

            // EBXL Biomes - Snow
            ebxlAlpine = config.getBoolean("Alpine", "EBXL Biomes - Snow", true, "");
            ebxlGlacier = config.getBoolean("Glacier", "EBXL Biomes - Snow", true, "");
            ebxlIcewasteland = config.getBoolean("Ice Wasteland", "EBXL Biomes - Snow", true, "");
            ebxlMountaintaiga = config.getBoolean("Mountain Taiga", "EBXL Biomes - Snow", true, "");
            ebxlSnowforest = config.getBoolean("Snow Forest", "EBXL Biomes - Snow", true, "");
            ebxlSnowyrainforest = config.getBoolean("Snowy Rainforest", "EBXL Biomes - Snow", true, "");

            // EBXL Biomes - Cold
            ebxlAutumnwoods = config.getBoolean("Autumn Woods", "EBXL Biomes - Cold", true, "");
            ebxlBirchforest = config.getBoolean("Birch Forest", "EBXL Biomes - Cold", true, "");
            ebxlForestedisland = config.getBoolean("Forested Island", "EBXL Biomes - Cold", true, "");
            ebxlForestedhills = config.getBoolean("Forested Hills", "EBXL Biomes - Cold", true, "");
            ebxlGreenhills = config.getBoolean("Green Hills", "EBXL Biomes - Cold", true, "");
            ebxlMeadow = config.getBoolean("Meadow", "EBXL Biomes - Cold", true, "");
            ebxlPineforest = config.getBoolean("Pine Forest", "EBXL Biomes - Cold", true, "");
            ebxlRedwoodforest = config.getBoolean("Redwood Forest", "EBXL Biomes - Cold", true, "");
            ebxlShrubland = config.getBoolean("Shrubland", "EBXL Biomes - Cold", true, "");
            ebxlTundra = config.getBoolean("Tundra", "EBXL Biomes - Cold", true, "");
            ebxlWoodlands = config.getBoolean("Woodlands", "EBXL Biomes - Cold", true, "");

            // EBXL Biomes - Hot
            ebxlMountaindesert = config.getBoolean("Mountain Desert", "EBXL Biomes - Hot", true, "");
            ebxlMountainridge = config.getBoolean("Mountain Ridge", "EBXL Biomes - Hot", true, "");
            ebxlSavanna = config.getBoolean("Savanna", "EBXL Biomes - Hot", true, "");
            ebxlWasteland = config.getBoolean("Wasteland", "EBXL Biomes - Hot", true, "");

            // EBXL Biomes - Wet
            ebxlExtremejungle = config.getBoolean("Extreme Jungle", "EBXL Biomes - Wet", true, "");
            ebxlGreenswamp = config.getBoolean("Green Swamp", "EBXL Biomes - Wet", true, "");
            ebxlMarsh = config.getBoolean("Marsh", "EBXL Biomes - Wet", true, "");
            ebxlMinijungle = config.getBoolean("Mini Jungle", "EBXL Biomes - Wet", true, "");
            ebxlRainforest = config.getBoolean("Rainforest", "EBXL Biomes - Wet", true, "");
            ebxlRedwoodlush = config.getBoolean("Redwood Lush", "EBXL Biomes - Wet", true, "");
            ebxlTemperaterainforest = config.getBoolean("Temperate Rainforest", "EBXL Biomes - Wet", true, "");

            // TC Biomes
            tcTaintedLand = config.getBoolean("Tainted Land", "TC Biomes", true, "");
            tcMagicalForest = config.getBoolean("Magical Forest", "TC Biomes", true, "");

            // CC Biomes
            ccEnderForest = config.getBoolean("Ender Forest", "CC Biomes", true, "");
            ccRainbowForest = config.getBoolean("Rainbow Forest", "CC Biomes", true, "");
            ccLuminousCliffs = config.getBoolean("Luminous Cliffs", "CC Biomes", true, "");
            ccLuminousCliffsShores = config.getBoolean("Luminous Cliffs Shores", "CC Biomes", true, "");

        } catch (Exception e) {
            for (int c = 0; c < biomeIDs.length; c++) {
                biomeIDs[c] = 200 + c;
            }
        } finally {
            if (config.hasChanged()) {
                config.save();
            }
        }
    }

    private static void renameOldProperties() {
        config.renameProperty("biome ids", "00 rwg_riverIce", "00 Ice River");
        config.renameProperty("biome ids", "01 rwg_riverCold", "01 Cold River");
        config.renameProperty("biome ids", "02 rwg_riverTemperate", "02 Temperate River");
        config.renameProperty("biome ids", "03 rwg_riverHot", "03 Hot River");
        config.renameProperty("biome ids", "04 rwg_riverWet", "04 Wet River");
        config.renameProperty("biome ids", "05 rwg_riverOasis", "05 River Oasis");
        config.renameProperty("biome ids", "06 rwg_oceanIce", "06 Ice Ocean");
        config.renameProperty("biome ids", "07 rwg_oceanCold", "07 Cold Ocean");
        config.renameProperty("biome ids", "08 rwg_oceanTemperate", "08 Temperate Ocean");
        config.renameProperty("biome ids", "09 rwg_oceanHot", "09 Hot Ocean");
        config.renameProperty("biome ids", "10 rwg_oceanWet", "10 Wet Ocean");
        config.renameProperty("biome ids", "11 rwg_oceanOasis", "11 Ocean Oasis");
        config.renameProperty("biome ids", "12 rwg_snowDesert", "12 Snow Desert");
        config.renameProperty("biome ids", "13 rwg_snowForest", "13 Snow Forest");
        config.renameProperty("biome ids", "14 rwg_coldPlains", "14 Cold Plains");
        config.renameProperty("biome ids", "15 rwg_coldForest", "15 Cold Forest");
        config.renameProperty("biome ids", "16 rwg_hotPlains", "16 Hot Plains");
        config.renameProperty("biome ids", "17 rwg_hotForest", "17 Hot Forest");
        config.renameProperty("biome ids", "18 rwg_hotDesert", "18 Hot Desert");
        config.renameProperty("biome ids", "19 rwg_plains", "19 Plains (RWG)");
        config.renameProperty("biome ids", "20 rwg_tropical", "20 Tropical Island");
        config.renameProperty("biome ids", "21 rwg_redwood", "21 Redwood");
        config.renameProperty("biome ids", "22 rwg_jungle", "22 Jungle (RWG)");
        config.renameProperty("biome ids", "23 rwg_oasis", "23 Oasis");
        config.renameProperty("biome ids", "24 rwg_temperateForest", "24 Temperate Forest");
    }

    public static boolean isBiomeEnabled(RealisticBiomeBase biome) {
        // Core Snow biomes
        if (biome == RealisticBiomeBase.polar) return biomePolar;
        if (biome == RealisticBiomeBase.snowHills) return biomeSnowHills;
        if (biome == RealisticBiomeBase.snowRivers) return biomeSnowRivers;
        if (biome == RealisticBiomeBase.snowLakes) return biomeSnowLakes;
        if (biome == RealisticBiomeBase.redwoodSnow) return biomeRedwoodSnow;

        // Core Cold biomes
        if (biome == RealisticBiomeBase.tundraHills) return biomeTundraHills;
        if (biome == RealisticBiomeBase.tundraPlains) return biomeTundraPlains;
        if (biome == RealisticBiomeBase.taigaHills) return biomeTaigaHills;
        if (biome == RealisticBiomeBase.taigaPlains) return biomeTaigaPlains;
        if (biome == RealisticBiomeBase.redwood) return biomeRedwood;
        if (biome == RealisticBiomeBase.darkRedwood) return biomeDarkRedwood;
        if (biome == RealisticBiomeBase.darkRedwoodPlains) return biomeDarkRedwoodPlains;
        if (biome == RealisticBiomeBase.woodhills) return biomeWoodHills;
        if (biome == RealisticBiomeBase.woodmountains) return biomeWoodMountains;

        // Core Hot biomes
        if (biome == RealisticBiomeBase.duneValleyForest) return biomeDuneValleyForest;
        if (biome == RealisticBiomeBase.savanna) return biomeSavanna;
        if (biome == RealisticBiomeBase.savannaForest) return biomeSavannaForest;
        if (biome == RealisticBiomeBase.savannaDunes) return biomeSavannaDunes;
        if (biome == RealisticBiomeBase.stoneMountains) return biomeStoneMountains;
        if (biome == RealisticBiomeBase.stoneMountainsCactus) return biomeStoneMountainsCactus;
        if (biome == RealisticBiomeBase.hotForest) return biomeHotForest;
        if (biome == RealisticBiomeBase.hotRedwood) return biomeHotRedwood;
        if (biome == RealisticBiomeBase.canyonForest) return biomeCanyonForest;
        if (biome == RealisticBiomeBase.mesaPlains) return biomeMesaPlains;
        if (biome == RealisticBiomeBase.desert) return biomeDesert;
        if (biome == RealisticBiomeBase.desertMountains) return biomeDesertMountains;
        if (biome == RealisticBiomeBase.duneValley) return biomeDuneValley;
        if (biome == RealisticBiomeBase.oasis) return biomeOasis;
        if (biome == RealisticBiomeBase.redDesertMountains) return biomeRedDesertMountains;
        if (biome == RealisticBiomeBase.redDesertOasis) return biomeRedDesertOasis;
        if (biome == RealisticBiomeBase.canyon) return biomeCanyon;
        if (biome == RealisticBiomeBase.mesa) return biomeMesa;

        // Default to enabled for any biomes not explicitly listed (mod biomes handled separately)
        return true;
    }

    public static boolean isModBiomeEnabled(String biomeName) {
        switch (biomeName) {
            // BOP Snow
            case "Snowy Coniferous Forest":
                return bopSnowyConiferousForest;
            case "Frost Forest":
                return bopFrostForest;
            case "Tundra":
                return bopTundra;

            // BOP Cold
            case "Boreal Forest":
                return bopBorealForest;
            case "Cherry Blossom Grove":
                return bopCherryBlossomGrove;
            case "Coniferous Forest":
                return bopConiferousForest;
            case "Dead Forest":
                return bopDeadForest;
            case "Garden":
                return bopGarden;
            case "Grove":
                return bopGrove;
            case "Highland":
                return bopHighland;
            case "Lavender Fields":
                return bopLavenderFields;
            case "Maple Woods":
                return bopMapleWoods;
            case "Meadow":
                return bopMeadow;
            case "Redwood Forest":
                return bopRedwoodForest;
            case "Seasonal Forest":
                return bopSeasonalForest;
            case "Shield":
                return bopShield;
            case "Woodland":
                return bopWoodland;

            // BOP Hot
            case "Bog":
                return bopBog;
            case "Brushland":
                return bopBrushland;
            case "Canyon":
                return bopCanyon;
            case "Chaparral":
                return bopChaparral;
            case "Deciduous Forest":
                return bopDeciduousForest;
            case "Fen":
                return bopFen;
            case "Heathland":
                return bopHeathland;
            case "Jade Cliffs":
                return bopJadeCliffs;
            case "Lush Desert":
                return bopLushDesert;
            case "Mountain":
                return bopMountain;
            case "Outback":
                return bopOutback;
            case "Prairie":
                return bopPrairie;
            case "Shrubland":
                return bopShrubland;

            // BOP Wet
            case "Bamboo Forest":
                return bopBambooForest;
            case "Bayou":
                return bopBayou;
            case "Dead Swamp":
                return bopDeadSwamp;
            case "Fungi Forest":
                return bopFungiForest;
            case "Lush Swamp":
                return bopLushSwamp;
            case "Mystic Grove":
                return bopMysticGrove;
            case "Rainforest":
                return bopRainforest;
            case "Sacred Springs":
                return bopSacredSprings;
            case "Sludgepit":
                return bopSludgepit;
            case "Temperate Rainforest":
                return bopTemperateRainforest;
            case "Tropical Rainforest":
                return bopTropicalRainforest;
            case "Wetland":
                return bopWetland;

            // EBXL Snow
            case "Alpine":
                return ebxlAlpine;
            case "Glacier":
                return ebxlGlacier;
            case "Ice Wasteland":
                return ebxlIcewasteland;
            case "Mountain Taiga":
                return ebxlMountaintaiga;
            case "Snow Forest":
                return ebxlSnowforest;
            case "Snowy Rainforest":
                return ebxlSnowyrainforest;

            // EBXL Cold
            case "Autumn Woods":
                return ebxlAutumnwoods;
            case "Birch Forest":
                return ebxlBirchforest;
            case "Forested Island":
                return ebxlForestedisland;
            case "Forested Hills":
                return ebxlForestedhills;
            case "Green Hills":
                return ebxlGreenhills;
            case "Meadow EBXL":
                return ebxlMeadow;
            case "Pine Forest":
                return ebxlPineforest;
            case "Redwood Forest EBXL":
                return ebxlRedwoodforest;
            case "Shrubland EBXL":
                return ebxlShrubland;
            case "Tundra EBXL":
                return ebxlTundra;
            case "Woodlands":
                return ebxlWoodlands;

            // EBXL Hot
            case "Mountain Desert":
                return ebxlMountaindesert;
            case "Mountain Ridge":
                return ebxlMountainridge;
            case "Savanna":
                return ebxlSavanna;
            case "Wasteland":
                return ebxlWasteland;

            // EBXL Wet
            case "Extreme Jungle":
                return ebxlExtremejungle;
            case "Green Swamp":
                return ebxlGreenswamp;
            case "Marsh":
                return ebxlMarsh;
            case "Mini Jungle":
                return ebxlMinijungle;
            case "Rainforest EBXL":
                return ebxlRainforest;
            case "Redwood Lush":
                return ebxlRedwoodlush;
            case "Temperate Rainforest EBXL":
                return ebxlTemperaterainforest;

            // TC
            case "Tainted Land":
                return tcTaintedLand;
            case "Magical Forest":
                return tcMagicalForest;

            // CC
            case "Ender Forest":
                return ccEnderForest;
            case "Rainbow Forest":
                return ccRainbowForest;
            case "Luminous Cliffs":
                return ccLuminousCliffs;
            case "Luminous Cliffs Shores":
                return ccLuminousCliffsShores;

            // Default to enabled for unknown biomes
            default:
                return true;
        }
    }
}
