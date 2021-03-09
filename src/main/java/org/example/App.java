package org.example;

public class App
{
    public static void main( String[] args )
    {
        Polygon square = new Polygon.Square(5);
        Polygon circle = new Polygon.Circle(6);
        Polygon rectangle = new Polygon.Rectangle(8, 6);

        System.out.println("CUADRADO    Área = " + square.getArea() + "    Lados = " + square.getSides());
        System.out.println("Circulo    Área = " + circle.getArea() + "    Lados = " + circle.getSides());
        System.out.println("Rectángulo    Área = " + rectangle.getArea() + "    Lados = " + rectangle.getSides());
    }
}
