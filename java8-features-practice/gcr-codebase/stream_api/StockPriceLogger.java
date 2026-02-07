package stream_api;
import java.util.*;

public class StockPriceLogger {
    public static void main(String[] args) {

        List<Double> stockPrices = Arrays.asList(
                120.5, 121.8, 119.3, 122.0
        );

        stockPrices.forEach(price ->
                System.out.println("Stock Price: ₹" + price));
    }
}
