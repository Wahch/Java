/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprob.gestionmagasin;

import java.time.LocalDateTime;

import java.time.LocalDate;

public class GestionMagasin {

    public static void main(String[] args) {
        Produit P1 = new Produit();
        Produit P2 = new Produit(1021, "Lait", "Delice");
        Produit P3 = new Produit(2510, "Yaourt", "Vitalait");
        Produit P4 = new Produit(3250, "Tomate", "Sicam", 1.2f);
        //3
        System.out.println("--------------- Question 3----------------");
        P4.afficher();
        //4
        System.out.println("--------------- Question 4 ----------------");
        P4.setPrix(0.7f);
        P4.afficher();
        //5
        //System.out.println("--------------- Question 5 ----------------");
        P2.setPrix(0.8f);
        P3.setPrix(0.9f);
        P1.setId(1);
        P1.setLibelle("Gazouz");
        P1.setLibelle("Booga");
        P1.setPrix(1.8f);
        System.out.println("--------------- Question 6 ----------------");
        P1.afficher();
        P2.afficher();
        P3.afficher();
        System.out.println("--------------- Question 7 ----------------");
        System.out.println(P1.toString());
        System.out.println("--------------- Question 8 ----------------");
        P1.setExpirationDate(LocalDate.of(1985, 1, 1).atTime(6, 46));
        System.out.println(P1.toString());
        System.out.println("--------------- Partie 2 ----------------");
        Magasin M1 = new Magasin(1, "Nabeul");
        M1.ajouterProduit(P4);
        M1.ajouterProduit(P1);
        M1.ajouterProduit(P2);
        System.out.println(M1.toString());
        System.out.println("--------------- Partie 3 ----------------");
        Produit P5 = new Produit(1, "a", "b", 1.2f);
        Produit P6 = new Produit(1, "a", "b", 1.2f);
        System.out.println("--------------- Question 1----------------");
        System.out.println(M1.comparer(P5, P6));
        System.out.println(P6.comparer(P5));
        System.out.println("--------------- Question 2 ----------------");
        System.out.println(M1.chercher(P1));
        System.out.println(M1.chercher(P6));
        System.out.println("--------------- Question 3----------------");
        Produit P7 = new Produit(3, "a", "b", 1.2f);
        M1.ajouterProduit(P7);
        M1.ajouterProduit(P7);
        System.out.println(M1.toString());
        System.out.println("--------------- Question 4 ----------------");
        M1.suppriemr(P1);
        System.out.println(M1.toString());
        System.out.println("--------------- Question 5 ----------------");
        Magasin M2 = new Magasin(2, "Tunis");
        System.out.println(Magasin.compareNbProduits(M1, M2));
        Magasin M3 = new Magasin(1,"carrefour","centre ville") ;
        Magasin M4 = new Magasin(2,"monoprix","menzah 6 ") ;
        Caissier C1 = new Caissier(1 , "Mohamed" , "tunis" , 25 , 1) ;
        Caissier C2 = new Caissier(2 , "Wahch" , "Manouba" , 20 , 2) ;
        Vendeur V1 = new Vendeur (3 , "Majd" , "Enasser" , 20 , 22) ; 
        Responsable R1 = new Responsable (4 , "Tebssi" , "Ariana" , 20 , 220) ;
        M3.ajouterEmployee(C1) ;
        M3.ajouterEmployee(C2) ;
        M3.ajouterEmployee(V1) ;
        M3.ajouterEmployee(R1) ; 
        Caissier C3 = new Caissier(5 , "Yacine" , "Nabeul" , 23 , 1) ;
        Vendeur V2 = new Vendeur (6 , "Khouni" , "Jasmin" , 24 , 62) ; 
        Vendeur V3 = new Vendeur (7, "Fahed" , "Esprit" , 28 , 23) ; 
        Vendeur V4 = new Vendeur (8 , "Maatoug" , "zarzis" , 50 , 24) ;
        Responsable R2 = new Responsable (9 , "Ahmed" , "Sokra" , 20 , 240) ;
        M4.ajouterEmployee(C3) ;
        M4.ajouterEmployee(V2) ;
        M4.ajouterEmployee(V3) ;
        M4.ajouterEmployee(V4) ; 
        M4.ajouterEmployee(R2) ;
        System.out.println(C1.toString());
        System.out.println(C2.toString());
        System.out.println(V1.toString());
        System.out.println(R1.toString());
        System.out.println(C3.toString());
        System.out.println(V2.toString());
        System.out.println(V3.toString());
        System.out.println(R2.toString());
        Produit P8 = new Produit(21, "hh", "h", 1.2f);
        Produit P9 = new Produit(22, "HCHC", "R", 1.6f);
        Produit P10 = new Produit(23, "HYHY", "F", 1.3f);
        Produit P11 = new Produit(24, "ABAB", "TY", 1.4f);
        M3.ajouterProduit(P8);
        M3.ajouterProduit(P9);
        M4.ajouterProduit(P10) ;
        M4.ajouterProduit(P11) ;
        System.out.println(M3.toString());
        System.out.println(M4.toString());
        ProduitFruit PF1 = new ProduitFruit(1254, "fraise"  ,  12.3f , "mars") ; 
        ProduitFruit P2F = new ProduitFruit(1224, "Pasteque"  ,  50.0f , "Juin") ;
        ProduitFruit P3F = new ProduitFruit(7896, "Mandarine"  ,  25.6f , "Decembre") ;
        ProduitFruit P4F = new ProduitFruit(8521, "Artichauts"  ,  14.0f , "Janvier") ;
        M3.ajouterProduit(PF1);
        M3.ajouterProduit(P2F);
        M3.ajouterProduit(P3F);
        M3.ajouterProduit(P4F);
      
        
    }
}
