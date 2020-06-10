public class BonusMilesService {
    public int calculate (int price) {
        short behindEveryRub = 20;
        int miles = (price / behindEveryRub);
        short limit = 32_000;
        if (miles > limit) {
            miles = limit;
        }
        return miles;
    }
}
