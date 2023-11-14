package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public abstract class Commande {
    protected Document document;
    protected String[] params; // Cette ligne est importante

    public Commande(Document doc, String[] params) {
        this.document = doc;
        this.params = params;
    }

    public abstract void executer();
}
