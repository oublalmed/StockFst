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
public class Commande {
    
   public int idCmd;
   public String libelleCmd,nomUtilisateur;
   public int qteCmd;
   public int prixCmd;
   public String dateCmd;

    public Commande(int idCmd, String libelleCmd, int qteCmd, int prixCmd, String dateCmd,String nomUtilisateur) {
        this.idCmd = idCmd;
        this.libelleCmd = libelleCmd;
        this.qteCmd = qteCmd;
        this.prixCmd = prixCmd;
        this.dateCmd = dateCmd;
        this.nomUtilisateur =nomUtilisateur;
    }

    public Commande() {
    }

    public int getIdCmd() {
        return idCmd;
    }

    public String getLibelleCmd() {
        return libelleCmd;
    }

    public int getQteCmd() {
        return qteCmd;
    }

    public int getPrixCmd() {
        return prixCmd;
    }

    public String getDateCmd() {
        return dateCmd;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }
   
   
    
}
