package ru.gb.oseminar6.repository;

import ru.gb.oseminar6.data.Figure;
import ru.gb.oseminar6.data.IRepository;

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
    public List<Double> allPerimeters(){
        //finish finding perimeters
        return null;
    }
    public List<Double> allAreas(){
        //finish finding areas
        return null;
    }
    public List<Double> allLength(){
        //finish finding lengths
        return null;
    }
}
