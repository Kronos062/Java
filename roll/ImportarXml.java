package roll;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;

public class ImportarXml {
    private static void importarPersonajes() {
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        Document document = null;
        
        try {
            DocumentBuilder builder = builderFactory.newDocumentBuilder();
            File f = new File ("personatges.xml");
            document = builder.parse(f);
            Element e = document.getDocumentElement();
            //Obtenir tots els nodes del document anomenats "nom"
            NodeList llistaPersonatge = e.getElementsByTagName("personatge");
            //Recorregut d'elements anomenats "Nom"
            for (int i = 0; i < llistaPersonatge.getLength(); i++) {
                Element personatge = (Element)llistaPersonatge.item(i);
                String nom = getTextContent(personatge, "nom");
                int nivell = Integer.parseInt(getTextContent(personatge, "nivell"));
                int puntsDeVida = Integer.parseInt(getTextContent(personatge, "puntsDeVida"));
                int puntsDeMana = Integer.parseInt(getTextContent(personatge, "puntsDeMana"));
                String arma = getTextContent(personatge, "arma");
                String armadura = getTextContent(personatge, "armadura");

                Personatge p = new Personatge(nom, nivell, puntsDeVida, puntsDeMana, arma, armadura);
                System.out.println("Personaje importado: " + p);
            }
        } catch (Exception ex) {
            System.out.println("Error en la importacion del personaje: " + ex);
        }
    }
}
