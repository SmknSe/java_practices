package practice23_24;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class main {
    public static void main(String[] args) {
        try {
            Reader reader = new BufferedReader(new FileReader("C:\\Users\\semey\\IdeaProjects\\java_practices\\src\\practice23_24\\csv\\test.csv"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
