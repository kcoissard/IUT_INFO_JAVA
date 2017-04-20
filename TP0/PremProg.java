public class PremProg  // une classe publique est utilisable par d'autres classes
{                      // si on omet public, alors la classe n'est plus utilisable
					   // par les classes définies dans un autre package

	/**
	 * @param args
	 */
	public static void main(String[] args) // String[] est obligatoire en Java pour le point d'entrée du programme
	{									   // String[] args <=> String args[] <=> tableau d'objets de type String
										   // la méthode main doit être publique pour que la machine virtuelle 
									       // y avoir accès
		System.out.print( "Salut! " ) ; // affichage sans passage à la ligne
		System.out.println( "Mon premier prog en Java : la magie des é, è et à" ) ; // println = print line (affichage suivi d'un passage à la ligne)
		// System désigne une classe dans laquelle se trouve un objet static out représentant
		// la fenêtre console ; System.out est donc la fenêtre console,indépendante du choix de l'instance
		// de la classe System
		// print et prinln sont des méthodes publiques de l'objet out de type PrintStream
		System.out.println( Integer.MIN_VALUE ) ;
		System.out.println( Long.MAX_VALUE ) ;
		
		float x = Clavier.lireFloat() ;
		System.out.println( "Vous avez tapé " + x + " bravo! " ) ;
	}

}
