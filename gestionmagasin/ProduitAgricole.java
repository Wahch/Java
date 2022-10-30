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
public class ProduitAgricole extends Produit{
    private String saison;
    private float quantite;

    public ProduitAgricole(String saison, float quantite, int id, String libelle) {
        super(id, libelle);
        this.saison = saison;
        this.quantite = quantite;
    }

    public String getSaison() {
        return saison;
    }

    public float getQuantite() {
        return quantite;
    }

    @Override
    public String toString() {
        return  "id=" + super.getId() + ", libelle=" + super.getLibelle() + "saison=" + saison + ", quantite=" + quantite;
    }
    
    
    
}
