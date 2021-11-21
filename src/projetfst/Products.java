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
public class Products {
    
  public  int idProduit ;
  public  String referenceProduit;
  public  String designationProduit;
  public String s,f;
  public int remise,qte;
  public int prix;

    public Products(int idProduit, String referenceProduit, String designationProduit, String s,int qte, String f, int remise, int prix) {
        this.idProduit = idProduit;
        this.referenceProduit = referenceProduit;
        this.designationProduit = designationProduit;
        this.s=s;
        this.f =f;
        this.remise=remise;
        this.prix = prix;
        this.qte=qte;
    }


    public int getIdProduit() {
        return idProduit;
    }

    public String getReferenceProduit() {
        return referenceProduit;
    }

    public String getDesignationProduit() {
        return designationProduit;
    }

    public String getS() {
        return s;
    }

    public String getF() {
        return f;
    }

    public int getRemise() {
        return remise;
    }

    public int getPrix() {
        return prix;
    }

    public int getQte() {
        return qte;
    }
   
    
  
}
