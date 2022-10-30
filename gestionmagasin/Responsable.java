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
public class Responsable extends Employee {

    private double prime;

    public Responsable(double prime, int id, String nom, String adresse, double nb_heures) {
        super(id, nom, adresse, nb_heures);
        this.prime = prime;
        super.setHourPrice(10);
        super.setSuprHourPricePercentage(20);
        super.setNbHoursSupp(160);
    }

    public double getPrime() {
        return prime;
    }

    @Override
    public String toString() {
        return "Responsable{" + "id=" + super.getId() + ", nom=" + super.getNom() + ", adresse=" + super.getAdresse() + ", nb_heures=" + super.getNb_heures() + ", prime=" + prime + '}';
    }

}
