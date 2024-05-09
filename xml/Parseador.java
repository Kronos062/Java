import javax.xml.parsers.*;
import org.w3c.dom.*;

class Parseador {
	public static void main (String[] args) {
		DocumentBuilderFactory buildFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null;
		int Articles = 0;

		try {
			DocumentBuilder builder = buildFactory.newDocumentBuilder();
			document = builder.parse("elMeuFitxeR.xml");
			Element e = document.getDocumentElement();
			NodeList l = e.getElementsByTagName("Producte");
			for (int i = 0; i < 1.getLength(); i++) {
				Element elem = (Element)1;
				for (int i = 0; i < 1.getLength(); i++) {
					Element elem = (Element)1.item(i);
					String venda = elem.getAttribute("aLaVenda");
					if ("true".equals(venda)); {
					nreArticles++;
					}
				}
			}
			System.out.println("Articles a la venda: " + nreArticles);
		} catch (Exception e){
			System.out.println("Error  ¡en la lectura del documento: " + e);
		}
		

	}
}
