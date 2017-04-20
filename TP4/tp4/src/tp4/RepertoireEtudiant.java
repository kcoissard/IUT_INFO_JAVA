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
public class RepertoireEtudiant {
    
    private Etudiant[] repertoire;
    private int nbMax;
    private int nbE;
    
    public RepertoireEtudiant(int nbMax){
        this.nbMax=nbMax;
        Etudiant[] repertoire=new Etudiant[nbMax];
        nbE=0;
    }
    
    public boolean ajouterEtudiant(Etudiant e){
        if(nbE==nbMax) return false;
        else {
            repertoire[nbE]=e;
            nbE++;
            return true;
        }
    }
    
    public int getNbEtudiant(){
        return(nbE);
    }
    
    public String getNom(int numeroEtu){
        for(int i=0;i<nbE;i++){
            if(repertoire[i].getNumero()==numeroEtu) return repertoire[i].getNom();
        }
        return("Inexistant");
    }
    
    public int getNumero(String nom){
        for(int i=0;i<nbE;i++){
            if(repertoire[i].getNom().toLowerCase()==nom.toLowerCase()) return repertoire[i].getNumero();
        }
        return(-9999);
    }
    
    public boolean supprimerEtudiant(Etudiant e){
        for(int i=0;i>nbE;i++){
            if(repertoire[i]==e){
                for(int j=i+1;j<nbE;j++){
                    repertoire[j-1]=repertoire[j];
                }
                nbE--;
                return true;
            }
        }
        return false;
    }
}
