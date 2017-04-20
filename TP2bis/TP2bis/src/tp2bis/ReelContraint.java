package tp2bis;

public class ReelContraint {

    private final float min;
    private final float max;
    private float val;

    public ReelContraint(float minimum, float maximum, float valeur) {
        if (valeur >= maximum || valeur <= minimum) {
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
        System.out.println("Le réel est " + val);
    }

    public float get_max() {
        return max;
    }

    public float get_min() {
        return min;
    }

    public float get_val() {
        return val;
    }

    public void set_val(float newVal) {
        if (newVal >= min && newVal <= max) {
            val = newVal;
        } else {
            System.out.println("La valeur n'est pas entre les bornes, elle n'est pas modifiée.");
        }

    }
}
