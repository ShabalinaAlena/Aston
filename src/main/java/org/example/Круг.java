package org.example;

public class Круг {
    double радиус;
    String цветЗаливки;
    String цветГраницы;

    Круг(double радиус, String цветЗаливки, String цветГраницы) {
        this.радиус = радиус;
        this.цветЗаливки = цветЗаливки;
        this.цветГраницы = цветГраницы;
    }

    double периметр() {
        return 2 * 3.14 * радиус;
    }

    double площадь() {
        return 3.14 * радиус * радиус;
    }
}