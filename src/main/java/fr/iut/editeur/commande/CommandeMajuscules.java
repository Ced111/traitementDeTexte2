package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeMajuscules extends Commande {

    public CommandeMajuscules(Document doc, String[] params) {
        // Ici, on suppose que le constructeur de la classe parente (Commande) prend le Document et les params
        super(doc, params);
    }

    @Override
    public void executer() {
        // Assurez-vous que vous avez les bons indices pour les paramètres
        int start = Integer.parseInt(params[1]); // L'index commence à 1 parce que 0 est le nom de la commande
        int end = Integer.parseInt(params[2]);
        document.majuscules(start, end);
    }
}
