package fr.rodez3il.a2022.mrmatt.solveur.structures;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ListeTableau<E> implements Liste<E> {
	
	private E tableau[];
	
	/**
	 * Constructeur de la classe ListeTableau<E>
	 * Permet d'initialiser le tableau de type E avec une taille de 1000
	 * 
	 * @param type : le type de l'élément pour déclarer le tableau
	 */
	public ListeTableau(Class<E> type) {
		this.tableau = (E[]) Array.newInstance(type, 1000);
	}
	
	/**
	 * Permet d'ajouter un élément au tableau
	 * 
	 * @param element : l'élément à ajouter au tableau
	 */
	public void ajouter(E element) {
		if(this.tableau.length < 1000) {
			this.tableau[tableau.length] = element;
		}
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
	public E enlever(int i) {
		
		E elementRetire = this.tableau[i];
		
		if(i >= 0 && i < this.tableau.length) { // Vérifie la cohérence de l'index passé en paramètre
			
			for(int y = i ; y < this.tableau.length ; y++) {
				this.tableau[y] = this.tableau[y+1];
			}
			
			// Retrait du dernier élément du tableau
			//this.tableau = ArrayUtils.removeElement(this.tableau, (this.tableau.length-1));
			
		}
		
		return elementRetire;
		
	}
	
	/**
	 * @return l'élément à l'index i du tableau, et null si l'index est inexistant
	 */
	public E element(int i) {
		E res = null;
		
		if(i >= 0 && i < this.tableau.length) { // Vérifie la cohérence de l'index passé en paramètre
			res = this.tableau[i];
		}
		
		return res;
	}
	
	/**
	 * @param e : l'élément dont on doit vérifier la présence dans le tableau
	 * @return true si e est présent dans le tableau, sinon false
	 */
	public boolean contient(E e) {
		
		int i = 0;
		boolean arretCalcul = false; // Permet d'arrêter le parcours du tableau si une occurrence a déjà eté trouvée
		boolean res = false;
		
		while(i < this.tableau.length && !arretCalcul) {
			
			if(this.tableau[i].equals(e)) {
				arretCalcul = true;
				res = true;
			}
			
			i++;
			
		}
		
		return res;
	}

}