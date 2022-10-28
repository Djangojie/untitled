package com.company;

public abstract class Customer {
    public abstract void eat();

public class Cat extends Animal{
    public void eat() {
        System.out.println("吃鱼");
    }
    }

public class Pig extends Animal{
    public void eat() {
        System.out.println("吃猪食");
    }
}

public class Feeder {
    private String name; //姓名

    public void feed(Pig pig){
        System.out.println(this.name+"喂"+"pig");
        dog.eat();
    }

    public void feed(Cat cat){
        System.out.println(this.name+"喂"+"cat");
        cat.eat();
    }

    public void feed(Animal animal){
        System.out.println(this.name+"喂"+animal);
        animal.eat();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


public class Test {
    public static void main(String[] args) {
        Dog pig = new Pig();
        Cat cat = new Cat();
        Feeder m1 = new Feeder();
        Feeder m2 = new Feeder();
        Feeder m3 = new Feeder();
        feeder.feed(pig);
        feeder.feed(cat);
    }
}


