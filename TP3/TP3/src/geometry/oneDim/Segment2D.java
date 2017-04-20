package geometry.oneDim;
import geometry.zeroDim.*;

public class Segment2D {
    
    private Point2D p1,p2;
    
    public Segment2D(Point2D p1, Point2D p2){
        this.p1=p1;
        this.p2=p2;
    }
    
    public float longueur(){   
        return (float) Math.sqrt((float) Math.pow(p2.get_x()-p1.get_x(),2)+(float) Math.pow(p2.get_y()-p1.get_y(),2));
    }
    
    public void affiche(){
        System.out.print("P1 : ");
        p1.affiche();
        System.out.print("P2 : ");
        p2.affiche();
        System.out.println("La distance entre ces deux points est de "+this.longueur());
    }
    
    public void deplaceP1(float dxP1, float dyP2){
        p1.deplace(dxP1, dyP2);
    }
    
    public void deplaceP2(float dxP2,float dyP2){
        p2.deplace(dxP2, dyP2);
    }
    
    public Point2D get_p1(){
        return this.p1;
    }
    
    public Point2D get_p2(){
        return this.p2;
    }
    
    public void set_p1(Point2D p1){
        this.p1=p1;
    }
    
    public void set_p2(Point2D p2){
        this.p2=p2;
    }
    
    public boolean est_perpendiculaire(Segment2D autreSegment){
        if((((this.get_p2().get_x()-this.get_p1().get_x())*(autreSegment.get_p2().get_x()-autreSegment.get_p1().get_x()))+
                (this.get_p2().get_y()-this.get_p1().get_y())*(autreSegment.get_p2().get_y()-autreSegment.get_p1().get_y()))!=0) return false;
        return true;
    }
}
