package org.example;

public class Прямоугольник {
    double длина;
    double ширина;
    String цветЗаливки;
    String цветГраницы;

    Прямоугольник(double длина, double ширина, String цветЗаливки, String цветГраницы) {
        this.длина = длина;
        this.ширина = ширина;
        this.цветЗаливки = цветЗаливки;
        this.цветГраницы = цветГраницы;
    }

    double периметр() {
        return 2 * (длина + ширина);
    }

    double площадь() {
        return длина * ширина;
    }
}