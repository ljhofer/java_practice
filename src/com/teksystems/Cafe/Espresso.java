package com.teksystems.Cafe;

public class Espresso extends Product {

    boolean extraShot = false;
    boolean macchiato = false;

    public Espresso(String name, double price, String description, boolean extraShot, boolean macchiato) {
        super(name, price, description);
        this.extraShot = false;
        this.macchiato= false;
    }

    public Espresso() {
        super("Espresso", 3.75, "Guaranteed to wake you up!");
        this.extraShot = false;
        this.macchiato = false;
    }

    public boolean isExtraShot() {
        return extraShot;
    }

    public void setExtraShot(boolean extraShot) {
        this.extraShot = extraShot;
    }

    public boolean isMacchiato() {
        return macchiato;
    }

    public void setMacchiato(boolean macchiato) {
        this.macchiato = macchiato;
    }

    @Override
    public double calculateProductTotal() {
        double addShot = (this.extraShot ? 2.00 : 0);
        double addMacchiato = (this.macchiato ? 1.00 : 0);
        double subTotal = this.getPrice()*this.getQuantity() + addShot + addMacchiato;

        return subTotal;
    }


}
