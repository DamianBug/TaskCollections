import java.util.Random;
import java.util.TreeSet;

/**
 * Created by Damian on 31.10.2017.
 */
public class TaskOne {

    public static void main(String[] args){

        Random random = new Random();
        int number;

        TreeSet<Integer> numberOfLotto = new TreeSet<>();
        while (numberOfLotto.size() != 6){
            number = random.nextInt(48) + 1;
            numberOfLotto.add(number);
        }
        System.out.println(numberOfLotto);
    }
}
