package com.factory;

import com.factory.*;

public class Main {
    public static void main(String[] args) {
        Shape rect = ShapeFactory.createShape("rectangle");
        rect.me();
    }
}

public class ShapeFactory {
    public static Shape createShape(String shapeType) {
        switch (shapeType){
            case("circle"):
                return new Circle();
            case("rectangle"):
                System.out.println(shapeType);
                return new Rectangle();
            default:
                return null;
        }
    }
}

interface Shape {
    public void me();
}

public class Circle implements Shape {
    public void me(){
       System.out.println("Circle Class");
    }
}

public class Rectangle implements Shape{
    public void me() {
        System.out.println("Rect Class");
    }
}


