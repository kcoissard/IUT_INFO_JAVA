package tp3;

public class A {

    private String test;
    
    
    public void A() {
        test = "";
    }

    private void f(int n, float x) {
        test = "Première";
    }

    public void f(float x, int n) {
        test = "Deuxième";
    }

    public void f(float x1, float x2) {
        test = "Troisième";
    }

    public void affiche() {
        System.out.println(test);
    }
    

}
