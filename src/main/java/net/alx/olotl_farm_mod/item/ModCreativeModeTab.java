package net.alx.olotl_farm_mod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ModCreativeModeTab {
    public static final CreativeModeTab OLOTL_FARM_TAB = new CreativeModeTab("olotlfarmtab") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ModItems.COBALT_INGOT.get());
        }
    };
}
