package core;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author franc
 */
class Room {

    private Map<Integer, Room> rooms;
    private Map<Integer, String> images;
    private static final int DIRECTIONS = 4;

    public Room() {
        rooms = new HashMap<>();
        images = new HashMap<>();
    }

    //Set room and image
    public void setAdjacentRoom(int direction, String roomImg, Room room) {
        rooms.put(direction, room);
        images.put(direction, roomImg);
    }

    //Set only image (no adjacent room in that direction)
    public void setAdjacentRoom(int direction, String roomImg) {
        images.put(direction, roomImg);
    }

    public Room getAdjacentRoom(int direction) {
        return rooms.get(Math.floorMod(direction, DIRECTIONS));
    }

    public String getImage(int direction) {
        return images.get(Math.floorMod(direction, DIRECTIONS));
    }

}
