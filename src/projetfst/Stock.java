/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetfst;

/**
 *
 * @author Hp
 */
public class Stock {
    
    public int idStock;
    public String libelle;
    public int nbrProduit;

    public Stock(int idStock, String libelle, int nbrProduit) {
        this.idStock = idStock;
        this.libelle = libelle;
        this.nbrProduit = nbrProduit;
    }

    public Stock() {
    }

    public int getIdStock() {
        return idStock;
    }

    public String getLibelle() {
        return libelle;
    }

    public int getNbrProduit() {
        return nbrProduit;
    }
    
    
}
