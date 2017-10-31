import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by Damian on 31.10.2017.
 */
public class TaskTwo {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe n:");
        int n = scanner.nextInt();
        int element;
        int value;

        TreeMap<Integer, Integer> elements = new TreeMap<>();

        for (int i = 0; i < n; i++){
            element = scanner.nextInt();
            if (elements.containsKey(element)){
                value = elements.get(element);
                elements.put(element, value + 1);
                }else {
                elements.put(element, 1);
            }
            for (Map.Entry<Integer, Integer> entry : elements.entrySet()) {
                Integer key = entry.getKey();
                value = entry.getValue();
                System.out.println(key+" występuje "+value);

                if (value == 1) {
                    System.out.println(" raz");
                } else {
                    System.out.println(" razy");
                }
            }
        }
    }
}
