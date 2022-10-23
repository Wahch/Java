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
public abstract class Magasin {

    private int id;
    private String adresse  ;
    private String nom_mg  ;
    private int capaciteMagasin , nbEmployee;
    private Produit[] ensembleProduits;
    private Employee[] ensembleEmployee;

    public Magasin(int id, String adresse) {
        this.id = id;
        this.adresse = adresse;
        this.capaciteMagasin = 0;
        this.ensembleProduits = new Produit[50];
    }
    public Magasin(int id, String nom_mg ,  String adresse) {
        this.id = id;
        this.adresse = adresse;
        this.nom_mg = nom_mg;
        this.capaciteMagasin = 0;
        this.ensembleProduits = new Produit[50];
    }

    public int getCapaciteMagasin() {
        return capaciteMagasin;
    }

    public boolean ajouterProduit(Produit p) {
        if (this.capaciteMagasin < 50) {
            if (chercher(p) == false) {
                ensembleProduits[this.capaciteMagasin] = p;
                this.capaciteMagasin++;
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
    public boolean chercher(Employee E) {
        for (int i = 0; i < this.nbEmployee; i++) {
            if (ensembleEmployee[i].comparerE(E)) {
                return true;
            }
        }
        return false;

    }
    
    public boolean chercher(Caissier C) {
        for (int i = 0; i < this.nbEmployee; i++) {
            if (ensembleEmployee[i].comparerE(C)) {
                return true;
            }
        }
        return false;
    }

    public boolean chercher(Responsable R) {
        for (int i = 0; i < this.nbEmployee; i++) {
            if (ensembleEmployee[i].comparerE(R)) {
                return true;
            }
        }
        return false;
    }

    public boolean chercher(Vendeur V) {
        for (int i = 0; i < this.nbEmployee; i++) {
            if (ensembleEmployee[i].comparerE(V)) {
                return true;
            }
        }
        return false;
    }
    public boolean ajouterEmployee(Employee E) {
        if (this.nbEmployee < 20) {
            if (chercher(E) == false) {
                ensembleEmployee[this.nbEmployee] = E;
                this.nbEmployee++;
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
    public boolean ajouterEmployee(Caissier C) {
        if (this.nbEmployee < 20) {
            if (chercher(C) == false) {
                ensembleEmployee[this.nbEmployee] = C;
                this.nbEmployee++;
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
    public boolean ajouterEmployee(Responsable R) {
        if (this.nbEmployee < 20) {
            if (chercher(R) == false) {
                ensembleEmployee[this.nbEmployee] = R;
                this.nbEmployee++;
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
    public boolean ajouterEmployee(Vendeur V) {
        if (this.nbEmployee < 20) {
            if (chercher(V) == false) {
                ensembleEmployee[this.nbEmployee] = V;
                this.nbEmployee++;
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
    

    public String toString() {
        String res = "";
        res += ("ID: " + this.id + "\n"
                + "adresse: " + this.adresse + "\n"
                + "capacite: " + this.capaciteMagasin + "\n"
                + "Liste des produits: \n");
        for (int i = 0; i < this.capaciteMagasin; i++) {
            res += "Produit n°" + (i + 1) + ":\n";
            res += ensembleProduits[i].toString();
            res += ("------------\n");
        }
        return res;
    }

    public boolean chercher(Produit P) {
        for (int i = 0; i < this.capaciteMagasin; i++) {
            if (comparer(P, ensembleProduits[i])) {
                return true;
            }
        }
        return false;

    }

    public static boolean comparer(Produit P1, Produit P2) {
        return ((P1.getId() == P2.getId()) && (P1.getLibelle() == P2.getLibelle()) && (P1.getPrix() == P2.getPrix()));
    }

    public void suppriemr(Produit P) {
        int index = -1;
        for (int i = 0; i < capaciteMagasin; i++) {
            if (ensembleProduits[i].comparer(P)) {
                index = i;
                break;
            }
        }
        if (index == 49) {
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
     public float calculStock(){
        float nb=0;
        for (int i = 0; i < capaciteMagasin; i++) {
            if (ensembleProduits[i] instanceof ProduitFruit) {
                nb=nb+ (ensembleProduits[i].getQuantite());
            }
        }
            return nb;
    }
}
