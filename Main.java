public class Main {

    public static void main(String[] args) {

        //different methods for each scenario
        scenario1();
        scenario2();
        scenario3();
        scenario4();
        scenario5();
    }

    public static void scenario1() {
        // Probability of rolling an odd number on a single 6-sided die = 3/6 or 50%
        // Would need to roll 1, 3, or 5

        int numTrue = 0;
        int numFalse = 0;
        int count = 100000;

        System.out.println("Scenario 1: Expected result 50%");

        for (int i = 0; i < count; i++) {
            //multiply times six because there are six sides
            //add one since zero is not an option
            int result = (int)Math.floor(Math.random()*6)+1;
            if (result == 1 || result == 3 || result == 5) {
                numTrue++;
            } else {
                numFalse++;
            }
        }

        System.out.println("Count of True: " + numTrue);
        System.out.println("Count of False: " + numFalse);
        System.out.println("Condition reached " + ((float)numTrue/(float)count)*100 + "%\n");
    }

    public static void scenario2() {
        // Probability of rolling an even number or a number over 5 on a single 10-sided die= 7/10 or 70%
        // Would need to roll 2, 4, 6, 7, 8, 9, or 10

        int numTrue = 0;
        int numFalse = 0;
        int count = 100000;

        System.out.println("Scenario 2: Expected result 70%");

        for (int i = 0; i < count; i++){
            //multiply by then because there are ten sides
            //add one since zero is not an option
            int result = (int)Math.floor(Math.random()*10)+1;
            if (result == 2 || result == 4 || result > 5){
                numTrue++;
            } else {
                numFalse++;
            }
        }

        System.out.println("Count of True: " + numTrue);
        System.out.println("Count of False: " + numFalse);
        System.out.println("Condition reached " + ((float)numTrue/(float)count)*100 + "%\n");
    }

    public static void scenario3() {
        // Probability of rolling an even number on the first roll and an odd number on the second roll on a single 6-sided die= 9/36 or 25%
        // Would need to roll a 2, 4, or 6 on the first roll (3/6) AND a 1, 3, 5 on the second roll (3/6)
        // 3/6 times 3/6 equals 9/36

        int numTrue = 0;
        int numFalse = 0;
        int count = 100000;

        System.out.println("Scenario 3: Expected result 25%");

        for (int i = 0; i < count; i++) {
            //multiply by six because there are six sides
            //add one since zero is not an option
            int resultA = (int)Math.floor(Math.random()*6)+1;
            int resultB = (int)Math.floor(Math.random()*6)+1;
            if ((resultA == 2 || resultA == 4 || resultA == 6) && (resultB == 1 || resultB == 3 || resultB == 5)) {
                numTrue++;
            } else {
                numFalse++;
            }
        }

        System.out.println("Count of True: " + numTrue);
        System.out.println("Count of False: " + numFalse);
        System.out.println("Condition reached " + ((float)numTrue/(float)count)*100 + "%\n");
    }

    public static void scenario4() {
        // Probability of rolling a 1 or 2 on the first roll, 3 or 4 on the second roll, and 5 or 6 on the last roll on a single 6-sided die= 8/216 or 3.704%
        // 2/6 times 2/6 times 2/6

        int numTrue = 0;
        int numFalse = 0;
        int count = 100000;

        System.out.println("Scenario 4: Expected result 3.704%");

        for (int i = 0; i < count; i++) {
            //multiply by six because there are six sides
            //add one since zero is not an option
            int resultA = (int)Math.floor(Math.random()*6)+1;
            int resultB = (int)Math.floor(Math.random()*6)+1;
            int resultC = (int)Math.floor(Math.random()*6)+1;
            if ((resultA == 1 || resultA == 2) && (resultB == 3 || resultB == 4) && (resultC == 5 || resultC == 6)){
                numTrue++;
            } else {
                numFalse++;
            }
        }

        System.out.println("Count of True: " + numTrue);
        System.out.println("Count of False: " + numFalse);
        System.out.println("Condition reached " + ((float)numTrue/(float)count)*100 + "%\n");
    }

    public static void scenario5() {
        // Probability of rolling a unique number four times without repeats on a single 6-sided die= 360/1296 or 27.778%
        // Out of four rolls, no results could equal each other. Multiply all options together

        int numTrue = 0;
        int numFalse = 0;
        int count = 100000;

        System.out.println("Scenario 5: Expected result 27.778%");

        for (int i = 0; i < count; i++) {
            int resultA = (int)Math.floor(Math.random()*6)+1;
            int resultB = (int)Math.floor(Math.random()*6)+1;
            int resultC = (int)Math.floor(Math.random()*6)+1;
            int resultD = (int)Math.floor(Math.random()*6)+1;
            if ((resultA!= resultB) && (resultA!= resultC) && (resultA!= resultD) && (resultB!= resultC) && (resultB!= resultD) && (resultC!= resultD)) {
                numTrue++;
            } else {
                numFalse++;
            }
        }

        System.out.println("Count of True: " + numTrue);
        System.out.println("Count of False: " + numFalse);
        System.out.println("Condition reached " + ((float)numTrue/(float)count)*100 + "%");
    }
}