package cfranc.hanoi;

import sun.util.resources.cldr.ar.CalendarData_ar_IQ;

import java.util.*;

public class Hanoi {
	
	Tour tourInit;
	Tour tourInter;
	Tour tourDest;

	public Hanoi(int n){
		// TODO ...
		//initialise les 3 tours
		tourInit = new Tour(100);
		tourInter = new Tour(100);
		tourDest = new Tour(100);

		int i;

		//liste de disques
		List<Disque> lesDisques = new ArrayList<>();
		//créer tous les disques
		for(i = 0; i < n; i++){
			lesDisques.add(new Disque(i+1));
		}

		Collections.reverse(lesDisques);

		//ajoute les disques sur la premiére tour
		for(i = 0; i<lesDisques.size(); i++){
			tourInit.empiler(lesDisques.get(i));
		}

	}

	
	public Hanoi(){
		tourInit = new Tour();
		tourInter = new Tour();
		tourDest = new Tour();
		Disque petit = new Disque(1);
		Disque moyen = new Disque(2);
		Disque grand = new Disque(3);
		tourInit.empiler(grand);
		tourInit.empiler(moyen);
		tourInit.empiler(petit);
	}
	
	public void bougerSommet(Tour from, Tour to) {
		tourInit = new Tour();
		tourInter = new Tour();
		tourDest = new Tour();
		// TODO ...

	}

	public void deplacer(int nbDisque, Tour from, Tour to, Tour by){
		if (nbDisque > 0) {
			deplacer(nbDisque-1, from, to, by);
			bougerSommet(from, to);
			deplacer(nbDisque-1, by, to, from);
		}
	}

	public void jouer() {
		deplacer(tourInit.taille(), tourInit, tourDest, tourInter);
	}

	public static void main(String[] args) {
		// Compléter la classe Hanoi pour résoudre le jeux avec 3 disques :
		Hanoi game = new Hanoi();
		System.out.println(game.tourInit.estVide());
		System.out.println(game.tourDest.estVide());
		game.jouer();
		System.out.println(game.tourInit.estVide());
		System.out.println(game.tourDest.estVide());
		
		// Compléter la classe Hanoi pour résoudre le jeux avec n disques :
		int n =100;
		Hanoi gameN = new Hanoi(n);
		System.out.println(gameN.tourInit.estVide());
		System.out.println(gameN.tourDest.estVide());
		gameN.jouer();
		System.out.println(gameN.tourInit.estVide());
		System.out.println(gameN.tourDest.estVide());
		
	}

}