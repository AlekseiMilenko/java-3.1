public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int miles = service.calculate(109_005);
        if (miles > 1000)
            miles = 1000;
        System.out.println(miles);
    }
}
