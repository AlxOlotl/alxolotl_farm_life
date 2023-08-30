package net.alx.olotl_farm_mod.item;

import net.alx.olotl_farm_mod.FarmMod;
import net.alx.olotl_farm_mod.block.ModBlocks;
import net.alx.olotl_farm_mod.item.custom.EightBallItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FarmMod.MOD_ID);

public static final RegistryObject<Item> COBALT_INGOT =ITEMS.register("cobalt_ingot",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OLOTL_FARM_TAB)));

public static final RegistryObject<Item> RAW_COBALT =ITEMS.register("raw_cobalt",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OLOTL_FARM_TAB)));


public static final RegistryObject<Item> SPINACH_SEEDS =ITEMS.register("spinach_seeds",
            () -> new ItemNameBlockItem(ModBlocks.SPINACH_CROP.get(),
                    new Item.Properties().tab(ModCreativeModeTab.OLOTL_FARM_TAB)));

public static final RegistryObject<Item> SPINACH =ITEMS.register("spinach",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OLOTL_FARM_TAB)
                    .food(new  FoodProperties.Builder(). nutrition(2).saturationMod(2f).build())));


    public static final RegistryObject<Item> EIGHT_BALL =ITEMS.register("eight_ball",
            () -> new EightBallItem(new Item.Properties().tab(ModCreativeModeTab.OLOTL_FARM_TAB).stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
