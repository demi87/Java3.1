public class BonusMilesService {
    public int calculate(int price) {
        int milePrice = 20;
        int miles = price / milePrice;

        return miles;
    }
}
