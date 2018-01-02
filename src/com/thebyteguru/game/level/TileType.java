/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thebyteguru.game.level;

/**
 *
 * @author user
 */
public enum TileType {

    /**
     * 0
     */
    EMPTY(0),
    /**
     * 1
     */
    BRICK(1),
    /**
     * 2
     */
    METAL(2),
    /**
     * 3
     */
    WATER(3),
    /**
     * 4
     */
    GRASS(4),
    /**
     * 5
     */
    ICE(5);

    private int n;

    private TileType(int n) {
        this.n = n;
    }

    public int numeric() {
        return n;
    }

    public static TileType fromNumeric(int n) {
        switch (n) {
            case 1:
                return BRICK;
            case 2:
                return METAL;
            case 3:
                return WATER;
            case 4:
                return GRASS;
            case 5:
                return ICE;
            default:
                return EMPTY;
        }
    }
}
