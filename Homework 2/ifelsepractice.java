//always start with importing our scanner so we can use it!
import java.util.Scanner;


/* our first practice file!
* create a 3 question quiz game (lots of if/else likely)
* requirements: keep track of the user's score, has to have at least 3 questions, use if/else
* can be any topic you pick :) feel free to pick some obscure or niche topics!
* good luck!
* */
public class ifelsepractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("A. 1+1=? ");
        System.out.println("a. 3 ");
        System.out.println("b. 2 ");
        System.out.println("c. 1 ");

        String ans= sc.nextLine();

        if (ans.equals("b")){
            System.out.println("Correct ");
        }
        else{
            System.out.println("Wrong");
        }

        System.out.println("B. All below are animals except:");
        System.out.println("a. dog ");
        System.out.println("b. cat ");
        System.out.println("c. book ");

        String ans1= sc.nextLine();

        if (ans1.equals("c")){
            System.out.println("Correct ");
        }
        else{
            System.out.println("Wrong");
        }
        System.out.println("A. which one is the phone brand? ");
        System.out.println("a. iPhone ");
        System.out.println("b. tea ");
        System.out.println("c. cow ");

        String ans2= sc.nextLine();

        if (ans2.equals("a")){
            System.out.println("Correct ");
        }
        else{
            System.out.println("Wrong");
        }

    }
}


