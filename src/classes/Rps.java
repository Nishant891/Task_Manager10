package classes;
import java.util.Random;
import java.util.Scanner;

//1-rock
//2-paper
//3-scissor


public class Rps {
    public static void winner(int computerinput,int userinput){
        if ((userinput == computerinput)) {
            System.out.println("Draw!");
            solve();
        }
        else if ((userinput == 1) && (computerinput == 2)) {
            System.out.println("Computer Won!");
            solve();
        }
        else if ((userinput == 1) && (computerinput == 3)) {
            System.out.println("User Won!");
            solve();
        }
        else if ((userinput == 2) && (computerinput == 1)) {
            System.out.println("User Won!");
            solve();
        }
        else if ((userinput == 2) && (computerinput == 3)) {
            System.out.println("Computer Won!");
            solve();
        }
        else if ((userinput == 3) && (computerinput == 1)) {
            System.out.println("Computer Won!");
            solve();
        }
        else if ((userinput == 3) && (computerinput == 2)) {
            System.out.println("User Won!");
            solve();
        }
    }
    public static void computer(int userinput){
        Random rand = new Random();
        int computerinput=rand.nextInt(1,4);
        if(computerinput==1) {
            System.out.println("Computer: Rock");
            winner(computerinput,userinput);
        }
        else if(computerinput==2) {
            System.out.println("Computer: Paper");
            winner(computerinput,userinput);
        }
        else if(computerinput==3) {
            System.out.println("Computer: Scissor");
            winner(computerinput,userinput);
        }
    }
    public static void main(String[] args) {
        solve();
    }
    public static void solve(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your choice: 0.Exit | 1.Rock | 2.Paper | 3.Scissor");
            int userinput = sc.nextInt();
            if (userinput == 0) {
                System.out.println("Thank You");
                break;
            }
            else if (userinput == 1) {
                System.out.println("User: Rock");
                computer(userinput);
            }
            else if (userinput == 2) {
                System.out.println("User: Paper");
                computer(userinput);
            }
            else if (userinput == 3) {
                System.out.println("User: Scissor");
                computer(userinput);
            }
            else {
                System.out.println("Please enter a valid number");
            }
        }
    }
}
