package org.example.classes;

public class HourlyEmployee extends Employee{

    private double nbHours;
    private double rate;
    private double percentage;


    public void setInfoSalaire(double nbHours, double rate, double percentage){
        this.nbHours= nbHours;
        this.rate=rate;
        this.percentage=percentage;




    }

    public HourlyEmployee(String name){
        super(name);



    }

    public HourlyEmployee(String name, double nbHours, double rate, double percentage){
        super(name);

        this.nbHours = nbHours;
        this.rate= rate;
        this.percentage=percentage;



    }



    @Override
    public double getSalaire() {
        double salary;
        if(nbHours >= 35){
            salary = 35 * rate + (nbHours-35)*rate*(1+percentage);}
        else{
            salary = nbHours*rate;
        }

        return salary;
    }
}
