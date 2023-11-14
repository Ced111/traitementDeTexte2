package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeClear extends Commande {

    public CommandeClear(Document document, String[] params) {
        super(document, params);
    }

    @Override
    public void executer() {
        document.clear();
    }
}
