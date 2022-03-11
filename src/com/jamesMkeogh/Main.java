package com.jamesMkeogh;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        String[] pathnames;
        String fileToFind = "FK9DqsiXEAIRKXr.png";
        String path = "C:\\Users\\james.keogh\\Desktop\\testImages\\";
        String newDirectory = path + "NewFolder";
        File file = new File(path);
        pathnames = file.list();
        folderCheck(newDirectory);

        // Print the names of files and directories
        findFiles(pathnames, fileToFind, path);
    }

    private static void folderCheck(String newDirectory) throws IOException {
        if (Files.isDirectory(Paths.get(newDirectory))) {
            System.out.println("Folder exists");
        } else {
            Files.createDirectory(Path.of(newDirectory));
            System.out.println("Folder created");
        }
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

