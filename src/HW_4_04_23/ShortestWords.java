package HW_4_04_23;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShortestWords {
//  Задача 2* (не обязательно)
//  Дана последовательность слов
//  (количество, а затем и сами слова, каждое слово с новой строки).
//  Вывести все самые короткие слова через пробел.
//  Оценить временную и пространственную сложность алгоритма.
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    String[] words = new String[n];
    for (int i = 0; i < n; i++) {
      words[i] = br.readLine();
    }

    int shortestLength = Integer.MAX_VALUE;
    for (String word : words) {
      if (word.length() < shortestLength) {
        shortestLength = word.length();
      }
    }
//    System.out.println("shortestLength : "+ shortestLength);

    for (String word : words) {
      if (word.length() == shortestLength) {
        System.out.print(word + " ");
      }
    }
  }
}


//public class ShortestWords {
//  public static void main(String[] args) throws IOException {
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//    int n = Integer.parseInt(br.readLine());
//
//    ArrayList<String> words = new ArrayList<>();
//    for (int i = 0; i < n; i++) {
//      words.add(br.readLine());
//    }
//
//    int shortestLength = Collections.min(words, Comparator.comparingInt(String::length)).length();
//    words.removeIf(word -> word.length() > shortestLength);
//
//    System.out.println(String.join(" ", words));
//  }
//}


