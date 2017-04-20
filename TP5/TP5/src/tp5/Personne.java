package tp5;

public class Personne {
    
    private String  nom;
    private String prenom;
    
    public Personne(String nom,String prenom){
        this.nom=nom;
        this.prenom=prenom;
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public String getPrenom(){
        return this.prenom;
    }
    
    public void setNom(String nouvNom){
        this.nom=nouvNom;
    }
    
    public void setPrenom(String nouvPrenom){
        this.prenom=nouvPrenom;
    }
    
    public void affiche(){
        System.out.println(this.nom+" "+this.prenom);
    }
}
