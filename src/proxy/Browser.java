package proxy;

import javax.swing.text.html.HTML;

public class Browser implements BrowserInterface{

    private String url;

    public Browser(String url){
        this.url = url;
    }

    @Override
    public Html show() {
        System.out.println("browser loading html from : " + url);
        return new Html(url);
    }
}
