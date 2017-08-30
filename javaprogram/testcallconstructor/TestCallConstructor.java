///test calling constructor from another constructor
public class TestCallConstructor{
   TestCallConstructor(){
     this("You're calling the second constructor through the first.");
   }
   TestCallConstructor(String s){
      System.out.println(s);
   }
   public static void main(String[] args){
   TestCallConstructor x=new TestCallConstructor();
   }
}