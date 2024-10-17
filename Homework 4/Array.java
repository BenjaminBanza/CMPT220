
/*
Take the given array and keep track of:
1. Any duplicate numbers
2. How many times the duplicate numbers appear
3. Print out those duplicate numbers with how many times they appear

 */
public class Main {
    public static void main(String[] args) {
        int[] myArray = {10, 3, 295, 38, 20, 3, 4, 267, 2445, 10, 5566, 87, 93, 17, 10, 2, 87, 267, 3176, 3, 82};

        System.out.println("Duplicate numbers and their counts:");
        for (int i = 0; i < myArray.length; i++) {
            int count = 0;
            boolean a = false;
            for (int k = 0; k < i; k++) {
                if (myArray[k] == myArray[i]) {
                    a = true;
                    break;
                }
            }

            if (!a) {
                for (int j = 0; j < myArray.length; j++) {
                    if (myArray[i] == myArray[j]) {
                        count++;
                    }
                }

                if (count > 1) {
                    System.out.println(myArray[i] + " appears " + count + " times.");
                }
            }
        }
    }
}
