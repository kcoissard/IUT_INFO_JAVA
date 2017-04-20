package tp4;

public class Tp4 {

    public static int[] carre(int n) {
        int tab[] = new int[n];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = i * i;
        }
        return (tab);
    }

    public static void affiche(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
    }

    public static int occurence(String chaine, String sousChaine) {
        int cpt = 0;
        int i = 0;
        for (int j = 0; j < chaine.length(); j++) {
            if (chaine.charAt(j) == sousChaine.charAt(i)) {
                i++;
                if (i == sousChaine.length()) {
                    cpt++;
                    i = 0;
                }
            } else {
                i = 0;
            }
        }
        return (cpt);
    }
    
    public static String intToString(int val){
        return(String.valueOf(val));
    }
    
    public static String doubleToString(double val){
        return(String.valueOf(val));
    }
    
    public static int stringToInt(String chaine){
        return(Integer.parseInt(chaine));
    }
    
    public static double stringToDouble(String chaine){
        return(Double.parseDouble(chaine));
    }
    
    public static int stringCompareToInt(String chaine,int val){
        if(val==stringToInt(chaine)) return 0;
        else if (val<stringToInt(chaine)) return 1;
        else return -1;
    }
    
    public static int stringCompareToDouble(String chaine,double val){
        if(val==stringToDouble(chaine)) return 0;
        else if (val<stringToDouble(chaine)) return 1;
        else return -1;
    }

    public static void main(String[] args) {

        //EXERCICE 1
        //Question 1
        /*int n=10;
         final int p=5;
         int t1[]={1,3,5};
         int t2[]={n-1,n,n+2};
         int t3[]={p-2,p,p+3};
         int t4[]={1,2,3};
         float x1[]={1,2,p,p+7};
         float x2[]={1.25f,2.5f,5}; */
        //Question 2
        /*int t[]=carre(5);
         for(int i=0;i<t.length;i++) System.out.print(t[i]+" ");
         for(int var:t) System.out.print(var+" ");*/
        //Question 3
        /*float t2 [] [] = { {1,3,5}, {0,2,4,6,8,10}, {1,2,3,5,7} } ;
        UtilTab.affichage(t2);
        
        //EXERCICE 2
        
        //EXERCICE 3
        affiche("Hello world");
        System.out.println(occurence("Javava","va"));*/
        
        //EXERCICE 4
    }

}
