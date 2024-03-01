class Km_to_Miles extends ConsoleProgram {

  /**
  * A program that lets you enter a distance in kilometers and converts it into miles
  * @author: Caelen Y
  */
  
  public void run() {
    
    // Retrieve the input
    double km = readInt("Enter the distance in kilometers: ");

    // Caclulate the miles
    double miles = km * 0.621371;

    // Display the output
    System.out.println("The number of miles is: " +miles); 
    
  }
}