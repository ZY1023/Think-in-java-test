//test using enum
enum Currency{
  USD,EUR,JPY,RMB,GBP
}
class MoneyType{
   Currency typem;
   public MoneyType(Currency typem){this.typem=typem;}
   public void describe(){
     switch(typem){
        case USD:  System.out.println("You're in America now");break;
        case EUR:  System.out.println("You're in Europe now");break;
        case JPY:  System.out.println("You're in Japan now");break;
        case RMB:  System.out.println("You're in China now");break;
        case GBP:  System.out.println("You're in Britain now");break;
     }
   }
}
public class TestEnum{
  public static void main(String[] args){
    //for(Currency c: Currency.values())
    //   System.out.println(c + ", ordinal " + c.ordinal());
    MoneyType
       usaM=new MoneyType(Currency.USD),
       euroM=new MoneyType(Currency.EUR),
       chinaM=new MoneyType(Currency.RMB);
    usaM.describe();
    euroM.describe();
    chinaM.describe();
  }
}