package com.abs;

public class Printer {
    private int tonerLevel = 100;
    private int numberOfPagePrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        if (tonerLevel >= 0 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }else{
            this.tonerLevel = -1;
        }
        this.numberOfPagePrinted = 0;
        this.duplexPrinter = duplexPrinter;
    }

    public int refillToner(int refill){
        if (refill >= 0 && refill <= 100){
            if ((this.tonerLevel + refill >=0) && (this.tonerLevel + refill <=0)){
                return this.tonerLevel + refill;
            }else {
                return -1;
            }
        }else {
            return -1;
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
