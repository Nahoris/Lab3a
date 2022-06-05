package pl.lublin.wsei.java.cwiczenia.console;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class TestNioCopy {
    public static void main(String[] args) throws IOException {
        //long starTime = System.currentTimeMillis();
        long startTime = -System.nanoTime();//dokładniejszy pomiar
        Path oryginal = new Path("sample_1920x1280.tiff");
        Path kopia = new File("img_copy2.tiff");
        Files.copy(oryginal.toAbsolutePath(), kopia.toAbsolutePath());
        // System.out.println("Czas kopiowa: " + (System.currentTimeMillis() - startTime)+" ms");
        System.out.println("Czas kopiowania: " + (float)(System.nanoTime() - startTime)/1000000+" ms");
    }
}