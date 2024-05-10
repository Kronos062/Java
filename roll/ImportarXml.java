package roll;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;

public class ImportarXml {
    private static void howToExtractDataFromXML() {
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        Document document = null;
        
        try {
            DocumentBuilder builder = builderFactory.newDocumentBuilder();
            File f = new File ("elMeuFitxer.xml");
            document = builder.parse(f);
            Element e = document.getDocumentElement();
            //Obtenir tots els nodes del document anomenats "nom"
            NodeList llistaElems = e.getElementsByTagName("Nom");
            //Recorregut d'elements anomenats "Nom"
            for (int i = 0; i < llistaElems.getLength(); i++) {
                Element elem = (Element)llistaElems.item(i);
                NodeList llistaFills = elem.getChildNodes();
                //Recorregut de nodes fill d'un element (text, atributs, etc.)
                String text = "";
                for (int j = 0; j < llistaFills.getLength(); j++) {
                    Node n = llistaFills.item(j);
                    //Mirar si els nodes són de text, com veureu CDATA ho hevist a LMSGI
                    if ( (n.getNodeType() == Node.TEXT_NODE)||
                        (n.getNodeType() == Node.CDATA_SECTION_NODE) ) {
                
                        text += n.getNodeValue();
                    }
                }

                //Arribat aquest punt veureu com aqui podriem extreure el codi per no repetir-nos, queda com a exercici
                NodeList llistaPreus = ((Element)elem.getParentNode()).getElementsByTagName("Preu");
                for (int j = 0; j < llistaPreus.getLength(); j++) {
                    Element preu = (Element)llistaPreus.item(j);
                    NodeList llistaFillsPreu = preu.getChildNodes();
                    for (int k = 0; k < llistaFillsPreu.getLength(); k++) { 
                        Node p = llistaFillsPreu.item(k);
                        //Mirar si els nodes són de text, com veureu CDATA ho hevist a LMSGI
                        if ( (p.getNodeType() == Node.TEXT_NODE)||
                            (p.getNodeType() == Node.CDATA_SECTION_NODE) ) {
                    
                            text += " " + p.getNodeValue();
                        }
                    }
                    System.out.println(text);
                }
            }
        } catch (Exception ex) {
            System.out.println("Error en la lectura del document: " + ex);
        }
    }
}
