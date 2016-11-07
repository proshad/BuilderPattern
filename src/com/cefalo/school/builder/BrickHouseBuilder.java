package com.cefalo.school.builder;

/**
 * Created by proshad on 11/7/16.
 */
public class BrickHouseBuilder implements BuildingBuilder {

    private House house = new House();
    @Override
    public void buildFloor() {
        house.addParts("Floor has been built for BrickHouse");
    }

    @Override
    public void buildWall() {
        house.addParts("Wall has been built for BrickHouse");
    }

    @Override
    public void buildRoof() {
        house.addParts("Roof has been built for BrickHouse");
    }

    @Override
    public void buildDoor() {
        house.addParts("Door has been built for BrickHouse");
    }

    @Override
    public void buildWindow() {
        house.addParts("Window has been built for BrickHouse");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
