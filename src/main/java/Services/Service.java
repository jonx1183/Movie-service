package Services;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Service {

  public String readFromFile(){
    try {
      File movie = new File("C:\\Users\\Gamer\\Documents\\demo\\IMDB-List");
      Scanner sc = new Scanner(movie);

     while (sc.hasNext()) {
       String data = sc.nextLine();
       System.out.println(data);
     }

    }catch (FileNotFoundException e){
      System.out.println("Error: File not found");
    }

    return readFromFile();

  }

  public String getFirst(){
    return "";
  }
}
