package flyweight;

import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BigChar {
  private String bigString = new String();

  public BigChar(char c) {
    StringBuilder fileName = new StringBuilder();
    fileName.append("./src/flyweight/big/big").append(c).append(".txt");
    try {
      bigString = Files.readString(Paths.get(fileName.toString()));
    } catch (Exception e) {
      bigString = c + "?";
    }
  }
  
  public void print() {
    System.out.print(bigString);
  }
}
