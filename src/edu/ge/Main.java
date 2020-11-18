package edu.ge;
import java.io.*;

public class Main {

    int count = 0;

    { getFile("C:\\Users\\KHM\\Desktop\\Resources\\BTU_DOCUMENT");

    }

    private void getFile(String dirPath) {
        File f = new File(dirPath);
        File[] files = f.listFiles();

        if (files != null)
            for (int i = 0; i < files.length; i++) {
                count++;
                File file = files[i];

                if (file.isDirectory()) {
                    getFile(file.getAbsolutePath());
                }
            }
    }

        public static void main(String[] args) {
            File dir = new File("C:\\Users\\KHM\\Desktop\\Resources\\BTU_DOCUMENT");
            FilenameFilter filter = new FilenameFilter() {
                public boolean accept(File dir, String name) {
                    return name.startsWith("b");
                }
            };
            String[] children = dir.list(filter);
            if (children == null) {
                System.out.println("მსგავსი სახის დირექტორია არ არსებობს!");
            } else {
                for (int i = 0; i < children.length; i++) {
                    String filename = children[i];
                    System.out.println(filename);
                }
            }
        }
    }
