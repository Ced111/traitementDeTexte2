package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument {

    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 4) {
            System.err.println("Format attendu : remplacer;depart;fin;chaine");
            return;
        }
        try {
            int start = Integer.parseInt(parameters[1]);
            int end = Integer.parseInt(parameters[2]);
            String remplacement = parameters[3];
            this.document.remplacer(start, end, remplacement);
            super.executer();
        } catch (NumberFormatException e) {
            System.err.println("Les indices doivent être des entiers valides.");
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("Indices hors limites pour le texte du document.");
        }
    }
}