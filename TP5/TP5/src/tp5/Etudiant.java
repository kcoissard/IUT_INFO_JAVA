package tp5;

public class Etudiant extends Personne{
    private String nom, prenom;
    private int numetu;
   
    public Etudiant(String nom, String prenom, int numetu)
    {
        super(nom,prenom);
        this.numetu= numetu;
    }
    
    public int getNumEtu()
    {
        return this.numetu;
    }
    
    public void setNumetu(int nouvNum)
    {
        this.numetu=nouvNum;
    }
    
    public void affiche()
    {
        System.out.print("Num etu : "+getNumEtu()+" Nom : ");
        super.affiche();
    }
}
