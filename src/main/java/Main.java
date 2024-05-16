import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        System.out.println(service.calculateSum(sales));
        System.out.println(service.calculateAvg(sales));
        System.out.println(service.maxSales(sales));
        System.out.println(service.minSales(sales));
        System.out.println(service.amountMonthUnderAvg(sales));
        System.out.println(service.amountMonthOverAvg(sales));

    }
}