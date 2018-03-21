package blok2PodstawyAlgorytmow;

import java.math.BigDecimal;

public class CashMachine {
    public static final int[] denominationsZloty = {200,100,50,20,10,5,2,1};
    public static final int[] denominationsGroszy = {50,20,10,5,2,1};

    public static final double[] NOMINALS = {200.0,100.0,50.0,20.0,10.0,5.0,2.0,1.0,0.5,0.2,0.1,0.05,0.02,0.01};


    public static void main(String[] args) {
//        withdrawal(1765.54);
        withdrawalBetter(1765.54);
    }

    public static void withdrawalBetter(BigDecimal amount){
//        amount.setScale(2); coś tu nie dziala ale rozwiazanie powinno byc BigDecimal
//        int i=0;//problem z precyzja double, jak odejmujesz double od double to jakies tam milionowe odejmie jesszcze
//        int[] numberOfValue = new int[NOMINALS.length];
//        while(amount.doubleValue()>0){
//            BigDecimal divisior=new BigDecimal(NOMINALS[i]);
//            divisior.setScale(2);
//            int count = amount.divide(divisior).intValue();
//            BigDecimal countDec = new BigDecimal(count);
//            countDec.setScale(2,Rounding);
//            numberOfValue[i]=amount.divide(new BigDecimal(NOMINALS[i])).intValue();
//
//
//            amount = amount.subtract(new BigDecimal(numberOfValue[i]))
//            amount -= numberOfValue[i]*NOMINALS[i];
//            System.out.println(numberOfValue[i]+" : "+NOMINALS[i]);
//            i++;
//        }
    }

    public static void withdrawalBetter(double amount){
        int i=0;//problem z precyzja double, jak odejmujesz double od double to jakies tam milionowe odejmie jesszcze
        int[] numberOfValue = new int[NOMINALS.length];
        while(amount>0){
            numberOfValue[i]=(int)(amount/NOMINALS[i]);
            amount -= numberOfValue[i]*NOMINALS[i];
            System.out.println(numberOfValue[i]+" : "+NOMINALS[i]);
            i++;
        }
    }

    public static void withdrawal(double amount){
        int zloty = (int)amount;
        double tempGroszy = (amount - zloty)*100;
        int groszy = (int)tempGroszy;
        printNominals(zloty,denominationsZloty);
        printNominals(groszy,denominationsGroszy);

    }
    private static void printNominals(int value, int[] nominalsArray){
        int i=0;
        int[] numberOfValue = new int[nominalsArray.length];

        while(value>0){
            numberOfValue[i]=value/nominalsArray[i];
            value -= numberOfValue[i]*nominalsArray[i];

            System.out.println(numberOfValue[i]+" : "+nominalsArray[i]);
            i++;
        }
    }
}
