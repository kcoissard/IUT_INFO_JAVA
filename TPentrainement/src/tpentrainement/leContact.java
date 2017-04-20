/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpentrainement;

/**
 *
 * @author USER
 */
public class leContact {
    
    private String nom;
    private String prenom;
    private String numTel;
    private java.util.Date date;
    private static int compteur=0;
    private int identifiant;

    


public leContact(){
    
nom = "inconnu";
prenom = "inconnu";
numTel = "inconnu";
date = new java.util.Date();
identifiant = compteur++;
}

public leContact(String _nom, String _prenom, String _numTel){
    nom=_nom;
    prenom=_prenom;
    numTel=_numTel;
    date = new java.util.Date();
    identifiant = compteur++;
}

public void setNom(String nom){
    System.out.println("Veuillez entrer un nouveau nom :");
    nom=clavier.lireString();
}

public String getNom(){
   return(this.nom);
}

public String toString(){
    return("prenom :"+prenom+"// nom : "+ nom);
}

public boolean equals(Object other){
    if(this == other){
        return true;
    }
    
    if(other==null){
        return false;
    }
    
    if(!(other instanceof Contact)){return false;}
    
    Contact c = (Contact) other;
    
    return((this.nom==c.nom)&&(this.prenom==c.prenom)&&(this.numTel==c.numTel));
}




}

}