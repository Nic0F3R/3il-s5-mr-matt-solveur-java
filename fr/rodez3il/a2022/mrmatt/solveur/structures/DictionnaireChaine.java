package fr.rodez3il.a2022.mrmatt.solveur.structures;

import java.lang.reflect.Array;

public class DictionnaireChaine<C, V> implements Dictionnaire<C, V> {
	
	/**
	 * Classe interne Dictionnaire
	 */
	class Dictionnaire {
		private C cle;
		private V valeur;
		
		public Dictionnaire(C pfCle, V pfValeur) {
			this.cle = pfCle;
			this.valeur = pfValeur;
		}
		
		public C getCle() {
			return this.cle;
		}
		
		public V getValeur() {
			return this.valeur;
		}
		
		public void setCle(C pfCle) {
			this.cle = pfCle;
		}
		
		public void setValeur(V pfValeur) {
			this.valeur = pfValeur;
		}
	}
	
	private Dictionnaire[] dictionnaire;
	
	/**
	 * Constructeur de DictionnaireChaine
	 */
	public DictionnaireChaine(Class<V> type) {
		
		this.dictionnaire = (Dictionnaire[]) Array.newInstance(type, 1000);
		
	}
	
	/**
	 * Permet d'insérer le couple clé/valeur dans le tableau Dictionnaire
	 * 
	 * @param cle : la clé permettant d'accéder à la valeur
	 * @param valeur : la valeur associée à la clé
	 */
	public void inserer(C cle, V valeur) {
		
		if(this.dictionnaire.length < 1000) {
			this.dictionnaire[this.dictionnaire.length].setCle(cle);
			this.dictionnaire[this.dictionnaire.length].setValeur(valeur);
		}
			
	}
	
	/**
	 * Permet de vérifier si le dictionnaire contient la clé demandée
	 * 
	 * @param cle : la clé à vérifier la présence
	 * 
	 * @return true si la clé est présente dans le dictionnaire, sinon false
	 */
	public boolean contient(C cle) {
		
		boolean res = false;
		boolean arretCalcul = false; // Permet d'arrêter le parcours du tableau si une occurrence a déjà eté trouvée
		
		int i = 0;
		
		while(i < this.dictionnaire.length && !arretCalcul) {
			
			if(this.dictionnaire[i].getCle().equals(cle)) {
				res = true;
				arretCalcul = true;
			}
			
			i++;
			
		}
		
		return res;
		
	}
	
	/**
	 * Permet de récupérer et retourner la valeur associée à la clé C
	 * 
	 * @param cle : la clé dont on doit récupérer la valeur associée
	 * 
	 * @return la valeur associée à la clé passée en paramètres
	 */
	public V valeur(C cle) {
		
		V valeur = null;
		boolean arretCalcul = false; // Permet d'arrêter le parcours du tableau si une occurrence a déjà eté trouvée
		
		int i = 0;
		
		while(i < this.dictionnaire.length && !arretCalcul) {
			
			if(this.dictionnaire[i].getCle().equals(cle)) {
				valeur = this.dictionnaire[i].getValeur();
				arretCalcul = true;
			}
			
			i++;
			
		}
		
		return valeur;
		
	}
	
}