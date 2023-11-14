package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public abstract class CommandeDocument extends Commande {

    protected Document document;

    protected String[]parameters;

    public CommandeDocument(Document document, String[] parameters) {
        super(document, parameters);
        this.document = document;
        this.parameters = parameters;
    }

    @Override
    public void executer() {
        System.out.println(this.document);
    }
}
