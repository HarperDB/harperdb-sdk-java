package io.harperdb.config.parser;

import io.harperdb.config.ConfigModel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertiesParserTest {

    @Test
    void testParse() {
        PropertiesParser propertiesParser = new PropertiesParser();
        ConfigModel configModel = propertiesParser.parse();

        assertNotNull(configModel);
        assertEquals(9956, configModel.getAsInt("server.node1.port"));
        assertEquals("localhost", configModel.getAsString("server.node1.host"));
        assertEquals(9957, configModel.getAsInt("server.node2.port"));
        assertEquals("127.0.0.1", configModel.getAsString("server.node2.host"));
    }
}