public class ChineseZodiac extends YearDatabase{
   public ChineseZodiac(){
      
   }
   
   public static void main(String[] args){
      YearDatabase ydb = new YearDatabase();
      
      ydb.BirthYear();
      ydb.BirthMonth();
      ydb.BirthDate();
      System.out.println("---------------");
      ydb.Birthday("flat 1?", 69, 420);
      ydb.ChineseYears();
      ydb.LuckyNumber();
      ydb.LuckyColor();
      ydb.Readings();
      //System.out.println("Your birthday: " + ydb.months[ydb.birthMonth - 1] + " " + ydb.birthDate + " " + ydb.birthYear);
   }
}