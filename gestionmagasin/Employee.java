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
public class Employee {

    private int id;
    private String nom;
    private String adresse;
    private double nb_heures;
    private double hourPrice;
    private double suprHourPricePercentage;
    private double nbHoursSupp;

    public Employee(int id, String nom, String adresse, double nb_heures) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.nb_heures = nb_heures;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public double getNb_heures() {
        return nb_heures;
    }

    public void setHourPrice(double hourPrice) {
        this.hourPrice = hourPrice;
    }

    public void setSuprHourPricePercentage(double suprHourPricePercentage) {
        this.suprHourPricePercentage = suprHourPricePercentage;
    }

    public void setNbHoursSupp(double nbHoursSupp) {
        this.nbHoursSupp = nbHoursSupp;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", nom=" + nom + ", adresse=" + adresse + ", nb_heures=" + nb_heures + '}';
    }

    public boolean comparer(Employee E) {
        return ((id == E.getId()) && (nom == E.getNom()) && (adresse == E.getAdresse()) && (nb_heures == E.getNb_heures()));
    }

    public double getSalaire() {
        if (nb_heures < nbHoursSupp) {
            return nb_heures * hourPrice;
        } else if (nb_heures >= nbHoursSupp) {
            return (nbHoursSupp * hourPrice + ((nb_heures - nbHoursSupp) * (hourPrice + hourPrice * suprHourPricePercentage / 100)));
        }
        return -1;
    }
}
