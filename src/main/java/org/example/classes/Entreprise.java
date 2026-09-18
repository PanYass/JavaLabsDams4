package org.example.classes;

import java.util.ArrayList;

public class Entreprise {
    String name;
    int nbrCommerciaux;
    public ArrayList<Employee> employees;
    int maxCommerciaux;


    public Entreprise(String name, int maxCommerciaux){
        this.employees = new ArrayList<>();
        this.name= name;
        this.maxCommerciaux=maxCommerciaux;
        this.nbrCommerciaux=0;


    }

    public void addEmployee( Employee e) throws EntrepriseSatureDeCommerciauxException{

        if(e instanceof Commercial){
            if(nbrCommerciaux<= maxCommerciaux){
                this.employees.add(e);
                this.nbrCommerciaux++;


            }
            else{
                throw new EntrepriseSatureDeCommerciauxException(this);

            }






        }else{

            this.employees.add(e);
        }







    }

}
