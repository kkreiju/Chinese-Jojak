import java.util.*;

public class ChineseZodiac extends YearDatabase{
   public ChineseZodiac(){
      
   }
   
   public static void main(String[] args){
      YearDatabase ydb = new YearDatabase();
      Scanner sc = new Scanner(System.in);
      String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
      int choice = 0;
      
      ydb.BirthYear();
      ydb.BirthMonth();
      ydb.BirthDate();
      ydb.Birthday("flat 1?", 69, 420);
      //System.out.println("Your birthday: " + ydb.months[ydb.birthMonth - 1] + " " + ydb.birthDate + " " + ydb.birthYear);
   }
}