package org.example;

public class Product {
    public static void Product (String[] args) {

    }
 private final String name;
 private final String productionDate;                                  //дата производства
 private final String manufacturer;                                       //производитель
 private final String countryOfOrigin;                                  //страна происхождения
 private final double price;                                             //цена
 private final boolean inReserved;                          //состояние бронирования покупателем

public Product(String name, String productionDate, String manufacturer,
               String countryOfOrigin, double price, boolean inReserved) {
    this.name = name;
    this.productionDate = productionDate;
    this.manufacturer = manufacturer;
    this.countryOfOrigin = countryOfOrigin;
    this.price = price;
    this.inReserved = inReserved;
}
    public void displayInfo () {
        System.out.println("Название: " + name);
        System.out.println("Дата" + productionDate);
        System.out.println("Производитель" + manufacturer);
        System.out.println("Страна происхождения" + countryOfOrigin);
        System.out.println("Цена" + price);
        System.out.println("Забронирован" + (inReserved ? "Да" : "Нет"));
    }
}

