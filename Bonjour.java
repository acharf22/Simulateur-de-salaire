 package hi;
//Pour faire reconnaître ma classe scanner j'importe un package dans lequel il y a la classe scanner	
	import java.util.Scanner;
	
	public class Bonjour {	
		public static void main(String[] args) {
			
			double nombreh;
			double tarif;
			double nombrem;
			
			// Un objet sacanner qui permet de lire la saisie clavier
			Scanner scanner = new Scanner (System.in);
			//l'objet possède des popriétés pour une chaîne de caractères 
			String nom;
			//Je demande a l'user de saisir son nom
			System.out.println("Veuillez écrire votre nom llah yar7am Lwaliddin  !");
			//Afficher la chaine qui va être saisie avec un mot de bienvenue
			nom = scanner.nextLine();
			System.out.println("Bienvenue " + nom); // la variable nom est en La concatenation avec le message "Bienvenue"
			
			//Passons maintenat au mode de paiement 
			System.out.println("Choisissez votre mode de paiement : Pour un mode de paiement hebdomadaire, tapez 1. Pour un mode de paiement mensuel tapez un autre numéro");
			
			double mode;
			mode = scanner.nextDouble();
			
			if (mode == 1 ) {
				    // Je donne a l'utilisateur la main d'entrer son propre tarif
					System.out.println("Quel est votre tarif de paiement par heure ? ");
					tarif = scanner.nextDouble();
					System.out.println("Faîtes entrer le nombre d’heures travaillées par semaine, un nombre qui ne devrait pas dépqsser 50 ");
					nombreh = scanner.nextDouble();
					
					if (nombreh <= 40) {
						System.out.println( "Votre salaire est de " + nombreh*tarif);
				                    	}
					
					 else if (nombreh > 40 && nombreh <= 50) {	
						System.out.println(  "Votre salaire est de " + (( 40 * tarif ) + (( nombreh - 40 ) * ( tarif * 1.5))) );
						//salaire = ( 40 * tarif ) + (( nombreh - 40 ) * ( tarif * 1.5))
			                                                  }
							 else {
								 System.out.println(  "Le nombre d’heure total que vous avez saisi depasse 50 ");
							 }
			                   }
			
			else {
				// Je donne a l'utilisateur la main d'entrer son propre tarif
				System.out.println("Quel est votre tarif de paiement par heure ? ");
				tarif = scanner.nextDouble();     
				System.out.println("Faîtes entrer le nombre d’heures travaillées par mois ! Attention : Le nombre d’heure total ne doit pas dépasser 200 heures par mois ");
				     nombrem = scanner.nextDouble();
				    
				     if (nombrem <= 180) {
				    	 System.out.println( "Votre salaire est de " + nombrem*tarif);
				                         }
				     else  if (nombrem > 180 && nombrem <= 200) { // je calcule le salaire auquel j'ajoute le supplement
				    	 System.out.println(  "Votre salaire est de " + (( 180 * tarif )  + (( nombrem - 180 ) * ( tarif * 1.5 ))) ); 
				                                              }
				     else {
				    	 System.out.println(  "Le nombre d’heure total que vous avez saisi depasse 200 ");
				     }
					
			}
			}	
			
			}
			

 
