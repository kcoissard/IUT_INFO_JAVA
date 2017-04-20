package tp5;

public class Point3D extends Point2D{
    
    private int x,y,z;
    
    public Point3D(int x,int y,int z){
        super(x,y);
        this.z=z;
    }
    
    public int getZ(){
        return this.z;
    }
    
    
}
