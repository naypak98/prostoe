package org.example;

public class Felix {
    private int sytost;

    public Felix(int sytost) {
        this.sytost=sytost;
    }

    public void sleep(){
        System.out.println("хрхрхрр");
    }

    public int getSytost() {
        return sytost;
    }

    public void eat(String foodType, int foodSize) {
        switch (foodType){
            case "оливки" -> sytost+=foodSize*5;
            case "майонез" -> sytost+=foodSize*15;
            case "каша" -> sytost+=foodSize*3;
            default -> sytost+=foodSize;
        }

    }

    public void hunger() {
        if (sytost >= 20) {
            sytost -= 20;
        } else {
            sytost = 0;
        }
        if (sytost<80) {
            System.out.println("МЯУмяуямяуямяуяммяумяуямяу");
        }
    }


}

