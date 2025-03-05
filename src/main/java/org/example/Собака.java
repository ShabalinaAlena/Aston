package org.example;

public class Собака extends Животное{
    Собака(String имя) {
        super(имя);
    }

    @Override
    void бежать(int расстояние) {
        super.бежать(расстояние);{
            if (расстояние <= 500) {
                System.out.println(имя + " пробежал " + расстояние + " м.");
            } else {
                System.out.println(имя + " не может пробежать " + расстояние + " м.");
            }
        }
    }

    @Override
    void плыть(int расстояние) {
        super.плыть(расстояние);{
            if (расстояние <= 10) {
                System.out.println(имя + " проплыл " + расстояние + " м.");
            } else {
                System.out.println(имя + " не может проплыть " + расстояние + " м.");
            }
        }
    }

}

