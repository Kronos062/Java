package roll;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;

public class CarregarPersonatgesXML {
    //he buscado mas ejemplos de parsers en java y he encontrado esto, forma parte de los nodos, es un cntl c (espero ):
    private static String getTextContent(Element element, String tagName) {
        NodeList nodeList = element.getElementsByTagName(tagName);
        if (nodeList != null && nodeList.getLength() > 0) {
            Element node = (Element) nodeList.item(0);
            return node.getTextContent();
        }
        return null;
    }

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
                int nivell = Integer.parseInt(getTextContent(personatge,"nivell"));
                int puntsDeVida = Integer.parseInt(getTextContent(personatge, "puntsDeVida"));
                int puntsDeMana = Integer.parseInt(getTextContent(personatge,"puntsDeMana"));
                String arma = getTextContent(personatge, "arma");
                String armadura = getTextContent(personatge, "armadura");

                Personatge p = new Personatge(nom, nivell, puntsDeVida, puntsDeMana, arma, armadura);
                System.out.println("Personaje importado: " + p);
            
            //Arribat aquest punt veureu com aqui podriem extreure el codi per no repetir-nos, queda com a exercici
            NodeList childNodes = personatge.getChildNodes();
                for (int j = 0; j < childNodes.getLength(); j++) {
                    Node node = childNodes.item(j);
                    if (node.getNodeType() == Node.TEXT_NODE || node.getNodeType() == Node.CDATA_SECTION_NODE) {
                        System.out.println("Texto encontrado: " + node.getNodeValue());
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println("Error en la importacion del personaje: " + ex);
        }
    }
}