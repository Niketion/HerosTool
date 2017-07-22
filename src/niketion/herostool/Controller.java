package niketion.herostool;

import javafx.application.Platform;
import niketion.Main;
import niketion.herostool.url.URLDownload;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Controller {

    private String mediafire = "https://www.mediafire.com/";

    public void closeButton() {
        Platform.exit();
    }

    public void minimize() {
        Main.getPrimaryStage().setIconified(true);
    }

    public void processHacker() {
        try {
            Runtime.getRuntime().exec(Main.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath() +  "/../othertools/4.exe");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(new JFrame(), "Tool non trovato, re-installalo o metti la cartella 'othertools' nella stessa del programma");
        }
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

    public void jdGui() {
        try {
            Runtime.getRuntime().exec(Main.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath() +  "/../othertools/1.exe");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(new JFrame(), "Tool non trovato, re-installalo o metti la cartella 'othertools' nella stessa del programma");
        }
    }

    public void lastActivityViewer() {
        try {
            Runtime.getRuntime().exec("cmd /c \""+Main.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath().replaceAll("/C:", "C:")+"/../othertools/2.exe\"");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(new JFrame(), "Tool non trovato, re-installalo o metti la cartella 'othertools' nella stessa del programma");
        }
    }

    public void userAssistView() {
        try {
            Runtime.getRuntime().exec(Main.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath() +  "/../othertools/3.exe");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(new JFrame(), "Tool non trovato, re-installalo o metti la cartella 'othertools' nella stessa del programma");
        }
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
