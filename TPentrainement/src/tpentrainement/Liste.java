/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpentrainement;

/**
 *
 * @author USER
 */
    public class ListeContacts{
    private final ArrayList <Contact> list;
    
    public ListeContacts(){
        list = new ArrayList<>();
    }
    
    public void ajouter(Contact c) throws Exception{
        if (c == null) throw new NullPointerException("Le Contact à ajouter est une référence null");
        //vérifier si le contact a ajouté n'est pas une référence null
        if (list.isEmpty()) {
            //vérifier si la liste est vide
            list.add(c);

        } else {
                //vérifier si un Objet Contact dans la liste est identique au Contact à ajouter
                if (list.contains(c)) throw new Exception("Le contact que vous souhaitez ajouter est déjà présent dans la liste");
                else list.add(c);
        }
        
    }
    
    public void supprimer(int id) throws Exception{
        if (list.isEmpty()) throw new Exception("La liste est vide, le contact n'existe pas");
        int i;
        for (i=0; i<list.size() && list.get(i).getId()!=id ;i++) ;
            
        if(list.get(i).getId()==id){
            list.remove(i);
            System.out.println("Le contact a été supprimé");
        }
            
        else throw new Exception("Le contact n'existe pas");
        
    }
    
    public String toString(){
        String resultat="";
        for (int i = 0; i < list.size(); i++)
            resultat=resultat+"Type : "+list.get(i).getClass()+" "+list.get(i)+"\n";
        return resultat;
    }
    
    public void afficherClients(){
        Iterator<Contact> iter = list.iterator() ;
        System.out.println("\t\t\tAFFICHAFE DES CLIENTS");
        System.out.println();
        while( iter.hasNext() )
        {
            Contact c=iter.next();
            if (c instanceof Client)  System.out.println(c);
        }
        System.out.println();
    }
    
    public void afficherFournisseurs(){
        System.out.println("\t\t\tAFFICHAFE DES FOURNISSEURS :");
        System.out.println();
     
        for (Contact c : list) if (c instanceof Fournisseur)  System.out.println(c);
        System.out.println();
    }
    
    public void triLexicographique() throws Exception{

        if (!list.isEmpty()){
            //Vérifier si la liste est vide
            list.sort(new Tri_lexicographique());

        }else throw new Exception("La liste utilisée est vide");//liste vide
    }

    public void triDate() throws Exception{

        if (!list.isEmpty()){
            //Vérifier si la liste est vide
            list.sort(new Tri_date());

        }else throw new Exception("La liste utilisée est vide");//liste vide
    }
}

}
