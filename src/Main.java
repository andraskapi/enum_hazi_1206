

public class Main {
    public static void main(String[] args) {
        System.out.println("The current month is: " + Month.JUNE.getInHun());

        for (Month month : Month.values()
        ) {
            System.out.println(month);

        }
        System.out.println(Month.JUNE.isSummerMonth());
        System.out.println(Month.FEBRUARY.isAutumnMonth());
        System.out.println(Month.MARCH.isSpringMonth());
        System.out.println(Month.SEPTEMBER.isWinterMonth());
        System.out.println(Month.DECEMBER.getMonthNumber());
        System.out.println(Month.SEPTEMBER.getMonthNumber());
        for (Month numerOfMonth : Month.values()
             ) {
            System.out.println(numerOfMonth.getMonthNumber()  + ". hónap: " + numerOfMonth.getInHun());

        }


        System.out.println();

        System.out.println("The current season is: " + Season.SUMMER);

        for (Season season : Season.values()
        ) {
            System.out.println(season);

        }
        System.out.println(Season.getSeasonByMonth(Month.FEBRUARY));
        System.out.println(Season.getSeasonByMonth(Month.FEBRUARY).getHungarianName());
        System.out.println(Month.getRandomMonth().getInHun().toLowerCase());

    }
}