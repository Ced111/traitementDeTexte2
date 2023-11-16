package fr.iut.editeur.document;

public class Document {

    private String texte;

    /**
     * Crée un nouveau document avec un texte vide.
     */
    public Document() {
        this.texte = "";
    }

    /**
     * Renvoie le texte actuel du document.
     *
     * @return Le texte du document.
     */
    public String getTexte() {
        return texte;
    }

    /**
     * Définit le texte du document.
     *
     * @param texte Le nouveau texte du document.
     */
    public void setTexte(String texte) {
        this.texte = texte;
    }

    /**
     * Ajoute du texte à la fin du document.
     *
     * @param texte Le texte à ajouter.
     */
    public void ajouter(String texte) {
        this.texte += texte;
    }

    /**
     * Retourne une représentation textuelle du document.
     *
     * @return Le texte du document.
     */
    @Override
    public String toString() {
        return this.texte;
    }

    /**
     * Remplace une portion du texte par un autre texte.
     *
     * @param start        L'index de début de la portion à remplacer.
     * @param end          L'index de fin de la portion à remplacer.
     * @param remplacement Le texte de remplacement.
     */
    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + remplacement + rightPart;
    }

    /**
     * Transforme en majuscules une portion du texte.
     *
     * @param start L'index de début de la portion à transformer.
     * @param end   L'index de fin de la portion à transformer.
     */
    public void majuscules(int start, int end) {
        String leftPart = this.texte.substring(0, start);
        String middlePart = this.texte.substring(start, end).toUpperCase();
        String rightPart = this.texte.substring(end);
        this.texte = leftPart + middlePart + rightPart;
    }

    /**
     * Efface une portion du texte.
     *
     * @param start L'index de début de la portion à effacer.
     * @param end   L'index de fin de la portion à effacer.
     */
    public void effacer(int start, int end) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + rightPart;
    }

    /**
     * Efface tout le texte du document.
     */
    public void clear() {
        texte = ""; // Efface tout le texte
    }

}
