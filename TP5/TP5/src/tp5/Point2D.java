package tp5;

public class Point2D {
    
    public Point2D(int x,int y){
        this.x=x;
        this.y=y;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public void setPosition(int newX,int newY){
        x=newX;
        y=newY;
    }
    
    private int x,y;
}
