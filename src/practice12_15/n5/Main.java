package practice12_15.n5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {
            String line;
            line = br.readLine();
            System.out.println(line);
            line = getLine(line);
            System.out.println(line);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static String getLine(String s) {
        ArrayList<String> words = new ArrayList<>(List.of(s.split(" ")));
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < words.size(); i++) {
            ArrayList<String> tmp = (ArrayList<String>) words.clone();
            str.append(tmp.get(i));
            tmp.remove(i);
            int c = 0;
            while (!tmp.isEmpty() && c < words.size()) {
                for (int j = 0; j < tmp.size(); j++) {
                    if (str.charAt(str.length() - 1) == tmp.get(j).charAt(0)) {
                        str.append(" ").append(tmp.get(j));
                        tmp.remove(j);
                    }
                }
                c++;
            }
            if (tmp.isEmpty()) return str.toString();
            else str = new StringBuilder();
        }
        if (str.isEmpty()) return "impossible";
        else return str.toString();
    }
}
