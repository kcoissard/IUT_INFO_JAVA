package tp2bis;


public class TP2bis {

    public static void main(String[] args) {
        System.out.println("Premier Voyage : Entrez une ville de départ, d'arrivée puis une distance et un prix au km :");
        String dp=Clavier.lireString();
        String ar=Clavier.lireString();
        float lg=Clavier.lireFloat();
        float km=Clavier.lireFloat();       
        Voyage v1 = new Voyage(lg,km,dp,ar);
        System.out.println("Deuxième Voyage : Entrez une ville de départ, d'arrivée puis une distance et un prix au km :");
        dp=Clavier.lireString();
        ar=Clavier.lireString();
        lg=Clavier.lireFloat();
        km=Clavier.lireFloat();       
        Voyage v2 = new Voyage(lg,km,dp,ar);
        System.out.println("Troisième Voyage : Entrez une ville de départ, d'arrivée puis une distance et un prix au km :");
        dp=Clavier.lireString();
        ar=Clavier.lireString();
        lg=Clavier.lireFloat();
        km=Clavier.lireFloat();   
        Voyage v3 = new Voyage(lg,km,dp,ar);
        System.out.println("Entrez une ville de départ, puis d'arrivée :");
        dp=Clavier.lireString();
        ar=Clavier.lireString();
        Voyage recherche=new Voyage(29999,3.1f,dp,ar);
        Voyage resultat=recherche.compare_trajectoire(v1);
        resultat=resultat.compare_trajectoire(v2);
        resultat=resultat.compare_trajectoire(v3);
        if(resultat.equals(recherche)) System.out.println ("Il n'y a pas de voyage correspondant.");
        else{
            System.out.println("Le voyage le plus court est :");
            resultat.affiche();
            resultat=recherche.compare_prix(v1);
            resultat=resultat.compare_prix(v2);
            resultat=resultat.compare_prix(v3);
            System.out.println("Le voyage le moins cher est :");
            resultat.affiche();
        }
    }
}
