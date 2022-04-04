// Java 1. HomeWork Lesson 7
// Maria Ralko
// 04.04.2022

class HomeWorkLesson7 {
    public static void main(String[] args) {
        Cat[] cats = {
        new Cat("Markiz", 12), new Cat("Maks", 18), new Cat("Vasya", 8)
        };
        Plate plate = new Plate(40, 32);
        System.out.println(plate);   

        // cats eat for the first time 
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }
        // we add food in the plate
        System.out.println(plate);
        plate.add(36);
        System.out.println(plate);   

        // cats eat second time
        for (Cat cat : cats) {
            cat.setFullness(false); // cats are hungry
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);        
    }
}
        
class Cat {
    private String name;
    private int appetite; // cat's appetite for the first time
    private boolean fullness; 
    
    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        fullness = false;
    }
    
    void setFullness(boolean status) {
        fullness = status;
    }
    
    void eat(Plate plate) {
        if (!fullness) {
            fullness = plate.decreaseFood(appetite);
        }
    }
    
    @Override
    public String toString() {
        return "(Cat's name: " + name + ", appetite = " + appetite +
            ", fullness = " + fullness + ")";
    }
}

class Plate {
    private int maxQuantity;
    private int food;
    
    Plate(int maxQuantity, int food) {
        this.maxQuantity = maxQuantity;
        this.food = food;
    }
    
    boolean decreaseFood(int portion) {
        if (food < portion) {
            return false;
        }
        food -= portion;
        return true;
    }
    
    void add(int food) {
        if (this.food + food <= maxQuantity) {
            this.food += food;
        }
    }
    
    @Override
    public String toString() {
        return "Plate: " + food;
    }
}