
package TP2;


public class TestEntierContraint {
    
    public static void main(String [] args){
        System.out.println("EXERCICE 1 ET 2 :");
        EntierContraint test = new EntierContraint (1,5,4);
        test.affiche();
        test.saisir();
        test.affiche();
        test.incr(1);
        System.out.print("Après incrémentation, ");
        test.affiche();
        
        System.out.println("\nEXERCICE 3 :");
        System.out.println("La valeur est "+test.get_val()+" comprise entre "+test.get_min()+" et "+test.get_max());
        test.set_val(3);
        System.out.println("On a mis la valeur de l'entier à "+ test.get_val());
        test.affiche();
        
        System.out.println("\nEXERCICE 4 :");
        System.out.println("Entrez un nombre d'heures, puis de minutes, puis de secondes :");
        int heure=Clavier.lireInt();
        int minute=Clavier.lireInt();
        int seconde=Clavier.lireInt();
        SexagesimalHMS heure1=new SexagesimalHMS(heure,minute,seconde);
        System.out.println("En sexagésimal, votre heure est "+heure1.getDec()+"\n");
        System.out.println("Entrez une heure sous format décimal :");
        float dec=Clavier.lireFloat();
        SexagesimalF heure2=new SexagesimalF(dec);
        System.out.println("Votre heure est "+heure2.getH()+" heure(s), "+heure2.getM()+" minutes et "+heure2.getS()+" secondes.");
        
                
    }
    
}
