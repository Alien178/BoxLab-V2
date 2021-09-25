import java.util.Scanner;

public class BoxLab
{

    public static void main(String[] args)
    {
        System.out.print("\033[H\033[2J");

        Scanner input = new Scanner(System.in);

        double correctAnswerGen; // Stores the Generated Correct Answer for Questions
        double answer; // Stores the Users Answers for Questions
        int valueOfCQ; // Stores Randomly Generated value of Cube Related Questions
        int valueOfRecW; // Stores Randomly Generated value of the width of a Rectangle Related Questions
        int valueOfRecH; // Stores Randomly Generated value of the height of a Rectangle Related Questions
        int valueOfRecL; // Stores Randomly Generated value of the Length of a Rectangle Related Questions
        
        //Inserting Values
        System.out.print(ConsoleColors.RED + "Enter Length: " + ConsoleColors.RESET);
        double length = input.nextDouble();

        System.out.print(ConsoleColors.RED + "Enter Width: " + ConsoleColors.RESET);
        double width = input.nextDouble();
        
        System.out.print(ConsoleColors.RED + "Enter Height: " + ConsoleColors.RESET);
        double height = input.nextDouble();
        
        System.out.println("");
        
        //Creating a new BoxClass
        BoxClass shape = new BoxClass(length, width, height);
        System.out.println(shape.CheckShape());

        input.nextLine();

        System.out.println(ConsoleColors.RED_BOLD + "Please type \"V\" for Volume or \"SA\" for Surface Area below: " + ConsoleColors.RESET);
        String userChoice = input.nextLine();

        firstUserChoice(userChoice);

        //Waiting for 1.5 seconds
        TimeSleep(1250);

        if (userChoice != null) {
            if (userChoice.equals("V")) {
                System.out.println(ConsoleColors.RED_BOLD + "Do you want to also learn about Surface Area?" + ConsoleColors.RED + "\nEnter \"Yes\" or \"No\":" + ConsoleColors.RESET);
                userChoice = input.nextLine();

                if (userChoice.equals("Yes") || userChoice.equals("Y")) {
                    BoxClass.SurfaceAreaExplanation();
                }

            } else if (userChoice.equals("SA")) {
                System.out.println(ConsoleColors.RED_BOLD + "Do you want to also learn about Volume?" + ConsoleColors.RED + "\nEnter \"Yes\" or \"No\":" + ConsoleColors.RESET);
                userChoice = input.nextLine();

                if (userChoice.equals("Yes") || userChoice.equals("Y")) {
                    BoxClass.VolumeExplanation();
                }

            } else {
                System.out.println(ConsoleColors.RED_BOLD + "Please type \"V\" for Volume or \"SA\" for Surface Area below: " + ConsoleColors.RESET);
                userChoice = input.nextLine();

                firstUserChoice(userChoice);
            }
        }

        //Waiting for 1.5 seconds
        TimeSleep(1500);


        //--------------Question 1------------------
        //System.out.println("");
        System.out.println(ConsoleColors.CYAN_BOLD + "{---Question 1---}\n" + ConsoleColors.RESET);
        
        //Randomly Generated Question Value
        valueOfCQ = (int) (Math.random() * 25);

        //Real Question
        System.out.println(ConsoleColors.RED_BOLD + "What is the surface area of a cube with all of it dimensions as " + valueOfCQ + "?" + ConsoleColors.RESET);
        
        //Finds the correct answer of the 
        correctAnswerGen = 2 * ((valueOfCQ * valueOfCQ) + (valueOfCQ * valueOfCQ) + (valueOfCQ * valueOfCQ));

        //Users Answer
        System.out.print(ConsoleColors.RED + "Answer: " + ConsoleColors.RESET);
        answer = input.nextDouble();

        //Checks if the answer is correct
        BoxClass.CorrectAnswerCube(correctAnswerGen, answer, "SAC", valueOfCQ);

        //Waiting for 1.5 seconds
        TimeSleep(1500);

        //--------------Question 2------------------
        System.out.println(ConsoleColors.CYAN_BOLD + "{---Question 2---}\n" + ConsoleColors.RESET);

        //Randomly Generated Question Value
        valueOfCQ = (int) (Math.random() * 25);

        //Real Question
        System.out.println(ConsoleColors.RED_BOLD + "What is the volume of a cube with all of it dimensions as " + valueOfCQ + "?" + ConsoleColors.RESET);

        //Finds the correct answer of the 
        correctAnswerGen = valueOfCQ * valueOfCQ * valueOfCQ;

        //Users Answer
        System.out.print(ConsoleColors.RED + "Answer: " + ConsoleColors.RESET);
        answer = input.nextDouble();

        //Checks if the answer is correct
        BoxClass.CorrectAnswerCube(correctAnswerGen, answer, "VC", valueOfCQ);

        //Waiting for 1.5 seconds
        TimeSleep(1500);


        //--------------Question 3------------------
        System.out.println(ConsoleColors.CYAN_BOLD + "{---Question 3---}\n" + ConsoleColors.RESET);

        //Randomly Generated Question Values
        valueOfRecW = (int) (Math.random() * 25); 
        valueOfRecH = (int) (Math.random() * 25); 
        valueOfRecL = (int) (Math.random() * 25);

        //Real Question
        System.out.println(ConsoleColors.RED_BOLD + "What is the volume of a rectangular prism with it dimensions as:" + ConsoleColors.RED);
        System.out.println("Length: " + valueOfRecL);
        System.out.println("Width: " + valueOfRecW);
        System.out.println("Height: " + valueOfRecH + ConsoleColors.RESET);

        //Finds the correct answer of the 
        correctAnswerGen = valueOfRecL * valueOfRecW * valueOfRecH;

        //Users Answer
        System.out.print(ConsoleColors.RED + "\nAnswer: " + ConsoleColors.RESET);
        answer = input.nextDouble();

        //Checks if the answer is correct
        BoxClass.CorrectAnswerRect(correctAnswerGen, answer, "VR", valueOfRecL, valueOfRecW, valueOfRecH);

        //Waiting for 1.5 seconds
        TimeSleep(1500);


        //--------------Question 4------------------
        System.out.println(ConsoleColors.CYAN_BOLD + "{---Question 4---}\n" + ConsoleColors.RESET);

        //Randomly Generated Question Values
        valueOfRecW = (int) (Math.random() * 25); 
        valueOfRecH = (int) (Math.random() * 25); 
        valueOfRecL = (int) (Math.random() * 25);

        //Real Question
        System.out.println(ConsoleColors.RED_BOLD + "What is the surface area of a rectangular prism with it dimensions as:" + ConsoleColors.RED);
        System.out.println("Length: " + valueOfRecL);
        System.out.println("Width: " + valueOfRecW);
        System.out.println("Height: " + valueOfRecH + ConsoleColors.RESET);
        
        //Finds the correct answer of the 
        correctAnswerGen = 2 * ((valueOfRecL * valueOfRecW) + (valueOfRecL * valueOfRecH) + (valueOfRecH * valueOfRecW));

        //Users Answer
        System.out.print(ConsoleColors.RED + "\nAnswer: " + ConsoleColors.RESET);
        answer = input.nextDouble();

        //Checks if the answer is correct
        BoxClass.CorrectAnswerRect(correctAnswerGen, answer, "SAR", valueOfRecL, valueOfRecW, valueOfRecH);

        

        //Closes the Scanner Method
        input.close();
        
    }

    //This method makes the currently running thread to stop for x amount of time.
    public static void TimeSleep(int x) {
        try {
            Thread.sleep(x);

        } catch(InterruptedException ex) {

            Thread.currentThread().interrupt();
        }
    }

    //This method was made to make it easier to input multiple times
    public static void firstUserChoice(String choice) {
        
        if (choice != null) {
            if (choice.equals("V")) {
                BoxClass.VolumeExplanation();

            } else if (choice.equals("SA")) {
                BoxClass.SurfaceAreaExplanation();

            } else {
                System.out.println("Sorry, but we don't have any lesson called \"" + choice + "\".");

            }
        }
    }
}