package org.example.classes;

public class Director extends Employee{

    public static Director d =null;
    public int baseSalary;

    private Director(String name, int baseSalary) {
        super(name);
        this.baseSalary=baseSalary;
    }
    public static Director createDirector(String name, int baseSalary){
        if(d==null){
            d= new Director(name, baseSalary);
        }
        return d;
    }
    @Override
    public double getSalaire() {
        return baseSalary + 0.004 * Commercial.totalTurnover;
    }

}
