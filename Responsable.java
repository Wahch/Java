/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprob.gestionmagasin;

/**
 *
 * @author Wahch
 */
public class Responsable extends Employee {
    private int prime ; 
 public Responsable(int id, String nom , String adresse , int nbHeures , int prime ) {
        super(id,nom,adresse,nbHeures)  ;
        this.prime = prime ;
    }

    public int getPrime() {
        return prime;
    }

    public void setPrime(int prime) {
        this.prime = prime;
    }
 @Override
    public String toString() {
        return "Responsable{" + "id=" + super.getId() + ", nom=" + super.getNom()+ ", adresse=" + super.getAdresse()+ ", nb_heures=" + super.getNbHeures() + "prime=" + prime + '}';
    }
}
