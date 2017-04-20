package tp2bis;

public class Voyage {

    private ReelContraint longueur;
    private ReelContraint prixAuKm;
    private String villeDeDepart;
    private String villeDArrivee;

    public Voyage(float lg, float prix, String depart, String arrivee) {
        longueur = new ReelContraint(1, 30000, lg);
        prixAuKm = new ReelContraint(0.05f, 3.2f, prix);
        villeDeDepart = depart;
        villeDArrivee = arrivee;
    }

    public void affiche() {
        System.out.println("Le voyage part de " + villeDeDepart + " et va à " + villeDArrivee
                + ". Sa longueur est de " + longueur.get_val() + " km et son prix au km est de " + prixAuKm.get_val() + " €.");
    }

    public ReelContraint get_longueur() {
        return (longueur);
    }

    public ReelContraint get_prix() {
        return (prixAuKm);
    }

    public String get_depart() {
        return (villeDeDepart);
    }

    public String get_arrivee() {
        return (villeDArrivee);
    }

    public void set_longueur(float val) {
        longueur.set_val(val);
    }

    public void set_prix(float val) {
        prixAuKm.set_val(val);
    }

    public void set_depart(String depart) {
        villeDeDepart = depart;
    }

    public void set_arrivee(String arrivee) {
        villeDArrivee = arrivee;
    }

    public Voyage compare_trajectoire(Voyage autreVoyage) {
        if (villeDeDepart.equals(autreVoyage.get_depart()) && villeDArrivee.equals(autreVoyage.get_arrivee())) {
            if (longueur.get_val() == autreVoyage.get_longueur().get_val()) {
                return (this);
            } else if (longueur.get_val() > autreVoyage.get_longueur().get_val()) {
                return (autreVoyage);
            } else {
                return (this);
            }
        } else {
            return (this);
        }
    }

    public Voyage compare_prix(Voyage autreVoyage) {
        if (villeDeDepart.equals(autreVoyage.get_depart()) && villeDArrivee.equals(autreVoyage.get_arrivee())) {
            if (prixAuKm.get_val() * longueur.get_val() == autreVoyage.get_prix().get_val() * autreVoyage.get_longueur().get_val()) {
                return (this);
            } else if (prixAuKm.get_val() * longueur.get_val() > autreVoyage.get_prix().get_val() * autreVoyage.get_longueur().get_val()) {
                return (autreVoyage);
            } else {
                return (this);
            }
        } else {
            return (this);
        }

    }

}
