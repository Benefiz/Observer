import java.util.Scanner;

/**
 * @author ekkasit.tan
 */
public class MainObserver {
    public static void main(String[] args) {
        Source src = new Source();
        Observer obs1 = new Observer();
        Observer obs2 = new Observer();
        src.register(obs1);
        src.register(obs2);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter score: ");
            String score = sc.nextLine();
            if (score.isEmpty())
                break;
            src.setScore(score);
        }
    }
}
