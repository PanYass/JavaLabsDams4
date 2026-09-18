package org.example.classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

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


    public void enregistreToi( FileWriter fw){
       PrintWriter out  = new PrintWriter(fw);
       out.println(
               this.getName() + "|"
                       + this.fixedSalary + "|"
                       + this.turnover



       );



    }


    public static void lire(FileReader fr) throws Exception{

        BufferedReader br = new BufferedReader(fr);

        String s;
        int lineCount = 0;
        while((s=br.readLine())!=null){
            String [] values = s.split("\\|");

            System.out.println(lineCount++
                    + ". name: "+ values[0]
                    + " fixed salary "+ values[1]
                    + "turn over" + values[2]


            );

        }






    }




}
