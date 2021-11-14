package org.esei.dm.androidwebviewcalculator;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

/**
 * Maneja la interfaz desde la web.
 */
public class WebAppInterface {
    Context context;

    /** Instantiate the interface and set the context */
    WebAppInterface(Context c) {
        this.context = c;
    }

    /** Show a toast from the web page - muestra un mensaje desde la interfaz web
    */
    @JavascriptInterface
    public void showToast(String toast) {
        Toast.makeText( context, toast, Toast.LENGTH_LONG ).show();
    }
}
