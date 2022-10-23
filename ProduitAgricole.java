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
public  class ProduitAgricole extends Produit{ 
    String type , saison  ; 
    float quantite ; 
    public ProduitAgricole(int id, String libelle,  String type ,String saison ) {
        super(id,libelle)  ;
        this.saison = saison;
        this.type = type;
    }
    
    public String toString() {
        return "Fruit{" + "id=" + super.getId() +  ", libelle=" + super.getLibelle() + ", quantite=" + quantite + ", saison=" + saison + '}';
    }

    public String getType() {
        return type;
    }

    public String getSaison() {
        return saison;
    }

    public float getQuantite() {
        return quantite;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSaison(String saison) {
        this.saison = saison;
    }

    public void setQuantite(float quantite) {
        this.quantite = quantite;
    }
    
}
