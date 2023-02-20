import java.util.*;

public class TestSandwichValdehuesa {
 
   public static void main(String[] args){
   
        SandwichValdeheusa Sandwich = new SandwichValdeheusa();
            
           /* Sandwich.setMainIngredient ("Tuna");
            Sandwich.setBreadType("Wheat");
            Sandwich.setPrice(4.99);
            Sandwich.display();*/
            
            String  ingredient, bread;
           double amount;
            
            
            Scanner sc = new Scanner(System.in);
           System.out.println("Enter First Name: ");
           ingredient = sc.next();
           
           System.out.println("Enter Last Name: ");
            bread  = sc.next();
            
            System.out.println("Enter Age: ");
            amount = sc.nextDouble();
           
           //SandwichValdeheusa Sandwich = new SandwichValdeheusa(ingredient,bread,amount);
           
           Sandwich.setMainIngredient(ingredient);
           Sandwich.setBreadType(bread);
           Sandwich.setPrice(amount);
           Sandwich.display();

           
             }
   }