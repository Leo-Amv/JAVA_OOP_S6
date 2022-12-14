package ru.gb.oseminar6.data;

import java.util.List;

public abstract class Polygon extends Figure implements IPerimeterable{
    protected List<Double> sides;

    public Polygon(List<Double> sides) {
        this.sides = sides;
    }

    @Override
    public Double perimeter() {
        Double result = 0D;
        for (Double side: this.sides) {
            result+=side;
        }
        return result;
    }
}
