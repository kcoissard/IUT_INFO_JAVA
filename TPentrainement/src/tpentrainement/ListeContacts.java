/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpentrainement;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator ;
/**
 *
 * @author p1300657
 */
public class ListeContacts {
    
    List <Contact> list = new ArrayList(); 
    
    public void ajouterContact(Contact _contact)
    {      
        boolean present = false;
        Iterator<Contact> iter = this.list.iterator() ;
        while( iter.hasNext() ){
            Contact o = iter.next() ;
            if(o.equals(_contact)) present = true;
        }
        if(present==false)  list.add(_contact);
        else System.out.println("le contact existe deja");
    }
    
    public void afficherListe()
    {
        Iterator<Contact> iter = this.list.iterator() ;
        while( iter.hasNext() ){
            Contact o = iter.next() ;
            System.out.println(o.toString());
        }
    }
    
    
}



