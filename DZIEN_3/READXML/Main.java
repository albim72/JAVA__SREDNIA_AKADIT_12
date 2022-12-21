import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {

            File file = new File("student.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);
            doc.getDocumentElement().normalize();
            System.out.println("Element główny: " + doc.getDocumentElement().getNodeName());

            NodeList nodeList = doc.getElementsByTagName("student");
            for(int itr=0;itr<nodeList.getLength();itr++){
                Node node = nodeList.item(itr);
                System.out.println("\nNazwa węzła: " + node.getNodeName());
                if(node.getNodeType() == Node.ELEMENT_NODE){
                    Element element = (Element) node;
                    System.out.println("ID studenta: " + element.getElementsByTagName("id").item(0).getTextContent());
                    System.out.println("imię studenta: " + element.getElementsByTagName("firstname").item(0).getTextContent());
                    System.out.println("nazwisko studenta: " + element.getElementsByTagName("lastname").item(0).getTextContent());
                    System.out.println("przedmiot: " + element.getElementsByTagName("subject").item(0).getTextContent());
                    System.out.println("ocena: " + element.getElementsByTagName("marks").item(0).getTextContent());
                }

            }
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        }
    }
}
