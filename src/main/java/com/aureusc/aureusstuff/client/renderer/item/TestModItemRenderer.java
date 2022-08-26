package com.aureusc.aureusstuff.client.renderer.item;


import com.aureusc.aureusstuff.item.ModAnimatedItem;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class TestModItemRenderer extends GeoItemRenderer<ModAnimatedItem> {

    public TestModItemRenderer() {
        super(new TestModItemModel());
    }
}