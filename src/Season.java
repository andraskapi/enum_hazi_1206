public enum Season {
    WINTER,
    SPRING,
    SUMMER,
    AUTUMN;

    public static Season getSeasonByMonth(Month month){
        return switch (month){
            case DECEMBER, JANUARY, FEBRUARY -> WINTER;
            case MARCH, APRIL, MAY -> SPRING;
            case JUNE, JULY, AUGUST -> SUMMER;
            case SEPTEMBER, OCTOBER, NOVEMBER -> AUTUMN;
        };
    }
    public String getHungarianName() {
        return switch (this) {
            case SPRING -> "Tavasz";
            case SUMMER -> "Nyár";
            case AUTUMN -> "Ősz";
            case WINTER -> "Tél";
        };
    }


}
