package org.ucode.catCoder;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TowerWars {
    public static void main(String[] args) throws FileNotFoundException {

        findEndPosition("C:\\Users\\fast\\IdeaProjects\\thirdlesson\\src\\main\\resources\\level1_1.in");
        findEndPosition("C:\\Users\\fast\\IdeaProjects\\thirdlesson\\src\\main\\resources\\level1_2.in");
        findEndPosition("C:\\Users\\fast\\IdeaProjects\\thirdlesson\\src\\main\\resources\\level1_3.in");
        findEndPosition("C:\\Users\\fast\\IdeaProjects\\thirdlesson\\src\\main\\resources\\level1_4.in");
        findEndPosition("C:\\Users\\fast\\IdeaProjects\\thirdlesson\\src\\main\\resources\\level1_5.in");

    }

    private static void findEndPosition(String fileLocation) throws FileNotFoundException {
        File file = new File(fileLocation);
        Scanner sc = new Scanner(file);

        int startingX = sc.nextInt();
        int startingY = sc.nextInt();

        //System.out.println(startingX);
        //System.out.println(startingY);

        ArrayList<String> commands = new ArrayList<>();

        while (sc.hasNext()){
            commands.add(sc.next());
        }

        //System.out.println(commands);

        int turn = 0;


        for (int i = 0; i < commands.size(); i++) {
            if (commands.get(i).equals("F")){
                if (turn==0){
                    startingX+=Integer.parseInt(commands.get(i+1));
                }
                if (turn==1){
                    startingY+=Integer.parseInt(commands.get(i+1));
                }
                if (turn==2){
                    startingX-=Integer.parseInt(commands.get(i+1));
                }
                if (turn==3){
                    startingY-=Integer.parseInt(commands.get(i+1));
                }
            }
            else if (commands.get(i).equals("T")){
                for (int j = 0; j < Integer.parseInt(commands.get(i+1)); j++) {
                    turn=(turn+1)%4;
                }
            }
        }
        System.out.println(startingX+" "+startingY);
    }
}
