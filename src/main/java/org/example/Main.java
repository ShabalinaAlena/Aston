package org.example;

public class Main {
    public static void main(String[] args) {

        Миска miska = new Миска(30);

        Собака tuzik = new Собака("Tuzik");
        Кот murka = new Кот("Murka");

        tuzik.бежать(500);
        tuzik.плыть(10);

        murka.бежать(200);
        murka.плыть(0);

        murka.есть(miska);

        miska.добавитьЕду(20);

        murka.есть(miska);

        System.out.println("Всего животных: " + Животное.счетчик);
    }
}