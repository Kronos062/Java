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

                Personaje p = new Personaje(nom, nivell, puntsDeVida, puntsDeMana, arma, armadura);
                System.out.println("Personaje importado: " + p);
            }
        } catch (Exception ex) {
            System.out.println("Error en la importacion del personaje: " + ex);
        }
    }
    //esto es un cntrl + c de una web (no he entendido la API de java sobre nodos:)
    private static String getTextContent(Element element, String tagName) {
        NodeList llistaPersonatge = element.getElementsByTagName(tagName);
        if (llistaPersonatge.getLength() > 0) {
            Element personatge = (Element)llistaPersonatge.item(0);
            return getTextFromElement(personatge);
        }
        return "";
    }
    
    private static String getTextFromElement(Element element) {
        StringBuilder text = new StringBuilder();
        NodeList llistaPersonatge = element.getChildNodes();
        for (int i = 0; i < llistaPersonatge.getLength(); i++) {
            Node node = llistaPersonatge.item(i);
            if (node.getNodeType() == Node.TEXT_NODE || node.getNodeType() == Node.CDATA_SECTION_NODE) {
                text.append(node.getNodeValue());
            }
        }
        return text.toString().trim();
    }
}

