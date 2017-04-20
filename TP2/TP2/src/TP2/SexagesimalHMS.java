
package TP2;

public class SexagesimalHMS {
    
    private final int heure;
    private final int minute;
    private final int seconde;
    private final float decimal;
    
    public SexagesimalHMS(int h,int m,int s){
        heure=h;
        minute=m;
        seconde=s;
        decimal=h+(float)m/60+(float)s/3600;
}
    
    public float getDec(){
        return(decimal);
    }
    
    public int getH(){
        return(heure);
    }
    
    public int getM(){
        return(minute);
    }
    
    public int getS(){
        return(seconde);
    } 
}
