
public class EntierContraint {
    
    public EntierContraint(int amin, int amax)
    {
        if( amin <= amax )
        {
            min = amin ;
            max = amax ;
        }
        else
        {
            max = amin ;
            min = amax ;            
        }
        val = min ;
    }
    
    public EntierContraint(int amin, int amax, int aval)
    {
        if( amin <= amax )
        {
            min = amin ;
            max = amax ;
        }
        else
        {
            max = amin ;
            min = amax ;            
        }
        
        if( min<= aval && aval <=max)
            val = aval ;
        else
        {
            if(aval>max)
                val = max ;
            else
                val = min ;
        }
    }
        
    public void affiche()
    {
        System.out.println("Entier "+val+ " dans intervalle [" + min+", "+max+"]");
    }
    
    public void saisir()
    {
        int valtmp ;
        do
        {
            System.out.println("Saisir une valeur dans l'intervalle ["+min+", "+max+"]");
            valtmp = Clavier.lireInt() ;
        }while( valtmp<min || valtmp>max ) ;
        val = valtmp ;
    }
    
    private int min, max ;
    private int val ;
}
