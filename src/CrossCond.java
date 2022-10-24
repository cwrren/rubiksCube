import com.rubiks.cube.boc.imp.ColourCheckerBocImp;
import com.rubiks.cube.data.Constant;
import com.rubiks.cube.data.Cube;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class CrossCond {

    private String [][] crossCoord = {{Cube.A21.getCoord(),Cube.B01.getCoord()},
            {Cube.A12.getCoord(),Cube.C01.getCoord()},
            {Cube.A01.getCoord(),Cube.D01.getCoord()},
            {Cube.A10.getCoord(),Cube.E01.getCoord()},
            {Cube.B12.getCoord(),Cube.C10.getCoord()},
            {Cube.C12.getCoord(),Cube.D10.getCoord()},
            {Cube.D12.getCoord(),Cube.E10.getCoord()},
            {Cube.E12.getCoord(),Cube.B10.getCoord()},
            {Cube.B21.getCoord(),Cube.F01.getCoord()},
            {Cube.F12.getCoord(),Cube.C21.getCoord()},
            {Cube.F21.getCoord(),Cube.D21.getCoord()},
            {Cube.F10.getCoord(),Cube.E21.getCoord()},
    };

    private ColourCheckerBocImp colourCheckerBocImp;

    public boolean checkColour(HashMap<String, String> cube, String coord, String colour) {
        if (StringUtils.equals(cube.get(coord), colour)) {
            return true;
        }
        return false;
    }

    public int[] locateWhite(HashMap<String, String> cube) throws Exception{
        Set<String> whiteList = colourCheckerBocImp.getKeys(cube, Constant.WHITE);
        for (String white : whiteList) {
            for (int i = 0; i < crossCoord.length; i++) {
                // columns
                for (int j = 0; j < crossCoord[i].length; j++) {
                    // get coord of white
                    if (crossCoord[i][j].equals(white)) {
                        return new int[]{i, j};
                    }
                }
            }
        }
        return null;
    }
}
