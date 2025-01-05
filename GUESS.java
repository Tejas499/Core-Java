import java.util.*;
public class GUESS {
    public static void main(String[] args) {

        int rand=(int)(Math.random()*100);
        System.out.println(rand);
        Scanner s=new Scanner(System.in);
        System.out.println("gues the number");
        int userInput=s.nextInt();

        if(userInput>rand){
            System.out.println("TOO LARGE");

        }

        else if(userInput<rand){
            System.out.println("TOO small");

        }
        else{
            System.out.println("perfetO");

        }
        System.out.println("NUMBER IS "+rand);
    }
}
