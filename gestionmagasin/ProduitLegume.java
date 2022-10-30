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
public class ProduitLegume extends ProduitAgricole {

    public ProduitLegume(int id, String libelle, float quantite, String saison) {
        super(saison, quantite, id, libelle);
    }
}
