package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;
    public void start() {
        zofka = new Turtle();

        kresliCtverec();

        kresliStrechu();

        zofka.penUp();
        zofka.turnLeft(45);
        zofka.move(300);
        zofka.penDown();

        nakresliPrase();


    }

    private void nakresliPrase() {
        for (int i = 0; i < 2; i++) {
            zofka.move(100);
            zofka.turnLeft(90);
            zofka.move(200);
            zofka.turnLeft(90);
        }
        zofka.turnRight(45);
        zofka.move(75);
        zofka.turnLeft(90);
        zofka.move(125);
        zofka.turnLeft(180);
        zofka.move(50);
        zofka.turnLeft(90);
        zofka.move(50);
        zofka.turnLeft(180);
        zofka.move(50);
        zofka.turnRight(45);
        zofka.penUp();
        zofka.move(200);
        zofka.turnRight(45);
        zofka.penDown();
        zofka.move(50);
        zofka.turnLeft(180);
        zofka.move(50);
        zofka.turnLeft(90);
        zofka.move(50);
        zofka.turnRight(180);
        zofka.move(50);
        zofka.turnLeft(45);
        zofka.move(100);
    }

    private void kresliStrechu() {
        zofka.penUp();
        zofka.move(200);
        zofka.penDown();
        zofka.turnLeft(45);
        zofka.move(145);
        zofka.turnLeft(90);
        zofka.move(145);
    }

}

    private void kresliCtverec() {
        for (int i = 0; i < 4 ; i++) {
            zofka.move(200);
            zofka.turnLeft(90);
        }
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
