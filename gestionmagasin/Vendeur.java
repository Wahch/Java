/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprob.gestionmagasin;

/**
 *
 * @author Trunks
 */
public class Vendeur extends Employee {

    private double tauxDeVente;

    public Vendeur(double tauxDeVente, int id, String nom, String adresse, double nb_heures) {
        super(id, nom, adresse, nb_heures);
        this.tauxDeVente = tauxDeVente;
    }

    @Override
    public String toString() {
        return "Vendeur{" + "id=" + super.getId() + ", nom=" + super.getNom() + ", adresse=" + super.getAdresse() + ", nb_heures=" + super.getNb_heures() + ", tauxDeVente=" + tauxDeVente + '}';
    }

    @Override
    public double getSalaire() {
        return 450 * tauxDeVente;
    }

}
