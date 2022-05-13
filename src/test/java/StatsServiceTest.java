import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    private final int[] testData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void sumPositive() {
        StatsService service = new StatsService();
        int actual = service.sum(testData);
        int expected = 180;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averagePositive() {
        StatsService service = new StatsService();
        double actual = service.average(testData);
        double expected = 15.0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSalesPositive() {
        StatsService service = new StatsService();
        int actual = service.maxSalesMonthIndex(testData);
        int expected = 7;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSalesPositive() {
        StatsService service = new StatsService();
        int actual = service.minSalesMonthIndex(testData);
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void belowAveragePositive() {
        StatsService service = new StatsService();
        int actual = service.belowAverageSalesMonthCount(testData);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveAveragePositive() {
        StatsService service = new StatsService();
        int actual = service.aboveAverageSalesMonthCount(testData);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }
}