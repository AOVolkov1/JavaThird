public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int k = 20;
        int miles = service.calculate(price,20); // должно получиться 500
        System.out.println(miles);

    }
}