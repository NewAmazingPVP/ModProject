package mod.modproject.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModProjectClient implements ClientModInitializer {
    public static final Item CUSTOM_ITEM = new Item(new FabricItemSettings());
    public static final Item GEM = new Item((new FabricItemSettings()));
    @Override
    public void onInitializeClient() {
        Registry.register(Registries.ITEM, new Identifier("tutorial", "custom_item"), CUSTOM_ITEM);
        Registry.register(Registries.ITEM, new Identifier("gem", "gem_t1"), GEM);
    }
}
