package com.jamesMkeogh;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        String[] pathnames;
        String fileToFind = "FK9DqsiXEAIRKXr.png";
        String directory = "C:\\Users\\james.keogh\\Desktop\\testImages";
        File file = new File(directory);
        pathnames = file.list();
        Files.createDirectory(Path.of("C:\\Users\\james.keogh\\Desktop\\testImages\\test"));
        // Print the names of files and directories
        findFiles(pathnames, fileToFind, directory);
    }

    private static void findFiles(String[] pathnames, String fileToFind, String directory) {
        if (pathnames != null) {
            for (String pathname : pathnames) {
                System.out.println(pathname);

                if (pathname.equals(fileToFind)) {
                    System.out.println("---------------------------------------------------");
                    for (String s : Arrays.asList("Found it = " + pathname + " in " + directory,
                        "---------------------------------------------------")) {
                        System.out.println(s);
                    }
                }
            }
        }
    }
}

