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
public class Fournisseur {
    public int idFournisseur;
    public String nomFournisseur;
    public String adresseFournisseur;
    public String telFournisseur;
    public String mailFournisseur;

    public Fournisseur(int idFournisseur, String nomFournisseur, String adresseFournisseur, String telFournisseur, String mailFournisseur) {
        this.idFournisseur = idFournisseur;
        this.nomFournisseur = nomFournisseur;
        this.adresseFournisseur = adresseFournisseur;
        this.telFournisseur = telFournisseur;
        this.mailFournisseur = mailFournisseur;
    }

    public Fournisseur() {
    }

    public int getIdFournisseur() {
        return idFournisseur;
    }

    public String getNomFournisseur() {
        return nomFournisseur;
    }

    public String getAdresseFournisseur() {
        return adresseFournisseur;
    }

    public String getTelFournisseur() {
        return telFournisseur;
    }

    public String getMailFournisseur() {
        return mailFournisseur;
    }
    
    
}
