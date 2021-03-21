/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;

/**
 *
 * @author Patricia
 */
public class Methods{ 
    public static void main (String[] args) {
    
 
nameMethod();
genderMethod();
int year = BirthYear();
System.out.println ("My birthyear: "+ year);
System.out.println ("------------------");


}
    static int BirthYear(){
    return 2000;
} 
  public static void nameMethod(){
      System.out.println("Name: Patricia Anne Perdido");
  }
  public static void genderMethod(){
      System.out.println("Gender: Female");
  }

}