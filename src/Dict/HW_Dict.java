package Dict;

import java.io.*;
import java.util.*;

public class HW_Dict {
    public static void main(String[] args) throws IOException {

        Map<String, String> dictionary = readFileAndMapIt();

        List<String> inputWords = outputValue();
        for (String word : inputWords) {
            if (dictionary.keySet().contains(word)) {
                System.out.println(dictionary.get(word));
            } else {
                System.out.println("Не найдено");
            }
        }
    }

    public static Map<String, String> readFileAndMapIt() {

        try (BufferedReader readFile = new BufferedReader(new FileReader("dict.txt"))) {
            Map<String, String> dictionary = new HashMap<>();
            int n = Integer.parseInt(readFile.readLine());

            for (int i = 0; i < n; i++) {
                String[] convertToArray = readFile.readLine().split(": ");
                dictionary.put(convertToArray[0].toLowerCase(), convertToArray[1]);
            }
            return dictionary;
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<String> outputValue() {
        try (BufferedReader readInput = new BufferedReader(new InputStreamReader(System.in))) {

            List<String> addToList = new ArrayList<>();

            int m = Integer.parseInt(readInput.readLine());
            for (int i = 0; i < m; i++) {
                addToList.add(readInput.readLine().toLowerCase());
            }
            return addToList;
        } catch (NumberFormatException | IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}