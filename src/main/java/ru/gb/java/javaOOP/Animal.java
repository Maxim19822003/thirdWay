package ru.gb.java.javaOOP;

public class Animal{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void animalInfo() {
        System.out.println("животное по имени: " + name);
    }

    protected void voice() {
        System.out.println("животное по имени: " + name + " издало звук");
    }

    protected void jump() {
        System.out.println("животное по имени: " + name + " подпрыгнуло");
    }
}

