package org.example;

public class Треугольник {
    double сторона1;
    double сторона2;
    double сторона3;
    String цветЗаливки;
    String цветГраницы;

    Треугольник(double сторона1, double сторона2, double сторона3, String цветЗаливки, String цветГраницы) {
        this.сторона1 = сторона1;
        this.сторона2 = сторона2;
        this.сторона3 = сторона3;
        this.цветЗаливки = цветЗаливки;
        this.цветГраницы = цветГраницы;
    }

    double периметр() {
        return сторона1 + сторона2 + сторона3;
    }

    double площадь() {
        double p = периметр() / 2;
        return Math.sqrt(p * (p - сторона1) * (p - сторона2) * (p - сторона3));
    }
}