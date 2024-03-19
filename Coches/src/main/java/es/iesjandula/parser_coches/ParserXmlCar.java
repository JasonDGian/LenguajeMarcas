package es.iesjandula.parser_coches;

// importamos la utilidad para manejar archivos.
import java.io.File;
// Importamos los objetos de excepción de entrada y salida.
import java.io.IOException;

// importamos las utilidades de builders de documentos.
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
// importamos objeto excepction para parser.
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ParserXmlCar {

	public static void main(String[] args) {
		
		//Creamos nueva "fabrica" para el constructor o builder de documentos.
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();


			try
			{
			// Instanciamos el constructor de documentos.
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
			
			// Parsear y almacenar el XML en la instancia del documento.
			Document document = documentBuilder.parse(new File("car.xml"));
			
			// recogemos el elemento raiz.
			Element rootElement = document.getDocumentElement();
			
			// recogemos la lista de coches.
			NodeList nodeListCar = rootElement.getElementsByTagName("coche");
			
			// Recoger el primer elemento de la lista.
			Element nodeCar = (Element) nodeListCar.item(0);  // Accede al objeto de indice 0 contenido en el nodo. 
			
			// Obtiene textos de los valores de los nodos.
			String marca 		= nodeCar.getElementsByTagName("marca").item(0).getTextContent();
			String modelo 		= nodeCar.getElementsByTagName("modelo").item(0).getTextContent();
			String puertas 		= nodeCar.getElementsByTagName("puertas").item(0).getTextContent();
			String kilometros 	= nodeCar.getElementsByTagName("kilometros").item(0).getTextContent();
			
			System.out.println("Marca: " + marca + " modelo: " + modelo + " puertas: " + puertas + " kilometros: " + kilometros);
			
			// obtiene elemento motor.
			NodeList listaNodoMotor = nodeCar.getElementsByTagName("motor");
			
			// obtiene primer elmeento de la lista.
			Element	nodoMotor = (Element) listaNodoMotor.item(0);
			
			String revoluciones = nodoMotor.getElementsByTagName("revoluciones").item(0).getTextContent();
			String tipo = nodoMotor.getElementsByTagName("tipo").item(0).getTextContent();
			
			System.out.println("Motor - Revoluciones: " + revoluciones + " tipo: " + tipo);
			
			}
			catch ( ParserConfigurationException | SAXException | IOException x ) {
				x.printStackTrace();		
			}
		
			

		
	}

}
