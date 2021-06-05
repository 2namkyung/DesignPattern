package proxy;

import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static void main(String[] args) {
        Browser browser = new Browser("www.naver.com");
        browser.show();
        browser.show();
        browser.show();

        System.out.println("--------------------------");

        BrowserInterface Ibrowser = new BrowserProxy("www.naver.com");
        Ibrowser.show();
        Ibrowser.show();
        Ibrowser.show();
        Ibrowser.show();

        System.out.println("---------------------------");

        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();
        BrowserInterface aopBrowser = new AopBrowser("www.naver.com",
                () -> {
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                () -> {
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                }
        );

        aopBrowser.show();
        System.out.println("loading time : " + end.get());
        System.out.println("----- Using Cache -----");
        aopBrowser.show();
        System.out.println("loading time : " + end.get());
    }
}
