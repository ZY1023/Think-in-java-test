//Listing a file system's root directories
import java.nio.file.*;

public class ListRootDir{
   public static void main(String[] args){
      FileSystem sys = FileSystems.getDefault();
      Iterable<Path> d = sys.getRootDirectories();
      for(Path name: d){
         System.out.println(name);
      }
   }
}