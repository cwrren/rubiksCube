import com.rubiks.cube.data.Constant;
import com.rubiks.cube.data.Cube;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;

public class ConsolePrinter {

    public ConsolePrinter() {

    }
    private final static String EMPTY = StringUtils.EMPTY;
    private final static String NEXT_LINE = "L";
    private final static String[] planeCube = {EMPTY,EMPTY,EMPTY,Cube.D22.getCoord(),Cube.D21.getCoord(),Cube.D20.getCoord(),NEXT_LINE,
            EMPTY,EMPTY,EMPTY,Cube.D12.getCoord(),Cube.D11.getCoord(),Cube.D10.getCoord(),NEXT_LINE,
            EMPTY,EMPTY,EMPTY,Cube.D02.getCoord(),Cube.D01.getCoord(),Cube.D00.getCoord(),NEXT_LINE,
            Cube.E20.getCoord(),Cube.E10.getCoord(),Cube.E00.getCoord(),Cube.A00.getCoord(),Cube.A01.getCoord(),Cube.A02.getCoord(),Cube.C02.getCoord(),Cube.C12.getCoord(),Cube.C22.getCoord(),NEXT_LINE,
            Cube.E21.getCoord(),Cube.E11.getCoord(),Cube.E01.getCoord(),Cube.A10.getCoord(),Cube.A11.getCoord(),Cube.A12.getCoord(),Cube.C01.getCoord(),Cube.C11.getCoord(),Cube.C21.getCoord(),NEXT_LINE,
            Cube.E22.getCoord(),Cube.E12.getCoord(),Cube.E02.getCoord(),Cube.A20.getCoord(),Cube.A21.getCoord(),Cube.A22.getCoord(),Cube.C00.getCoord(),Cube.C10.getCoord(),Cube.C20.getCoord(),NEXT_LINE,
            EMPTY,EMPTY,EMPTY,Cube.B00.getCoord(),Cube.B01.getCoord(),Cube.B02.getCoord(),NEXT_LINE,
            EMPTY,EMPTY,EMPTY,Cube.B10.getCoord(),Cube.B11.getCoord(),Cube.B12.getCoord(),NEXT_LINE,
            EMPTY,EMPTY,EMPTY,Cube.B20.getCoord(),Cube.B21.getCoord(),Cube.B22.getCoord(),NEXT_LINE,
            EMPTY,EMPTY,EMPTY,Cube.F00.getCoord(),Cube.F01.getCoord(),Cube.F02.getCoord(),NEXT_LINE,
            EMPTY,EMPTY,EMPTY,Cube.F10.getCoord(),Cube.F11.getCoord(),Cube.F12.getCoord(),NEXT_LINE,
            EMPTY,EMPTY,EMPTY,Cube.F20.getCoord(),Cube.F21.getCoord(),Cube.F22.getCoord(),NEXT_LINE};

    public ConsolePrinter(HashMap<String, String> cube) {

    }
    public void printAll(HashMap<String, String> cube){
        for(String coord: planeCube) {
            if (StringUtils.equals(coord, NEXT_LINE)) {
                printColour(NEXT_LINE);
            } else {
                printColour(cube.get(coord));
            }
        }
    }

    public void printColour(String colour){
        if (StringUtils.equals(colour, Constant.WHITE)) {
            pW();
            pW();
            pW();
            //pS();
        } else if (StringUtils.equals(colour, Constant.ORANGE)) {
            pO();
            pO();
            pO();
            //pS();
        } else if (StringUtils.equals(colour, Constant.GREEN)) {
            pG();
            pG();
            pG();
            //pS();
        } else if (StringUtils.equals(colour, Constant.RED)) {
            pR();
            pR();
            pR();
            //pS();
        } else if (StringUtils.equals(colour, Constant.BLUE)) {
            pB();
            pB();
            pB();
            //pS();
        } else if (StringUtils.equals(colour, Constant.YELLOW)) {
            pY();
            pY();
            pY();
            //pS();
        } else if (StringUtils.equals(colour, NEXT_LINE)) {
            pL();
        } else {
            pS();
            pS();
            pS();
            //pS();
        }
    }

    public static void pS() {
        System.out.print(" ");
    }

    public static void pL() {
        System.out.println();
    }

    public static void pW() {
        System.out.print(ConsoleColours.WHITE_BACKGROUND_BRIGHT + " " + ConsoleColours.RESET);
    }

    public static void pO() {
        System.out.print(ConsoleColours.ORANGE_BACKGROUND_BRIGHT + " " + ConsoleColours.RESET);
    }

    public static void pG() {
        System.out.print(ConsoleColours.GREEN_BACKGROUND_BRIGHT + " " + ConsoleColours.RESET);
    }

    public static void pR() {
        System.out.print(ConsoleColours.RED_BACKGROUND_BRIGHT + " " + ConsoleColours.RESET);
    }

    public static void pB() {
        System.out.print(ConsoleColours.BLUE_BACKGROUND_BRIGHT + " " + ConsoleColours.RESET);
    }

    public static void pY() {
        System.out.print(ConsoleColours.YELLOW_BACKGROUND_BRIGHT + " " + ConsoleColours.RESET);
    }
}
