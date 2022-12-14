package ru.gb.oseminar6.figures;

import ru.gb.oseminar6.data.Figure;
import ru.gb.oseminar6.data.ILengthable;

public class Circle extends Figure implements ILengthable {
    private final Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    protected Double area() {
        //finish finding the area
        return null;
    }

    @Override
    public Double length() {
        //finish finding length
        return null;
    }

}
