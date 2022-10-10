public class Text {

    private String content;
    private CareTaker history;

    public Text(String content) {
        this.content = content;
        history = new CareTaker();
    }

    public void update(String newContent) {
        this.content = newContent;
        Memento temp = new Memento(this.content);
        history.addNew(temp);
    }

}
