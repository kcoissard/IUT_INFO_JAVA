/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

/**
 *
 * @author p1513278
 */
public class Etudiant {
    
    private static int num=0;
    private int numero;
    private String prenom;
    private String nom;
    
    public Etudiant(String prenom,String nom){
        this.numero+=num;
        this.prenom=prenom;
        this.nom=nom;
    }
    
    public void setNom(String nom){
        this.nom=nom;
    }
    
    public int getNumero(){
        return(this.numero);
    }
    
    public String getNom(){
        return(this.nom);
    }
    
    public String getPrenom(){
        return(this.prenom);
    }
    
}
