package com.example.plugin.util;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class StringHandler extends DefaultHandler {
    private static final int STRING_LENGTH = 10;
    private static final String STRING_TAG = "string";
    boolean _isStringField = false;

    @Override
    public void startElement(
            String uri, String localName, String qName, Attributes attributes)
            throws SAXException {

        if (qName.equalsIgnoreCase(STRING_TAG))
            _isStringField = true;
    }

    @Override
    public void endElement(String uri,
                           String localName, String qName) throws SAXException {
    }

    @Override
    public void characters(char ch[], int start, int length) throws SAXException {
        String str = new String(ch, start, length);
        if (_isStringField && str.trim().length() > 0) {
            if (length > STRING_LENGTH) {
                System.out.println("String Value : " + str + " cannot fit in textview. Will be truncated");
            } else {
                System.out.println("String Value : " + str + " will fit in textview.");
            }
        }
    }
}
