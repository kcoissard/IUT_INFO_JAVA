package tp5;

public class Point2DAffichable extends Point2D {
    
    public Point2DAffichable(int x,int y){
        super(x,y);
    }
    
    public void affiche(){
        System.out.println("Coordonnées du point : "+super.getX()+" "+super.getY());
    }
    
    private int x,y;
}
