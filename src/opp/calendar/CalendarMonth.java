package opp.calendar;

public class CalendarMonth {

    private static final char[] weekDaysShortcuts = {'M', 'T', 'W', 'T', 'F', 'S', 'S'};
    private static final String Months[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};

    private final String name;
    private CalendarDay[] days;
    private int startingWeekDay;
    private int startingMonthDay;


    public static CalendarMonth of(String name,int year, int month, int numberOfDays, int startingWeekDay) {
        CalendarMonth calendarMonth = new CalendarMonth(name);
        calendarMonth.startingWeekDay = startingWeekDay;
        calendarMonth.days = createCalendarDays(year, month, numberOfDays);

        return calendarMonth;
    }//wzorzec projektowy, fabryka

    public static CalendarMonth[] ofYear() {
        CalendarMonth[] oneYear = new CalendarMonth[12];
        oneYear[0]=CalendarMonth.of(Months[0],2018,0+1,31, 1 );
        int startDay=1;
        int startDaytemp=CalendarMonth.findLastMonthDay(startDay,31);
        oneYear[1]=CalendarMonth.of(Months[1],2018,2,28, startDaytemp);
        startDay=startDaytemp;
        startDaytemp=CalendarMonth.findLastMonthDay(startDay,28);
        oneYear[2]=CalendarMonth.of(Months[2],2018,2+1,2%2 == 0 ? 31 : 30, startDaytemp );
        startDay=startDaytemp;

        for (int i = 3; i < 12-1; i++) {
            startDaytemp=CalendarMonth.findLastMonthDay(startDay,i%2 == 0 ? 30 : 31);
            oneYear[i]=CalendarMonth.of(Months[i],2018,i+1,i%2 == 0 ? 31 : 30, startDaytemp );
            startDay=startDaytemp;
        }
        return oneYear;

    }


    private static CalendarDay[] createCalendarDays(int year, int month, int numberOfDays) {
        CalendarDay[] days = new CalendarDay[numberOfDays];
        for (int i = 0; i < numberOfDays; i++) {
            days[i]= new CalendarDay(year,month,i+1);
        }
        return days;
    }

    public CalendarMonth(String name) {
        this.name = name;
    }

    public CalendarMonth(String name, CalendarDay[] days, int startingWeekDay) {
        this.name = name;
        this.days = days;
        this.startingWeekDay = startingWeekDay;
    }

    public static int findLastMonthDay(int startingMonthDay,int numberOfDay)
    {
       int lastDay = (startingMonthDay + numberOfDay) % 7;
       return lastDay;
    }


    public String getName() {
        return name;
    }

    public CalendarDay[] getDays() {
        return days;
    }

    public void setDays(CalendarDay[] days) {
        this.days = days;
    }

    public int getStartingWeekDay() {
        return startingWeekDay;
    }

    public void setStartingWeekDay(int startingWeekDay) {
        this.startingWeekDay = startingWeekDay;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(name.toUpperCase()).append("\n");
        appendHorizontalLine(builder);
        for (int i = 0; i < weekDaysShortcuts.length; i++) {
            builder.append(weekDaysShortcuts[i]).append("   ");
        }
        builder.append("\n");
        appendHorizontalLine(builder);

        for (int i = 0; i < startingWeekDay - 1; i++) {
            builder.append("    ");
        }
        for (int i = 0 ; i < days.length; i++) {
            if ((i + startingWeekDay - 1) % 7 == 0) {
                builder.append("\n");
            }
            builder.append(createCalendarDayElement(days[i]));
        }
        builder.append("\n");
        appendHorizontalLine(builder);
        return builder.toString();
    }

    private void appendHorizontalLine(StringBuilder builder) {
        for (int i = 0; i < 7 * 4; i++) {
            builder.append("-");
        }
        builder.append("\n");
    }

    private String createCalendarDayElement(CalendarDay calendarDay) {
        String calendarDayRepresentation = "" + calendarDay.getDay();
        calendarDayRepresentation += calendarDay.hasNote() ? "*" : " ";
        calendarDayRepresentation += calendarDay.getDay() >= 10 ? " " : "  ";
        return calendarDayRepresentation;
    }


    public void setNoteForDay(String note, int dayNumber) {
        days[dayNumber-1].setNotes(note);
    }

    public String getNoteForDay(int dayNymber){
        return days[dayNymber-1].getNotes();
    }
}