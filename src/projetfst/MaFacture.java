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
public class MaFacture {
    public int idFacture;
    public String dateFacture,libelleFacture,nomUtilisateur;
    public double total;

    public int getIdFacture() {
        return idFacture;
    }

    public String getDateFacture() {
        return dateFacture;
    }

    public String getLibelleFacture() {
        return libelleFacture;
    }

    public double getTotal() {
        return total;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    
    public MaFacture(int idFacture,String libelleFacture, String dateFacture , double total,String nomUtilisateur) {
        this.idFacture = idFacture;
        this.dateFacture = dateFacture;
        this.libelleFacture = libelleFacture;
        this.total = total;
        this.nomUtilisateur=nomUtilisateur;
    }
    
    
    
}
