package com.github.tartaricacid.touhoulittlemaid.init;

import com.github.tartaricacid.touhoulittlemaid.TouhouLittleMaid;
import com.github.tartaricacid.touhoulittlemaid.entity.monster.EntityFairy;
import com.github.tartaricacid.touhoulittlemaid.entity.passive.EntityMaid;
import com.github.tartaricacid.touhoulittlemaid.item.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.core.Registry;

public final class InitItems {
    // Items
    public static Item MAID_SPAWN_EGG;
    public static Item FAIRY_SPAWN_EGG;

    public static Item MAID_BACKPACK_SMALL;
    public static Item MAID_BACKPACK_MIDDLE;
    public static Item MAID_BACKPACK_BIG;

    public static Item HAKUREI_GOHEI;
    public static Item SANAE_GOHEI;

    public static Item EXPLOSION_PROTECT_BAUBLE;
    public static Item FIRE_PROTECT_BAUBLE;
    public static Item PROJECTILE_PROTECT_BAUBLE;
    public static Item MAGIC_PROTECT_BAUBLE;
    public static Item FALL_PROTECT_BAUBLE;
    public static Item DROWN_PROTECT_BAUBLE;

    public static Item ULTRAMARINE_ORB_ELIXIR;
    public static Item NIMBLE_FABRIC;

    public static Item ITEM_MAGNET_BAUBLE;
    public static Item MUTE_BAUBLE;

    public static Item SMART_SLAB_INIT;
    public static Item SMART_SLAB_EMPTY;
    public static Item SMART_SLAB_HAS_MAID;

    public static Item CAMERA;
    public static Item PHOTO;
    public static Item FILM;

    public static Item RED_FOX_SCROLL;
    public static Item WHITE_FOX_SCROLL;
    public static Item SERVANT_BELL;
    public static Item TRUMPET;

    public static Item PINK_MAID_BED_ITEM;
    public static Item WHITE_MAID_BED_ITEM;
    public static Item BLACK_MAID_BED_ITEM;
    public static Item YELLOW_MAID_BED_ITEM;
    public static Item BLUE_MAID_BED_ITEM;
    public static Item GREEN_MAID_BED_ITEM;
    public static Item PURPLE_MAID_BED_ITEM;

    public static Item CHAIR;
    public static Item PICNIC_BASKET;
    public static Item SNACK_CABINET_ITEM;
    public static Item SCARECROW_ITEM;
    public static Item MAID_BEACON_ITEM;

    public static Item POWER_POINT;
    public static Item WIRELESS_IO;
    public static Item KAPPA_COMPASS;
    public static Item EXTINGUISHER;
    public static Item ENTITY_ID_COPY;
    public static Item BROOM_ITEM;

    public static Item GARAGE_KIT_ITEM;
    public static Item MODEL_SWITCHER_ITEM;
    public static Item CHAIR_SHOW;
    public static Item CHISEL;

    public static Item FAVORABILITY_TOOL_ADD;
    public static Item FAVORABILITY_TOOL_REDUCE;
    public static Item FAVORABILITY_TOOL_FULL;
    public static Item OWNER_CONVERSION_TOOL;
    public static Item SUBSTITUTE_JIZO;

    public static Item CHANGE_CHAIR_MODEL;
    public static Item CHANGE_MAID_MODEL;
    public static Item MAID_100_HEALTHY;
    public static Item KILL_100;
    public static Item KILL_SLIME_300;
    public static Item ALL_NETHERITE_EQUIPMENT;
    public static Item KILL_WITHER;
    public static Item KILL_DRAGON;
    public static Item TACZ_GUN_ICON;

    public static Item GOMOKU_ITEM;
    public static Item CCHESS_ITEM;
    public static Item WCHESS_ITEM;
    public static Item KEYBOARD_ITEM;
    public static Item BOOKSHELF_ITEM;
    public static Item COMPUTER_ITEM;
    public static Item SHRINE_ITEM;

    public static void registerAll() {
        // Spawn eggs
        MAID_SPAWN_EGG = registerItem("maid_spawn_egg", new SpawnEggItem(EntityMaid.TYPE, 0xFFFFFF, 0x000000, new Item.Properties().stacksTo(64)));
        FAIRY_SPAWN_EGG = registerItem("fairy_spawn_egg", new SpawnEggItem(EntityFairy.TYPE, 0xFFFFFF, 0xAAAAAA, new Item.Properties().stacksTo(64)));

        // Backpacks
        MAID_BACKPACK_SMALL = registerItem("maid_backpack_small", new ItemMaidBackpack(new Identifier(TouhouLittleMaid.MOD_ID, "maid_backpack_small")));
        MAID_BACKPACK_MIDDLE = registerItem("maid_backpack_middle", new ItemMaidBackpack(new Identifier(TouhouLittleMaid.MOD_ID, "maid_backpack_middle")));
        MAID_BACKPACK_BIG = registerItem("maid_backpack_big", new ItemMaidBackpack(new Identifier(TouhouLittleMaid.MOD_ID, "maid_backpack_big")));

        // Gohei
        HAKUREI_GOHEI = registerItem("hakurei_gohei", new ItemGohei());
        SANAE_GOHEI = registerItem("sanae_gohei", new ItemGohei());

        // Baubles
        EXPLOSION_PROTECT_BAUBLE = registerItem("explosion_protect_bauble", new ItemDamageableBauble(new Identifier(TouhouLittleMaid.MOD_ID, "explosion_protect_bauble"), 32));
        FIRE_PROTECT_BAUBLE = registerItem("fire_protect_bauble", new ItemDamageableBauble(new Identifier(TouhouLittleMaid.MOD_ID, "fire_protect_bauble"), 128));
        PROJECTILE_PROTECT_BAUBLE = registerItem("projectile_protect_bauble", new ItemDamageableBauble(new Identifier(TouhouLittleMaid.MOD_ID, "projectile_protect_bauble"), 64));
        MAGIC_PROTECT_BAUBLE = registerItem("magic_protect_bauble", new ItemDamageableBauble(new Identifier(TouhouLittleMaid.MOD_ID, "magic_protect_bauble"), 128));
        FALL_PROTECT_BAUBLE = registerItem("fall_protect_bauble", new ItemDamageableBauble(new Identifier(TouhouLittleMaid.MOD_ID, "fall_protect_bauble"), 32));
        DROWN_PROTECT_BAUBLE = registerItem("drown_protect_bauble", new ItemDamageableBauble(new Identifier(TouhouLittleMaid.MOD_ID, "drown_protect_bauble"), 64));

        ULTRAMARINE_ORB_ELIXIR = registerItem("ultramarine_orb_elixir", new ItemDamageableBauble(new Identifier(TouhouLittleMaid.MOD_ID, "ultramarine_orb_elixir"), 6));
        NIMBLE_FABRIC = registerItem("nimble_fabric", new ItemDamageableBauble(new Identifier(TouhouLittleMaid.MOD_ID, "nimble_fabric"), 64));

        ITEM_MAGNET_BAUBLE = registerItem("item_magnet_bauble", new ItemNormalBauble(new Identifier(TouhouLittleMaid.MOD_ID, "item_magnet_bauble")));
        MUTE_BAUBLE = registerItem("mute_bauble", new ItemNormalBauble(new Identifier(TouhouLittleMaid.MOD_ID, "mute_bauble")));

        SMART_SLAB_INIT = registerItem("smart_slab_init", new ItemSmartSlab(new Identifier(TouhouLittleMaid.MOD_ID, "smart_slab_init"), ItemSmartSlab.Type.INIT));
        SMART_SLAB_EMPTY = registerItem("smart_slab_empty", new ItemSmartSlab(new Identifier(TouhouLittleMaid.MOD_ID, "smart_slab_empty"), ItemSmartSlab.Type.EMPTY));
        SMART_SLAB_HAS_MAID = registerItem("smart_slab_has_maid", new ItemSmartSlab(new Identifier(TouhouLittleMaid.MOD_ID, "smart_slab_has_maid"), ItemSmartSlab.Type.HAS_MAID));

        CAMERA = registerItem("camera", new ItemCamera());
        PHOTO = registerItem("photo", new ItemPhoto());
        FILM = registerItem("film", new ItemFilm());

        RED_FOX_SCROLL = registerItem("red_fox_scroll", new ItemFoxScroll());
        WHITE_FOX_SCROLL = registerItem("white_fox_scroll", new ItemFoxScroll());
        SERVANT_BELL = registerItem("servant_bell", new ItemServantBell());
        TRUMPET = registerItem("trumpet", new ItemTrumpet());

        // Beds as items
        PINK_MAID_BED_ITEM = registerItem("pink_maid_bed", new ItemMaidBed(new Identifier(TouhouLittleMaid.MOD_ID, "pink_maid_bed"), InitBlocks.PINK_MAID_BED));
        WHITE_MAID_BED_ITEM = registerItem("white_maid_bed", new ItemMaidBed(new Identifier(TouhouLittleMaid.MOD_ID, "white_maid_bed"), InitBlocks.WHITE_MAID_BED));
        BLACK_MAID_BED_ITEM = registerItem("black_maid_bed", new ItemMaidBed(new Identifier(TouhouLittleMaid.MOD_ID, "black_maid_bed"), InitBlocks.BLACK_MAID_BED));
        YELLOW_MAID_BED_ITEM = registerItem("yellow_maid_bed", new ItemMaidBed(new Identifier(TouhouLittleMaid.MOD_ID, "yellow_maid_bed"), InitBlocks.YELLOW_MAID_BED));
        BLUE_MAID_BED_ITEM = registerItem("blue_maid_bed", new ItemMaidBed(new Identifier(TouhouLittleMaid.MOD_ID, "blue_maid_bed"), InitBlocks.BLUE_MAID_BED));
        GREEN_MAID_BED_ITEM = registerItem("green_maid_bed", new ItemMaidBed(new Identifier(TouhouLittleMaid.MOD_ID, "green_maid_bed"), InitBlocks.GREEN_MAID_BED));
        PURPLE_MAID_BED_ITEM = registerItem("purple_maid_bed", new ItemMaidBed(new Identifier(TouhouLittleMaid.MOD_ID, "purple_maid_bed"), InitBlocks.PURPLE_MAID_BED));

        CHAIR = registerItem("chair", new ItemChair());
        PICNIC_BASKET = registerItem("picnic_basket", new ItemPicnicBasket());
        SNACK_CABINET_ITEM = registerItem("snack_cabinet", new ItemSnackCabinet());
        SCARECROW_ITEM = registerItem("scarecrow", new ItemScarecrow());
        MAID_BEACON_ITEM = registerItem("maid_beacon", new ItemMaidBeacon());

        POWER_POINT = registerItem("power_point", new ItemPowerPoint());
        WIRELESS_IO = registerItem("wireless_io", new ItemWirelessIO());
        KAPPA_COMPASS = registerItem("kappa_compass", new ItemKappaCompass());
        EXTINGUISHER = registerItem("extinguisher", new ItemExtinguisher());
        ENTITY_ID_COPY = registerItem("entity_id_copy", new ItemEntityIdCopy());
        BROOM_ITEM = registerItem("broom", new ItemBroom());

        GARAGE_KIT_ITEM = registerItem("garage_kit", new ItemGarageKit());
        MODEL_SWITCHER_ITEM = registerItem("model_switcher", new ItemModelSwitcher());
        CHAIR_SHOW = registerItem("chair_show", new ItemChairShow());
        CHISEL = registerItem("chisel", new ItemChisel());

        FAVORABILITY_TOOL_ADD = registerItem("favorability_tool_add", new ItemFavorabilityTool("add"));
        FAVORABILITY_TOOL_REDUCE = registerItem("favorability_tool_reduce", new ItemFavorabilityTool("reduce"));
        FAVORABILITY_TOOL_FULL = registerItem("favorability_tool_full", new ItemFavorabilityTool("full"));
        OWNER_CONVERSION_TOOL = registerItem("owner_conversion_tool", new ItemOwnerConversionTool());
        SUBSTITUTE_JIZO = registerItem("substitute_jizo", new ItemSubstituteJizo());

        CHANGE_CHAIR_MODEL = registerItem("change_chair_model", new ItemAdvancementIcon());
        CHANGE_MAID_MODEL = registerItem("change_maid_model", new ItemAdvancementIcon());
        MAID_100_HEALTHY = registerItem("maid_100_healthy", new ItemAdvancementIcon());
        KILL_100 = registerItem("kill_100", new ItemAdvancementIcon());
        KILL_SLIME_300 = registerItem("kill_slime_300", new ItemAdvancementIcon());
        ALL_NETHERITE_EQUIPMENT = registerItem("all_netherite_equipment", new ItemAdvancementIcon());
        KILL_WITHER = registerItem("kill_wither", new ItemAdvancementIcon());
        KILL_DRAGON = registerItem("kill_dragon", new ItemAdvancementIcon());
        TACZ_GUN_ICON = registerItem("tacz_gun_icon", new ItemAdvancementIcon());

        // Block items
        GOMOKU_ITEM = registerItem("gomoku", new BlockItem(InitBlocks.GOMOKU, new Item.Properties().setId(ResourceKey.create(Registries.ITEM, new Identifier(TouhouLittleMaid.MOD_ID, "gomoku")))));
        CCHESS_ITEM = registerItem("cchess", new BlockItem(InitBlocks.CCHESS, new Item.Properties().setId(ResourceKey.create(Registries.ITEM, new Identifier(TouhouLittleMaid.MOD_ID, "cchess")))));
        WCHESS_ITEM = registerItem("wchess", new BlockItem(InitBlocks.WCHESS, new Item.Properties().setId(ResourceKey.create(Registries.ITEM, new Identifier(TouhouLittleMaid.MOD_ID, "wchess")))));
        KEYBOARD_ITEM = registerItem("keyboard", new BlockItem(InitBlocks.KEYBOARD, new Item.Properties().setId(ResourceKey.create(Registries.ITEM, new Identifier(TouhouLittleMaid.MOD_ID, "keyboard")))));
        BOOKSHELF_ITEM = registerItem("bookshelf", new BlockItem(InitBlocks.BOOKSHELF, new Item.Properties().setId(ResourceKey.create(Registries.ITEM, new Identifier(TouhouLittleMaid.MOD_ID, "bookshelf")))));
        COMPUTER_ITEM = registerItem("computer", new BlockItem(InitBlocks.COMPUTER, new Item.Properties().setId(ResourceKey.create(Registries.ITEM, new Identifier(TouhouLittleMaid.MOD_ID, "computer")))));
        SHRINE_ITEM = registerItem("shrine", new BlockItem(InitBlocks.SHRINE, new Item.Properties().rarity(Rarity.RARE).setId(ResourceKey.create(Registries.ITEM, new Identifier(TouhouLittleMaid.MOD_ID, "shrine")))));
    }

    private static Item registerItem(String id, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TouhouLittleMaid.MOD_ID, id), item);
    }
}
