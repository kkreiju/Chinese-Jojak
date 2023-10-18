public class ChineseZodiac extends YearDatabase{
   String month;
   int day, year;

   ChineseZodiac(){
      day = birthDate;
      year = birthYear;
   }
   
   public static void main(String[] args){
      YearDatabase ydb = new YearDatabase();
      ydb.BirthYear();
      ydb.BirthMonth();
      ydb.BirthDate();
      System.out.println("---------------");
      ChineseZodiac cz = new ChineseZodiac();
      ydb.Birthday("i love you sir", cz.day, cz.year);
      ydb.ChineseYears();
      ydb.LuckyNumber();
      ydb.LuckyColor();
      ydb.Readings();
   }
}