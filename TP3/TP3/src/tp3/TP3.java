package tp3;

import geometry.zeroDim.*;
import geometry.oneDim.*;
import geometry.twoDim.*;

public class TP3 {

    public static void main(String[] args) {
        //EXERCICE 1
        
        /*short p = 1;
        int n1 = 1;
        int n2 = 1;
        float x = 1f;

        A t = new A();
        t.f(p,x);
        t.affiche(); */
        
        //EXERCICE 2
        /*Compteur c1=new Compteur();
        Compteur c2=new Compteur();
        Compteur c3=new Compteur();
        System.out.println("Le premier objet a pour numéro "+c1.getId()+", le deuxième "+c2.getId()+" et le troisième "+c3.getId()+". Le dernier objet créé a comme numéro "+Compteur.getIdMax()+".");*/
        
        //EXERCICE 3
        Point2D a=new Point2D(0,0);
        Point2D b=new Point2D(1,0);
        Point2D c=new Point2D(0,1);
        Point2D d=new Point2D(1,1);
        /*Triangle2D tri=new Triangle2D(a,b,c);
        System.out.println("Construction d'un triangle :\n");
        System.out.println("L'aire de ce triangle est de "+tri.aire()+" et son périmètre de "+tri.perimetre()+".");
        System.out.println("\nConstruction d'un rectangle incorrect :\n");
        Rectangle2D rec1=new Rectangle2D(a,b,c,d);
        System.out.println("L'aire de ce rectangle est de "+rec1.aire()+" et son périmètre de "+rec1.perimetre()+".");
        System.out.println("\nConstruction d'un rectangle correct :\n");
        Rectangle2D rec2=new Rectangle2D(a,b,d,c);
        System.out.println("L'aire de ce rectangle est de "+rec2.aire()+" et son périmètre de "+rec2.perimetre()+".");*/
        
        //EXERCICE 4
        System.out.println("La distance entre le point A et B est de "+a.distance(d));
        b.rotation(3*Math.PI/2);
        System.out.print("Après rotation, ");
        b.affiche();
        
        
        
    }

}
