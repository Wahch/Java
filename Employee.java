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
public class Employee {
    private int id , nbHeures , nbEmployee ; 
    private String nom , adresse ;
    private Employee[] ensembleEmployee;
    public Employee(int id, String nom , String adresse , int nbHeures  ) {
        this.id = id;
        this.adresse = adresse;
        this.nom = nom;
        this.nbHeures = nbHeures;
        this.nbEmployee=0 ; 
        this.ensembleEmployee = new Employee[20];
    }

    public int getId() {
        return id;
    }

    public int getNbHeures() {
        return nbHeures;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNbHeures(int nbHeures) {
        this.nbHeures = nbHeures;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public  boolean comparerE(Employee E1) {
        return ((E1.getId() == this.getId()) && (E1.getNom() == this.getNom()) && (E1.getAdresse() == this.getAdresse()));
    }
    
    

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", nbHeures=" + nbHeures + ", nom=" + nom + ", adresse=" + adresse + '}';
    }
    
    
    
}

