import IO.Clavier;

public class TD1LiveCoding {

    public static void main(String[] args) {
        System.out.println("Saisir un montant entier svp: ");
        int montant = Clavier.lireInt() ;
        int _5cents ;
        stop: for(int _1euro=0; _1euro <= montant; _1euro++)
        {
            for(int _50cents=0; _50cents <= (montant - _1euro)*2; _50cents++)
            {
                for(int _20cents=0; _20cents <= (montant - _1euro -_50cents*0.5)*5; _20cents++)
                {
                    for(int _10cents=0; _10cents <= (montant - _1euro -_50cents*0.5 - _20cents/5.)*10; _10cents++)
                    {
                        _5cents = (int)Math.floor( (montant - _1euro -_50cents*0.5 - _20cents/5. - _10cents/10.)*20 +0.001) ;
                        System.out.println("décomposition: " + _1euro + " x 1 euro + " + _50cents + " x 50 cents +" + _20cents + " x 20 cents + " + _10cents + " x 10 cents + " + _5cents + " x 5 cents");
						System.out.println("Continuer? o/n");
                        char rep = Clavier.lireChar() ;
                        if( rep == 'n' )
                        {
                            break stop ;
                        }
					}
                }
            }
        }
    }
}
