package org.example.classes;

public class Commercial extends Employee{

    private double fixedSalary;
    private double turnover ;

    public static double totalTurnover = 0;

    public Commercial(String name){
        super(name);

    }
    public Commercial(String name, double fixedSalary, double turnover){
        super(name);
        this.fixedSalary=fixedSalary;
        this.turnover=turnover;
        totalTurnover+=turnover;

    }

    public void setInfoSalaire(double fixedSalary, double turnover){
        this.fixedSalary= fixedSalary;
        this.turnover = turnover;
        totalTurnover+=turnover;


    }

    @Override
    public double getSalaire(){

        return this.fixedSalary + 0.01* this.turnover;
    }




}
