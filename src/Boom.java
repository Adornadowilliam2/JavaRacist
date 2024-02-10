import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Boom {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
        int choices;
        //simple OOP
        Terorist tr = new Terorist();
        String[] bad = {"nigga", "Nigga", "Fat", "Shit", "Bullshit"};
        String[] Onepiece = {"Luffy", "Zoro", "Nami", "Sanji", "Franky","Brook", "Robin", "Chooper", "Jinbei"};
        int num; //for choices question
        Scanner scanner = new Scanner(System.in); //scanner exist
        
        //turn into green color
        String greenColor = "\u001B[32m";
        String orangeColor = "\u001B[33m"; //Sorry i am color blind, Lol HAHAHAHAHA
        // ANSI escape code to reset the color
        String resetColor = "\u001B[0m";
        String pinkColor = "\u001B[35m";
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
                    System.out.println("Yeahh That's right");
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
                    if (Arrays.asList(Onepiece).contains(fullname)) {
                        System.out.println(orangeColor + "So you're a pirate, Huh"+ resetColor);
                        Thread.sleep(1000);
                        System.out.println("Get.. ready for the jumpscare");
                        System.out.print("5");
                        Thread.sleep(1000);
                        System.out.print(",4");
                        Thread.sleep(1000);
                        System.out.print(",3");
                        Thread.sleep(1000);
                        System.out.print(",2");
                        Thread.sleep(1000);
                        System.out.print(",1");
                        System.out.println("\nComing Soon");
                    }
                    
                    Thread.sleep(1000);
                    System.out.print("How old are you?? ");
                    int age = Integer.parseInt(br.readLine());
                    if(age <= 10){
                        System.out.print("\nWhat....!!! a brat,");
                        System.out.println("I will exit this program...");
                        break;
                    }
                    if(age > 100){
                        System.out.println("Why are you still alive??");
                        Thread.sleep(1000);
                        System.out.println("I think you fake your age");
                        System.out.println("\nI will end this application, next time please put the exact age");
                    }
                    tr.setAge(age);;
                    System.out.print("Give me you address please uwu?? ");
                    String address = br.readLine();
                    tr.setAddress(address);
                    System.out.print("\nThis may take for a while, ");
                    Thread.sleep(1000);
                    System.out.println("Please wait a moment!!" + pinkColor);
                    Thread.sleep(9000);
                    tr.getInfo();
                    //simple arithmethic
                    int age10 = age + 5;
                    System.out.println("\nAnd after 5 years you will be: " + age10);
                    System.out.println("You live in " + address + ", Philippines");
                    //make a random number
                    Random rand = new Random();
                    int randomNumber = rand.nextInt(5000) + 1000;
                    System.out.println("And your salary possible would be: $" + randomNumber + resetColor);


                    System.out.println("For the next magic tricks");
                    Thread.sleep(1000);
                    //for reversing the character
                    String text;
                    String reverse = "";
                    //for red color text
                    String redColor = "\u001B[31m";

                    System.out.print(redColor + "\nInput your text: ");
                    text = br.readLine();
                    for (int i = 0; i < text.length(); i++) {
                        reverse = text.charAt(i) + reverse;
                      }System.out.println("Reversed string: "+ reverse + resetColor);

                    System.out.println("\nThen for my last tricky magic");
                    Thread.sleep(1000);
                    System.out.print("This will show if you need to live or shutdown!!!,");
                    Thread.sleep(1000);
                    System.out.print("Lol.,.....");
                    Thread.sleep(1000);
                    System.out.println("Hhahahahahha");
                    int randomBomb = rand.nextInt(10) + 1;
                    System.out.println("Your outcome show is: " + redColor + randomBomb + resetColor);
                    if(randomBomb == 4){
                         Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
                         Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
                         Runtime.getRuntime().exec("taskkill /F /IM code.exe");
                         ProcessBuilder processBuilder = new ProcessBuilder("shutdown", "-s", "-t", "0");
                         Process process = processBuilder.start();
                         process.waitFor();
                     }
                    Thread.sleep(1000);
                    System.out.println("You somewhat survive !!!! Lol HAhahaahha");
                    Thread.sleep(1000);
                    int gambling;
                    do{
                        System.out.println("\nNow as a gift to your somewhat surviving skills you have");
                        System.out.print("Please choose a number between 1 to 5: ");
                        gambling = Integer.parseInt(br.readLine());
                        switch (gambling) {
                            case 1:
                                System.out.print("What is 1 + 1?? ");
                                num = Integer.parseInt(br.readLine());
                                Thread.sleep(1000);
                                if(num != 2){
                                    System.out.println("You stupid as fuck!");
                                    Runtime.getRuntime().exec("taskkill /F /IM code.exe");
                                    break;
                                }
                                break;
                            case 2:
                                System.out.println("In the periodic table what is Gold??");
                                Thread.sleep(1000);
                                System.out.println("[1] Au");
                                Thread.sleep(1000);
                                System.out.println("[2] H");
                                Thread.sleep(1000);
                                System.out.println("[3] Kr");
                                Thread.sleep(1000);
                                System.out.println("[4] Gd");
                                Thread.sleep(1000);
                                System.out.print("What is your choices: ");
                                num = Integer.parseInt(br.readLine());
                                if(num != 1){
                                    System.out.println("You stupid as fuck!");
                                    Runtime.getRuntime().exec("taskkill /F /IM code.exe");
                                    break;
                                }
                                break;
                                case 3:
                                int option;
                                Airplane vehicle = new Airplane();
                                double fuelAmout = 0.0;
                                                    
                                do{
                                    System.err.println();
                                    System.out.println(orangeColor+ "=========================");
                                    System.out.println("[1] Engine start/stop");
                                    System.out.println("[2] Refuel");
                                    System.out.println("[3] Drive");
                                    System.out.println("[4] Exit");
                                    System.out.print("Select an option: ");
                                    option = Integer.parseInt(br.readLine());
                                    System.out.println("=========================");
                                    switch (option) {
                                        case 1:
                                            boolean getEngineStatus = vehicle.toggleEngineStatus();
                                            System.out.println("Engine: " + (getEngineStatus ? "Started" : "Stopped"));
                                            break;
                                        case 2:
                                    
                                                System.out.println();
                                                System.out.println("Current fuel: " + vehicle.getFuel());
                                                System.out.print("Refuel amount: " );
                                                fuelAmout = Double.parseDouble(br.readLine());
                                                vehicle.refuel(fuelAmout);
                                                System.out.println("New fuel amount: " + vehicle.getFuel());
                                    
                                        break;
                                        case 3:
                                            if(vehicle.getEngineStatus()){
                                            
                                                System.out.println();
                                                System.out.println("Current fuel:" + vehicle.getFuel());
                                                System.out.println("Distance traveled: " + vehicle.getDistanceTraveled());
                                                System.out.print("Enter distance: ");
                                                int distance = Integer.parseInt(br.readLine());
                                                vehicle.drive(distance);
                                                
                                               }else{
                                                System.out.println("ERROR: engine is not yet started");
                                            }
                                        break;
                                        case 4:
                                            System.out.println("Exiting...");
                                            System.out.println("=========================");
                                            break;
                                        default:
                                        System.out.println("Error, please try again!");
                                            break;
                                    }
                                }while(option !=4);
                                System.out.println(resetColor);
                                break;
                            case 4:
                            System.out.print("Enter the height of the Christmas tree: ");
                            int height = Integer.parseInt(br.readLine());
                    
                            for (int i = 0; i < height; i++) {
                                // Print spaces before each line
                                for (int j = 0; j < height - i - 1; j++) {
                                    System.out.print(" ");
                                }
                    
                                // Print asterisks for each line
                                for (int k = 0; k < 2 * i + 1; k++) {
                                    System.out.print("*");
                                }
                    
                                // Move to the next line
                                System.out.println();
                            }
                    
                            // Print the tree trunk
                            for (int i = 0; i < height - 1; i++) {
                                System.out.print(" ");
                            }
                            System.out.println("*");
                            break;
                            case 5:
                            System.out.println(orangeColor+ "\nDon't be ever to go back to this again my friend!!" + resetColor);
                            break;   
                            default:
                            System.out.println("\nOnly 1 to 5 idiot");
                                break;
                        }
                    }while(gambling !=5);
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
                System.out.println("\n===New tasked added===");
                System.out.println("[1] Simple Calculator");
                System.out.println("[2] Multiply, Divide, Add");
                System.out.println("[3] Adding every character number");
                System.out.println("[4] Gambling divisible 10");
                System.out.println("[5] All around Calculator");
                System.out.print("\nSelect an option: ");
                num = Integer.parseInt(br.readLine());
                switch (num) {
                    case 1:
                    // System.out.println("[1] Simple Calculator");

                    System.out.print("Input 1: ");
                    int num1 = scanner.nextInt();
                             
                    System.out.print("Input 2: ");
                    int num2 = scanner.nextInt();
                             
                    int output;
                    if (num1 > num2) {
                        output = num1 - num2;
                    } else if (num1 < num2) {
                        output = num1 + num2;
                    } else {
                        output = num1 * num2;
                    }
                 
                    System.out.println("Output: " + output);
                        break;
                    case 2:
                    // System.out.println("[2] Multiply, Divide, Add");
                    System.out.print("Enter an integer: ");
                    int input = scanner.nextInt();
                 
            
                    int numDigits = String.valueOf(input).length();
            
                    if (numDigits == 3) {
                        int result = (input / 100) * ((input / 10) % 10) * (input % 10);
                        System.out.println("Output: " + result);
                    } else if (numDigits == 2) {
                        int result = (input / 10) / (input % 10);
                        System.out.println("Output: " + result);
                    } else if (numDigits == 1) {
                        int result = input + 42;
                        System.out.println("Output: " + result);
                    } else {
                        System.out.println("Output: " + input);
                    }
                    break;
                    case 3:
                    //  System.out.println("[3] Adding every character number");
                    System.out.print("Input: ");
                    int number = scanner.nextInt();
        
                    int sum = 0;
                    while (number != 0) {
                        int digit = number % 10;
                        sum += digit;
                        number /= 10;
                    }

                    System.out.println("Output: " + sum);
                    break;
                    case 4:
                    // System.out.println("[4] Gambling divisible 10");
                    int[] array = new int[10];
                    Random random = new Random();
            
                    // Fill the array with random numbers ranging from 1-100
                    for (int i = 0; i < array.length; i++) {
                        array[i] = random.nextInt(100) + 1;
                    }
            
                    // Display each element of the array
                    for (int i = 0; i < array.length; i++) {
                        if (array[i] % 10 == 0) {
                            System.out.print("Hit ");
                        } else {
                            System.out.print(array[i] + " ");
                        }
                    }
                    break;
                    case 5:
                    //    System.out.println("[5] All aroud Calculator");
                    int difference, quotient, product;
            
                    System.out.print("Enter 1st Integer: ");
                    num1 = scanner.nextInt();
            
                    System.out.print("Enter 2nd Integer: ");
                    num2 = scanner.nextInt();
            
                    sum = num1 + num2;
                    difference = num1 - num2;
                    quotient = num1 / num2;
                    product = num1 * num2;
            
                    System.out.println("Sum: " + sum);
                    System.out.println("Difference: " + difference);
                    System.out.println("Quotient: " + quotient);
                    System.out.println("Product: " + product);
            
                    System.out.println("\n----------------------------");
                    scanner.nextLine(); // Clear the input buffer
                    System.out.println("Press Enter to exit...");
                    scanner.nextLine();
                    break;
                    default:
                    System.out.println("Please Choose only between this three!!...");
                        break;
                }
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
        scanner.close();
    }
    
}

