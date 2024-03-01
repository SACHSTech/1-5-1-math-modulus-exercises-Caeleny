class FtoC extends ConsoleProgram {

  /**
  * A program that converts a Farenheit degree into Celsius
  * @author: Caelen Y
  */
  
  public void run() {
    
     // Declare the variables
     double Fahrenheit;

     // Retrieve the Fahrenheit degree
     Fahrenheit = readDouble("Enter a Fahrenheit degree: ");
 
     // Calculate the celsius
     double Celsius = (Fahrenheit - 32) * 0.56;
 
     // Display the output
     System.out.println("The celsius is: " + Celsius);
    
  }
}