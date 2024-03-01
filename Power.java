class Power extends ConsoleProgram {

  /**
  * A program that lets the user enter two numbers, and prints it out as an exponent
  * @author: Caelen Y
  */
  
  public void run() {
    
    // Declare the variables
    double a;
    double b;

    // Ask for the number and exponent
    a = readDouble("Enter the number: ");
    b = readDouble("Enter the exponent: ");

    // Calculate the solution
    double c = Math.pow(a, b);

    // Print out the solution
    System.out.println( c );

  }
}