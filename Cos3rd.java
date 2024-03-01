class Cos3rd extends ConsoleProgram {

  /**
  * A program thatlets you enter two sides of a triangle and the contained angle, and that will use the cosine law to calculate the third side:
  * @author: Caelen Y
  */
  
  public void run() {

    // Retrieve the inputs
    double a = readDouble("Enter the length of side a: ");
    double b = readDouble("Enter the length of side b: ");
    double angle = readDouble("Enter the degree of the angle: ");

    // Calculate the radian 
    double radian = angle * Math.PI/ 180;

    // Calculate the third side
    double side3 = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(radian));

    // Display the result
    System.out.println("The length of the third side is: " +side3);
  }
}