//test the default constructor
public class DefaultConstructor{
   public static void main(String[] args){
   DCtest a = new DCtest("test");
   }
}
class DCtest{
   /*public void testprint(){
     System.out.println("You're using a default constructor!");
   }*/
   DCtest(String s){
      System.out.println("You're using the overloaded constructor, and the argument is:"+s);
   }
}