class Minutes extends ConsoleProgram {

  /**
  * A program that lets the user enter a number of minutes, and it will output the number of days, hours, and minutes
  * @author: Caelen Y
  */
  
  public void run() {
    
    // Declare the variables
    int ominutes;
    int hours;
    int days;

    // Retrieve the number of minutes from the user
    int iminutes = readInt("Enter the number of minutes: ");

    // Calculate the number of days, hours, and minutes
    days = iminutes / 1440;
    hours = (iminutes % 1440)/60;
    ominutes = (iminutes % 1440)%60;

    // Display the output
    System.out.println("The number of days is: " +days);
    System.out.println("The number of hours is: " +hours);
    System.out.println("The number of minutes is: " +ominutes);
  }
}