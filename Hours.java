class Hours extends ConsoleProgram {

  /**
  * A program that lets you enter a number of minutes, and that will calculate the number 
  of days, hours and minutes that represents.
  * @author: Caelen Y
  */
  
  public void run() {
    
    // Retrieve the number of hours from the user
    int ihours = readInt("Enter the number of hours: ");

    // Calculate the number of days and hours
    int days = ihours / 24;
    int ohours = ihours % 24;

    // Display the results
    System.out.println("The amount of days is: " +days);
    System.out.println("The amount of hours is: " +ohours);
  }
}