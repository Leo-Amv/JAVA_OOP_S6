package ru.gb.oseminar6.figures;

import ru.gb.oseminar6.data.Polygon;

import java.util.Arrays;

public class Rectangle extends Polygon {
    private final Double firstSide;
    private final Double secondSide;

    public Rectangle(Double firstSide, Double secondSide) {
        super(Arrays.asList(firstSide,secondSide));
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    protected Double area() {
        //finish finding the area
        return null;
    }

    public Double getFirstSide() {
        return firstSide;
    }

    public Double getSecondSide() {
        return secondSide;
    }
}
