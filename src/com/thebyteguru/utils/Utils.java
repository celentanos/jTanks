/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thebyteguru.utils;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Utils {

    public static BufferedImage resize(BufferedImage image, int width, int heigth) {
        BufferedImage newImage = new BufferedImage(width, heigth, BufferedImage.TYPE_INT_ARGB);
        newImage.getGraphics().drawImage(image, 0, 0, width, heigth, null);
        return newImage;
    }

    public static Integer[][] levelParser(String filePath) {

        Integer[][] result = null;

        try (BufferedReader reader = new BufferedReader(new FileReader(new File(filePath)))) {

            String line = null;
            List<Integer[]> lvlLines = new ArrayList<Integer[]>();

            while ((line = reader.readLine()) != null) {
                if (!line.contains("<")) {
                    line = line.replace(" ", "");
                    lvlLines.add(str2int_arrays(line.split(",")));
                } else {
                    continue;
                }
            }
            result = new Integer[lvlLines.size()][lvlLines.get(0).length];
            for (int i = 0; i < lvlLines.size(); i++) {
                result[i] = lvlLines.get(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static final Integer[] str2int_arrays(String[] sArr) {
        Integer[] result = new Integer[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            result[i] = Integer.parseInt(sArr[i]);
        }
        return result;
    }
}
