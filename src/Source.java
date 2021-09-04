import java.util.ArrayList;

/**
 * @author ekkasit.tan
 */
public class Source {
    private final ArrayList<Observer> list;
    private String score;

    public Source() {
        this.list = new ArrayList<>();
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
        notifyObservers();
    }

    public void register(Observer observer) {
        list.add(observer);
    }

    public void notifyObservers() {
        for (Observer observer : list) {
            observer.update(this);
        }
    }
}
