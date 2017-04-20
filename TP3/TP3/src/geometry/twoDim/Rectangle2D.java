package geometry.twoDim;
import geometry.oneDim.*;
import geometry.zeroDim.*;

public class Rectangle2D {

    private final Segment2D s1, s2, s3, s4;

    public Rectangle2D(Point2D p1, Point2D p2, Point2D p3, Point2D p4) {
        s1 = new Segment2D(p1, p2);
        s2 = new Segment2D(p2, p3);
        s3 = new Segment2D(p3, p4);
        s4 = new Segment2D(p4, p1);
        if (!s1.est_perpendiculaire(s2) || !s3.est_perpendiculaire(s4)) {
            System.out.println("Les points ne forment pas un rectangle, toutes les coordonnées sont mises à 0");
            Point2D porigine = new Point2D(0, 0);
            s1.set_p1(porigine);
            s1.set_p2(porigine);
            s2.set_p1(porigine);
            s2.set_p2(porigine);
            s3.set_p1(porigine);
            s3.set_p2(porigine);
            s4.set_p1(porigine);
            s4.set_p2(porigine);
        }
    }
    
    public float perimetre(){
        return (s1.longueur()+s2.longueur())*2;
    }
    
    public float aire(){
        return s1.longueur()*s2.longueur();
    }
    
    
}
