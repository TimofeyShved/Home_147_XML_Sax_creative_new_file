package com.company;

import javax.xml.stream.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
        // Что бы прочитать XML файл, нужно создать сборщик ( ◡‿◡ *)
        XMLOutputFactory factory = XMLOutputFactory.newFactory();
        XMLStreamWriter streamWriter = factory.createXMLStreamWriter(new FileOutputStream("text.xml"));

        streamWriter.writeStartDocument();
        streamWriter.writeStartElement("bookstore");

            streamWriter.writeStartElement("book");
            streamWriter.writeAttribute("category", "COOKING");
                    streamWriter.writeStartElement("title");
                        streamWriter.writeCharacters("Everyday Italian");
                    streamWriter.writeEndElement();
            streamWriter.writeEndElement();

            streamWriter.writeStartElement("book");
            streamWriter.writeAttribute("category", "CHILDREN");
                    streamWriter.writeStartElement("title");
                        streamWriter.writeCharacters("Everyday Italian");
                    streamWriter.writeEndElement();
            streamWriter.writeEndElement();

            streamWriter.writeStartElement("book");
            streamWriter.writeAttribute("category", "WEB");
                    streamWriter.writeStartElement("title");
                        streamWriter.writeCharacters("Everyday Italian");
                    streamWriter.writeEndElement();
            streamWriter.writeEndElement();

        streamWriter.writeEndElement();
        streamWriter.writeEndDocument();


    }
}
