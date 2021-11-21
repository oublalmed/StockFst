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
public class Vente {
    
    public String designation,etat,reference,nomClient,dateL,stock,fournisseur,typeClient;
    public double somme,prixVente;
    public int qte,idVente,idClient,idProduit,remise,idEtat,nbrProduit,idFacture;
    public int getIdVente() {
        return idVente;
    }

    public int getIdClient() {
        return idClient;
    }

    public int getIdProduit() {
        return idProduit;
    }

    public double getPrixVente() {
        return prixVente;
    }

    public int getQte() {
        return qte;
    }

    public int getRemise() {
        return remise;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSomme() {
        return somme;
    }

    public String getEtat() {
        return etat;
    }

    public String getReference() {
        return reference;
    }

    public String getNomClient() {
        return nomClient;
    }

    public int getIdEtat() {
        return idEtat;
    }

    public String getDateL() {
        return dateL;
    }

    public String getStock() {
        return stock;
    }

    public String getFournisseur() {
        return fournisseur;
    }

    public int getNbrProduit() {
        return nbrProduit;
    }

    public String getTypeClient() {
        return typeClient;
    }

    public int getIdFacture() {
        return idFacture;
    }

    
    
    public Vente(int idVente, int qte,double prixVente,int remise,  int idClient, int idProduit,String designation, double somme,String dateL) {
        this.idVente = idVente;
        this.idClient = idClient;
        this.idProduit = idProduit;
        this.prixVente = prixVente;
        this.qte = qte;
        this.remise = remise;
        this.designation = designation;
        this.somme = somme;
        this.dateL = dateL;
        
    }

    public Vente(int idVente ,String designation, String reference, int qte , double prixVente, double somme, String nomClient,int idEtat ,String etat) {
        this.designation = designation;
        this.etat = etat;
        this.reference = reference;
        this.nomClient = nomClient;
        this.somme = somme;
        this.prixVente = prixVente;
        this.qte = qte;
        this.idVente = idVente;
        this.idEtat = idEtat;
    }

    public Vente(String reference,String designation, String stock, String fournisseur, int nbrProduit, int qte,double prixVente,int remise,double somme, String nomClient,String typeClient,   int idFacture, String etat) {
        this.designation = designation;
        this.etat = etat;
        this.reference = reference;
        this.nomClient = nomClient;
        this.typeClient = typeClient;
        this.stock = stock;
        this.fournisseur = fournisseur;
        this.somme = somme;
        this.prixVente = prixVente;
        this.qte = qte;
        this.remise = remise;
        this.nbrProduit = nbrProduit;
        this.idFacture=idFacture;
    }
    
    
    
}
