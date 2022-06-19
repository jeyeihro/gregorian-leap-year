package com.github.jeyeihro.gregorian.display.common;

import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CommonSetup implements BeforeEachCallback, AfterEachCallback {
    private static ByteArrayOutputStream _baos;
    private static PrintStream _out;
    private static final String _LN = System.getProperty("line.separator");

    @Override
    public void beforeEach(ExtensionContext context){
        _baos = new ByteArrayOutputStream();
        _out = System.out;
        System.setOut(new PrintStream(new BufferedOutputStream(_baos)));
    }

    @Override
    public void afterEach(ExtensionContext context){
        System.setOut(_out);
    }

    public static String getOutput(){
        return _baos.toString();
    }

    public static String createExpected(String expected){
        return expected + _LN;
    }

    public static String newline(){ return _LN; }
}
