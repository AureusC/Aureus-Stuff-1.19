package com.aureusc.aureusstuff.client.renderer.item;

import com.aureusc.aureusstuff.AureusStuff;
import com.aureusc.aureusstuff.item.ModAnimatedItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class TestModItemModel extends AnimatedGeoModel<ModAnimatedItem> {

    @Override
    public ResourceLocation getModelResource(ModAnimatedItem object) {
        return new ResourceLocation(AureusStuff.MOD_ID,"geo/test_staff.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ModAnimatedItem object) {
        return new ResourceLocation(AureusStuff.MOD_ID,"textures/item/test_staff_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ModAnimatedItem animatable) {
        return new ResourceLocation(AureusStuff.MOD_ID,"animations/armor_animations.json");
    }
}

