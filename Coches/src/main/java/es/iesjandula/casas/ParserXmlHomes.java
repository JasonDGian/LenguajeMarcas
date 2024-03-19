package es.iesjandula.casas;

import java.io.File;
import java.io.IOException; 
import javax.xml.parsers.DocumentBuilder; 
import javax.xml.parsers.DocumentBuilderFactory; 
import javax.xml.parsers.ParserConfigurationException; 
import org.w3c.dom.Document; 
import org.w3c.dom.Element; 
import org.w3c.dom.NodeList; 
import org.xml.sax.SAXException; 

public class ParserXmlHomes {

    public static void main(String[] args) {
    	
    	 // Create a new factory of documents builder
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
    	
        try {     
            // Get the document builder
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            
            // Parse the XML file
            Document document = documentBuilder.parse(new File("homes.xml"));
            
            Element rootElement = document.getDocumentElement();
            
            // Get the list of 'Home' nodes
            NodeList nodeListHome = rootElement.getElementsByTagName("casa");

            for (int i = 0; i < nodeListHome.getLength(); i++) {
                // Get the current 'Home' node
                Element nodeHome = (Element) nodeListHome.item(i);

                // Get text from node values
                String ciudad 		= nodeHome.getAttributes().getNamedItem("ciudad").getTextContent();
                String tipo 		= nodeHome.getAttributes().getNamedItem("tipo").getTextContent();
                int metrosCuadrados = Integer.valueOf(nodeHome.getAttributes().getNamedItem("metrosCuadrados").getTextContent());
                int plantas		 	= Integer.valueOf(nodeHome.getAttributes().getNamedItem("plantas").getTextContent());
                int habitaciones 	= Integer.valueOf(nodeHome.getAttributes().getNamedItem("habitaciones").getTextContent());
                boolean zonasComunes = Boolean.valueOf(nodeHome.getAttributes().getNamedItem("zonasComunes").getTextContent());

                // Print home details
                System.out.println("Ciudad: " + ciudad + ", tipo: " + tipo + ", metrosCuadrados: " + metrosCuadrados + ", plantas: " + plantas + ", habitaciones: " + habitaciones + ", zonasComunes: " + zonasComunes);
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}