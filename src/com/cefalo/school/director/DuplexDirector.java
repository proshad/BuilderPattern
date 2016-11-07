package com.cefalo.school.director;

import com.cefalo.school.builder.BuildingBuilder;

/**
 * Created by proshad on 11/7/16.
 */
public class DuplexDirector implements BuildingDirector {

    @Override
    public void construct(BuildingBuilder buildingBuilder) {
        buildingBuilder.buildFloor();
        buildingBuilder.buildWall();
        buildingBuilder.buildRoof();
        buildingBuilder.buildDoor();
        buildingBuilder.buildWindow();
    }
}
