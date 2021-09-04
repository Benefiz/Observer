/**
 * @author ekkasit.tan
 */
public class Observer {
    public void update(Source o) {
        System.out.println("live result: " + o.getScore());
    }

}
