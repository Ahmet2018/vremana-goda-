package vremena.goda;

import java.util.Scanner;

public class VremenaGoda {

    public static void main(String[] args) {
        Scanner num = new Scanner (System.in);
        System.out.println("Ведите год");
        int first;
        first = num.nextInt();
        
        if (first % 4 ==0){
            System.out.println(first+"Високосный");
           
        }else if (first/100==0 || first / 400==0){
            System.out.println(first + " не високосный");
        } else{
            
        }
       
        
    }
    
}
