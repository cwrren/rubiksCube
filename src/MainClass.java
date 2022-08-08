import com.rubiks.cube.boc.ColourCheckerBoc;
import com.rubiks.cube.boc.imp.ColourCheckerBocImp;
import com.rubiks.cube.boc.imp.SpinFuncBocImp;
import com.rubiks.cube.data.Constant;
import com.rubiks.cube.data.Cube;

import java.util.HashMap;

public class MainClass {
    public static HashMap<String, String> cube = new HashMap<>();

    public static void main(String[] args) {
        ColourCheckerBocImp colourCheckerBoc = new ColourCheckerBocImp();
        try {
            setTestCube();
            //resetCube();
            System.out.println("Is standard Cube? " + colourCheckerBoc.isStdCube(cube));
            ConsolePrinter consolePrinter = new ConsolePrinter(cube);
            consolePrinter.printAll(cube);

            System.out.println();
            SpinFuncBocImp spinFuncBocImp = new SpinFuncBocImp();
            spinFuncBocImp.spinR(cube);
            spinFuncBocImp.spinRP(cube);

            consolePrinter.printAll(cube);

        } catch (Exception e) {

        }
    }


    // cube for testing
    public static void setTestCube() {
        cube.put(Cube.A00.getCoord(), Constant.BLUE);
        cube.put(Cube.A01.getCoord(), Constant.GREEN);
        cube.put(Cube.A02.getCoord(), Constant.BLUE);
        cube.put(Cube.A10.getCoord(), Constant.WHITE);
        cube.put(Cube.A11.getCoord(), Constant.WHITE);
        cube.put(Cube.A12.getCoord(), Constant.ORANGE);
        cube.put(Cube.A20.getCoord(), Constant.WHITE);
        cube.put(Cube.A21.getCoord(), Constant.RED);
        cube.put(Cube.A22.getCoord(), Constant.GREEN);

        cube.put(Cube.B00.getCoord(), Constant.GREEN);
        cube.put(Cube.B01.getCoord(), Constant.YELLOW);
        cube.put(Cube.B02.getCoord(), Constant.YELLOW);
        cube.put(Cube.B10.getCoord(), Constant.YELLOW);
        cube.put(Cube.B11.getCoord(), Constant.ORANGE);
        cube.put(Cube.B12.getCoord(), Constant.BLUE);
        cube.put(Cube.B20.getCoord(), Constant.RED);
        cube.put(Cube.B21.getCoord(), Constant.RED);
        cube.put(Cube.B22.getCoord(), Constant.GREEN);

        cube.put(Cube.C00.getCoord(), Constant.RED);
        cube.put(Cube.C01.getCoord(), Constant.BLUE);
        cube.put(Cube.C02.getCoord(), Constant.YELLOW);
        cube.put(Cube.C10.getCoord(), Constant.WHITE);
        cube.put(Cube.C11.getCoord(), Constant.GREEN);
        cube.put(Cube.C12.getCoord(), Constant.BLUE);
        cube.put(Cube.C20.getCoord(), Constant.YELLOW);
        cube.put(Cube.C21.getCoord(), Constant.BLUE);
        cube.put(Cube.C22.getCoord(), Constant.WHITE);

        cube.put(Cube.D00.getCoord(), Constant.ORANGE);
        cube.put(Cube.D01.getCoord(), Constant.WHITE);
        cube.put(Cube.D02.getCoord(), Constant.ORANGE);
        cube.put(Cube.D10.getCoord(), Constant.RED);
        cube.put(Cube.D11.getCoord(), Constant.RED);
        cube.put(Cube.D12.getCoord(), Constant.GREEN);
        cube.put(Cube.D20.getCoord(), Constant.RED);
        cube.put(Cube.D21.getCoord(), Constant.GREEN);
        cube.put(Cube.D22.getCoord(), Constant.YELLOW);

        cube.put(Cube.E00.getCoord(), Constant.WHITE);
        cube.put(Cube.E01.getCoord(), Constant.ORANGE);
        cube.put(Cube.E02.getCoord(), Constant.ORANGE);
        cube.put(Cube.E10.getCoord(), Constant.RED);
        cube.put(Cube.E11.getCoord(), Constant.BLUE);
        cube.put(Cube.E12.getCoord(), Constant.ORANGE);
        cube.put(Cube.E20.getCoord(), Constant.RED);
        cube.put(Cube.E21.getCoord(), Constant.GREEN);
        cube.put(Cube.E22.getCoord(), Constant.BLUE);

        cube.put(Cube.F00.getCoord(), Constant.WHITE);
        cube.put(Cube.F01.getCoord(), Constant.WHITE);
        cube.put(Cube.F02.getCoord(), Constant.ORANGE);
        cube.put(Cube.F10.getCoord(), Constant.ORANGE);
        cube.put(Cube.F11.getCoord(), Constant.YELLOW);
        cube.put(Cube.F12.getCoord(), Constant.YELLOW);
        cube.put(Cube.F20.getCoord(), Constant.BLUE);
        cube.put(Cube.F21.getCoord(), Constant.YELLOW);
        cube.put(Cube.F22.getCoord(), Constant.GREEN);
    }

    // cube for testing
    public static void resetCube() {
        cube.put(Cube.A00.getCoord(), Constant.WHITE);
        cube.put(Cube.A01.getCoord(), Constant.WHITE);
        cube.put(Cube.A02.getCoord(), Constant.WHITE);
        cube.put(Cube.A10.getCoord(), Constant.WHITE);
        cube.put(Cube.A11.getCoord(), Constant.WHITE);
        cube.put(Cube.A12.getCoord(), Constant.WHITE);
        cube.put(Cube.A20.getCoord(), Constant.WHITE);
        cube.put(Cube.A21.getCoord(), Constant.WHITE);
        cube.put(Cube.A22.getCoord(), Constant.WHITE);

        cube.put(Cube.B00.getCoord(), Constant.ORANGE);
        cube.put(Cube.B01.getCoord(), Constant.ORANGE);
        cube.put(Cube.B02.getCoord(), Constant.ORANGE);
        cube.put(Cube.B10.getCoord(), Constant.ORANGE);
        cube.put(Cube.B11.getCoord(), Constant.ORANGE);
        cube.put(Cube.B12.getCoord(), Constant.ORANGE);
        cube.put(Cube.B20.getCoord(), Constant.ORANGE);
        cube.put(Cube.B21.getCoord(), Constant.ORANGE);
        cube.put(Cube.B22.getCoord(), Constant.ORANGE);

        cube.put(Cube.C00.getCoord(), Constant.GREEN);
        cube.put(Cube.C01.getCoord(), Constant.GREEN);
        cube.put(Cube.C02.getCoord(), Constant.GREEN);
        cube.put(Cube.C10.getCoord(), Constant.GREEN);
        cube.put(Cube.C11.getCoord(), Constant.GREEN);
        cube.put(Cube.C12.getCoord(), Constant.GREEN);
        cube.put(Cube.C20.getCoord(), Constant.GREEN);
        cube.put(Cube.C21.getCoord(), Constant.GREEN);
        cube.put(Cube.C22.getCoord(), Constant.GREEN);

        cube.put(Cube.D00.getCoord(), Constant.RED);
        cube.put(Cube.D01.getCoord(), Constant.RED);
        cube.put(Cube.D02.getCoord(), Constant.RED);
        cube.put(Cube.D10.getCoord(), Constant.RED);
        cube.put(Cube.D11.getCoord(), Constant.RED);
        cube.put(Cube.D12.getCoord(), Constant.RED);
        cube.put(Cube.D20.getCoord(), Constant.RED);
        cube.put(Cube.D21.getCoord(), Constant.RED);
        cube.put(Cube.D22.getCoord(), Constant.RED);

        cube.put(Cube.E00.getCoord(), Constant.BLUE);
        cube.put(Cube.E01.getCoord(), Constant.BLUE);
        cube.put(Cube.E02.getCoord(), Constant.BLUE);
        cube.put(Cube.E10.getCoord(), Constant.BLUE);
        cube.put(Cube.E11.getCoord(), Constant.BLUE);
        cube.put(Cube.E12.getCoord(), Constant.BLUE);
        cube.put(Cube.E20.getCoord(), Constant.BLUE);
        cube.put(Cube.E21.getCoord(), Constant.BLUE);
        cube.put(Cube.E22.getCoord(), Constant.BLUE);

        cube.put(Cube.F00.getCoord(), Constant.YELLOW);
        cube.put(Cube.F01.getCoord(), Constant.YELLOW);
        cube.put(Cube.F02.getCoord(), Constant.YELLOW);
        cube.put(Cube.F10.getCoord(), Constant.YELLOW);
        cube.put(Cube.F11.getCoord(), Constant.YELLOW);
        cube.put(Cube.F12.getCoord(), Constant.YELLOW);
        cube.put(Cube.F20.getCoord(), Constant.YELLOW);
        cube.put(Cube.F21.getCoord(), Constant.YELLOW);
        cube.put(Cube.F22.getCoord(), Constant.YELLOW);
    }
}
