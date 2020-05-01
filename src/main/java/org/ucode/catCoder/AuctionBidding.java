package org.ucode.catCoder;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AuctionBidding {
    public static void main(String[] args) {


    File file = new File("C:\\Users\\fast\\IdeaProjects\\thirdlesson\\src\\main\\resources\\inputproblem.txt");
    Scanner sc;

    {
        try {
            sc = new Scanner(file);

            ArrayList<String[]> list = new ArrayList<>();

            String input = sc.next();

 //           System.out.println(input);

            String[] split = input.split(",");

            boolean oneBid = false;
//if the auction is too short, meaning it only has one bidder, the program stops and first bidder with the bid wins
            if(split.length<4){
                System.out.println(split[1]+","+split[2]);
                oneBid=true;
            }
while(!oneBid) {
 //   System.out.println(Arrays.toString(split));
 //   System.out.println(split[7]);

    int[] bids = new int[split.length];
//getting only the bids from the input
    for (int i = 0; i < split.length; i++) {
        if (i % 2 == 0) {
            bids[i] = Integer.parseInt(split[i]);
        }
    }
//    System.out.println(Arrays.toString(bids));
//finding the maximum bid
    int largest = 0;
    for (int i = 0; i < bids.length; i++) {
        if (largest < bids[i]) {
            largest = bids[i];
        }
    }

    int temp=0;
    for (int i = 0; i < bids.length; i++)
    {
        for (int j = i + 1; j < bids.length; j++)
        {
            if (bids[i] > bids[j])
            {
                temp = bids[i];
                bids[i] = bids[j];
                bids[j] = temp;
            }
        }
    }
    temp +=1;

    int pointer = 0;
//finding the slot where the maximum bid is located
//    System.out.println("The largest value is " + largest);
    for (int i = 0; i < bids.length; i++) {
        pointer++;
        if (temp == bids[i]) {
            //System.out.println("It is in slot number " + pointer);
            break;
        }
    }

    System.out.println(split[pointer - 2] + "," + temp);
    break;
}
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

}
