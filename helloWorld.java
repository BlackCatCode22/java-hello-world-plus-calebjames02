// Name of programmer: Caleb Bergen
// Name of program: Hello World
// Date started: 1/27/23

import java.util.Scanner;
public class helloWorld{
    public static void main(String[] args){
       String name;
       String greeting;
       Scanner userInput = new Scanner(System.in);
       
       System.out.println("Hello, please enter your preferred name: ");
       name = userInput.nextLine();
       
       greeting = "Hello " + name + " how are you doing today?";
       
       System.out.println(greeting);
    
    }
}