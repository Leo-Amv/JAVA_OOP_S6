package ru.gb.oseminar6.repository;

import ru.gb.oseminar6.data.Figure;
import ru.gb.oseminar6.data.IRepository;
import ru.gb.oseminar6.data.Polygon;
import ru.gb.oseminar6.figures.Circle;

import java.util.ArrayList;
import java.util.List;

public class FiguresRepository implements IRepository<Figure> {
    private final List<Figure> figures;

    public FiguresRepository() {
        this.figures = new ArrayList<>();
    }

    @Override
    public void add(Figure value) {
        this.figures.add(value);
    }

    public List<Double> allPerimeters() {
        List<Double> result = new ArrayList<>();
        for (Figure f : this.figures) {
            if (f instanceof Polygon){
                result.add(((Polygon) f).perimeter());
            }
        }
        return result;
    }

    public List<Double> allAreas() {
        List<Double> result = new ArrayList<>();
        for (Figure f : this.figures) {
            result.add(f.area());
        }
        return result;
    }

    public List<Double> allLength() {
        List<Double> result = new ArrayList<>();
        for (Figure f : this.figures) {
            if (f instanceof Circle){
                result.add(((Circle) f).length());
            }
        }
        return result;
    }
}
