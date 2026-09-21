package org.example;

import org.example.classes.*;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main() {
        Commercial e1 = new Commercial("toto");
        Commercial e2 = new Commercial("titi", 1300, 6000);
        Commercial e5 = new Commercial("titi", 1100, 10000);


        e1.setInfoSalaire(1500,3000);


        HourlyEmployee e3 = new HourlyEmployee("tata");
        HourlyEmployee e4 = new HourlyEmployee ("tete", 48, 15, 0.3);

        e3.setInfoSalaire(30, 10,0.5);


        Employee [] e = new Employee[5];
         e[0] = e1;
        e[1] = e2;
        e[2] = e3;
        e[3] = e4;
        e[4] = e5;

        for(int i=0; i<5; i++){
         System.out.println(e[i].getSalaire());
        }





        Entreprise entr = new Entreprise("alti", 1);


//        try{
//
//            entr.addEmployee(e1);
//            entr.addEmployee(e3);
//            entr.addEmployee(e2);
//            entr.addEmployee(e5);
//
//
//        }catch (EntrepriseSatureDeCommerciauxException ex){
//            System.out.println("more than 3 commerciaux oops");
//
//            Entreprise erroredEntreprise = ex.getEntreprise();
//
//            for(Employee employee : erroredEntreprise.employees){
//                System.out.println(employee);
//
//            }

        try{
        FileOutputStream fw = new FileOutputStream("saved commerciaux.txt", true);
        e1.enregistreToi(fw);
        fw.close();
//            FileReader fr = new FileReader("saved commerciaux");
//
//            Commercial.lire(fr);
//            fr.close();

        }catch(Exception ex){
            ex.printStackTrace();
    }


    }
}