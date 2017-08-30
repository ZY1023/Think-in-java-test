//test protectecd keyword
import com.testprotected.*;

public class ProtectedTest extends TestProtected{
    public static void main(String[] args){
        ProtectedTest tt = new ProtectedTest();
        tt.pump();
        Test t=new Test();
    }
    public void pump(){
        test();
    }
}
class Test{
   Test(){
     TestProtected t;
     t.test();
   }
}