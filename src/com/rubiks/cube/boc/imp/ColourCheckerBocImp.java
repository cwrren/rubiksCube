package com.rubiks.cube.boc.imp;

import com.rubiks.cube.boc.ColourCheckerBoc;
import com.rubiks.cube.data.Constant;

import java.util.*;

public class ColourCheckerBocImp implements ColourCheckerBoc {

    @Override
    public boolean isStdCube(HashMap<String, String> cube) throws Exception {
        if (fullCubeCheck(cube))
            return true;
        return false;
    }

    private boolean fullCubeCheck(HashMap<String, String> cube) throws Exception {
        int white = getColourNumber(cube, Constant.WHITE);
        int orange = getColourNumber(cube, Constant.ORANGE);
        int green = getColourNumber(cube, Constant.GREEN);
        int red = getColourNumber(cube, Constant.RED);
        int blue = getColourNumber(cube, Constant.BLUE);
        int yellow = getColourNumber(cube, Constant.YELLOW);

        if (white == 9 && orange == 9 && green == 9 && red == 9 && blue == 9 && yellow == 9)
            return true;
        return false;
    }

    private int getColourNumber(HashMap<String, String> cube, String colour) throws Exception {
        return getKeys(cube, colour).size();
    }

    private static Set<String> getKeys(Map<String, String> map, String value) throws Exception {

        Set<String> result = new HashSet<>();
        if (map.containsValue(value)) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (Objects.equals(entry.getValue(), value)) {
                    result.add(entry.getKey());
                }
            }
        }
        return result;

    }
}