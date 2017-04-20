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
public class Client extends Contact {
    
    private double chiffre;
    
    public Client()
    {
        super();
        chiffre = 0.0;
    }
    
    public Client(String _nom, String _prenom, String _numTel, double _chiffre)
    {
        super(_nom, _prenom, _numTel);
        chiffre = _chiffre;
    }
    
    @Override
    public String toString()
    {
        return(super.toString()+" / chiffre = "+chiffre);
    }
}
