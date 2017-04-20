/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class leClient extends leContact {
   
    private double CA;
    
    public leClient(){
        super();
        CA = 0.0;
    }
     public leClient(String _nom, String _prenom, String numTel, double _CA){
     super(_nom, _prenom, _numTel);
     CA=_CA;
     }
    
    
    
}
