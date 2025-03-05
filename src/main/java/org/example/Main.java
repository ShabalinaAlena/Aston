package org.example;

public class Main {
    public static void main(String[] args) {
    //Задание 1
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

    // Задание 2
        Круг круг = new Круг(10, "белый", "черный");
        Прямоугольник прямоугольник = new Прямоугольник(6, 8, "зеленый", "белый");
        Треугольник треугольник = new Треугольник(4, 5, 6, "красный", "желтый");

        System.out.println("\nКруг:");
        System.out.println("Периметр: " + круг.периметр());
        System.out.println("Площадь: " + круг.площадь());
        System.out.println("Цвет заливки: " + круг.цветЗаливки);
        System.out.println("Цвет границы: " + круг.цветГраницы);

        System.out.println("\nПрямоугольник:");
        System.out.println("Периметр: " + прямоугольник.периметр());
        System.out.println("Площадь: " + прямоугольник.площадь());
        System.out.println("Цвет заливки: " + прямоугольник.цветЗаливки);
        System.out.println("Цвет границы: " + прямоугольник.цветГраницы);

        System.out.println("\nТреугольник:");
        System.out.println("Периметр: " + треугольник.периметр());
        System.out.println("Площадь: " + треугольник.площадь());
        System.out.println("Цвет заливки: " + треугольник.цветЗаливки);
        System.out.println("Цвет границы: " + треугольник.цветГраницы);
    }
}