// importNecessaryPackage
import java.util.Arrays;

public class ArrayDemo {
   public static void main(String[] args) {

   // initializing Object array
   Object[] ob1 = new Object[] { 10, 20 };

   // let us print all the elements available in list
   System.out.println("The array is:");
   for (Object number : ob1) {
      System.out.println("Number = " + number);
   }
	
   System.out.println("The string representation of array is:");
   System.out.println(Arrays.toString(ob1));    
   }
}  
