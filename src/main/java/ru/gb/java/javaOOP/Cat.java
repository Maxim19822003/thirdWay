package ru.gb.java.javaOOP;

public class Cat extends Animal {

    private String color;
    private Integer age;

    public Cat(String name, String color, Integer age) {
        super(name);
        this.color = color;
        this.age = age;
    }

    public Cat() {
    }

    @Override
    protected void animalInfo() {
        super.animalInfo();
    }

    @Override
    protected void voice() {
        System.out.println(toString() + " Мяукает!");
    }

    @Override
    protected void jump() {
        super.jump();
    }

    public void setAge(Integer age) {
        if (age >= 0 && age < 40) {
            this.age = age;
        } else {
            System.out.println("Введенный возраст некорректен! ");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + super.getName() + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
