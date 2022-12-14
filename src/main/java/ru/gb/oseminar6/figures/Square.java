package ru.gb.oseminar6.figures;

public class Square extends Rectangle{
    private final Double firstSide;

    public Square(Double firstSide) {
        super(firstSide,firstSide);
        this.firstSide = firstSide;
    }

    @Override
    protected Double area() {
        //finish finding the area
        return null;
    }

    @Override
    public Double getFirstSide() {
        return firstSide;
    }
}
