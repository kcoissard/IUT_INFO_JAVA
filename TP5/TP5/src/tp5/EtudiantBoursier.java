package tp5;

public class EtudiantBoursier extends Etudiant{
    private String nom, prenom;
    private int numetu;
    private boolean bourse;
   
    public EtudiantBoursier(String nom, String prenom, int numetu,boolean bourse)
    {
        super(nom,prenom,numetu);
        this.bourse=bourse;
    }

}