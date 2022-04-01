// Java 1. Homework Lesson 6
// Maria Ralko
// 01.04.2022

class HomeWorkLesson6_Interface {
    public static void main(String[] args) {
        Cat cat = new Cat(200);
        Dog dog = new Dog(500, 10);
        
        IAnimal[] animals = {cat, dog};
        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.run(175));
            System.out.println(animal.run(201));
            System.out.println(animal.run(501));
            System.out.println(animal.swim(7));
            System.out.println(animal.swim(11));
        }
        System.out.println("Total quantity of animals: " + Animal.getQuantityOfAnimals());
    }
}

class Cat extends Animal {
    Cat (int runLimit) {
        super(runLimit, -1);
    }
    @Override
    public String swim(int distance) {
        return getClassName() + "can't swim";
    }
}

class Dog extends Animal {
    Dog (int runLimit, int swimLimit) {
        super(runLimit, swimLimit);
    }
}

abstract  class Animal implements IAnimal {
    protected int runLimit;
    protected int swimLimit;
    protected String className;
    protected static int quantityOfAnimals;
    
    Animal (int runLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        className = getClass().getSimpleName();
        quantityOfAnimals++;
    }
    
    public String getClassName() {
        return className;
    }             
    
    public static int getQuantityOfAnimals() {
    return quantityOfAnimals;
}
    @Override
    public String run(int distance) {
        if  (distance > runLimit) {
            return className + " can't run " + distance;
        } else {
            return className + " ran " + distance;
        }
    }    
    
   @Override
    public String swim(int distance) {
        if  (distance > swimLimit) {
            return className + " can't swim " + distance;
        } else {
            return className + " swam " + distance;
        }
    }     
    
    @Override
    public String toString() {
        return className + ". runLimit: " + runLimit + ", swimLimit: " + swimLimit;
    }
}

interface IAnimal {
    String run(int distance);
    String swim(int distance);
}