package stringmanipulation;

import java.util.Scanner;

public class StringManipulation {
  
    public static void main(String[] args) {
        loginCheck();

    }
    public static void loginCheck(){
        User u = new User("Ted", "Boyo", "TB");
        Scanner user = new Scanner(System.in);
        System.out.println("Enter your Username: ");
        String uName = user.nextLine();
        
        System.out.println("Enter your Password: ");
        String pWord = user.nextLine();
        
        if((uName.equals("Admin")) && (pWord.equals("password123"))){
            System.out.println("You're in");
            System.out.println(u);
        }else{
            System.out.println("Wrong");
        }
    }
    
}
