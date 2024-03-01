class Rads extends ConsoleProgram {

  /**
  * A program that converts degree measures to radian measures
  * @author:Caelen Yeung
  */
  
  public void run() {

    // Declare the variable
    double radian;

    // Retrieve the degree from the user
    int degree = readInt("Enter the degree: ");
    
    // Convert the degree into radian measures
    radian = degree * Math.PI/ 180;

    // Display the output
    System.out.println("The radian measure of this degree is: " + radian);
  }
}