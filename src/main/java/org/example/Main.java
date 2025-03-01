public class Main {
    public static void main(String[] args) {
        Park park = new Park("Центральный парк");

        park.addAttraction("Веревочный парк", "09:00 - 20:00", 250.0);
        park.addAttraction("Вихрь", "10:00 - 20:00", 400.0);
        park.addAttraction("Гусеница", "11:00 - 20:00", 200.0);
    }
}