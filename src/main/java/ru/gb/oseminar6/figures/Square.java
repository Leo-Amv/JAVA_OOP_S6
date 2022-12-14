package ru.gb.oseminar6.figures;

public class Square extends Rectangle {
    private final Double firstSide;

    public Square(Double firstSide) {
        super(firstSide, firstSide);
        this.firstSide = firstSide;
    }

    @Override
    public Double area() {
        return this.firstSide * this.firstSide;
    }

    @Override
    public Double getFirstSide() {
        return firstSide;
    }
}
