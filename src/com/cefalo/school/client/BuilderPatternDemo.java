package com.cefalo.school.client;

import com.cefalo.school.builder.BrickHouseBuilder;
import com.cefalo.school.builder.BuildingBuilder;
import com.cefalo.school.builder.GlassHouseBuilder;
import com.cefalo.school.builder.House;
import com.cefalo.school.director.DuplexDirector;

/**
 * Created by proshad on 11/7/16.
 */
public class BuilderPatternDemo {
    public static void main(String[] args){
        DuplexDirector director = new DuplexDirector();

        BuildingBuilder brickHouseBuilder = new BrickHouseBuilder();
        BuildingBuilder glassHouseBuilder = new GlassHouseBuilder();

        // Construct two buildings
        director.construct(brickHouseBuilder);
        House brickHouse = brickHouseBuilder.getHouse();
        brickHouse.showParts();

        director.construct(glassHouseBuilder);
        House glassHouse = glassHouseBuilder.getHouse();
        glassHouse.showParts();
    }
}
