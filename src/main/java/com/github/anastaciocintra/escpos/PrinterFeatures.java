package com.github.anastaciocintra.escpos;

/**
 * Bundles a number of feature toggles to influence the behaviour of the {@link EscPos} class
 */
public class PrinterFeatures {
    private final boolean fonts;


    public PrinterFeatures() {
        this(true);
    }

    public PrinterFeatures(boolean fonts) {
        this.fonts = fonts;
    }


    public boolean supportsFonts() {
        return fonts;
    }
}
