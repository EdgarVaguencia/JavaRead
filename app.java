import java.io.*;
import java.util.*; //Scanner

public class app{
  public static void main(String args[]){
    // Variables globales
    float number;
    String val = null;
    int result;
    /* ++++++++++++++++++++++++++++++
    //         BUFFER READ          //
    +++++++++++++++++++++++++++++++*/
    /*InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(in);
    System.out.println("Enter float number");
    try{
      val=br.readLine();
    }
    catch(Exception e){}*/

    /* +++++++++++++++++++++++++++++++
    //         CONSOLE              //
    ++++++++++++++++++++++++++++++++*/
    /*Console cnl = null;
    try{
      cnl = System.console();
      if( cnl != null){
        val = cnl.readLine("Enter float number: ");
      }
    }
    catch(Exception e){}*/

    /* +++++++++++++++++++++++++++++++
    //         SCANNER              //
    ++++++++++++++++++++++++++++++++*/
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter float number: ");
    val = scn.next();

    // Funciones genericas independiente de la manera de entrada
    try{
      number = Float.valueOf(val);
      result = (int)number;
      System.out.println("Your input = "+number);
      System.out.println("Your input in int terms is = "+result);
    }
    catch(Exception e){
      System.out.println("+++++++ WARNING +++++++");
      System.out.format("The input: '%s' not is float type",val);
    }

  }
}
