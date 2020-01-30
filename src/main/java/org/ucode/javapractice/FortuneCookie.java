import java.util.*;

/*
http://www.programmingbydoing.com/a/fortune-cookie.html
 */

public class FortuneCookie {
    public static void main(String[] args) {
        Random r = new Random();
        int randomCookie = (1+r.nextInt(6));

        String a = "Everyone agrees you are the best";
        String b = "Trust your friends, but keep your eyes open.";
        String c = "Learn how to do something new today.";
        String d = "Pursue your dreams with vigor.";
        String e = "Go with your gut feeling.";
        String f = "Your home will be filled with peace and harmony.";

        String one = ( 1 + r.nextInt(54) + "\t" );
        String two = ( 1 + r.nextInt(54) + "\t" );
        String three = ( 1 + r.nextInt(54) + "\t" );
        String four = ( 1 + r.nextInt(54) + "\t" );
        String five = ( 1 + r.nextInt(54) + "\t" );
        String six = ( 1 + r.nextInt(54) + "\t" );

        if (randomCookie==1){
            System.out.println(a+"\n"+one+two+three+four+five+six);
        }
        else if (randomCookie==2){
            System.out.println(b+"\n"+two+three+four+five+six);
        }
        else if (randomCookie==3){
            System.out.println(c+"\n"+one+two+three+four+five+six);
        }
        else if (randomCookie==4){
            System.out.println(d+"\n"+one+two+three+four+five+six);
        }
        else if (randomCookie==5){
            System.out.println(e+"\n"+one+two+three+four+five+six);
        }
        else if (randomCookie==6){
            System.out.println(f+"\n"+one+two+three+four+five+six);
        }
    }
}
