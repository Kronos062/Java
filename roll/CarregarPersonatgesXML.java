package roll;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;

public class CarregarPersonatgesXML {
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
                int puntsDeVida = Integer.parseInt(getTextContent(personatge"puntsDeVida"));
                int puntsDeMana = Integer.parseInt(getTextContent(personatge,"puntsDeMana"));
                String arma = getTextContent(personatge, "arma");
                String armadura = getTextContent(personatge, "armadura");

                Personatge p = new Personatge(nom, nivell, puntsDeVida, puntsDeMana, arma, armadura);
                System.out.println("Personaje importado: " + p);
            }
            //Arribat aquest punt veureu com aqui podriem extreure el codi per no repetir-nos, queda com a exercici
            NodeList llistaPersonatge = ((Element)elem.getParentNode()).getElementsByTagName("Preu");
            for (int j = 0; j < llistaPersonatge.getLength(); j++) {
                Element personatge = (Element)llistaPersonatge.item(j);
                NodeList llistaPersonatge = personatge.getChildNodes();
                for (int k = 0; k < llistaPersonatge.getLength(); k++) { 
                    Node p = llistaPersonatge.item(k);
                    //Mirar si els nodes són de text, com veureu CDATA ho hevist a LMSGI
                    if ( (p.getNodeType() == Node.TEXT_NODE)||
                        (p.getNodeType() == Node.CDATA_SECTION_NODE) ) {
                
                        text += " " + p.getNodeValue();
                    }
                }
                System.out.println(text);
            }
        } catch (Exception ex) {
            System.out.println("Error en la importacion del personaje: " + ex);
        }
    }
}