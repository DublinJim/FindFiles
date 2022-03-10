package com.jamesMkeogh;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        String[] pathnames;
        String fileToFind = "FK9DqsiXEAIRKXr.png";
        String directory ="C:\\Users\\james.keogh\\Desktop\\testImages";
        File file = new File(directory);
        pathnames = file.list();

        // Print the names of files and directories
        findFiles(pathnames, fileToFind,directory);
    }

    private static void findFiles(String[] pathnames, String fileToFind,String directory) {
        if (pathnames != null) {
            for (String pathname : pathnames) {
                System.out.println(pathname);

                if (pathname.equals(fileToFind)) {
                    System.out.println("Found it!!!!!  = " + pathname+" in "+directory);
                }
            }
        }
    }
}

