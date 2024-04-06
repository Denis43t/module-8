package org.example;

public abstract class Shape implements Printable {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println(this.name);
    }
}

