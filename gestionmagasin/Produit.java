/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprob.gestionmagasin;

import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author Trunks
 */
public class Produit implements Critere {
    
    private int id;
    private String libelle, marque;
    private float prix;
    private LocalDateTime expirationDate;
    
    public void setPrix(float nvPrice) {
        if (prix >= 0) {
            prix = nvPrice;
        }
    }
    
    public int getId() {
        return id;
    }
    
    public String getLibelle() {
        return libelle;
    }
    
    public String getMarque() {
        return marque;
    }
    
    public float getPrix() {
        return prix;
    }
    
    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }
    
    public void setId(int nvId) {
        id = nvId;
    }
    
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    
    public void setExpirationDate(LocalDateTime date) {
        this.expirationDate = date;
    }
    
    public Produit() {
    }
    
    public Produit(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }
    
    public Produit(int id, String libelle, String marque, float prix) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
    //    if (this.prix >= 0) {
            this.prix = prix;
      //  } 
    }
    
    public Produit(int id, String libelle, String marque) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        
    }
    
    public void afficher() {
        System.out.println("ID: " + this.id);
        System.out.println("libelle: " + this.libelle);
        System.out.println("marque: " + this.marque);
        System.out.println("prix: " + this.prix);
        System.out.println("-------------------------------");
    }

    /*public String toString() {
        return "ID: " + id + "\n" + "libelle: " + libelle + "\n" + "marque: " + marque + "\n" + "prix: " + prix + "\nDate: " + expirationDate + "\n";
    }*/
    @Override
    public String toString() {
        return "Produit{" + "id=" + id + ", libelle=" + libelle + ", marque=" + marque + ", prix=" + prix + ", expirationDate=" + expirationDate + '}';
    }

    /*@Override
    public String toString() {
        return "Produit{" + "id=" + id + ", libelle=" + libelle + ", quantite=" + quantite + '}';
    }*/
    public boolean comparer(Produit P) {
        return ((P.id == id) && (P.libelle.equals(libelle)) && (P.prix == prix));
    }
    
    public String determinerTypeProduit() {
        if (this instanceof ProduitFruit) {
            return "Fruit";
        } else if (this instanceof ProduitLegume) {
            return "Legume";
        } else {
            return "autre";
        }
    }
    
    @Override
    public boolean estFrais(String saison) {
        if (determinerTypeProduit().equals("Fruit")) {
            String ch1 = (saison.toLowerCase());
            String ch2 = (((ProduitAgricole) this).getSaison().toLowerCase());
            boolean test = ch1.equals(ch2);
            if (test) {
                return true;
            }
        }
        if (determinerTypeProduit().equals("Legume")) {
            int monthNumber = getMounthNumber(((ProduitAgricole) this).getSaison());
            int parmMonthNumber = getMounthNumber(saison);
            if (monthNumber == -1 || parmMonthNumber == -1) {
                return false;
            } else {
                boolean test = (parmMonthNumber - monthNumber) == 0 || (parmMonthNumber - monthNumber) == 1;
                if (test) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }
    
    private int getMounthNumber(String monthName) {
        switch (monthName.toLowerCase()) {
            case "janvier":
                return 1;
            case "fevrier":
                return 2;
            case "mars":
                return 3;
            case "avril":
                return 4;
            case "mai":
                return 5;
            case "juin":
                return 6;
            case "juillet":
                return 7;
            case "aout":
                return 8;
            case "septembre":
                return 9;
            case "octobre":
                return 10;
            case "novembre":
                return 11;
            case "décembre":
                return 12;
            default:
                return -1;
        }
    }
}
