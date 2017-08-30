//Test this
package com.test;
public class TestThis{
   public static void main(String[] args){
     TestThisWithMethod test = new TestThisWithMethod();
     test.f1();
   }
}

class TestThisWithMethod{
  void f1(){
   this.f2();
   f2();
  }
  void f2(){
  System.out.println("test this");
  }
}