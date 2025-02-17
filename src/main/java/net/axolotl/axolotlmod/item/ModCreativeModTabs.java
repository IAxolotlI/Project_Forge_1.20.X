package net.axolotl.axolotlmod.item;

import net.axolotl.axolotlmod.AxolotlMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AxolotlMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> AXOLOTL_TAB=CREATIVE_MODE_TABS.register("axolotl_tab",
            ()-> CreativeModeTab.builder().icon(()->new ItemStack(ModItems.STEEL_INGOT.get()))
                    .title(Component.translatable("creativetab.axolotl_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.STEEL_INGOT.get());

                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
