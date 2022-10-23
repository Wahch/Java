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
public class Vendeur extends Employee {
    private int tauxDeVente ; 
 public Vendeur(int id, String nom , String adresse , int nbHeures , int tauxDeVente ) {
        super(id,nom,adresse,nbHeures)  ;
        this.tauxDeVente = tauxDeVente ;
    }

    public int getTauxDeVente() {
        return tauxDeVente;
    }

    public void setTauxDeVente(int tauxDeVente) {
        this.tauxDeVente = tauxDeVente;
    }
 @Override
    public String toString() {
        return "Vendeur{" + "id=" + super.getId() + ", nom=" + super.getNom()+ ", adresse=" + super.getAdresse()+ ", nb_heures=" + super.getNbHeures() + "taux de vente=" + tauxDeVente + '}';
    }
    
}
