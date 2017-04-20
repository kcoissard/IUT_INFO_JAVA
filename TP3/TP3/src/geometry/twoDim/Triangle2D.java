package geometry.twoDim;
import geometry.zeroDim.*;

import geometry.oneDim.Segment2D;

public class Triangle2D {
    
    private final Segment2D s1,s2,s3;
    
    public Triangle2D(Point2D p1,Point2D p2,Point2D p3){
        s1=new Segment2D(p1,p2);
        s2=new Segment2D(p2,p3);
        s3=new Segment2D(p3,p1);
    }
    
    public float perimetre(){
        return(s1.longueur()+s2.longueur()+s3.longueur());
    }
    
    public float aire(){
        float p=this.perimetre();
        return (float) Math.sqrt ((float)(p/2*(p/2-s1.longueur())*(p/2-s2.longueur())*(p/2-s3.longueur())));
    }
}
