class AreaSin extends ConsoleProgram {

  /**
  * A program that uses the Math.sin() function to calculate the area of a triangle, given two sides and the contained angle
  * @author: Caelen Y
  */
  
  public void run() {
    
    // Declare the variables
    double area;
    double radianangle;

    // Retrieve the inputs
    double a = readDouble("Enter the length of side a: ");
    double b = readDouble("Enter the length of side b: ");
    double angle = readDouble("Enter the degree of the angle: ");

    // Convert the degree to radian
    radianangle = angle * Math.PI/ 180;

    // Calculate the area with the formula
    area = (a * b * Math.sin(radianangle)) / 2;

    // Display the output
    System.out.println("The area of the triangle is: " +area);
  }
}