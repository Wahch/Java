/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprob.gestionmagasin;

import java.util.Comparator;

/**
 *
 * @author Trunks
 */
public class Magasin {

    private int id;
    private String name;
    private String adresse;
    private int capaciteMagasin;
    private int nbEmployees;
    private Produit[] ensembleProduits;
    private Employee[] ensembleEmployees;
    private String currency = "TND";
    private static int maxProduits = 2;
    private static int maxEmployees = 20;

    public Magasin(int id, String name, String adresse) {
        this.id = id;
        this.name = name;
        this.adresse = adresse;
        this.capaciteMagasin = 0;
        this.ensembleProduits = new Produit[maxProduits];
        this.nbEmployees = 0;
        this.ensembleEmployees = new Employee[maxEmployees];

    }

    public Magasin(int id, String adresse) {
        this.id = id;
        this.adresse = adresse;
        this.capaciteMagasin = 0;
        this.ensembleProduits = new Produit[maxProduits];
        this.nbEmployees = 0;
        this.ensembleEmployees = new Employee[maxEmployees];
    }

    public int getCapaciteMagasin() {
        return capaciteMagasin;
    }

    public static boolean comparer(Produit P1, Produit P2) {
        return ((P1.getId() == P2.getId()) && (P1.getLibelle() == P2.getLibelle()) && (P1.getPrix() == P2.getPrix()));
    }

    public boolean chercher(Produit P) {
        for (int i = 0; i < this.capaciteMagasin; i++) {
            if (comparer(P, ensembleProduits[i])) {
                return true;
            }
        }
        return false;
    }

    public boolean chercher(Employee E) {
        for (int i = 0; i < this.nbEmployees; i++) {
            if (ensembleEmployees[i].comparer(E)) {
                return true;
            }
        }
        return false;

    }

    public boolean chercher(Caissier C) {
        for (int i = 0; i < this.nbEmployees; i++) {
            if (ensembleEmployees[i].comparer(C)) {
                return true;
            }
        }
        return false;
    }

    public boolean chercher(Responsable R) {
        for (int i = 0; i < this.nbEmployees; i++) {
            if (ensembleEmployees[i].comparer(R)) {
                return true;
            }
        }
        return false;
    }

    public boolean chercher(Vendeur V) {
        for (int i = 0; i < this.nbEmployees; i++) {
            if (ensembleEmployees[i].comparer(V)) {
                return true;
            }
        }
        return false;
    }

    public boolean ajouter(Produit p) throws MagasinPleinException, PrixNegatifException {
        if (p.getPrix() < 0) {
            throw new PrixNegatifException("Le prix est négative");
        }
            if (chercher(p) == false) 
            try{
                ensembleProduits[this.capaciteMagasin] = p;
                this.capaciteMagasin++;
                return true;
            }  
            catch (Exception e) {
                throw new MagasinPleinException("Nombre maximal de produits est: " + maxProduits);
            }
            else {
                return false;
            }
        
       
    }

    public boolean ajouter(Employee E) {
        if (this.nbEmployees < maxEmployees) {
            if (chercher(E) == false) {
                ensembleEmployees[this.nbEmployees] = E;
                this.nbEmployees++;
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public boolean ajouter(Caissier C) {
        if (this.nbEmployees < maxEmployees) {
            if (chercher(C) == false) {
                ensembleEmployees[this.nbEmployees] = C;
                this.nbEmployees++;
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public boolean ajouter(Responsable R) {
        if (this.nbEmployees < maxEmployees) {
            if (chercher(R) == false) {
                ensembleEmployees[this.nbEmployees] = R;
                this.nbEmployees++;
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public boolean ajouter(Vendeur V) {
        if (this.nbEmployees < maxEmployees) {
            if (chercher(V) == false) {
                ensembleEmployees[this.nbEmployees] = V;
                this.nbEmployees++;
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String res = "";
        res += ("ID: " + this.id + "\n"
                + "Nom: " + this.name + "\n"
                + "Adresse: " + this.adresse + "\n"
                + "Capacite: " + this.capaciteMagasin + "\n"
                + "Liste des produits: \n");
        for (int i = 0; i < this.capaciteMagasin; i++) {
            res += "Produit n°" + (i + 1) + ":\n";
            res += ensembleProduits[i].toString() + ":\n";
        }
        if (this.capaciteMagasin == 0) {
            res += "0 produits";
        }
        res += "\nListe des employées: \n";
        for (int i = 0; i < this.nbEmployees; i++) {
            res += "Employee n°" + (i + 1) + ":\n";
            res += ensembleEmployees[i].toString() + "\n";
        }
        if (this.nbEmployees == 0) {
            res += "0 Employées";
        }
        return res;
    }

    public void suppriemr(Produit P) {
        int index = -1;
        for (int i = 0; i < capaciteMagasin; i++) {
            if (ensembleProduits[i].comparer(P)) {
                index = i;
                break;
            }
        }
        if (index == maxProduits - 1) {
            ensembleProduits[index] = null;
        }
        for (int i = index; i < capaciteMagasin; i++) {
            ensembleProduits[i] = ensembleProduits[i + 1];
        }
        capaciteMagasin--;
        ensembleProduits[capaciteMagasin] = null;
    }

    public static Magasin compareNbProduits(Magasin M1, Magasin M2) {
        if (M1.capaciteMagasin > M2.capaciteMagasin) {
            return M1;
        } else if (M1.capaciteMagasin < M2.capaciteMagasin) {
            return M2;
        }
        return null;
    }

    public String getEemployeesSalaries() {
        String res = "Affichage des salaires des employées:\n";
        for (int i = 0; i < this.nbEmployees; i++) {
            res += "Employee n°" + (i + 1) + ":\n";
            res += ensembleEmployees[i].toString() + " Salary: " + ensembleEmployees[i].getSalaire() + " " + currency + "\n";
        }
        return res;
    }
    
    public float calculStock(){
        float totalQuantite = 0f;
        for (int i = 0; i < this.capaciteMagasin; i++) {
            //if (ensembleProduits[i] instanceof ProduitFruit){
            if (ensembleProduits[i].determinerTypeProduit().equals("Fruit")){
                totalQuantite += ((ProduitAgricole) ensembleProduits[i]).getQuantite();
            }
        }
        return totalQuantite;
    }
}
