package com.company;

public class Printer {

    private int level;
    private int pages;
    private boolean duplex;

    public Printer(int level, boolean duplex) {

        if(level > -1 && level <= 100){
        this.level = level;
        }else {
            this.level = -1;
        }

        this.duplex = duplex;
        this.pages = 0;
    }

    public int addLevel(int lvlAmount){
        if (level > 0 && lvlAmount <= 100){
            if (this.level + lvlAmount > 100){
                return -1;
            }
            return this.level =+ lvlAmount;
        } else {
            return -1;
        }
    }

    public  int printPages(int pages){
        int pagesToPrint = pages;
        if (this.duplex){
            pagesToPrint = (pages /2) + (pages % 2);
            System.out.printf("Printing in Duplex Mode");
        }
        this.pages += pagesToPrint;
        return pagesToPrint;
    }

    public int getPages() {
        return pages;
    }
}
