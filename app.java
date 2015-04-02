import java.io.*;
import java.util.*; //Scanner
import entradas.*;

public class app{
  public static void main(String args[]){
    // Variables globales
    float number;
    String val = null;
    int result;
    double numberd = 0.0;
    /* ++++++++++++++++++++++++++++++
    //         BUFFER READ          //
    +++++++++++++++++++++++++++++++*/
    /*InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(in);
    System.out.println("Enter float number otra prueba");
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
        val = cnl.readLine("Enter float number de aqui: ");
      }
    }
    catch(Exception e){}*/

    /* +++++++++++++++++++++++++++++++
    //         SCANNER              //
    ++++++++++++++++++++++++++++++++*/
    /*Scanner scn = new Scanner(System.in);
    System.out.println("Enter float number: ");
    val = scn.next();*/

    /* +++++++++++++++++++++++++++++++
    //         StdIn Class           //
    ++++++++++++++++++++++++++++++++*/
    try{
      System.out.println("Enter double number: ");
      numberd = StdIn.readDouble();
    }
    catch(Exception e){
      System.out.println("+++++++ WARNING +++++++");
      System.out.format("The input: '%s' not is double type",val);
    }

    // Funciones genericas independiente de la manera de entrada
    try{
      //number = Float.valueOf(val);
      //result = (int)number;
      System.out.println("Your input = "+Math.floor(numberd));
      //System.out.println("Your input in int terms is = "+result);
    }
    catch(Exception e){
      System.out.println("+++++++ WARNING +++++++");
      System.out.format("The input: '%s' not is float type",val);
    }

  }
}
