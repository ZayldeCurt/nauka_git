package opp.calendar;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class CalendarApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberSC;

        CalendarMonth[] oneYear =CalendarMonth.ofYear();
        for (int i = 0; i < oneYear.length; i++) {
            System.out.println(oneYear[i]);
        }
     /*   System.out.println("Which month? (number)");
        int monthNumber = scanner.nextInt();
        System.out.println(oneYear[monthNumber-1]);
        while(true)
        {
            System.out.println("menu:");
            System.out.println("1. add note");
            System.out.println("2. show note");
            System.out.println("3. remove note");
            System.out.println("4. change month");
            numberSC = scanner.nextInt();

            switch(numberSC){
                case 1:
                    System.out.println("in which day?");
                    int dayNumber = scanner.nextInt();
                    System.out.println("write note:");
                    scanner = new Scanner(System.in);
                    String note = scanner.nextLine();
                    oneYear[monthNumber-1].setNoteForDay(note,dayNumber);
                    break;
                case 2:
                    System.out.println("in which day?");
                    System.out.println(oneYear[monthNumber-1].getNoteForDay(scanner.nextInt()));
                    break;
                case 3:
                    System.out.println("in which day?");
                    oneYear[monthNumber-1].setNoteForDay("",scanner.nextInt());
                    break;
                case 4:
                    System.out.println("Which month? (number)");
                    monthNumber = scanner.nextInt();
//                    System.out.println(oneYear[monthNumber-1]);
                    break;
                default:
                    break;
            }
            System.out.println(oneYear[monthNumber-1]);
        }
*/

    }
}
