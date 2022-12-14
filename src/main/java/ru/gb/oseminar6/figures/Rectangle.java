package ru.gb.oseminar6.figures;

import ru.gb.oseminar6.data.Polygon;

import java.util.Arrays;

public class Rectangle extends Polygon {
    private final Double firstSide;
    private final Double secondSide;

    public Rectangle(Double firstSide, Double secondSide) {
        super(Arrays.asList(firstSide, secondSide,firstSide,secondSide));
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public Double area() {
        return this.firstSide * this.secondSide;
    }

    public Double getFirstSide() {
        return firstSide;
    }

    public Double getSecondSide() {
        return secondSide;
    }
}
