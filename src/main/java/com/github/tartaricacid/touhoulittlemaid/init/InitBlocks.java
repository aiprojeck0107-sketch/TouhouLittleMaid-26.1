package com.github.tartaricacid.touhoulittlemaid.init;

import com.github.tartaricacid.touhoulittlemaid.TouhouLittleMaid;
import com.github.tartaricacid.touhoulittlemaid.block.*;
import com.github.tartaricacid.touhoulittlemaid.blockentity.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;

import net.minecraft.core.Registry;

public final class InitBlocks {
    // Blocks
    public static Block PINK_MAID_BED;
    public static Block WHITE_MAID_BED;
    public static Block BLACK_MAID_BED;
    public static Block YELLOW_MAID_BED;
    public static Block BLUE_MAID_BED;
    public static Block GREEN_MAID_BED;
    public static Block PURPLE_MAID_BED;

    public static Block ALTAR;
    public static Block STATUE;
    public static Block GARAGE_KIT;
    public static Block MAID_BEACON;
    public static Block MODEL_SWITCHER;
    public static Block PICNIC_MAT;
    public static Block GOMOKU;
    public static Block CCHESS;
    public static Block WCHESS;
    public static Block KEYBOARD;
    public static Block BOOKSHELF;
    public static Block COMPUTER;
    public static Block SHRINE;
    public static Block SCARECROW;
    public static Block SNACK_CABINET;

    // Block entity types
    public static BlockEntityType<BlockEntityAltar> ALTAR_BE;
    public static BlockEntityType<BlockEntityStatue> STATUE_BE;
    public static BlockEntityType<BlockEntityGarageKit> GARAGE_KIT_BE;
    public static BlockEntityType<BlockEntityMaidBeacon> MAID_BEACON_BE;
    public static BlockEntityType<BlockEntityModelSwitcher> MODEL_SWITCHER_BE;
    public static BlockEntityType<BlockEntityGomoku> GOMOKU_BE;
    public static BlockEntityType<BlockEntityCChess> CCHESS_BE;
    public static BlockEntityType<BlockEntityWChess> WCHESS_BE;
    public static BlockEntityType<BlockEntityKeyboard> KEYBOARD_BE;
    public static BlockEntityType<BlockEntityBookshelf> BOOKSHELF_BE;
    public static BlockEntityType<BlockEntityComputer> COMPUTER_BE;
    public static BlockEntityType<BlockEntityShrine> SHRINE_BE;
    public static BlockEntityType<BlockEntityPicnicMat> PICNIC_MAT_BE;
    public static BlockEntityType<BlockEntitySnackCabinet> SNACK_CABINET_BE;
    public static BlockEntityType<BlockEntityMaidBed> MAID_BED_BE;

    public static void registerAll() {
        // Register blocks
        PINK_MAID_BED = registerBlock("pink_maid_bed", new BlockMaidBed(new Identifier(TouhouLittleMaid.MOD_ID, "pink_maid_bed"), DyeColor.PINK));
        WHITE_MAID_BED = registerBlock("white_maid_bed", new BlockMaidBed(new Identifier(TouhouLittleMaid.MOD_ID, "white_maid_bed"), DyeColor.WHITE));
        BLACK_MAID_BED = registerBlock("black_maid_bed", new BlockMaidBed(new Identifier(TouhouLittleMaid.MOD_ID, "black_maid_bed"), DyeColor.BLACK));
        YELLOW_MAID_BED = registerBlock("yellow_maid_bed", new BlockMaidBed(new Identifier(TouhouLittleMaid.MOD_ID, "yellow_maid_bed"), DyeColor.YELLOW));
        BLUE_MAID_BED = registerBlock("blue_maid_bed", new BlockMaidBed(new Identifier(TouhouLittleMaid.MOD_ID, "blue_maid_bed"), DyeColor.BLUE));
        GREEN_MAID_BED = registerBlock("green_maid_bed", new BlockMaidBed(new Identifier(TouhouLittleMaid.MOD_ID, "green_maid_bed"), DyeColor.GREEN));
        PURPLE_MAID_BED = registerBlock("purple_maid_bed", new BlockMaidBed(new Identifier(TouhouLittleMaid.MOD_ID, "purple_maid_bed"), DyeColor.PURPLE));

        ALTAR = registerBlock("altar", new BlockAltar());
        STATUE = registerBlock("statue", new BlockStatue());
        GARAGE_KIT = registerBlock("garage_kit", new BlockGarageKit());
        MAID_BEACON = registerBlock("maid_beacon", new BlockMaidBeacon());
        MODEL_SWITCHER = registerBlock("model_switcher", new BlockModelSwitcher());
        PICNIC_MAT = registerBlock("picnic_mat", new BlockPicnicMat());
        GOMOKU = registerBlock("gomoku", new BlockGomoku());
        CCHESS = registerBlock("cchess", new BlockCChess());
        WCHESS = registerBlock("wchess", new BlockWChess());
        KEYBOARD = registerBlock("keyboard", new BlockKeyboard());
        BOOKSHELF = registerBlock("bookshelf", new BlockBookshelf());
        COMPUTER = registerBlock("computer", new BlockComputer());
        SHRINE = registerBlock("shrine", new BlockShrine());
        SCARECROW = registerBlock("scarecrow", new BlockScarecrow());
        SNACK_CABINET = registerBlock("snack_cabinet", new BlockSnackCabinet());

        // Register block entity types
        ALTAR_BE = registerBlockEntityType("altar", BlockEntityType.Builder.of(BlockEntityAltar::new, ALTAR));
        STATUE_BE = registerBlockEntityType("statue", BlockEntityType.Builder.of(BlockEntityStatue::new, STATUE));
        GARAGE_KIT_BE = registerBlockEntityType("garage_kit", BlockEntityType.Builder.of(BlockEntityGarageKit::new, GARAGE_KIT));
        MAID_BEACON_BE = registerBlockEntityType("maid_beacon", BlockEntityType.Builder.of(BlockEntityMaidBeacon::new, MAID_BEACON));
        MODEL_SWITCHER_BE = registerBlockEntityType("model_switcher", BlockEntityType.Builder.of(BlockEntityModelSwitcher::new, MODEL_SWITCHER));
        GOMOKU_BE = registerBlockEntityType("gomoku", BlockEntityType.Builder.of(BlockEntityGomoku::new, GOMOKU));
        CCHESS_BE = registerBlockEntityType("cchess", BlockEntityType.Builder.of(BlockEntityCChess::new, CCHESS));
        WCHESS_BE = registerBlockEntityType("wchess", BlockEntityType.Builder.of(BlockEntityWChess::new, WCHESS));
        KEYBOARD_BE = registerBlockEntityType("keyboard", BlockEntityType.Builder.of(BlockEntityKeyboard::new, KEYBOARD));
        BOOKSHELF_BE = registerBlockEntityType("bookshelf", BlockEntityType.Builder.of(BlockEntityBookshelf::new, BOOKSHELF));
        COMPUTER_BE = registerBlockEntityType("computer", BlockEntityType.Builder.of(BlockEntityComputer::new, COMPUTER));
        SHRINE_BE = registerBlockEntityType("shrine", BlockEntityType.Builder.of(BlockEntityShrine::new, SHRINE));
        PICNIC_MAT_BE = registerBlockEntityType("picnic_mat", BlockEntityType.Builder.of(BlockEntityPicnicMat::new, PICNIC_MAT));
        SNACK_CABINET_BE = registerBlockEntityType("snack_cabinet", BlockEntityType.Builder.of(BlockEntitySnackCabinet::new, SNACK_CABINET));
        MAID_BED_BE = registerBlockEntityType("maid_bed", BlockEntityType.Builder.of(BlockEntityMaidBed::new,
                PINK_MAID_BED, WHITE_MAID_BED, BLACK_MAID_BED,
                YELLOW_MAID_BED, BLUE_MAID_BED, GREEN_MAID_BED,
                PURPLE_MAID_BED));
    }

    private static Block registerBlock(String id, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(TouhouLittleMaid.MOD_ID, id), block);
    }

    private static <T extends BlockEntity> BlockEntityType<T> registerBlockEntityType(String id, BlockEntityType.Builder<T> builder) {
        BlockEntityType<T> type = builder.build(null);
        return Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(TouhouLittleMaid.MOD_ID, id), type);
    }
}
