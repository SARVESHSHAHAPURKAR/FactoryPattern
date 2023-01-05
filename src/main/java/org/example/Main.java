package org.example;

import Factory.Shape;
import Factory.ShapeFactory;

public class Main {
    public static void main(String[] args){

        ShapeFactory shapeFactoryObj = new ShapeFactory();
        Shape shape = shapeFactoryObj.getShape("Rectangle");
        shape.draw();
    }
}