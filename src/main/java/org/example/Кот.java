package org.example;

class Кот extends Животное {
    boolean сытость = false;
Кот(String имя) {
    super(имя);
}

@Override
void бежать(int расстояние) {
    if (расстояние <= 200) {
        System.out.println(имя + " пробежал " + расстояние + " м.");
    } else {
        System.out.println(имя + " не может пробежать " + расстояние + " м.");
    }
}

@Override
void плыть(int расстояние) {
    System.out.println(имя + " не умеет плавать.");
}

void есть(Миска миска) {
    if (миска.еда >= 10) {
        миска.еда -= 10;
        сытость = true;
        System.out.println(имя + " поел и теперь сыт.");
    } else {
        System.out.println(имя + " не смог поесть, в миске мало еды.");
    }
}
}

class Миска {
    int еда;

    Миска(int еда) {
        this.еда = еда;
    }

    void добавитьЕду(int количество) {
        еда += количество;
        System.out.println("В миску добавлено " + количество + " еды. Теперь в миске " + еда + " еды.");
    }
}
