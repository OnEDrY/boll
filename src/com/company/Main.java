package com.company;

public class Main {

    public static void main(String[] args) {
        Boll t = new Boll();

        t.setX(1);
        t.setY(1);

        t.getX();
        t.getY();

        t.setXY(2,2);

        t.move(3 , 3);

        System.out.println(t.toString());

    }
}

