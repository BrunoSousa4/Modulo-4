
package javaapplication3;

public class JavaApplication3 {

    public static void main(String[] args) {
        int num1 = 1, num2 = 0;
        
        System.out.println(num2);
        System.out.println(num1);
        
        for(int i = 0; i < 100000000; i++){
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.println(num1);
        }
    }
    
}

