package Check_Directory;

import java.io.File;
import java.util.*;

public class Directory_check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String directoryPath = sc.next(); // Replace with the directory path you want to check and create

        File directory = new File(directoryPath);

        if (directory.exists()) {
            if (directory.isDirectory() && directory.canWrite()) {
                System.out.println("Directory exists and you have write access to it.");
            } else {
                System.out.println("Directory exists, but you do not have write access.");
            }
        } else {
            if (directory.mkdirs()) {
                System.out.println("Directory created successfully."+ directory.getAbsolutePath());
            } else {
                System.out.println("Failed to create the directory.");
            }
        }
    }
}
