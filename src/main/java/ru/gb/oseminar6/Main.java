package ru.gb.oseminar6;

import ru.gb.oseminar6.figures.Circle;
import ru.gb.oseminar6.figures.Rectangle;
import ru.gb.oseminar6.figures.Square;
import ru.gb.oseminar6.figures.Triangle;
import ru.gb.oseminar6.repository.FiguresRepository;

public class Main {
    public static void main(String[] args) {
        Triangle ta = new Triangle(1D,2D,2D);
        Square sq = new Square(3D);
        Rectangle ra = new Rectangle(4D,5D);
        Circle cr = new Circle(6D);
        FiguresRepository figuresRepository = new FiguresRepository();
        figuresRepository.add(ta);
        figuresRepository.add(sq);
        figuresRepository.add(ra);
        figuresRepository.add(cr);
        System.out.println(figuresRepository.allAreas());
        System.out.println(figuresRepository.allPerimeters());
        System.out.println(figuresRepository.allLength());
    }
}