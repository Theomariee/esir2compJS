package compilation.generator;

import java.util.ArrayList;

public class FonctionTable {
	/** Constructeur privé */
    private FonctionTable()
    {}
 
    /** Instance unique pré-initialisée */
    private static FonctionTable INSTANCE = new FonctionTable();
    private static ArrayList<String> fonctions;
     
    /** Point d'accès pour l'instance unique du singleton */
    public static FonctionTable getInstance()
    {   return INSTANCE;
    }
}
