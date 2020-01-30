import java.util.*;

/*
http://www.programmingbydoing.com/a/adventure2.html
 */

public class AdventureGameWithWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nextroom = 1;
        String choice = "";
        while (nextroom!=0){
            if (nextroom == 1) {
                System.out.println("You wake up and find yourself in an elevator. The \"door\" is half open but " +
                        "you could also try to push a \"button\" to go to a different floor");
                System.out.print(">");
                choice = input.next();
                if (choice.equals("door")) {
                    nextroom = 2;
                } else if (choice.equals("button")) {
                    nextroom = 3;
                } else {
                    System.out.println(choice + " was not an option. Please try again.");
                }
            }
            if (nextroom==2){
                System.out.println("As soon as you leave the elevator the door closes and you hear the elevator " +
                        "crashing down. You look around and see an open \"door\" at the end of the hallway. " +
                        "But as you start walking towards it you spot another way to the \"left\".");
                System.out.print(">");
                choice=input.next();
                if (choice.equals("door")){
                    nextroom=4;
                }
                else if (choice.equals("left")){
                    nextroom=5;
                }
                else {
                    System.out.println(choice + " was not an option. Please try again.");
                }
            }
            if (nextroom==3){
                System.out.println("Great news. The door closes, you hear the elevator starting up. Not so great news," +
                        "you start feeling the elevator going down, not in a controlled manner.");
                nextroom=1;
            }
            if (nextroom==4){
                System.out.println("You open the door only to find that you have stepped out into the Arctic tundra. " +
                        "You can either \"fight\" or try to \"run\" away from the huge polar bear in front of you.");
                System.out.print(">");
                choice=input.next();
                if (choice.equals("fight")){
                    System.out.println("That was pretty stupid of you if you care for someones opinion.");
                    nextroom=0;
                }
                else if (choice.equals("run")){
                    System.out.println("That was pretty stupid of you if you care for someones opinion.");
                    nextroom=0;
                }
                else {
                    System.out.println(choice + " was not an option. Please try again.");
                }
            }
            if (nextroom==5){
                System.out.println("You feel like you have been walking for a mile already and you have not " +
                        "sighted a door or anything else. But just as you finish that thought you see" +
                        " a \"fire\" escape and a \"window\".");
                System.out.print(">");
                choice=input.next();
                if (choice.equals("fire")){
                    System.out.println("You start walking down the fire escape and just as you are about to get to step" +
                            " down onto the street you wake up in your bed.");
                    nextroom=0;
                }
                else if (choice.equals("window")){
                    System.out.println("On a closer inspection you see that it is not actually a window but a portal " +
                            "which pulls you in as soon as you step closer. You find yourself continually" +
                            " falling but never hitting the ground. Suddenly you hear someone " +
                            "calling your name and you wake up in your bed.");
                    nextroom=0;
                }
                else {
                    System.out.println(choice + " was not an option. Please try again.");
                }
            }
        }
        System.out.println("Thank you for playing!");
        System.out.println("This was just a Demo, for the full experience please buy the goddamn freaking game!!!");
    }
}
