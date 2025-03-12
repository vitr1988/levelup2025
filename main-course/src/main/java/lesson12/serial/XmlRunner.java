package lesson12.serial;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.math.BigDecimal;

public class XmlRunner {
    public static void main(String[] args) throws Exception {
        Employee employee = new Employee(
                "Ivanov Vitaly", 20,
                new Position(1L, "Expert", new BigDecimal("1000000"))
        );
//        XmlMapper xmlMapper = new XmlMapper();
        ObjectMapper jsonMapper = new ObjectMapper();
        jsonMapper.enable(SerializationFeature.INDENT_OUTPUT);
//        xmlMapper.registerModule(new JavaTimeModule());
//        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);
//        XMLStreamWriter xmlStreamWriter = XMLOutputFactory.newInstance().createXMLStreamWriter(new FileWriter("src/resources/text.xml"));
//        xmlMapper.writeValue(xmlStreamWriter, employee);
        System.out.println(jsonMapper
//                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(employee));
//        System.out.println(jsonMapper.writeValueAsString(employee));
//        xmlStreamWriter.flush();
//        xmlStreamWriter.close();
    }
}
