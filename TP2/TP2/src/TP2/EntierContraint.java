package TP2;

public class EntierContraint {

    private final int min;
    private final int max;
    private int val;

    public EntierContraint(int minimum, int maximum, int valeur) {
        if (valeur > maximum || valeur < minimum) {
            maximum = 2;
            minimum = 0;
            valeur = 1;
            System.out.println("Valeurs non correctes, on prend comme valeurs par défaut 0, 1 et 2 (min, val et max)");
        }
        min = minimum;
        max = maximum;
        val = valeur;
    }


public void affiche() {
        System.out.println("L'entier est " + val);
    }

    public void saisir() {
        int entree;
        System.out.println("Saisissez une valeur entre " + min + " et " + max);
        do {
            entree = Clavier.lireInt();
            if (min > entree || max < entree) {
                System.out.println("La valeur n'est pas dans les bornes, entrez une autre valeur :");
            }
        } while (min > entree || max < entree);
        this.val = entree;
    }

    public void incr(int i) {
        if (val + i > max) {
            val = max;
            System.out.println("La valeur atteinte est trop grande, on la pose à " + max);
        } else if (val + i < min) {
            val = min;
            System.out.println("La valeur atteinte est trop petite, on la pose à " + min);
        } else {
            val = val + i;
        }
    }

    public int get_max() {
        return max;
    }

    public int get_min() {
        return min;
    }

    public int get_val() {
        return val;
    }

    public void set_val(int newVal) {
        if(newVal>min&&newVal<max) val = newVal;
        else System.out.println("La valeur n'est pas entre les bornes, elle n'est pas modifiée.");

    }
}
