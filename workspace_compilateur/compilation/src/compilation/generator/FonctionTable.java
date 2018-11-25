package compilation.generator;

import java.util.ArrayList;

public class FonctionTable {
	/** Constructeur priv� */
    private FonctionTable()
    {}
 
    /** Instance unique pr�-initialis�e */
    private static FonctionTable INSTANCE = new FonctionTable();
    private static ArrayList<String> fonctions;
     
    /** Point d'acc�s pour l'instance unique du singleton */
    public static FonctionTable getInstance()
    {   return INSTANCE;
    }
}
