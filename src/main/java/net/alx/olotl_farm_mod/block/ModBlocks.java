package net.alx.olotl_farm_mod.block;


import net.alx.olotl_farm_mod.FarmMod;
import net.alx.olotl_farm_mod.block.custom.CobaltTintLampBlock;
import net.alx.olotl_farm_mod.block.custom.ZoomBlock;
import net.alx.olotl_farm_mod.item.ModCreativeModeTab;
import net.alx.olotl_farm_mod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {


    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, FarmMod.MOD_ID);

    //Raw and Full blocks

    public static final RegistryObject<Block> COBALT_BLOCK =registerBlock("cobalt_block",
            () ->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.OLOTL_FARM_TAB);

    public static final RegistryObject<Block> RAW_COBALT_BLOCK =registerBlock("raw_cobalt_block",
            () ->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.OLOTL_FARM_TAB);

    //Ores

    public static final RegistryObject<Block> COBALT_ORE =registerBlock("cobalt_ore",
            () ->new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3,7)), ModCreativeModeTab.OLOTL_FARM_TAB);

    public static final RegistryObject<Block> DEEPSLATE_COBALT_ORE =registerBlock("deepslate_cobalt_ore",
            () ->new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3,7)), ModCreativeModeTab.OLOTL_FARM_TAB);

    //Tree things
    public static final RegistryObject<Block> DATE_LOG =registerBlock("date_log",
            () ->new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.OLOTL_FARM_TAB);

    public static final RegistryObject<Block> DATE_WOOD =registerBlock("date_wood",
            () ->new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.OLOTL_FARM_TAB);

    public static final RegistryObject<Block> STRIPPED_DATE_LOG =registerBlock("stripped_date_log",
            () ->new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.OLOTL_FARM_TAB);

    public static final RegistryObject<Block> DATE_LEAVES =registerBlock("date_leaves",
            () ->new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.OLOTL_FARM_TAB);

    public static final RegistryObject<Block> DATE_LOG_SHEATH =registerBlock("date_log_sheath",
            () ->new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.OLOTL_FARM_TAB);

    public static final RegistryObject<Block> DATE_PLANK =registerBlock("date_plank",
            () ->new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.OLOTL_FARM_TAB);


    //Misc
    public static final RegistryObject<Block> ZOOM_BLOCK =registerBlock("zoom_block",
            () ->new ZoomBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.OLOTL_FARM_TAB);

    public static final RegistryObject<Block> COBALT_TINT_LAMP =registerBlock("cobalt_tint_lamp",
            () ->new CobaltTintLampBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()
                    .lightLevel(state -> state.getValue(CobaltTintLampBlock.LIT) ? 15 : 0)), ModCreativeModeTab.OLOTL_FARM_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
    registerBlockItem(name, toReturn, tab);
        return  toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
