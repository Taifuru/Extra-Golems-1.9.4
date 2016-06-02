package com.golems.main;

import com.golems.entity.EntityBookshelfGolem;
import com.golems.entity.EntityCoalGolem;
import com.golems.entity.EntityEndstoneGolem;
import com.golems.entity.EntityIceGolem;
import com.golems.entity.EntityLapisGolem;
import com.golems.entity.EntityLeafGolem;
import com.golems.entity.EntityMelonGolem;
import com.golems.entity.EntityMushroomGolem;
import com.golems.entity.EntityNetherBrickGolem;
import com.golems.entity.EntityRedstoneGolem;
import com.golems.entity.EntitySlimeGolem;
import com.golems.entity.EntitySpongeGolem;
import com.golems.entity.EntityStainedClayGolem;
import com.golems.entity.EntityStainedGlassGolem;
import com.golems.entity.EntityTNTGolem;
import com.golems.util.GolemConfigSet;

import net.minecraftforge.common.config.Configuration;

/** Registers the config settings to adjust aspects of this mod **/
public class Config 
{
	// public static Map<Class<? extends GolemBase>, GolemConfigSet> configMap;
	
	public static GolemConfigSet BEDROCK;
	public static GolemConfigSet BOOKSHELF;
	public static GolemConfigSet CLAY;
	public static GolemConfigSet COAL;
	public static GolemConfigSet CRAFTING;
	public static GolemConfigSet DIAMOND;
	public static GolemConfigSet EMERALD;
	public static GolemConfigSet ENDSTONE;
	public static GolemConfigSet GLASS;
	public static GolemConfigSet GLOWSTONE;
	public static GolemConfigSet GOLD;
	public static GolemConfigSet HARD_CLAY;
	public static GolemConfigSet ICE;
	public static GolemConfigSet LAPIS;
	public static GolemConfigSet LEAF;
	public static GolemConfigSet MELON;
	public static GolemConfigSet MUSHROOM;
	public static GolemConfigSet NETHERBRICK;
	public static GolemConfigSet OBSIDIAN;
	public static GolemConfigSet PRISMARINE;
	public static GolemConfigSet QUARTZ;
	public static GolemConfigSet RED_SANDSTONE;
	public static GolemConfigSet REDSTONE;
	public static GolemConfigSet SANDSTONE;
	public static GolemConfigSet SEA_LANTERN;
	public static GolemConfigSet SLIME;
	public static GolemConfigSet SPONGE;
	public static GolemConfigSet STAINED_CLAY;
	public static GolemConfigSet STAINED_GLASS;
	public static GolemConfigSet STRAW;
	public static GolemConfigSet TNT;
	public static GolemConfigSet WOOD;
	public static GolemConfigSet WOOL;

	public static void mainRegistry(Configuration config)
	{
		config.load();
		initGolemConfigSets(config);
		loadSpecials();
		config.save();
	}
	
	/** Now I can change default attack and health values all from one place **/
	public static void initGolemConfigSets(Configuration config)
	{
		BEDROCK = new GolemConfigSet(config, "Bedrock Golem", 999.0D, 32.0F);
		BOOKSHELF = new GolemConfigSet(config, "Bookshelf Golem", 28.0D, 1.5F);
		CLAY = new GolemConfigSet(config, "Clay Golem", 20.0D, 2.0F);
		COAL = new GolemConfigSet(config, "Coal Golem", 14.0D, 2.5F);
		CRAFTING = new GolemConfigSet(config, "Crafting Golem", 24.0D, 2.0F);
		DIAMOND = new GolemConfigSet(config, "Diamond Golem", 220.0D, 20.0F);
		EMERALD = new GolemConfigSet(config, "Emerald Golem", 190.0D, 18.0F);
		ENDSTONE = new GolemConfigSet(config, "Endstone Golem", 50.0D, 8.0F);
		GLASS = new GolemConfigSet(config, "Glass Golem", 8.0D, 13.0F);
		GLOWSTONE = new GolemConfigSet(config, "Glowstone Golem", 8.0D, 12.0F);
		GOLD = new GolemConfigSet(config, "Gold Golem", 80.0D, 8.0F);
		HARD_CLAY = new GolemConfigSet(config, "Hardened Clay Golem", 22.0D, 4.0F);
		ICE = new GolemConfigSet(config, "Ice Golem", 18.0D, 6.0F);
		LAPIS = new GolemConfigSet(config, "Lapis Lazuli Golem", 50.0D, 1.5F);
		LEAF = new GolemConfigSet(config, "Leaf Golem", 6.0D, 0.5F);
		MELON = new GolemConfigSet(config, "Melon Golem", 18.0D, 1.5F);
		MUSHROOM = new GolemConfigSet(config, "Mushroom Golem", 30.0D, 3.0F);
		NETHERBRICK = new GolemConfigSet(config, "Nether Brick Golem", 25.0D, 6.5F);
		OBSIDIAN = new GolemConfigSet(config, "Obsidian Golem", 120.0D, 18.0F);
		PRISMARINE = new GolemConfigSet(config, "Prismarine Golem", 24.0D, 8.0F);
		QUARTZ = new GolemConfigSet(config, "Quartz Golem", 85.0D, 8.5F);
		RED_SANDSTONE = new GolemConfigSet(config, "Red Sandstone Golem", 15.0D, 4.0F);
		REDSTONE = new GolemConfigSet(config, "Redstone Golem", 18.0D, 2.0F);
		SANDSTONE = new GolemConfigSet(config, "Sandstone Golem", 15.0D, 4.0F);
		SEA_LANTERN = new GolemConfigSet(config, "Sea Lantern Golem", 26.0D, 4.0F);
		SLIME = new GolemConfigSet(config, "Slime Golem", 85.0D, 2.5F);
		SPONGE = new GolemConfigSet(config, "Sponge Golem", 20.0D, 1.5F);
		STAINED_CLAY = new GolemConfigSet(config, "Stained Clay Golem", 26.0D, 3.0F);
		STAINED_GLASS = new GolemConfigSet(config, "Stained Glass Golem", 9.0D, 12.0F);
		STRAW = new GolemConfigSet(config, "Straw Golem", 10.0D, 1.0F);
		TNT = new GolemConfigSet(config, "TNT Golem", 14.0D, 2.5F);
		WOOD = new GolemConfigSet(config, "Wooden Golem", 20.0D, 3.0F);
		WOOL = new GolemConfigSet(config, "Wool Golem", 10.0D, 1.0F);		
	}
	
	public static void loadSpecials()
	{
		BOOKSHELF.addKey(EntityBookshelfGolem.ALLOW_SPECIAL, true, "Whether this golem can give itself potion effects");
		COAL.addKey(EntityCoalGolem.ALLOW_SPECIAL, false, "Whether this golem can inflict blindness");
		ENDSTONE.addKey(EntityEndstoneGolem.ALLOW_SPECIAL, true, "Whether this golem can teleport");
		ENDSTONE.addKey(EntityEndstoneGolem.ALLOW_WATER_HURT, true, "Whether the Endstone Golem takes damage from water");
		ICE.addKey(EntityIceGolem.ALLOW_SPECIAL, true, "Whether this golem can freeze water and cool lava nearby");
		ICE.addKey(EntityIceGolem.CAN_USE_REGULAR_ICE, true, "When true, the Ice Golem can be built with regular ice as well as packed ice");
		ICE.addKey(EntityIceGolem.AOE, 3, 1, 8, "Radial distance at which this golem can freeze / cool liquids");
		LAPIS.addKey(EntityLapisGolem.ALLOW_SPECIAL, true, "Whether this golem can inflict harmful potion effects");
		LEAF.addKey(EntityLeafGolem.ALLOW_SPECIAL, true, "Whether this golem can heal itself");
		MELON.addKey(EntityMelonGolem.ALLOW_SPECIAL, true, "Whether this golem can plant flowers randomly");
		MELON.addKey(EntityMelonGolem.FREQUENCY, 240, 1, 24000, "Average number of ticks between planting flowers");
		MUSHROOM.addKey(EntityMushroomGolem.ALLOW_SPECIAL, true, "Whether this golem can plant mushrooms randomly");
		MUSHROOM.addKey(EntityMushroomGolem.FREQUENCY, 420, 1, 24000, "Average number of ticks between planting mushrooms");
		NETHERBRICK.addKey(EntityNetherBrickGolem.ALLOW_FIRE_SPECIAL, true, "Whether this golem can light mobs on fire");
		NETHERBRICK.addKey(EntityNetherBrickGolem.ALLOW_LAVA_SPECIAL, true, "Whether this golem can slowly melt cobblestone");
		NETHERBRICK.addKey(EntityNetherBrickGolem.MELT_DELAY, 240, 1, 24000, "Number of ticks it takes to melt cobblestone (12 sec * 20 t/sec = 240 t)");
		REDSTONE.addKey(EntityRedstoneGolem.ALLOW_SPECIAL, true, "Whether this golem can power nearby redstone");
		REDSTONE.addKey(EntityRedstoneGolem.POWER, 15, 0, 15, "Level of redstone power emitted by this golem");
		SLIME.addKey(EntitySlimeGolem.ALLOW_SPECIAL, true, "Whether this golem can apply extra knockback when attacking");
		SLIME.addKey(EntitySlimeGolem.KNOCKBACK, 2.0012F, 0.001F, 10.0F, "How powerful the Slime Golem attack is (Higher Value = Further Knockback)");
		SPONGE.addKey(EntitySpongeGolem.ALLOW_SPECIAL, true, "Whether this golem can absorb water");
		SPONGE.addKey(EntitySpongeGolem.PARTICLES, true, "Whether this golem should always drip water");
		SPONGE.addKey(EntitySpongeGolem.RANGE, 4, 2, 8, "Radial distance at which this golem can absorb water (Warning: larger values cause lag)");
		SPONGE.addKey(EntitySpongeGolem.INTERVAL, 80, 1, 24000, "Number of ticks between each water-check; increase to reduce lag");
		STAINED_CLAY.addKey(EntityStainedClayGolem.DROP_META, -1, -1, 15, "The metadata of stained clay dropped by this golem. Set to -1 to let it be based on current texture");
		STAINED_GLASS.addKey(EntityStainedGlassGolem.DROP_META, -1, -1, 15, "The metadata of stained glass dropped by this golem. Set to -1 to let it be based on current texture");
		TNT.addKey(EntityTNTGolem.ALLOW_SPECIAL, true, "Whether this golem can explode when fighting or dying");
	}
/*
	private static void registerConfigSets()
	{
		configMap = new HashMap(40);
		registerConfigSet(EntityBedrockGolem.class, BEDROCK);
		registerConfigSet(EntityBookshelfGolem.class, BOOKSHELF);
		registerConfigSet(EntityClayGolem.class, CLAY);
		registerConfigSet(EntityCoalGolem.class, COAL);
		registerConfigSet(EntityCraftingGolem.class, CRAFTING);
		registerConfigSet(EntityDiamondGolem.class, DIAMOND);
		registerConfigSet(EntityEmeraldGolem.class, EMERALD);
		registerConfigSet(EntityEndstoneGolem.class, ENDSTONE);
		registerConfigSet(EntityGlassGolem.class, GLASS);
		registerConfigSet(EntityGlowstoneGolem.class, GLOWSTONE);
		registerConfigSet(EntityGoldGolem.class, GOLD);
		registerConfigSet(EntityHardenedClayGolem.class, HARD_CLAY);
		registerConfigSet(EntityIceGolem.class, ICE);
		registerConfigSet(EntityLapisGolem.class, LAPIS);
		registerConfigSet(EntityLeafGolem.class, LEAF);
		registerConfigSet(EntityMelonGolem.class, MELON);
		registerConfigSet(EntityMushroomGolem.class, MUSHROOM);
		registerConfigSet(EntityNetherBrickGolem.class, NETHERBRICK);
		registerConfigSet(EntityObsidianGolem.class, OBSIDIAN);
		registerConfigSet(EntityPrismarineGolem.class, PRISMARINE);
		registerConfigSet(EntityQuartzGolem.class, QUARTZ);
		registerConfigSet(EntityRedSandstoneGolem.class, RED_SANDSTONE);
		registerConfigSet(EntityRedstoneGolem.class, REDSTONE);
		registerConfigSet(EntitySandstoneGolem.class, SANDSTONE);
		registerConfigSet(EntitySeaLanternGolem.class, SEA_LANTERN);
		registerConfigSet(EntitySlimeGolem.class, SLIME);
		registerConfigSet(EntitySpongeGolem.class, SPONGE);
		registerConfigSet(EntityStainedClayGolem.class, STAINED_CLAY);
		registerConfigSet(EntityStainedGlassGolem.class, STAINED_GLASS);
		registerConfigSet(EntityStrawGolem.class, STRAW);
		registerConfigSet(EntityTNTGolem.class, TNT);
		registerConfigSet(EntityWoodenGolem.class, WOOD);
		registerConfigSet(EntityWoolGolem.class, WOOL);
	}
	
	public static GolemConfigSet registerConfigSet(Class<? extends GolemBase> clazz, GolemConfigSet configSet)
	{
		return configMap.put(clazz, configSet);
	}
	
	public static boolean getBoolean(GolemBase golem, String key)
	{
		GolemConfigSet set = getConfigFor(golem);
		if(set != null)
		{
			return set.getBoolean(key);
		}
		return false;
	}
	
	public static int getInt(GolemBase golem, String key)
	{
		GolemConfigSet set = getConfigFor(golem);
		if(set != null)
		{
			return set.getInt(key);
		}
		return 0;
	}
	
	public static float getFloat(GolemBase golem, String key)
	{
		GolemConfigSet set = getConfigFor(golem);
		if(set != null)
		{
			return set.getFloat(key);
		}
		return 0.0F;
	}
	
	public static GolemConfigSet getConfigFor(GolemBase golem)
	{
		return golem != null ? getConfigFor(golem.getClass()) : (GolemConfigSet)null;
	}
	
	public static GolemConfigSet getConfigFor(Class<? extends GolemBase> golem) throws IllegalArgumentException
	{
		if(configMap.containsKey(golem))
		{
			return configMap.get(golem);
		}
		else
		{
			String error = "Error: could not find GolemConfigSet for class " + golem.getName();
			throw new IllegalArgumentException(error);
		}
	}
*/
}