package org.example;

class Животное {
    String имя;
    static int счетчик = 0;

    Животное(String имя) {
        this.имя = имя;
        счетчик++;
    }

    void бежать(int расстояние) {
        System.out.println(имя + " бежит " + расстояние + " м.");
    }

    void плыть(int расстояние) {
        System.out.println(имя + " плывет " + расстояние + " м.");
    }
}