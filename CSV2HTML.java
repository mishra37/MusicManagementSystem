import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.IOException;
import java.io.FileWriter;

public class CSV2HTML{

  public static void main(String[] args) {
    String toWrite = "";
    toWrite += "<html><table>";
    try {
      File myObj = new File("sliceSongs.csv");
      Scanner myReader = new Scanner(myObj);
      int i = 0;
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        if(i==0) {
          String[] headerList = data.split(",");
          toWrite += "<tr>";
          for(String each:headerList) 
            toWrite += "<th>" + each + "</th>";
          toWrite += "</tr>";  
      } else{
          String[] headerList = data.split(",");
          toWrite += "<tr>";
          for(String each:headerList) {
            toWrite += "<td>" + each + "</td>";
          }
          toWrite += "</tr>";
        }
        i++;
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

    try {
      FileWriter myWriter = new FileWriter("output.html");
      myWriter.write(toWrite);
      myWriter.close();
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
