package com.rubiks.cube.boc.imp;

import com.rubiks.cube.boc.SpinFuncBoc;
import com.rubiks.cube.data.Cube;

import java.util.HashMap;

public class SpinFuncBocImp implements SpinFuncBoc {

    @Override
    public void spinR(HashMap<String, String> cube) throws Exception {
        final HashMap<String, String> temp = new HashMap<>(cube);
        cube.replace(Cube.A02.getCoord(), temp.get(Cube.B02.getCoord()));
        cube.replace(Cube.A12.getCoord(), temp.get(Cube.B12.getCoord()));
        cube.replace(Cube.A22.getCoord(), temp.get(Cube.B22.getCoord()));
        cube.replace(Cube.B02.getCoord(), temp.get(Cube.F02.getCoord()));
        cube.replace(Cube.B12.getCoord(), temp.get(Cube.F12.getCoord()));
        cube.replace(Cube.B22.getCoord(), temp.get(Cube.F22.getCoord()));
        cube.replace(Cube.F02.getCoord(), temp.get(Cube.D20.getCoord()));
        cube.replace(Cube.F12.getCoord(), temp.get(Cube.D10.getCoord()));
        cube.replace(Cube.F22.getCoord(), temp.get(Cube.D00.getCoord()));
        cube.replace(Cube.D20.getCoord(), temp.get(Cube.A02.getCoord()));
        cube.replace(Cube.D10.getCoord(), temp.get(Cube.A12.getCoord()));
        cube.replace(Cube.D00.getCoord(), temp.get(Cube.A22.getCoord()));

        cube.replace(Cube.C11.getCoord(), temp.get(Cube.C11.getCoord()));
        cube.replace(Cube.C00.getCoord(), temp.get(Cube.C20.getCoord()));
        cube.replace(Cube.C01.getCoord(), temp.get(Cube.C10.getCoord()));
        cube.replace(Cube.C02.getCoord(), temp.get(Cube.C00.getCoord()));
        cube.replace(Cube.C12.getCoord(), temp.get(Cube.C01.getCoord()));
        cube.replace(Cube.C22.getCoord(), temp.get(Cube.C02.getCoord()));
        cube.replace(Cube.C21.getCoord(), temp.get(Cube.C12.getCoord()));
        cube.replace(Cube.C20.getCoord(), temp.get(Cube.C22.getCoord()));
        cube.replace(Cube.C10.getCoord(), temp.get(Cube.C21.getCoord()));
    }

    @Override
    public void spinRP(HashMap<String, String> cube) throws Exception {
        final HashMap<String, String> temp = new HashMap<>(cube);
        cube.replace(Cube.A02.getCoord(), temp.get(Cube.D20.getCoord()));
        cube.replace(Cube.A12.getCoord(), temp.get(Cube.D10.getCoord()));
        cube.replace(Cube.A22.getCoord(), temp.get(Cube.D00.getCoord()));
        cube.replace(Cube.B02.getCoord(), temp.get(Cube.A02.getCoord()));
        cube.replace(Cube.B12.getCoord(), temp.get(Cube.A12.getCoord()));
        cube.replace(Cube.B22.getCoord(), temp.get(Cube.A22.getCoord()));
        cube.replace(Cube.F02.getCoord(), temp.get(Cube.B02.getCoord()));
        cube.replace(Cube.F12.getCoord(), temp.get(Cube.B12.getCoord()));
        cube.replace(Cube.F22.getCoord(), temp.get(Cube.B22.getCoord()));
        cube.replace(Cube.D20.getCoord(), temp.get(Cube.F02.getCoord()));
        cube.replace(Cube.D10.getCoord(), temp.get(Cube.F12.getCoord()));
        cube.replace(Cube.D00.getCoord(), temp.get(Cube.F22.getCoord()));

        cube.replace(Cube.C11.getCoord(), temp.get(Cube.C11.getCoord()));
        cube.replace(Cube.C00.getCoord(), temp.get(Cube.C02.getCoord()));
        cube.replace(Cube.C01.getCoord(), temp.get(Cube.C12.getCoord()));
        cube.replace(Cube.C02.getCoord(), temp.get(Cube.C22.getCoord()));
        cube.replace(Cube.C12.getCoord(), temp.get(Cube.C21.getCoord()));
        cube.replace(Cube.C22.getCoord(), temp.get(Cube.C20.getCoord()));
        cube.replace(Cube.C21.getCoord(), temp.get(Cube.C10.getCoord()));
        cube.replace(Cube.C20.getCoord(), temp.get(Cube.C00.getCoord()));
        cube.replace(Cube.C10.getCoord(), temp.get(Cube.C01.getCoord()));
    }

    @Override
    public void spinL(HashMap<String, String> cube) throws Exception {
        final HashMap<String, String> temp = new HashMap<>(cube);
        cube.replace(Cube.A00.getCoord(), temp.get(Cube.D22.getCoord()));
        cube.replace(Cube.A10.getCoord(), temp.get(Cube.D12.getCoord()));
        cube.replace(Cube.A20.getCoord(), temp.get(Cube.D02.getCoord()));
        cube.replace(Cube.B00.getCoord(), temp.get(Cube.A00.getCoord()));
        cube.replace(Cube.B10.getCoord(), temp.get(Cube.A10.getCoord()));
        cube.replace(Cube.B20.getCoord(), temp.get(Cube.A20.getCoord()));
        cube.replace(Cube.F00.getCoord(), temp.get(Cube.B00.getCoord()));
        cube.replace(Cube.F10.getCoord(), temp.get(Cube.B10.getCoord()));
        cube.replace(Cube.F20.getCoord(), temp.get(Cube.B20.getCoord()));
        cube.replace(Cube.D22.getCoord(), temp.get(Cube.F00.getCoord()));
        cube.replace(Cube.D12.getCoord(), temp.get(Cube.F10.getCoord()));
        cube.replace(Cube.D02.getCoord(), temp.get(Cube.F20.getCoord()));

        cube.replace(Cube.E11.getCoord(), temp.get(Cube.E11.getCoord()));
        cube.replace(Cube.E00.getCoord(), temp.get(Cube.E20.getCoord()));
        cube.replace(Cube.E01.getCoord(), temp.get(Cube.E10.getCoord()));
        cube.replace(Cube.E02.getCoord(), temp.get(Cube.E00.getCoord()));
        cube.replace(Cube.E12.getCoord(), temp.get(Cube.E01.getCoord()));
        cube.replace(Cube.E22.getCoord(), temp.get(Cube.E02.getCoord()));
        cube.replace(Cube.E21.getCoord(), temp.get(Cube.E12.getCoord()));
        cube.replace(Cube.E20.getCoord(), temp.get(Cube.E22.getCoord()));
        cube.replace(Cube.E10.getCoord(), temp.get(Cube.E21.getCoord()));
    }

    @Override
    public void spinLP(HashMap<String, String> cube) throws Exception {

    }

    @Override
    public void spinU(HashMap<String, String> cube) throws Exception {

    }

    @Override
    public void spinUP(HashMap<String, String> cube) throws Exception {

    }

    @Override
    public void spinD(HashMap<String, String> cube) throws Exception {

    }

    @Override
    public void spinDP(HashMap<String, String> cube) throws Exception {

    }

    @Override
    public void spinF(HashMap<String, String> cube) throws Exception {

    }

    @Override
    public void spinFP(HashMap<String, String> cube) throws Exception {

    }

    @Override
    public void spinB(HashMap<String, String> cube) throws Exception {

    }

    @Override
    public void spinBP(HashMap<String, String> cube) throws Exception {

    }

    @Override
    public void spinr(HashMap<String, String> cube) throws Exception {

    }

    @Override
    public void spinrP(HashMap<String, String> cube) throws Exception {

    }

    @Override
    public void spinl(HashMap<String, String> cube) throws Exception {

    }

    @Override
    public void spinlP(HashMap<String, String> cube) throws Exception {

    }

    @Override
    public void spinu(HashMap<String, String> cube) throws Exception {

    }

    @Override
    public void spinuP(HashMap<String, String> cube) throws Exception {

    }

    @Override
    public void spind(HashMap<String, String> cube) throws Exception {

    }

    @Override
    public void spindP(HashMap<String, String> cube) throws Exception {

    }

    @Override
    public void spinf(HashMap<String, String> cube) throws Exception {

    }

    @Override
    public void spinfP(HashMap<String, String> cube) throws Exception {

    }

    @Override
    public void spinb(HashMap<String, String> cube) throws Exception {

    }

    @Override
    public void spinbP(HashMap<String, String> cube) throws Exception {

    }

    @Override
    public void spinM(HashMap<String, String> cube) throws Exception {

    }

    @Override
    public void spinMp(HashMap<String, String> cube) throws Exception {

    }

    @Override
    public void spinE(HashMap<String, String> cube) throws Exception {

    }

    @Override
    public void spinEp(HashMap<String, String> cube) throws Exception {

    }

    @Override
    public void spinS(HashMap<String, String> cube) throws Exception {

    }

    @Override
    public void spinSp(HashMap<String, String> cube) throws Exception {

    }

    @Override
    public void spinx(HashMap<String, String> cube) throws Exception {

    }

    @Override
    public void spinxP(HashMap<String, String> cube) throws Exception {

    }

    @Override
    public void spiny(HashMap<String, String> cube) throws Exception {

    }

    @Override
    public void spinyP(HashMap<String, String> cube) throws Exception {

    }

    @Override
    public void spinz(HashMap<String, String> cube) throws Exception {

    }

    @Override
    public void spinzP(HashMap<String, String> cube) throws Exception {

    }
}