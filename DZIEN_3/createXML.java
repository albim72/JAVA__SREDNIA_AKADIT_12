import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.print.Doc;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main {

    private static void writeXml(Document doc, OutputStream output) throws TransformerException {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(output);
        transformer.transform(source,result);
    }

    public static void main(String[] args) throws ParserConfigurationException,TransformerException {

        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = docFactory.newDocumentBuilder();

        Document doc = documentBuilder.newDocument();

        Element rootElement = doc.createElement("autokomis");
        doc.appendChild(rootElement);
        //doc.createElement("marka");
        rootElement.appendChild(doc.createElement("marka"));
        

        try(FileOutputStream output = new FileOutputStream("car.xml")){
            writeXml(doc,output);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
