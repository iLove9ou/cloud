package com.cloud.gateway.utils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

public class XmlUtil {

    public static String beanToXml(Object obj, Class<?> load) throws JAXBException {
         JAXBContext context = JAXBContext.newInstance(load);
         Marshaller marshaller = context.createMarshaller();
         marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
         marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
         StringWriter writer = new StringWriter();
         marshaller.marshal(obj, writer);
         return writer.toString();
    }

    public static Object xmlToBean(String xmlPath,Class<?> load) throws JAXBException, IOException {
         JAXBContext context = JAXBContext.newInstance(load);
         Unmarshaller unmarshaller = context.createUnmarshaller();
         Object object = unmarshaller.unmarshal(new File(xmlPath));
         return object;
    }
}
