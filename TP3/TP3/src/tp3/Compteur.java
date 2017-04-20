package tp3;

public class Compteur {

    private final int id;

    private static int num;

    static {
        System.out.println("Entrez la valeur du numéro initial :");
        int var;
        do {
            var = Clavier.lireInt();
            if (var-1 < 0) {
                System.out.println("Entrez une valeur supérieure à 0");
            }
        } while (var-1 < 0);
        num=var-1;
    }

    public Compteur() {
        id = ++num;
    }

    public int getId() {
        return this.id;
    }

    public static int getIdMax() {
        return num;
    }

    public static void set_num() {
        System.out.println("Entrez une nouvelle valeur pour le numéro initial :");
        num = Clavier.lireInt();
    }
    
}
