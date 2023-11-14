package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeEffacer extends Commande {

    public CommandeEffacer(Document doc, String[] params) {
        super(doc, params);
    }

    @Override
    public void executer() {
        int start = Integer.parseInt(params[1]); // Assurez-vous que vous obtenez les bons indices
        int end = Integer.parseInt(params[2]);
        document.effacer(start, end);
    }
}

