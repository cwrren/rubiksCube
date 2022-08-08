import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;

public class CrossCond {

    public boolean checkColour(HashMap<String, String> cube, String coord, String colour) {
        if (StringUtils.equals(cube.get(coord), colour)) {
            return true;
        }
        return false;
    }
}
