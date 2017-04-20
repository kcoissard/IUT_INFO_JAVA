package geometry.zeroDim;


public class Point2D {
    
    private float x,y;
    
    public Point2D(float x, float y){
        this.x=x;
        this.y=y;
    }
    
    public Point2D(float abs){
        x=abs;
        y=0;
    }
    
    public Point2D(){
        x=0;
        y=0;
    }
    
    public void deplace (float dx, float dy){
        x+=dx;
        y+=dy;
    }
    
    public void affiche(){
        System.out.println("coord = "+x+" "+y);
    }
    
    public float get_x(){
        return x;
    }
    
    public float get_y(){
        return y;
    }
    
    public void set_x(float x){
        this.x=x;
    }
    
    public void set_y(float y){
        this.y=y;
    }
    
    public float distance(Point2D autrePoint){
        return (float) Math.sqrt((float) Math.pow(autrePoint.get_x()-this.get_x(),2)+(float) Math.pow(autrePoint.get_y()-this.get_y(),2));
    }
    
    public void rotation(double angleEnRadians){
        angleEnRadians=angleEnRadians%(2*Math.PI);
        float ret=x*(float)Math.cos(angleEnRadians)-y*(float)Math.sin(angleEnRadians);
        y=y*(float)Math.cos(angleEnRadians)+x*(float)Math.sin(angleEnRadians);
        x=ret;
    }
}
