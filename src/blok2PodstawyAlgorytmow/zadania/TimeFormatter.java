package blok2PodstawyAlgorytmow.zadania;

import org.assertj.core.api.Assertions;

public class TimeFormatter {
    public static void main(String[] args) {
        Assertions.assertThat(format(62)).isEqualTo("1 minute and 2 seconds");
        Assertions.assertThat(format(3662)).isEqualTo("1 hour, 1 minute and 2 seconds");
    }

    private static String format(int seconds) {

        double time=seconds*1.0;
        int temp1=0;
        int temp2=0;
        int temp3=0;

        if(time/60<1){
            temp1=(int)time;
            return temp1+" seconds";
        }
        else if(time/360<1){
            temp1=(int)time/60;
            temp2=(int)(time-temp1*60);
            return temp1 + " minute and "+temp2+" seconds";
        }
        else{
            temp1=(int)time/3600;
            double temp= (time-temp1*3600);
            if((temp)/60>1)
            {
                temp2=(int)((time-temp1*3600)/60);
            }
            temp3=(int)(time-temp1*3600-temp2*60);
            return temp1+" hour, "+temp2+" minute and "+temp3+" seconds";

        }



    }
}
