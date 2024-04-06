package org.example;

public class Main {
    public static void main(String[] args) {
        OutputShapeNameService outputShapeNameService = new OutputShapeNameService();
        Printable circle = new Circle("Circle");
        Printable cone = new Cone("Cone");
        Printable cube = new Cube("Cube");
        Printable pentagon = new Pentagon("Pentagon");
        Printable square = new Square("Square");
        outputShapeNameService.outputShapeName(circle);
        outputShapeNameService.outputShapeName(cone);
        outputShapeNameService.outputShapeName(cube);
        outputShapeNameService.outputShapeName(square);
        outputShapeNameService.outputShapeName(pentagon);

    }
}