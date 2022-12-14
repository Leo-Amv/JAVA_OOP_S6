package ru.gb.oseminar6.figures;

import ru.gb.oseminar6.data.Polygon;

import java.util.Arrays;

public class Triangle extends Polygon {
    private final Double firstSide;
    private final Double secondSide;
    private final Double thirdSide;

    public Triangle(Double firstSide, Double secondSide, Double thirdSide) {
        super(Arrays.asList(firstSide,secondSide,thirdSide));
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public Double area() {
        //finish finding the area
        return null;
    }

    public Double getFirstSide() {
        return firstSide;
    }

    public Double getSecondSide() {
        return secondSide;
    }

    public Double getThirdSide() {
        return thirdSide;
    }
}
