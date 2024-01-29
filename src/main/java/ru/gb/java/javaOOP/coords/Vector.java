package ru.gb.java.javaOOP.coords;

public class Vector {
    private int x;
    private int y;
    private int z;

    public Vector() {
        x = 0;
        y = 0;
        z = 0;
    }
    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector:\n" +
                "x = " + x +
                ", y = " + y +
                ", z = " + z;
    }

    /**
     * @apiNote метод, вычисляющий длину вектора
     * @return длина
     */
    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    /**
     * @apiNote Метод для вычисления скалярного произведения
     * @param vectorTwo вектор, с которым производится умножение
     * @return скаляр
     */
    public double scalarProduct(Vector vectorTwo) {
        return x * vectorTwo.x + y * vectorTwo.y + z * vectorTwo.z;
    }

    /**
     * @apiNote метод, вычисляющий векторное произведение с другим вектором:
     * @param vectorTwo
     * @return результат
     */
    public Vector vectorMultiplication(Vector vectorTwo) {
        return new Vector(
                y*vectorTwo.z-z*vectorTwo.y,
                z*vectorTwo.x-x*vectorTwo.z,
                x*vectorTwo.y-y*vectorTwo.x
        );
    }

    public double cos(Vector vectorTwo) {
        return scalarProduct(vectorTwo) / (vectorTwo.length() * length());
    }
}

