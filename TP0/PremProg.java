public class PremProg  // une classe publique est utilisable par d'autres classes
{                      // si on omet public, alors la classe n'est plus utilisable
					   // par les classes d�finies dans un autre package

	/**
	 * @param args
	 */
	public static void main(String[] args) // String[] est obligatoire en Java pour le point d'entr�e du programme
	{									   // String[] args <=> String args[] <=> tableau d'objets de type String
										   // la m�thode main doit �tre publique pour que la machine virtuelle 
									       // y avoir acc�s
		System.out.print( "Salut! " ) ; // affichage sans passage � la ligne
		System.out.println( "Mon premier prog en Java : la magie des �, � et �" ) ; // println = print line (affichage suivi d'un passage � la ligne)
		// System d�signe une classe dans laquelle se trouve un objet static out repr�sentant
		// la fen�tre console ; System.out est donc la fen�tre console,ind�pendante du choix de l'instance
		// de la classe System
		// print et prinln sont des m�thodes publiques de l'objet out de type PrintStream
		System.out.println( Integer.MIN_VALUE ) ;
		System.out.println( Long.MAX_VALUE ) ;
		
		float x = Clavier.lireFloat() ;
		System.out.println( "Vous avez tap� " + x + " bravo! " ) ;
	}

}
