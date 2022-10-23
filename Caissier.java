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
public class Caissier extends Employee {
 private int numCaisse ; 
 public Caissier(int id, String nom , String adresse , int nbHeures , int numCaisse  ) {
        super(id,nom,adresse,nbHeures)  ;
        this.numCaisse = numCaisse ;
    }

    public int getNumCaisse() {
        return numCaisse;
    }

    public void setNumCaisse(int numCaisse) {
        this.numCaisse = numCaisse;
    }
    
    @Override
    public String toString() {
        return "Caissier{" + "id=" + super.getId() + ", nom=" + super.getNom()+ ", adresse=" + super.getAdresse()+ ", nb_heures=" + super.getNbHeures() + "numCaisse=" + numCaisse + '}';
    }
 
    
}
