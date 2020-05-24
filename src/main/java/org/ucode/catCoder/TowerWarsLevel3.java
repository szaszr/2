package org.ucode.catCoder;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TowerWarsLevel3 {
    public static void main(String[] args) throws FileNotFoundException {

        findEndPosition("C:\\Users\\fast\\IdeaProjects\\thirdlesson\\src\\main\\resources\\level3_1.in");

    }

    private static void findEndPosition(String fileLocation) throws FileNotFoundException {
        File file = new File(fileLocation);
        Scanner sc = new Scanner(file);

        ArrayList<String> lines = new ArrayList<>();

        while(sc.hasNextLine()){
                lines.add(sc.nextLine());
        }

        System.out.println(lines);

        String startingGrid;
        ArrayList <String> startingPosition = new ArrayList<>();
        ArrayList <String> commands = new ArrayList<>();
        ArrayList <String> tickSpeed = new ArrayList<>();
        ArrayList <String> numberOfAliens = new ArrayList<>();
        //ArrayList <String>  = new ArrayList<>();

        startingGrid = lines.get(0);

        //int gridSizeX = Integer.parseInt(lines.get(0).split(" "));
        int gridSizeY = lines.get(0).charAt(2);

        //System.out.println(gridSizeX);
        System.out.println(gridSizeY);

        //int startingX = sc.nextInt();
        //int startingY = sc.nextInt();

        //System.out.println(startingX);
        //System.out.println(startingY);

        //ArrayList<String> commands = new ArrayList<>();
        ArrayList<Integer> visitedPointsX = new ArrayList<>();
        ArrayList<Integer> visitedPointsY = new ArrayList<>();

        while (sc.hasNext()){
            commands.add(sc.nextLine());
        }

        //System.out.println(commands);

        int turn = 0;

        //visitedPointsX.add(startingX);
        //visitedPointsY.add(startingY);

/*
        for (int i = 0; i < commands.size(); i++) {
            if (commands.get(i).equals("F")){
                if (turn==0){
                    for (int j = 0; j < Integer.parseInt(commands.get(i+1)) ; j++) {
                        startingX++;
                        visitedPointsX.add(startingX);
                        visitedPointsY.add(startingY);
                    }
                }
                if (turn==1){
                    for (int j = 0; j < Integer.parseInt(commands.get(i+1)) ; j++) {
                        startingY++;
                        visitedPointsX.add(startingX);
                        visitedPointsY.add(startingY);
                    }
                }
                if (turn==2){
                    for (int j = 0; j < Integer.parseInt(commands.get(i+1)) ; j++) {
                        startingX--;
                        visitedPointsX.add(startingX);
                        visitedPointsY.add(startingY);
                    }
                }
                if (turn==3){
                    for (int j = 0; j < Integer.parseInt(commands.get(i+1)) ; j++) {
                        startingY--;
                        visitedPointsX.add(startingX);
                        visitedPointsY.add(startingY);
                    }
                }
            }
            else if (commands.get(i).equals("T")){
                for (int j = 0; j < Integer.parseInt(commands.get(i+1)); j++) {
                    turn=(turn+1)%4;
                }
            }
        }

        //PrintWriter out = new PrintWriter("C:\\Users\\fast\\Desktop\\level2_5.out.txt");

        for (int i = 0; i < visitedPointsX.size(); i++) {
            //System.out.println(visitedPointsX.get(i)+" "+visitedPointsY.get(i));
            //out.println(visitedPointsX.get(i)+" "+visitedPointsY.get(i));

        }
    }

 */
}}
