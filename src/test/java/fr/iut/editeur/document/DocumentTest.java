package fr.iut.editeur.document;

import fr.iut.editeur.document.Document;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class DocumentTest extends TestCase {


    private Document document;

    @Before
    public void setUp() {
        document = new Document();
    }

    @Test
    public void testAjouter() {
        document.ajouter("Test");
        assertEquals("Test", document.getTexte());
    }

    @Test
    public void testSetTexte() {
        document.setTexte("Hello");
        assertEquals("Hello", document.getTexte());
    }

    @Test
    public void testRemplacer() {
        document.setTexte("Bonjour");
        document.remplacer(0, 3, "Bonsoir");
        assertEquals("Bonsoirjour", document.getTexte());
    }

    @Test
    public void testMajuscules() {
        document.setTexte("bonjour");
        document.majuscules(0, 7);
        assertEquals("BONJOUR", document.getTexte());
    }

    @Test
    public void testEffacer() {
        document.setTexte("Bonjour");
        document.effacer(0, 3);
        assertEquals("jour", document.getTexte());
    }

    @Test
    public void testClear() {
        document.setTexte("Bonjour");
        document.clear();
        assertEquals("", document.getTexte());
    }
}