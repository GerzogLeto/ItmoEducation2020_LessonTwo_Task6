import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Random random = new Random();
        int guess =  (int)(random.nextDouble()*10);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num;
        System.out.println("Number guess : " + guess);
        while(true){
            System.out.println("Enter a number of ticket in range 1...9 : ");
            String str = br.readLine();
            num = Integer.valueOf(str);
            if(num == 0) {
                System.out.println("You are out of the game.");
                return;
            }
            if(num == guess) {
                System.out.println("You guessed!");
                return;
            }
            if(num > guess) {
                System.out.println("the hidden number is less!");
                continue;
            }
            if(num < guess) {
                System.out.println("the hidden number is greater!");
                continue;
            }
        }

    }
}
