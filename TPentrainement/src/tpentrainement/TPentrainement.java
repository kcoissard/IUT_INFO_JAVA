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
public class TPentrainement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Contact a = new Contact(); 
        Contact b = new Contact("aa", "aa", "1215563565");
        Client c = new Client("bb", "bb", "5656565656", 53.25);
        System.out.println(b.toString());        
        b.toString();
        c.toString();
        Fournisseur d = new Fournisseur("bb", "bb", "5656565656", 53.25, 0.5);
        d.toString();
        
        ListeContacts l = new ListeContacts();
        l.ajouterContact(a);
        l.ajouterContact(b);
        l.ajouterContact(c);
        l.ajouterContact(d);
        l.ajouterContact(a);
        l.afficherListe();
    }
    
}
