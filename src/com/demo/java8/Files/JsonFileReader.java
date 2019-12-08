package com.demo.java8.Files;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.EnumSet;

public class JsonFileReader
{
    public static void main( String[] args ) throws IOException
    {
        EnumSet<StandardOpenOption> openOptions = EnumSet.of(StandardOpenOption.READ);
        Path path = Files.createTempFile("igGaAccounts", ".json");
        path.toFile().deleteOnExit();
        //InputStream inputStream = Files.newInputStream("", openOptions.toArray(new StandardOpenOption[openOptions.size()]));
    }
}
