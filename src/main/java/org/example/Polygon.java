package org.example;

public interface Polygon {
    public float getArea();
    public int getSides();

    public class Square implements Polygon{
        public int side;
        public Square(int side) {
            this.side = side;
        }
        public float getArea() {
            return (float)Math.pow(this.side, 2);
        }
        public int getSides() {
            return 4;
        }
    }

    public class Circle implements Polygon{
        int radius;
        public Circle(int radius) {
            this.radius = radius;
        }
        public float getArea() {
            return (float)(Math.PI * Math.pow(this.radius, 2));
        }
        public int getSides() {
            return 0;
        }
    }

    public class Rectangle implements Polygon{
        int width;
        int height;
        public Rectangle(int width, int height) {
            this.height = height;
            this.width = width;
        }
        public float getArea() {
            return (float)(width * height);
        }
        public int getSides() {
            return 4;
        }
    }
}
