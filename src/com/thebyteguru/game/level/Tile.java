/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thebyteguru.game.level;

import com.thebyteguru.utils.Utils;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 *
 * @author user
 */
public class Tile {

    private BufferedImage image;
    private TileType type;

    protected Tile(BufferedImage image, int scale, TileType type) {
        this.type = type;
        this.image = Utils.resize(image, image.getWidth() * scale, image.getHeight() * scale);
    }

    protected void render(Graphics2D g, int x, int y) {
        g.drawImage(image, x, y, null);
    }

    protected TileType type() {
        return type;
    }
}
