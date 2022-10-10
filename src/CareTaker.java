import java.util.ArrayList;

public class CareTaker {

    private ArrayList<Memento> history;


    public CareTaker() {
        history = new ArrayList<>();
    }

    public void addNew(Memento memo) {
        history.add(memo);
    }

    public Memento retrieve() {
        return this.history.get(history.size() - 1);
    }
}
