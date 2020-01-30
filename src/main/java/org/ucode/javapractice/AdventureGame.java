import java.util.*;

/*
http://www.programmingbydoing.com/a/choose-your-own-short-adventure.html
 */

public class AdventureGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO ROBERT'S TINY ADVENTURE!");
        System.out.println();
        System.out.println("You are in a creepy house!  Would you like to go \"upstairs\" or into the\n" +
                "\"kitchen\"?");
        String r1 = input.next();
        if (r1.equals("upstairs")){
            System.out.println("Upstairs you see a hallway.  At the end of the hallway is the master\n" +
                    "\"bedroom\".  There is also a \"bathroom\" off the hallway.  Where would you like\n" +
                    "to go?");
            String r2 = input.next();
            if (r2.equals("bedroom")){
                System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture.  The\n" +
                        "bed is unmade.  In the back of the room, the closet door is ajar.  Would you\n" +
                        "like to open the door? (\"yes\" or \"no\")");
                String r3 = input.next();
                if (r3.equals("no")){
                    System.out.println("Well, then I guess you'll never know what was in there.  Thanks for playing,\n" +
                            "I'm tired of making nested if statements.");
                }
                else if (r3.equals("yes")){
                    System.out.println("Amazing, you found nothing in the closet,\n" +
                            " also stop looking into closets you creep!");
                }
            }
            else if (r2.equals("bathroom")){
                System.out.println("Inside you see someone taking a shower and someone taking a dump on the toilet." +
                        "\nWould you like to leave the bathroom?(\"yes\" or \"no\")");
                String r4 = input.next();
                if (r4.equals("yes")){
                    System.out.println("Try knocking before going in somewhere");
                }
                else if (r4.equals("no")){
                    System.out.println("What would you like to achieve by staying in there? You sicko!");
                }
            }
        }
        else if (r1.equals("kitchen")){
            System.out.println("There is a long countertop with dirty dishes everywhere.  Off to one side\n" +
                    "there is, as you'd expect, a refrigerator. You may open the \"refrigerator\"\n" +
                    "or look in a \"cabinet\".");
            String r5 = input.next();
            if (r5.equals("refrigerator")){
                System.out.println("Inside the refrigerator you see food and stuff.  It looks pretty nasty.\n" +
                        "Would you like to eat some of the food? (\"yes\" or \"no\")");
                String r6 = input.next();
                if (r6.equals("no")){
                    System.out.println("You die of starvation... eventually.");
                }
                else if (r6.equals("yes")){
                    System.out.println("Why you gotta eat that nasty stuff??");
                }
            }
            else if (r5.equals("cabinet")){
                System.out.println("Inside the refrigerator you see a single knife. Do you want to take it?" +
                        "\n(\"yes\" or \"no\")");
                String r7 = input.next();
                if (r7.equals("no")){
                    System.out.println("That is a good boy, also why would you take a poor persons only knife");
                }
                else if (r7.equals("yes")){
                    System.out.println("Great job, just look at yourself walking around holding a knife");
                }
            }
        }
    }
}
