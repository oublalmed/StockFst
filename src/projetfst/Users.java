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
public class Users {
    
   private int idUtilisateur;
    private String nomUtilisateur;
    private String prenomUtlisateur;
    private String mailUtlisateur;
    private int telUtlisateur;
    private String password;

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public String getPrenomUtlisateur() {
        return prenomUtlisateur;
    }

    public String getMailUtlisateur() {
        return mailUtlisateur;
    }

    public int getTelUtlisateur() {
        return telUtlisateur;
    }

    public String getPassword() {
        return password;
    }

    public Users(int idUtilisateur, String nomUtilisateur, String prenomUtlisateur, String mailUtlisateur, int telUtlisateur, String password) {
        this.idUtilisateur = idUtilisateur;
        this.nomUtilisateur = nomUtilisateur;
        this.prenomUtlisateur = prenomUtlisateur;
        this.mailUtlisateur = mailUtlisateur;
        this.telUtlisateur = telUtlisateur;
        this.password = password;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
