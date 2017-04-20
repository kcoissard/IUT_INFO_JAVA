package tp5;

public class TestPoints2D {

    public static void main(String[] args) {

        //EXERCICE 1
        //Question 1
        /*Point2D parent = new Point2D(1, 2);
        Point2DAffichable enfant = new Point2DAffichable(2, 1);
        enfant.affiche();
        System.out.println(enfant.getX());
        System.out.println(enfant.getY());
        enfant.setPosition(1, 2);
        enfant.affiche();
        parent.setPosition(1, 2);
        System.out.println(parent.getX());
        System.out.println(parent.getY());*/

        //Question 2
        /*Point3D espace = new Point3D(1, 2, 3);
        System.out.println(espace.getX() + " " + espace.getY() + " " + espace.getZ());*/
        
        //EXERCICE 2-3
        /*Personne p=new Personne("Georges","Petitpois");
        Etudiant e=new Etudiant("Guillaume","Meneroud",1151579);
        System.out.println(e.getNom()+" "+e.getPrenom()+" "+e.getNumEtu());
        p.affiche();
        e.affiche();
        EtudiantBoursier eb=new EtudiantBoursier("Jean","Debard",11513278,true);
        System.out.println(eb.getNom()+" "+eb.getPrenom()+" "+eb.getNumEtu());
        eb.affiche();*/
        

        //EXERCICE 4
        byte bb = 1;
        short p = 2;
        int n = 3;
        long q = 4;
        float x = 5.f;
        double y = 6.;
        A a = new A();
        a.f(bb);
        a.f(x);
        System.out.println();
        B b = new B();
        b.f(bb);
        b.f(x);
        System.out.println();
        C c = new C();
        c.f(bb);
        c.f(q);
        c.f(x);
        System.out.println();
        D d = new D();
        d.f(bb);
        d.f(q);
        d.f(y);
        System.out.println();
        E e = new E();
        e.f(bb);
        e.f(q);
        e.f(y);
        System.out.println();
        F f = new F();
        f.f(bb);
        f.f(n);
        f.f(x);
        f.f(y);
        f.f(p);
        f.f(q);
    }
}
