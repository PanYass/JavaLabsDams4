package org.example.classes;

public class EntrepriseSatureDeCommerciauxException extends  Exception{


    private Entreprise entreprise;


    public EntrepriseSatureDeCommerciauxException(Entreprise e){
        this.entreprise=e;

    }

    public Entreprise getEntreprise(){
        return entreprise;

    }
}
