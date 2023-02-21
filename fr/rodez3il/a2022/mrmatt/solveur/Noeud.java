package fr.rodez3il.a2022.mrmatt.solveur;

import fr.rodez3il.a2022.mrmatt.solveur.structures.DictionnaireChaine;
import fr.rodez3il.a2022.mrmatt.solveur.structures.ListeChainee;
import fr.rodez3il.a2022.mrmatt.solveur.structures.ListeTableau;
import fr.rodez3il.a2022.mrmatt.sources.Niveau;

/**
 * Classe Noeud servant au solveur
 * 
 * @author Nicolas Ferrayé - 3iL
 */
public class Noeud {

	private DictionnaireChaine configurations; // Configurations connues
	private Niveau niveau; // Niveau en cours
	private ListeTableau fils; // Moyen de représenter les 4 fils du noeud
	private ListeChainee commandes; // Liste des commandes nécessaires pour atteindre cette configuration
	
	/**
	 * Constructeur de Noeud
	 */
	public Noeud() {
		
		Class<Object> type = null;
		
		this.configurations = new DictionnaireChaine(type);
		this.niveau = new Niveau("niveaux/1rocher.txt");
		this.fils = new ListeTableau(type);
		this.commandes = new ListeChainee(type);
		
	}
	
	public void calculerFils() {
		// TODO
	}
	
}
