package com.meryemalay;

public class Printer {

    private int tonerLevel;
    private int PagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        if(this.tonerLevel >-1 && this.tonerLevel <=100){
            this.tonerLevel = tonerLevel;
        }else{
            this.tonerLevel = -1;
        }
        this.duplexPrinter = duplexPrinter;
        this.PagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount >0 && tonerAmount <= 100){
            if(this.tonerLevel + tonerAmount >100){
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }else{
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.duplexPrinter){
            pagesToPrint /= 2;
            System.out.println("Printing in duplex mode");
        }
        this.PagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return PagesPrinted;
    }
}
