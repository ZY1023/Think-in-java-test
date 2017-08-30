//test of creating an array of String objects
public class StringArrayInit{
  public static void main(String[] args){
     String[] s={
      new String("I'm"),
      new String("creating"),
      new String("a"),
      new String("string"),
      new String("array"),
     };
     for(String ss:s){
       System.out.print(ss+" ");
     }
  }
}