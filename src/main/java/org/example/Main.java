package org.example;

public class Main {
    public static void main(String[] args) {
        OutputShapeNameService outputShapeNameService=new OutputShapeNameService();
        Shape circle=new Circle();
        Shape cone=new Cone();
        Shape cube=new Cube();
        Shape pentagon=new Pentagon();
        Shape square=new Square();
        outputShapeNameService.outputShapeName(circle);
        outputShapeNameService.outputShapeName(cube);
        outputShapeNameService.outputShapeName(cone);
        outputShapeNameService.outputShapeName(pentagon);
        outputShapeNameService.outputShapeName(square);
    }
}