/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprob.gestionmagasin;

import java.time.LocalDateTime;

import java.time.LocalDate;

public class GestionMagasin {

    public static void main(String[] args) throws PrixNegatifException, MagasinPleinException {
        System.out.println("--------------- Prosit 5 Polymorphisme ----------------");
        System.out.println("--------------- Question 2 ----------------");
        Produit P1 = new ProduitFruit(1254, "Fraise", 12.3f, "mars");
        Produit P2 = new ProduitFruit(1224, "Pastèque", 50f, "Juin");
        Produit P3 = new ProduitFruit(7896, "Mandarine", 25.6f, "Décembre");
        Produit P4 = new ProduitLegume(8521, "Artichauts", 14f, "Janvier");
        System.out.println("--------------- Question 3 ----------------");
        Magasin MC = new Magasin(1, "Carrefour", "Centre-Ville");
        MC.ajouter(P1);
        MC.ajouter(P2);
        MC.ajouter(P3);
        MC.ajouter(P4);
        System.out.println(MC.toString());
        System.out.println("--------------- Question 4 ----------------");
        System.out.println("Le type du P1: " + P1.determinerTypeProduit());
        System.out.println("Le type du P4: " + P4.determinerTypeProduit());
        Produit P5 = new Produit(1, "libelle", "marque");
        System.out.println("Le type du P5: " + P5.determinerTypeProduit());
        System.out.println("--------------- Question 5 ----------------");
        System.out.println("La quantite total des fruits: " + MC.calculStock());
        System.out.println("--------------- Question 6 ----------------");
        System.out.println(P1.estFrais("MaRs"));
        System.out.println(P4.estFrais("fevrier"));
        Magasin ME = new Magasin(1, "TUNIS");
        Produit Pe1 = new Produit(1, "CHOCO");
        Produit PE5 = new Produit(4, "lait" , "Delice" , -5.5f);
        Produit PE2 = new Produit(2, "JUS");
        Produit PE3 = new Produit(3, "Coca");
        
     
         ME.ajouter(PE5);
        ME.ajouter(Pe1);
        ME.ajouter(PE2);
        ME.ajouter(PE3);
       
    }
}
