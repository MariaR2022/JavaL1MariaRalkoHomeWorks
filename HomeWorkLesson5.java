/**
 * Java L1. Homework 5
 *
 * Maria Ralko
 * 23.02.2022
 */

class HomeWorkLesson5 {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan Ivanovich", "SalesManager", "ivanov_ii@mail.ru", 1121212, 50000, 28);
        persArray[1] = new Person("Petrov Petr Petrovich", "SalesDirector", "petrov_pp@mail.ru", 1131313, 100000, 45);
        persArray[2] = new Person("Sidorov Sidor Sidorovich", "FinancialAnalyst", "sidorov_ss@mail.ru", 1141414, 80000, 41);
        persArray[3] = new Person("Sokolov Denis Fedorovich", "SalesManager", "sokolov_df@mail.ru", 1151515, 50000, 25);
        persArray[4] = new Person("Belov Andrey Andreevich", "Administrator", "belov_aa@mail.ru", 1161616, 55000, 58); 
        
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) {
                System.out.println(persArray[i] + " ");
            }
        }
        System.out.println();
    }
}

class Person {
    private String name;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;
    
    Person (String name, String position, String email, int phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    
    public int getAge() {
        return age;    
    }
            
    @Override
    public String toString() {
        return name + ", " + position + ", " + email + ", " + phone + ", " + salary + ", " + age;
    } 
        
}