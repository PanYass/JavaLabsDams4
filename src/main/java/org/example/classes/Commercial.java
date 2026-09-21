package org.example.classes;

import java.io.*;

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


    public void enregistreToi( FileOutputStream fos) throws Exception{
//       PrintWriter out  = new PrintWriter(fw);
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeUTF(getName());
        dos.writeUTF("|");
        dos.writeDouble(this.fixedSalary);
        dos.writeUTF("|");
        dos.writeDouble(this.turnover);

        dos.flush();







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
