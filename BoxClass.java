public class BoxClass {
    
    private double l;
    private double w;
    private double h;

    
    public BoxClass(double realLength, double realWidth, double realHeight) {
        l = realLength;
        w = realWidth;
        h = realHeight;
    }

    //Checks the Shape for a Cube of a Rectangular Prism
    public String CheckShape() {
        if (l == w && l == w) {
            if (w == h) {
                return ConsoleColors.GREEN_BOLD + "The shape you have created is a cube. Its dimensions for length, width and height are " + l + ".\n" + ConsoleColors.RESET;
            } else {
                return ConsoleColors.GREEN_BOLD + "The shape you have created is a rectangular prism. Its dimensions are:\nLength: " + l + "\nHeight: " + h + "\nWidth: " + w + "\n" + ConsoleColors.RESET;
            }
        } else {
            return ConsoleColors.GREEN_BOLD + "The shape you have created is a rectangular prism. Its dimensions are:\nLength: " + l + "\nHeight: " + h + "\nWidth: " + w + "\n" + ConsoleColors.RESET;
        }
    }

    /*This method prints out the Explanation of Surface Area*/
    public static void SurfaceAreaExplanation() {
        System.out.println("");
        
        //Surface Area Question
        System.out.println(ConsoleColors.CYAN_BOLD + "---------------Learn Surface Area---------------" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.RED_BOLD + "How to Calculate Surface Area of a Cube/Rectangular Prism?" + ConsoleColors.RESET);
        
        System.out.println(ConsoleColors.GREEN_BOLD + "");
        
        //Surface Area
        System.out.println("Surface area is the sum of the areas of all faces (or surfaces) on a 3D shape. A cuboid has 6 rectangular faces. To find the surface area of a cuboid, add the areas of all 6 faces. We can also label the length (l), width (w), and height (h) of the prism and use the formula, SA = 2((l * w) + (l * h) + (h * w)), to find the surface area.");
        
        System.out.println("");
        
        //Surface Area Example
        System.out.println("For example, a box of 4 width, 3 length, and 2 height has a surface area of 52 units squared.");
        
        System.out.println("" + ConsoleColors.RESET);
    }

    /*This method prints out the Explanation of Volume*/
    public static void VolumeExplanation() {
        System.out.println("");

        //Volume Question
        System.out.println(ConsoleColors.CYAN_BOLD + "---------------Learn Volume---------------" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.RED_BOLD + "How to Calculate Volume of a Cube/Rectangular Prism?" + ConsoleColors.RESET);
        
        System.out.println(ConsoleColors.GREEN_BOLD + "");

        //Volume
        System.out.println("You can calculate the volume of a box by multiplying length x width x height. So for example, with this single wall box, the size is given as 3mm (length) x 4mm (width) x 2mm (height) has a volume of 24mm cubed.");
        
        System.out.println("" + ConsoleColors.RESET);
    }

    /*This method checks if the answers for a Cube related question is correct or not.*/
    public static void CorrectAnswerCube(double correctAnswer, double userAnswer, String typeOfQuestion, int value) {
        if (userAnswer == correctAnswer) {
            System.out.println(ConsoleColors.GREEN_BOLD + "Your answer is " + userAnswer + " , which is the correct answer." + ConsoleColors.RESET);
            System.out.println("");

        } else if (userAnswer != correctAnswer) {

            //This checks if the Question type is "Surface Area of Cube"
            if (typeOfQuestion.equals("SAC")) {
                System.out.println(ConsoleColors.PURPLE_BOLD + "");
                System.out.println("The correct answer is " + correctAnswer + ". Your answer was " + userAnswer + ". Remember the formula of Surface Area is SA = 2((l * w) + (l * h) + (h * w)).");
                System.out.println("How to Find the Answer: ");
                System.out.println("SA = 2((" + value + " * " + value + ") + (" + value + " * " + value + ") + (" + value + " * " + value + "))");
                System.out.println("SA = 2((" + value * value + ") + (" + value * value + ") + (" + value * value + "))");
                System.out.println("SA = 2((" + ((value * value) + (value * value)) + ") + (" + value * value + "))");
                System.out.println("SA = 2(" + ((value * value) + (value * value) + (value * value)) + ")");
                System.out.println("SA = " + 2 * ((value * value) + (value * value) + (value * value)));
                System.out.println("" + ConsoleColors.RESET);

            //This checks if the Question type is "Volume of Cube"
            } else if (typeOfQuestion.equals("VC")) {
                System.out.println(ConsoleColors.PURPLE_BOLD + "");
                System.out.println("The correct answer is " + correctAnswer + ". Your answer was " + userAnswer + ". Remember the formula of Volume is V = l * w * h.");
                System.out.println("How to Find the Answer: ");
                System.out.println("V = " + value + " * " + value + " * " + value);
                System.out.println("V = " + (value * value * value));
                System.out.println("" + ConsoleColors.RESET);
                
            } else {
                System.out.println(ConsoleColors.GREEN_BOLD + "Couldn't Load the correct answers." + ConsoleColors.RESET);
            }
        }
    }

    public static void CorrectAnswerRect(double correctAnswer, double userAnswer, String typeOfQuestion, int valueL, int valueW, int valueH) {
        if (userAnswer == correctAnswer) {
            System.out.println(ConsoleColors.GREEN_BOLD + "Your answer is " + userAnswer + " , which is the correct answer." + ConsoleColors.RESET);
            System.out.println("");

        } else if (userAnswer != correctAnswer) {

            //This checks if the Question type is "Surface Area of Rectangular Prism"
            if (typeOfQuestion.equals("SAR")) {
                System.out.println(ConsoleColors.PURPLE_BOLD + "");
                System.out.println("The correct answer is " + correctAnswer + ". Your answer was " + userAnswer + ". Remember the formula of Surface Area is SA = 2((l * w) + (l * h) + (h * w)).");
                System.out.println("How to Find the Answer: ");
                System.out.println("SA = 2((" + valueL + " * " + valueW + ") + (" + valueL + " * " + valueH + ") + (" + valueH + " * " + valueW + "))");
                System.out.println("SA = 2((" + valueL * valueW + ") + (" + valueL * valueH + ") + (" + valueH * valueW + "))");
                System.out.println("SA = 2((" + ((valueL * valueW) + (valueL * valueH)) + ") + (" + valueH * valueW + "))");
                System.out.println("SA = 2(" + ((valueL * valueW) + (valueL * valueH) + (valueH * valueW)) + ")");
                System.out.println("SA = " + 2 * ((valueL * valueW) + (valueL * valueH) + (valueH * valueW)));
                System.out.println("" + ConsoleColors.RESET);
            
            //This checks if the Question type is "Volume of Rectangular Prism"
            } else if (typeOfQuestion.equals("VR")) {
                System.out.println(ConsoleColors.PURPLE_BOLD + "");
                System.out.println("The correct answer is " + correctAnswer + ". Your answer was " + userAnswer + ". Remember the formula of Volume is V = l * w * h.");
                System.out.println("How to Find the Answer: ");
                System.out.println("V = " + valueL + " * " + valueW + " * " + valueH);
                System.out.println("V = " + (valueL * valueW * valueH));
                System.out.println("" + ConsoleColors.RESET);
                
            } else {
                System.out.println(ConsoleColors.GREEN_BOLD + "Couldn't Load the correct answers." + ConsoleColors.RESET);
            }
        }
    }
}