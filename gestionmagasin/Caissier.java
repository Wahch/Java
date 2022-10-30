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
public class Caissier extends Employee {

    private int numeroDeCaisse;

    public Caissier(int numeroDeCaisse, int id, String nom, String adresse, double nb_heures) {
        super(id, nom, adresse, nb_heures);
        this.numeroDeCaisse = numeroDeCaisse;
        super.setHourPrice(5);
        super.setSuprHourPricePercentage(15);
        super.setNbHoursSupp(180);
    }

    public int getNumeroDeCaisse() {
        return numeroDeCaisse;
    }

    @Override
    public String toString() {
        return "Caissier{" + "id=" + super.getId() + ", nom=" + super.getNom() + ", adresse=" + super.getAdresse() + ", nb_heures=" + super.getNb_heures() + ", numeroDeCaisse=" + numeroDeCaisse + '}';
    }
}
