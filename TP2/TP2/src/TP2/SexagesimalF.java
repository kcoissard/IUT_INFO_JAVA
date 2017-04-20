
package TP2;

public class SexagesimalF {
    
    private final float decimal;
    private final int heure;
    private final int minute;
    private final int seconde;
    
    public SexagesimalF(float d){
        decimal=d;
        heure=(int)d;
        minute=((int)(d*60)%60);
        seconde=((int)(d*3600)%60);
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
