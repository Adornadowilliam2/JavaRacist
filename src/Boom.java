import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Boom {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
        int choices;
        //simple OOP
        Terorist tr = new Terorist();
        String[] bad = {"nigga", "Nigga", "Fat", "Shit", "Bullshit"};


        //turn into green color
        String greenColor = "\u001B[32m";

        // ANSI escape code to reset the color
        String resetColor = "\u001B[0m";
        do{
            System.out.println("\n==Welcome to linux command==");
            System.out.println("What would you like to do");
            System.out.println("[1] Plant a bomb");
            System.out.println("[2] Plant a Trojan attack");
            System.out.println("[3] Say Hello World 143 times");
            System.out.println("[4] Reset the font color");
            System.out.println("[5] Exit");
            System.err.print("Select an Option: ");
            choices = Integer.parseInt(br.readLine());
            switch (choices) {
                case 1:
                    System.out.println("\nWhy are you hacking??");
                    Thread.sleep(1000);
                    System.out.println("Yeahh That right");
                    Thread.sleep(1000);
                    System.out.print("You know what, ");
                    Thread.sleep(1000);
                    System.out.println("I will send you a Bomb.exe");
                    Thread.sleep(1000);
                    System.out.println("I hope you love this shit");
                    Thread.sleep(1000);
                    System.out.print("First give me your name please: ");
                    String fullname = br.readLine();
                    tr.setName(fullname);
                    tr.setName(fullname);
                    if (Arrays.asList(bad).contains(fullname)) {
                        System.out.println("Why are you using offensive language?");
                        Thread.sleep(1000);
                        System.out.println("I will end this application to discourage such behavior.");
                        return;
                    }
                    Thread.sleep(1000);
                    System.out.print("How old are you?? ");
                    int age = Integer.parseInt(br.readLine());
                    if(age <= 10){
                        System.out.print("What....!!! a brat,");
                        System.out.println("I will exit this program...");
                        break;
                    }
                    tr.setAge(age);;
                    System.out.print("Give me you address please uwu?? ");
                    String address = br.readLine();
                    tr.setAddress(address);
                    System.out.print("\nThis may take for a while, ");
                    Thread.sleep(1000);
                    System.out.println("Please wait a moment!!");
                    Thread.sleep(9000);
                    tr.getInfo();
                    //simple arithmethic
                    int age10 = age + 5;
                    System.out.println("\nAnd after 5 years you will be: " + age10);
                    System.out.println("You live in " + address + ", Philippines");
                    //make a random number
                    Random rand = new Random();
                    int randomNumber = rand.nextInt(5000) + 1000;
                    System.out.println("And your salary possible would be: $" + randomNumber);
                    break;
                case 2:

                System.out.println("\nHow to plan a Trojan??");
                Thread.sleep(1000);
                System.out.println("Create a javascript file");
                Thread.sleep(1000);
                System.out.println("That create many tab as the user try to delete something");
                Thread.sleep(1000);
                System.out.println("And if the user try to to Alt + f4, it will automatically delete the system OS");
                Thread.sleep(1000);
                System.out.println("I hope it helps :)");
              
        
                // Print text in green color
                System.out.println("This text is will turn into green color in");
                Thread.sleep(1000);
                System.out.print("5,");
                Thread.sleep(1000);
                System.out.print("4,");
                Thread.sleep(1000);
                System.out.print("3,");
                Thread.sleep(1000);
                System.out.print("2,");
                Thread.sleep(1000);
                System.out.print("1");
                System.out.println(greenColor);
                break;
                case 3:
                System.out.println("Get ready for the next battle");
                for(int i = 0; i <= 143; i++){
                    System.out.println(i + ".) " + "Hello World!");
                }
                System.out.println("=================");
                break;
                case 4:
                System.out.println("The text color will reset in ");
                Thread.sleep(1000);
                System.out.println("5");
                Thread.sleep(1000);
                System.out.println("4");
                Thread.sleep(1000);
                System.out.println("3");
                Thread.sleep(1000);
                System.out.println("2");
                Thread.sleep(1000);
                System.out.println("1");
                System.out.println(resetColor);
                break;
                case 5:
                System.out.println("End application...");
                break;
                default:
                System.err.println("Invalid number please try again!");
                    break;
            }
        }while(choices !=5);
        System.out.println(resetColor);
    }
    
}

