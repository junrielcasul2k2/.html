public class SandwichValdeheusa {

private String mainIngredient;
private String breadType;
private double price;

public void setMainIngredient (String ingredient){
      mainIngredient = ingredient;
}

public String getMainIngredient(){
      return mainIngredient;
}
public void setBreadType (String bread){
      breadType = bread;
}
public String getBreadType(){
      return breadType;
}      
public void setPrice (double amount){
      price = amount;
}
public double getPrice(){
      return price;
}
public void display(){
      System.out.print("Enter First Name: "+mainIngredient+ "\nLast Name: "+breadType+ "\nAge: "+price);
      
 }
 }
