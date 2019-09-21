import java.util.Scanner;

public class Rocha_p03 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String[] topics = new String [5];
        int[][] responses = new int[5][10];
        int[] totalTopic = new int[5];
        double[] averageTopic = new double[5];
        int numUsers;
        int i;
        int j;
        int userResponse;
        int highest = 0;
        int lowest = 0;
        double temp1;
        double temp2;
        
        
        for (i=0; i<5; i++) {
            totalTopic[i]   = 0;
            averageTopic[i] = 0;
            for (j=0; j<10; j++) {
                responses[i][j] = 0;
            }
        }
        
        topics[0] = "Income Inequality";
        topics[1] = "Climate Change";
        topics[2] = "International Affairs";
        topics[3] = "Healthcare";
        topics[4] = "Education";
        
        System.out.println("In this survey you will rate the importance of five topics to be discussed in the 2020 presidential debate.");
        System.out.println("Rates go from 1 (least important) to 10 (most important).");
        System.out.println("How many people will be taking the survey?");
        numUsers = in.nextInt();
        
        
        for (i=0; i<5; i++) {
            System.out.println("Topic: " + topics[i]);
            for (j=0; j<numUsers; j++) {
                System.out.println("Rating from user " + (j + 1) + ":");
                userResponse =  in.nextInt();
                responses[i][userResponse-1] += 1;
                totalTopic[i] += userResponse;
            }
            averageTopic[i] = (double) totalTopic[i] / numUsers;
            
        }
        
        System.out.println("Votes for each topic:");
        System.out.println(        "\t\t\t1   2   3   4   5   6   7   8   9   10    Average Rating");
        System.out.println(        "\t\t\t--  --  --  --  --  --  --   --  --  --   --------------");
        
        for (i=0; i<5; i++) {
            System.out.print(topics[i] + ":\t");
            if (i == 1 || i == 3 || i == 4)
                System.out.print("\t");
            for (j=0; j<10; j++) {
                System.out.print("" + responses[i][j] + "   ");
            }
                System.out.printf("\t%.2f", averageTopic[i]);
                System.out.print("\n");
            }
        
        temp1 = averageTopic[0];
        temp2 = averageTopic[0];
        
        for (i=0; i<5; i++) {
            if (averageTopic[i] > temp1) {
                temp1 = averageTopic[i];
                highest = i;
            }
            if (averageTopic[i] < temp2) {
                temp2 = averageTopic[i];
                lowest = i;
            }
        }
        
        System.out.print("\nTopic with the highest score: " + topics[highest] + ". Points: ");
        System.out.printf("%.2f", averageTopic[highest]);
        System.out.print("\nTopic with the lowest score: " + topics[lowest] + ". Points: ");
        System.out.printf("%.2f", averageTopic[lowest]);
    }        

}
