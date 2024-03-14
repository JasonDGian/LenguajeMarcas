package es.iesjandula.coches.xml.helloworld;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

// ctrl - shift - O -> importa todo automaticamente.
// crtl - shift - C -> Comenta.
public class ParserXmlHelloWorld 
{


	public static void main(String[] args) 
	{

		// Creates a new factory of documents builder.
		// Patron factoria, oculta la implementación a hacer. Oculta al desarrollador como va a hacer la implementacion.
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

		try 
		{

			// Create a new instance of document builder
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

			// Parse and store t he XML in the instance of Document.
			Document document = documentBuilder.parse(new File("Hello_world.xml"));

			// Get the root element
			Element rootElement = document.getDocumentElement();

			System.out.println("Nombre del elemento raiz . . " + rootElement.getNodeName());
			System.out.println(" Valor del elemento raiz . . " + rootElement.getTextContent());

		}

		catch (ParserConfigurationException e) 
		{
			e.printStackTrace();
		}

		catch (SAXException e) 
		{
			e.printStackTrace();
		} 
		
		catch (IOException xmlException) 
		{
			xmlException.printStackTrace();
		}

	} // Cierra main

} // Cierra clase principal.
