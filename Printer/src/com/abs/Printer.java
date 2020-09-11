package com.abs;

public class Printer {
    private int tonerLevel = 100;
    private int numberOfPagePrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, int numberOfPagePrinted, boolean duplexPrinter) {
        if (tonerLevel >= 0 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }
        this.numberOfPagePrinted = numberOfPagePrinted;
        this.duplexPrinter = duplexPrinter;
    }

    public void refillToner(int refill){
        if (refill >= 0 && refill <= 100){
            this.tonerLevel = refill;
        }
    }

    public void printPage(){
        this.numberOfPagePrinted ++;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagePrinted() {
        return numberOfPagePrinted;
    }
}
