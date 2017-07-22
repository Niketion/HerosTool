package niketion.herostool;

import niketion.herostool.url.URLDownload;

import java.net.MalformedURLException;
import java.net.URL;

public class Controller {

    private String mediafire = "https://www.mediafire.com/";

    public void processHacker() {
        getURL(mediafire+"?uzx7s1t3qo4yk5o");
    }

    public void vapeSmasher() {
        getURL(mediafire+"?57jkq915fj6flze");
    }

    public void buckyRoberts() {
        getURL(mediafire+"?jtzo5o1e693jssm");
    }

    public void injectionSpotter() {
        getURL(mediafire+"?q80dqal27apbfq3");
    }

    public void lastActivityViewer() {
        getURL(mediafire+"?3hn8ufet74ba3bv");
    }

    public void lowAutoclicker() {
        getURL(mediafire+"?kdf6kit7t9fdep3");
    }

    public void cheatSamsher() {
        getURL(mediafire+"?311u5brzu5c7gur");
    }

    public void allTools() {
        getURL(mediafire+"?icjnn9a05nanuwx");
    }

    private void getURL(String string) {
        try {
            new URLDownload(new URL(string));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
