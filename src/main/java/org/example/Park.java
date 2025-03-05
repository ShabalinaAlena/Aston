public class Park {
    private String parkName;

    public Park(String parkName) {
        this.parkName = parkName;
    }

    public class Attraction {
        private String attractionName; // Название аттракциона
        private String workingHours; // Время работы
        private double price; // Стоимость

        public Attraction(String attractionName, String workingHours, double price) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void displayInfo() {
            System.out.println("Аттракцион: " + attractionName);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + price);
            System.out.println(); // Пустая строка для разделения
        }
    }

    public void addAttraction(String attractionName, String workingHours, double price) {
        Attraction attraction = new Attraction(attractionName, workingHours, price);
        attraction.displayInfo(); // Выводим информацию о новом аттракционе
    }
}