package observer;

public class Button{

    private String name;
    private ButtonListenerInterface buttonListener;

    public Button(String name){
        this.name = name;
    }

    public void click(String msg){
        buttonListener.clickEvent(msg);
    }

    public void addListener(ButtonListenerInterface buttonListener){
        this.buttonListener = buttonListener;
    }
}
