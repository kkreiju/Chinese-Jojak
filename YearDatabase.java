import java.util.*;

public class YearDatabase {
   Scanner sc = new Scanner(System.in);
   public int birthMonth;
   String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
         "November", "December" };
   public int birthDate;
   public int birthYear;
   public boolean leapYear;
   public String chineseZodiac;

   void BirthYear() {
      try {
         System.out.print("Enter Birth Year: ");
         birthYear = sc.nextInt();
         if (birthYear < 1900) {
            System.out.println("Years 1900 up to this year are only allowed.");
            throw new Exception();
         } else if (birthYear > 2023) {
            System.out.println("Lol, how do you exist today?");
            throw new Exception();
         }
         LeapYearCheck();
      } catch (Exception e) {
         System.out.println("Incorrect Input, Try Again!");
         sc.nextLine();
         BirthYear();
      }
   }

   void LeapYearCheck() {
      boolean leap = false;
      if (birthYear % 4 == 0) {
         if (birthYear % 100 == 0) {
            if (birthYear % 400 == 0) {
               leap = true;
            } else {
               leap = false;
            }
         } else {
            leap = true;
         }
      } else {
         leap = false;
      }
      this.leapYear = leap;
   }

   void BirthMonth() {
      try {
         System.out.println("Birth Months: (Integer Input Only!)");
         for (int i = 1; i <= months.length; i++) {
            System.out.print(i + ". " + months[i - 1] + "\n");
            Thread.sleep(200);
         }
         System.out.print("Enter Input: ");
         birthMonth = sc.nextInt();
         if (birthMonth < 1 || birthMonth > 12) {
            throw new Exception();
         }
      } catch (Exception e) {
         System.out.println("Incorrect Input, Try Again!");
         sc.nextLine();
         BirthMonth();
      }
   }

   void BirthDate() {
      try {
         Thread.sleep(500);
         System.out.print("Enter Birth Date: ");
         birthDate = sc.nextInt();
         if (birthMonth == 1 || birthMonth == 3 || birthMonth == 5 || birthMonth == 7 || birthMonth == 8
               || birthMonth == 10 || birthMonth == 12) {
            // 31 - January, March, May, July, August, October, December
            if (birthDate < 1 || birthDate > 31) {
               System.out.println("Inputs only 1-31!");
               throw new Exception();
            }
         } else if (birthMonth == 4 || birthMonth == 6 || birthMonth == 9 || birthMonth == 11) {
            // 30 - April, June, September, November
            if (birthDate < 1 || birthDate > 30) {
               System.out.println("Inputs only 1-30!");
               throw new Exception();
            }
         } else {
            // 29 - 28 - February
            if (leapYear) {
               if (birthDate < 1 || birthDate > 29) {
                  System.out.println("Inputs only 1-29!");
                  throw new Exception();
               }
            } else {
               if (birthDate < 1 || birthDate > 28) {
                  System.out.println("Inputs only 1-28!");
                  throw new Exception();
               }
            }
         }
      } catch (Exception e) {
         System.out.println("Incorrect Input, Try Again!");
         sc.nextLine();
         BirthDate();
      }
   }

   void Birthday(String month, int day, int year) {
      month = this.months[this.birthMonth - 1];
      day = this.birthDate;
      year = this.birthYear;
      System.out.println("Your birthday: " + month + " " + day + " " + year);
   }

   void ChineseYears() {
      String yearOfTheWhat;
      String[] animals = { "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", "Monkey", "Rooster",
            "Dog", "Pig" };
      for (int i = 1899; i <= 2023;) {
         for (int j = 0; j < 12; j++) {
            i++;
            if (birthYear == i) {
               yearOfTheWhat = animals[j];
               this.chineseZodiac = yearOfTheWhat;
               break;
            }
         }
      }
      System.out.println("You belong on Year of the " + chineseZodiac);
   }

   void LuckyNumber() {
      int maxNum = 10;
      int minNum = 1;
      int randomNum = (int)(Math.random() * (maxNum - minNum + 1)) + minNum;
      System.out.println("Your lucky number is: " + randomNum);
   }

   void LuckyColor(){
      int maxNum = 6;
      int minNum = 0;
      int randomNum = (int)(Math.random() * (maxNum - minNum + 1)) + minNum;
      String[] color = {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};
      System.out.println("Your lucky color is: " + color[randomNum]);
   }

   void Readings(){
      int maxNum = 6;
      int minNum = 0;
      int randomNum = (int)(Math.random() * (maxNum - minNum + 1)) + minNum;
      String[] randomReadings = {"your wallet will become abundant in cash.", "you will meet the reaper.", "someone hates you.", "you will recieve a gift from someone.", "your destiny will be good.", "there are more opportunities to come onto your life.", "you will pass your exams."};
      System.out.println("My readings is " + randomReadings[randomNum]);
   }
}