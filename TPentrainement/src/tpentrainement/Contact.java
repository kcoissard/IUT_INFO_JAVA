/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpentrainement;

/**
 *
 * @author p1300657
 */
public class Contact {
    
    private String nom;
    private String prenom;
    private String numTel;
    private java.util.Date date;
    private static int identifiant = 1;
    private int monIdentifiant;
    
    public Contact()
    {
        nom = "inconnu";
        prenom = "inconnu";
        numTel = "inconnu";
        date = new java.util.Date();
        monIdentifiant = identifiant++;
    }
    
    public Contact(String _nom, String _prenom, String _numTel)
    {
        nom = _nom;
        prenom = _prenom;
        numTel = _numTel;
        date = new java.util.Date();
        monIdentifiant = identifiant++;
    }
    
    public String toString()
    {
       return("nom : "+nom+" / prenom : "+prenom+" / numero de telephone : "+numTel+" / date : "+date+" / identifiant : "+monIdentifiant);
    }
    
    public boolean equals(Object other)
    {
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }
        
        if( !(other instanceof Contact) ) return false;
        
        Contact c = (Contact) other;
        
        return ((this.nom == c.nom) && (this.prenom == c.prenom) && (this.numTel == c.numTel));
    }
    
    
    
    
}
