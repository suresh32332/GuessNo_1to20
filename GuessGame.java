import java.util.*;

class GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int randomGuess = random.nextInt(20) + 1;
        int attempts = 0;
        int guess;
        System.out.println("-----------Wel Come to Guess Game !-----------");
        System.out.println("Guessing Number range 1 to 20 ");

        while (true) {
            System.out.println("Enter your Guessing Number: ");
            guess = sc.nextInt();
            attempts++;
          
            if (guess <= 20) {
                  System.out.println("Correct Number: " + randomGuess);

                if (guess < randomGuess) {
                    System.out.println("Try again !\n Your number is less then ");

                } else if (guess > randomGuess) {
                    System.out.println("Try again !\n Your number great than ");
                } else {
                    System.out.println("congratulation :" + guess );
                    System.out.println("your attempts : " + attempts);
                    break;
                }

            }else{
                System.out.println("Ivaild Number !");
            }
        }

        sc.close();
    }
}
