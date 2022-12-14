package ru.gb.oseminar6;

import ru.gb.oseminar6.figures.Triangle;

public class Main {
    public static void main(String[] args) {
        Triangle t = new Triangle(1D,2D,3D);
        System.out.println(t.perimeter());
    }
}