package niketion.herostool.url;

import java.awt.*;
import java.net.URL;

public class URLDownload {

    @Deprecated
    public URLDownload(URL url) {
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            try {
                desktop.browse(url.toURI());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
