import java.util.Scanner;

public class Calender {
  public static void main(String[] args) {

  int month, year;
  
  Scanner input = new Scanner(System.in);
  System.out.println("Enter a month (1-12): ");
  month = input.nextInt();
  System.out.println("Enter a year: ");
  year = input.nextInt();

  int days = 0;
  String monthName = "";
  switch(month) {

    case 1:
      monthName = "January";
      days = 31;
      break;
    case 2:
      monthName = "February";
      if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
      days = 29;
      break; 
    case 3:
      monthName = "March";
      days = 31;
      break;
  }
    System.out.println(monthName + " " + year + " has " + days + " days");
    input.close();
  }
}