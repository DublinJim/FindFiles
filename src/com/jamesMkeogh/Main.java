package com.jamesMkeogh;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        String[] pathnames;
        String fileToFind = "FK9DqsiXEAIRKXr.png";
        File file = new File("C:\\Users\\james.keogh\\Desktop\\testImages");
        pathnames = file.list();

        // Print the names of files and directories
        if (pathnames != null) {
            for (String pathname : pathnames) {
                System.out.println(pathname);

                if (pathname.equals(fileToFind)) {
                    System.out.println("found it " + pathname);
                }
            }
        }
    }
}

