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
public class FactureClient {
    
    public int idFacture,qte,prixVente;
    public double total;
    public String reference,Client,Produit;

    public FactureClient(int idFacture, String Produit, String reference  , int qte, int prixVente, double total, String Client) {
        this.idFacture = idFacture;
        this.Client = Client;
        this.Produit = Produit;
        this.qte = qte;
        this.prixVente = prixVente;
        this.total = total;
        this.reference = reference;
    }

    public int getIdFacture() {
        return idFacture;
    }

    public String getIdClient() {
        return Client;
    }

    public String getIdProduit() {
        return Produit;
    }

    public int getQte() {
        return qte;
    }

    public int getPrixVente() {
        return prixVente;
    }

    public double getTotal() {
        return total;
    }

    public String getReference() {
        return reference;
    }
    
    
    
}
