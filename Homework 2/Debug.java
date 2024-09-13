
public class Debug {
    public static void main(String[] args) {

        //for this section: are these all printing the best option? If they aren't, fix it!
        //(However you interpret 'fix' is fine i promise, any way you fix it shows you get the concept to me)
        int var1 = 4;
        if (var1 > 4){
            System.out.println("Var1 is greater than 4");
        // I will put if else just in case the number is equal to 4
        }
        else if (var1 ==4 ){
            System.out.println("Number is equal to 4");

        }
        else{
            System.out.println("Var1 is less than 4");
        }

        int var2 = 6;
        if (var2 == 5){
            System.out.println("Var2 is 5");
        } else if (var2 > 5){
            System.out.println("Var2 is greater than 5");
        } else if (var2 < 5){
            System.out.println("Var2 is less than 5");
        } else{
            System.out.println("Var2 is 6");
        }

        int var3 = 5;
        if (var3 > 10){
            System.out.println("Var3 is greater than 10");
        }
        // I added else if just in case number is equal to 10
        else if (var3==10){
            System.out.println("The number is equal to 10");

        }
        else {
            System.out.println("Var3 is less than 10");
        }




        //for this section: why are we not entering the if statement?
        // Because marist with capital M is not euqal with marist with lowercase m so we directly go to "else" because "else" runs when condition if is false.
        //
        if ("Marist" == "marist"){
            System.out.println("Marist college!");
        } else{
            System.out.println("Not marist college :(!");
        }


    }
}
