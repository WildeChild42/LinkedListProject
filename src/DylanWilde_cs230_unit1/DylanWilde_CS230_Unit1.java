/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DylanWilde_cs230_unit1;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Dylan Wilde
 */
public class DylanWilde_CS230_Unit1
{

    private static Scanner input;
    
    public static void main(String[] args)
    {
       TestScriptUnit1();
    }
    
    public static void TestScriptUnit1()
    {
         LinkedData contributors = new LinkedData();
        
        Openfile();
        
        input.useDelimiter(",|\\r\\n");  //Tell the program to consider a comma, return or new line the end of an entry
        
        // load all of the data into the stack
        while (input.hasNext()) {
            contributors.Push(
                new Contributor(
                    input.next(),input.next(),input.next(),input.next(),
                    input.nextInt(),input.nextInt()
                )
            ); 
        }
        // close scanner 
        input.close();
        // print contributors
        System.out.println("Full stack of contributors:");
        PrintContributors(contributors);
        // one pop of the stack per requirements
        contributors.Pop();
        // print contributors after pop of stack
        System.out.println("Contributors after one pop of the stack:");
        PrintContributors(contributors);
    }
    
    public static void Openfile()
    {
        try {  //Use a try/catch block to access the csv file.  
            input = new Scanner(Paths.get("files\\contributors.csv"));
        }
        catch (IOException E) { //if the csv file cannot be found
            System.err.println("Unable to open file. Terminating!");
            System.exit(1);
        }
    }
    
    public static <T> void PrintContributors(T contributors) //Print the contibutors
    {
        System.out.println(contributors+"\n");
    }
    
}
