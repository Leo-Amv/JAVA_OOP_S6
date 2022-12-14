package ru.gb.oseminar6.figures;

import ru.gb.oseminar6.data.Figure;
import ru.gb.oseminar6.data.ILengthable;

public class Circle extends Figure implements ILengthable {
    private final Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double area() {
        return 3.14 * radius * radius;
    }

    @Override
    public Double length() {
        return 3.14 * radius * 2;
    }

}
