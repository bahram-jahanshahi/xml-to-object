package se.bahram.seb.eform.xml;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import se.bahram.seb.eform.xml.beans.SimpleBean;
import se.bahram.seb.eform.xml.beans.Student;

import java.io.File;
import java.io.IOException;

public class Xml2ObjApp {

    public static void main(String[] args) {
        writeObject2Xml();
        writeXml2Object();
        writeXmlFile2Object();
        writeXmlFile2ObjectAdvance();
    }

    private static void writeXmlFile2ObjectAdvance() {
        File file = new File("/Users/bahram/IdeaProjects/xml2object/filer/Student.xml");
        XmlMapper xmlMapper = new XmlMapper();
        Student bean = null;
        try {
            bean = xmlMapper.readValue(file, Student.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(bean);
    }

    private static void writeXmlFile2Object() {
        File file = new File("/Users/bahram/IdeaProjects/xml2object/filer/SimpleBean.xml");
        XmlMapper xmlMapper = new XmlMapper();
        SimpleBean bean = null;
        try {
            bean = xmlMapper.readValue(file, SimpleBean.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(bean);
    }

    private static void writeXml2Object() {
        XmlMapper xmlMapper = new XmlMapper();
        SimpleBean bean = null;
        try {
            bean = xmlMapper.readValue("<SimpleBean><a>1</a><b>2</b><c>ccc</c></SimpleBean>", SimpleBean.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        System.out.println(bean);
    }

    private static void writeObject2Xml() {
        XmlMapper xmlMapper = new XmlMapper();
        try {
            String xml = xmlMapper.writeValueAsString(new SimpleBean());
            System.out.println(xml);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
