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
public class Fournisseur extends Contact {
    
    private double montantTotal;
    private double rabaisMoyen;
    
    public Fournisseur()
    {
        super();
        montantTotal = 0.0;
        rabaisMoyen = 0;
    }
    
    public Fournisseur(String _nom, String _prenom, String _numTel, double _montantTotal, double _rabaisMoyen)
    {
        super(_nom, _prenom, _numTel);
        montantTotal = _montantTotal;
        rabaisMoyen = _rabaisMoyen;
    }
    
    @Override
    public String toString()
    {
        return(super.toString()+" / montantTotal = "+montantTotal+" / rabaisMoyen = "+rabaisMoyen*100+"%");
    }
}
