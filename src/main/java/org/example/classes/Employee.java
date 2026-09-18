package org.example.classes;

public abstract class Employee {
    private String name;
    private double weeklyBonus =0;

    public Employee(String name){
        this.name=name;

    }
    public String getName(){
        return name;
    };

    public abstract double getSalaire();

    @Override
    public String toString() {
        return this.name;
    }
}
