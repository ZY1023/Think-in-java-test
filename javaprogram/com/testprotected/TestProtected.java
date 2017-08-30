// test Protected has package access but not public
package com.testprotected;

public class TestProtected{
   protected void test(){
     System.out.println("You must use the protected");
   }
}