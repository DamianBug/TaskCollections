import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Damian on 31.10.2017.
 */
public class TaskThree {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj słowo po Polsku:");
        String word = scanner.next();

        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("tata", "father");
        dictionary.put("mama", "mother");
        dictionary.put("pies", "dog");
        dictionary.put("kot", "cat");

        if (dictionary.containsKey(word.toLowerCase())){
            System.out.println("Słowo po angielsku to "+dictionary.get(word.toLowerCase()));
        }else {
            System.out.println("Nie ma słowa w słowniku");
        }
    }
}
