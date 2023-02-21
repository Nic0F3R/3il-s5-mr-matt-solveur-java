package fr.rodez3il.a2022.mrmatt.solveur.structures;

import java.lang.reflect.Array;

/**
 * Classe ListeChainee. Liste dont l'élément N+1 dépend de l'élément N
 * 
 * @author Nicolas Ferrayé - 3iL
 *
 * @param <T> le type des éléments du tableau
 */
public class ListeChainee<T> implements Liste<T> {
	
	/**
	 * Classe interne Maillon
	 */
	class Maillon {
		private T donnee;
		private Maillon suivant;
		
		public Maillon(T pfDonnee, Maillon pfSuivant) {
			this.donnee = pfDonnee;
			this.suivant = pfSuivant;
		}
		
		public T getDonnee() {
			return this.donnee;
		}
		
		public Maillon getSuivant() {
			return this.suivant;
		}
		
		public void setDonnee(T pfDonnee) {
			this.donnee = pfDonnee;
		}
		
		public void setSuivant(Maillon pfSuivant) {
			this.suivant = pfSuivant;
		}
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
	
	/**
	 * Permet d'ajouter un maillon avec l'élément de type T en donnée
	 * 
	 * @params element : l'élément de type T à ajouter
	 */
	public void ajouter(T element) {
		if(this.tableau.length < 1000) {
			Maillon maillon = new Maillon(element, null);
			this.tableau[this.tableau.length] = maillon;
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
	 * Permet de retirer l'élément à l'index i du tableau, et retourne la donnée à l'index i
	 * 
	 * @return la donnée supprimée
	 */
	public T enlever(int i) {
		
		T donnee = null;
		
		if(i >= 0 && i < this.tableau.length) { // Vérifie la cohérence de l'index passé en paramètre
			donnee = this.tableau[i].getDonnee();
			
			for(int y = i ; y < this.tableau.length - 1 ; y++) {
				this.tableau[y] = this.tableau[y+1];
			}
		}
		
		return donnee;
		
	}
	
	/**
	 * @return l'élément à l'index i du tableau, et null si l'index est inexistant
	 */
	public T element(int i) {
		
		T res = null;
		
		if(i >= 0 && i < this.tableau.length) { // Vérifie la cohérence de l'index passé en paramètre
			res = this.tableau[i].getDonnee();
		}
		
		return res;
		
	}
	
	/**
	 * Permet de vérifier la présence de la donnée e dans le tableau
	 * 
	 * @return true si la donnée e existe dans le tableau, sinon false
	 */
	public boolean contient(T e) {
		
		boolean res = false;
		boolean arretCalcul = false; // Permet d'arrêter le parcours du tableau si une occurrence a déjà eté trouvée
		
		int i = 0;
		
		while(i < this.tableau.length && !arretCalcul) {
			
			if(this.tableau[i].getDonnee().equals(e)) {
				res = true;
				arretCalcul = true;
			}
			
			i++;
			
		}
		
		return res;
		
	}

}

