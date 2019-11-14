
import java.io.*; 
import java.util.ArrayList;

/**
 * dans cette class on va faire le test de notre jeux
 * on va crée par exemple un paquet de cartes
 * on va y'ajouter et retirer des cartes
 * PIQUES = 0
 * COEURS = 1
 * DIAMANTS = 2
 * TREFLES = 3
 * JOKER = 4
 * ACE = 1
 * JACK = 11
 * QUEEN = 12
 * KING = 13
 */


public class Main {


    public static void main(String[] args) 
    { 
    ArrayList<Carte> main = new ArrayList<Carte>(12);



    Carte carte1 = new Carte();
    Carte carte2 = new Carte(2,1);
    Carte carte3= new Carte(3 , 0);
    Carte carte4 = new Carte(6 , 0);
    Carte carte5 = new Carte(5,1);
    Carte carte6 = new Carte(8,2);
    Carte carte7 = new Carte(13 , 1);
    Carte carte8 = new Carte(12 ,2);
    Carte carte9 = new Carte(13,1);
    Carte carte10 = new Carte(12,1);


    main.add(carte1);
    main.add(carte2);
    main.add(carte3);
    main.add(carte4);
    main.add(carte5);
    main.add(carte6);
    main.add(carte7);
    main.add(carte8);
    main.add(carte9);
    main.add(carte10);

    System.out.println("Vous avez dans la main\t"+main.size()+"\tcartes :");
    for(int i =0 ; i<main.size() ; i++){

        System.out.println("Carte\t"+main.get(i).getvaleurAsString()+ "\tde\t"+main.get(i).getcostumeAsString());

    }


    
        
}

}