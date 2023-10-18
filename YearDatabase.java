import java.util.*;

public class YearDatabase{
   Scanner sc = new Scanner(System.in);
   public int birthMonth;
   String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
   public int birthDate;
   public int birthYear;
   public boolean leapYear;
   
   void BirthYear(){
      try{
         System.out.print("Enter Birth Year: ");
         birthYear = sc.nextInt();
         this.birthYear = birthYear;
         LeapYearCheck();
      }catch(Exception e){
         System.out.println("Incorrect Input, Try Again!");
         sc.nextLine();
         BirthYear();
      }
   }
   
   void LeapYearCheck(){
      boolean leap = false;

     if(birthYear % 4 == 0){
        if(birthYear % 100 == 0){
            if(birthYear % 400 == 0){
                leap = true;
            }
            else{
                leap = false;
            }
        }
        else{
            leap = true;
        }
    }
    else{
        leap = false;
    }
    
      this.leapYear = leap;
      System.out.println(birthYear + " is leap? " + this.leapYear);
   }
   
   void BirthMonth(){
      try{
         System.out.println("Birth Months: (Integer Input Only!)");
         for(int i = 1 ; i <= months.length ; i++){
            System.out.print(i + ". " + months[i - 1] + "\n"); 
            Thread.sleep(200);
         }
         System.out.print("Enter Input: ");
         birthMonth = sc.nextInt();
         if(birthMonth < 1 || birthMonth > 12){
            throw new Exception();
         }
         else{
            this.birthMonth = birthMonth;
         }
      }catch(Exception e){
         System.out.println("Incorrect Input, Try Again!");
         sc.nextLine();
         BirthMonth();
      }
   }
   
   void BirthDate(){
      try{
         Thread.sleep(500);
         System.out.print("Enter Birth Date: ");
         birthDate = sc.nextInt();
         //31 - January, March, May, July, August, October, December
         //30 - April, June, September, November
         //29 - 28 - February
         
         if(birthMonth == 1 || birthMonth == 3 || birthMonth == 5 || birthMonth == 7 || birthMonth == 8 || birthMonth == 10 || birthMonth == 12){
            if(birthDate < 1 || birthDate > 31){
               throw new Exception();
            }
            else{
               this.birthDate = birthDate;
            }
         }
         else if(birthMonth == 4 || birthMonth == 6 || birthMonth == 9 || birthMonth == 11){
            if(birthDate < 1 || birthDate > 30){
               throw new Exception();
            }
            else{
               this.birthDate = birthDate;
            }
         }
         else{
            System.out.println("haha gihimo pag kalag kalag");
         }
      }catch(Exception e){
         System.out.println("Incorrect Input, Try Again!");
         sc.nextLine();
         BirthDate();
      }
   }
   
   void Birthday(String month, int day, int year){
      month = this.months[this.birthMonth - 1];
      day = this.birthDate;
      year = this.birthYear;
      System.out.println("Your birthday: " + month + " " + day + " " + year);
   }
}