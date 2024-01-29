package ru.gb.java.javaOOP.coords;

public class Main {
    public static void main(String[] args) {
        Vector vectorOne = new Vector(3, 3, 3);
        Vector vectorTwo = new Vector(3, 3, 3);
        System.out.println("vectorTwo = " + vectorTwo);;
        System.out.println(vectorOne);
        System.out.println("vectorOne.length() = " + vectorOne.length());
        System.out.println("vectorOne.scalarProduct(vectorTwo) = " + vectorOne.scalarProduct(vectorTwo));
        System.out.println(vectorOne.vectorMultiplication(vectorTwo));
    }
}
