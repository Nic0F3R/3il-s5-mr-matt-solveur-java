package fr.rodez3il.a2022.mrmatt.solveur.structures;

import java.lang.reflect.Array;

public class ListeChainee<T> implements Liste<T> {
	
	/**
	 * Classe interne Maillon
	 */
	class Maillon {
		private T donnee;
		private Maillon suivant;
	}
	
	private Maillon[] tableau;
	
	/**
	 * Constructeur de la classe ListeChainee<T>
	 * Permet d'initialiser le tableau de type T avec une taille de 1000
	 * 
	 * @param type : le type de l'élément pour déclarer le tableau
	 */
	public ListeChainee(Class<T> type) {
		this.tableau = (Maillon[]) Array.newInstance(type, 1000);
	}
	
	public void ajouter(T element) {
		//this.tableau[this.tableau.length] = element;
	}
	
	/**
	 * @return true si le tableau est vide, sinon false
	 */
	public boolean estVide() {
		
		boolean res = false;
		
		if(this.tableau.length == 0) {
			res = true;
		}
		
		return res;
		
	}
	
	/**
	 * @return la taille du tableau
	 */
	public int taille() {
		return this.tableau.length;
	}
	
	/**
	 * Permet de retirer l'élément à l'index i du tableau
	 * 
	 * @return l'élément supprimé
	 */
	public T enlever(int i) {
		
	}
	
	/**
	 * @return l'élément à l'index i du tableau, et null si l'index est inexistant
	 */
	public T element(int i) {
		
		T res = null;
		
		if(i >= 0 && i < this.tableau.length) { // Vérifie la cohérence de l'index passé en paramètre
			res = this.tableau[i]; // .donnee ?
		}
		
		return res;
		
	}
	
	public boolean contient(T e) {
		
	}

}

