

public class Carte {
   
   public final static int PIQUES = 0;   // CODE POUR LES 4 COSTUMES PLUS LE JOCKER.
   public final static int COEURS = 1;
   public final static int DIAMANTS = 2;
   public final static int TREFLES = 3;
   public final static int JOKER = 4;
   
   public final static int ACE = 1;      // CODE POUR LES CARTES NON NUMERIQUE.
   public final static int JACK = 11;     
   public final static int QUEEN = 12;   
   public final static int KING = 13;
   
   /**
    * UNE CARTE NE PEUX ETRE QUE PIQUES, COEURS, DIAMANTS,
    * TREFLES, OU JOKER.  LE COSTUME NE PEUX PLUS ETRE CHANGER APRÉS
    * LA CONSTRUCTION DE LA CARTE
    */
   private final int costume; 
   
   /**
    * LA VALEUR DE LA CARTE.  POUR UNE CARTE NORMAL C'EST UNE VALEUR ENTRE
    * 1 ET 13, AVEC  1 QUI REPRESENTE L'ACE.  POUR LE JOCKER LA VALEUR
    * PEUT ETRE N'IMPORTE LAQUEL. LA VALEUR NE PEUX PLUS ETRE CHANGER
    * APRÉS SA CRÉATION.
    */
   private final int valeur;
   
   /**
    * Creates a Joker, with 1 as the associated valeur.  (Note that
    * "new Card()" is equivalent to "new Card(1,Card.JOKER)".)
    */
   public Carte() {
     costume = JOKER;
      valeur = 1;
   }
   
   public int getcostume() {
	return costume;
}

/**
    * Crée une carte avec un costume et une valeur spécifiés.
    * @param valeur la valeur de la nouvelle carte. Pour une carte ordinaire (non-joker),
    * la valeur doit être comprise entre 1 et 13, 1 représentant un As.
    * Vous pouvez utiliser les constantes Card.ACE, Card.JACK, Card.QUEEN et Card.KING.
    * Pour un Joker, la valeur peut être n'importe quoi.
    * @param costume le costume de la nouvelle carte. Ce doit être l'une des valeurs
    * Card.PIQUES, Card.COEURS, Card.DIAMANTS, Card.TREFLES ou Card.JOKER.
    * @throws IllegalArgumentException si les valeurs des paramètres ne sont pas dans la
    * intervales autorisées
    */
   public Carte(int valeur, int costume) {
      if (costume != PIQUES && costume != COEURS && costume != DIAMANTS && 
            costume != TREFLES && costume != JOKER)
         throw new IllegalArgumentException("Costume de jeu illégal");
      if (costume != JOKER && (valeur < 1 || valeur > 13))
         throw new IllegalArgumentException("Valuur de jeu illégal");
    this.valeur = valeur;
    this.costume = costume;
   }




   
  /**
    * Retourne la valeur de cette carte.
    * @return la valeur, qui est l'un des nombres de 1 à 13, inclus pour
    * une carte ordinaire, et qui peut être n'importe quelle valeur pour un Joker.
    */


   public int getvaleur() {
      return valeur;
   }
   
   /**
   * Retourne une représentation en chaîne de caractères du costume de la carte.
   * @return l'une des chaînes de caractères "PIQUES", "COEURS", "DIAMANTS", "TREFLES"
   * ou "Joker".
   */

   public String getcostumeAsString() {
      switch ( costume ) {
      case PIQUES:   return "PIQUES";
      case COEURS:   return "COEURS";
      case DIAMANTS: return "DIAMANTS";
      case TREFLES:    return "TREFLES";
      default:       return "Joker";
      }
   }
   
   /**
   * Retourne une représentation sous forme de chaîne de la valeur de la carte.
   * @return pour une carte normale, une des chaînes "As", "2",
   * "3", ..., "10", "Jack", "Queen" ou "King". Pour un Joker, le
   * la chaîne est toujours numérique.
   */
   
   public String getvaleurAsString() {
      if (costume == JOKER)
         return "" + valeur;
      else {
         switch ( valeur ) {
         case 1:   return "Ace";
         case 2:   return "2";
         case 3:   return "3";
         case 4:   return "4";
         case 5:   return "5";
         case 6:   return "6";
         case 7:   return "7";
         case 8:   return "8";
         case 9:   return "9";
         case 10:  return "10";
         case 11:  return "Jack";
         case 12:  return "Queen";
         default:  return "King";
         }
      }
   }
   
   /**
   * Retourne une représentation sous forme de chaîne de cette carte, incluant les deux
   * sa couleur et sa valeur (sauf pour un Joker de valeur 1,
   * la valeur de retour est juste "Joker"). Exemple de valeurs de retour
   * sont: "Queen of COEURS", "10 of DIAMANTS", "Ace of PIQUES",
   * "Joker", "Joker # 2"
   */

   public String toString() {
      if (costume == JOKER) {
         if (valeur == 1)
            return "Joker";
         else
            return "Joker #" + valeur;
      }
      else
         return getvaleurAsString() + " of " + getcostumeAsString();
   }
   

} 