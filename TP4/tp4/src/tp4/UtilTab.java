package tp4;

public class UtilTab {

    public static double somme(double[] tab) {
        double somme = 0;
        for (int i = 0; i < tab.length; i++) {
            somme = somme + tab[i];
        }

        return (somme);
    }

    public static float somme(float[][] tab) {
        float somme = 0;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                somme = somme + tab[i][j];
            }
        }
        return (somme);
    }

    public static double moyenne(double[] tab) {
        double moy = 0;
        for (int i = 0; i < tab.length; i++) {
            moy += tab[i];
        }

        return (moy / tab.length);
    }

    public static float moyenne(float[][] tab) {
        float moy = 0;
        float cpt = 0;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                moy = moy + tab[i][j];
                cpt++;
            }
        }

        return (moy / cpt);
    }

    public static double minimum(double[] tab) {
        double min = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] < min) {
                min = tab[i];
            }
        }

        return (min);
    }

    public static double maximum(double[] tab) {
        double max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] < max) {
                max = tab[i];
            }
        }

        return (max);
    }

    public static void affichage(double[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i] + " ");
        }
    }

    public static void affichage(float[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static double[] copie(double[] tab) {
        double[] copieTab = new double[tab.length];
        for (int i = 0; i < tab.length; i++) {
            copieTab[i] = tab[i];
        }

        return (copieTab);
    }

    public static float[][] copie(float[][] tab) {
        float[][] copieTab = new float[tab.length][];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                copieTab[i][j] = tab[i][j];
            }
        }
        return (copieTab);
    }

    public static double[] genereTabAlea(int nbCases) {
        double[] tabAlea = new double[nbCases];
        for (int i = 0; i < nbCases; i++) {
            tabAlea[i] = Math.random();
        }

        return (tabAlea);
    }

    public static float sommeLigne(float[][] tab, int indiceL) {
        float somme = 0;
        for (int i = 0; i < tab[indiceL].length; i++) {
            somme = somme + tab[indiceL][i];
        }

        return (somme);
    }

    public static float sommeColonne(float[][] tab, int indiceC) {
        float somme = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i].length < indiceC - 1) {
                somme = somme + tab[i][indiceC];
            }
        }

        return (somme);
    }

}
