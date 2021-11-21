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
public class Client {
   public int idClient;
   public String nomClient,adresseClient,telClient,nomPoduit;

    public int getIdClient() {
        return idClient;
    }

    public String getTelClient() {
        return telClient;
    }

    public String getNomClient() {
        return nomClient;
    }


    

    public String getNomPoduit() {
        return nomPoduit;
    }

    
    public Client(int idClient, String nomClient,String telClient ) {
        this.idClient = idClient;
        this.telClient = telClient;
        this.nomClient = nomClient;
        
    }
   
   
   
}
