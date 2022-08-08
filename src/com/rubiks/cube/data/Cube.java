package com.rubiks.cube.data;

public enum Cube {
    // white face
    A00("A00"),A01("A01"),A02("A02"),
    A10("A10"),A11("A11"),A12("A12"),
    A20("A20"),A21("A21"),A22("A22"),

    // orange face
    B00("B00"),B01("B01"),B02("B02"),
    B10("B10"),B11("B11"),B12("B12"),
    B20("B20"),B21("B21"),B22("B22"),

    // green face
    C00("C00"),C01("C01"),C02("C02"),
    C10("C10"),C11("C11"),C12("C12"),
    C20("C20"),C21("C21"),C22("C22"),

    // red face
    D00("D00"),D01("D01"),D02("D02"),
    D10("D10"),D11("D11"),D12("D12"),
    D20("D20"),D21("D21"),D22("D22"),

    // blue face
    E00("E00"),E01("E01"),E02("E02"),
    E10("E10"),E11("E11"),E12("E12"),
    E20("E20"),E21("E21"),E22("E22"),

    // yellow face
    F00("F00"),F01("F01"),F02("F02"),
    F10("F10"),F11("F11"),F12("F12"),
    F20("F20"),F21("F21"),F22("F22");

    private String coord;
    
    Cube(String coord) {
        this.coord = coord;
    }

    public String getCoord() {
        return coord;
    }
}
