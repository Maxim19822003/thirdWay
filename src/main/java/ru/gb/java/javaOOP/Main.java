package ru.gb.java.javaOOP;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1)Создать класс Cat с полями: имя,цвет,кол-во лет. Поработать с полями напрямую
        //2) Данному классу добавить инкапсуляцию + сделать валидацию на введенный возраст
        Cat catOne = new Cat("barsik","gray",4);
        System.out.println("Кот: " + catOne.getName() +
                "\n имеет цвет: " + catOne.getColor() +
                "\n возраста: " + catOne.getAge());
        catOne.setAge(100);
        System.out.println("Кот: " + catOne.getName() +
                "\n имеет цвет: " + catOne.getColor() +
                "\n возраста: " + catOne.getAge());
    }
}
