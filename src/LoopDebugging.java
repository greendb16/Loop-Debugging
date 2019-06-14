import java.util.Scanner;

public class LoopDebugging {
    public static void main(String[]args){

        Scanner key =new Scanner(System.in);
        System.out.println("Type whatever and however much you want!");
        String userInput = key.nextLine();
        System.out.println(userInput);
        while(!userInput.equalsIgnoreCase("")){
            userInput = key.nextLine();
            System.out.println(userInput);
        }
    }
}
