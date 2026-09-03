/* 
import java.util.Scanner;
public class basic {
    public static void main(String[] args){
       //c=Math.sqrt(a^2 + b^2)
       Scanner scanner = new Scanner(System.in);

       double a;
       double b;
       double c;

       System.out.print("Enter the length of side A : ");
       a = scanner.nextDouble();

       System.out.print("Enter the length of side B : ");
       b = scanner.nextDouble();

       c=Math.sqrt(Math.pow(a,2) + Math.pow(b, 2));

       System.out.println("Hypotenuse c is "+c +" cm");

       scanner.close();

    }
}

import java.util.Scanner;
public class basic{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius;

        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius : ");
        radius = scanner.nextDouble();

        circumference=2*Math.PI*radius;
        area=Math.PI*Math.pow(radius, 2);
        volume=(4.0/3.0)*Math.PI*Math.pow(radius, 3);

        System.out.printf("Circumference of circle is %.1fcm\n",circumference); 
        System.out.printf("Area of circle is %.1fcm²\n",area); // numlock+alt+0178
        System.out.printf("Volume of circle is %.1fcm^3\n",volume); //numlock+alt+0179   OR cm\u00B3,  BUT ³ is not displaying correctly in the terminal 
        scanner.close();
    }
}

// ************************************************************
//                       COMPOUND INTEREST
// ************************************************************
import java.util.Scanner;
public class basic{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double P;
        double r;
        int t;
        int n;
        double A;

        System.out.print("Enter the principal amount :");
        P = scanner.nextDouble();

        System.out.print("Enter the interest rate (%):");
        r = scanner.nextDouble()/100;

        System.out.print("Enter the #of times compound per year :");
        t = scanner.nextInt();

        System.out.print("Enter the # of years :");
        n = scanner.nextInt();

        A=P*Math.pow((1+r/n),n*t);
        System.out.printf("the amount after %d years is RS.%.2f",n,A);

        scanner.close();
    }
}
  
// ************************************************************
//                       WEIGHT CONVERTION
// ************************************************************
import java.util.Scanner;
public class basic{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("WEIGHT CONVERSION\n1.Convert lbs to kgs\n2.Convert kgs to lbs");
        int option;
        double weight;
        double newWeight;
        System.out.print("Choose option: ");
        option = scanner.nextInt();
        if(option==1){
            System.out.print("Enter the weight in lbs :");
            weight=scanner.nextDouble();
            newWeight=weight*0.453592;
            System.out.printf("The new weight in kgs is : %.2f",newWeight);
        }
        else if(option==2){
            System.out.print("Enter the weight in kgs :");
            weight=scanner.nextDouble();
            newWeight=weight*2.20462;
            System.out.printf("The new weight in lbs is : %.2f",newWeight);
        }
        else{
            System.out.println("Enter  a valid option !");
        }
        scanner.close();
    }
}
      
// ************************************************************
//                       TEMPERATURE CONVERTION
// ************************************************************
import java.util.Scanner;
public class basic{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter temperature: ");
        double temp=scanner.nextDouble();
        System.out.print("convert to °C or °F ?(C or F):  ");
        String unit=scanner.next().toUpperCase();
        double newTemp=(unit.equals("C")?(temp-32)*5/9:(temp*5/9)+32);
        System.out.printf("new temperature : %.2f °%s",newTemp,unit);

        scanner.close();
    }
}
        
// ************************************************************
//                       CALCULATOR
// ************************************************************
import java.util.Scanner;
public class basic{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double n1;
        double n2;
        char operator;
        double result=0;
        boolean isValidOperator=true;

        System.out.print("Enter 1st operand: ");
        n1=scanner.nextDouble();

        System.out.print("choose operator (+,-,*,/,^): ");
        operator=scanner.next().charAt(0);

        System.out.print("Enter 2st operand: ");
        n2=scanner.nextDouble();

        switch(operator){
            case '+' -> result=n1+n2;
            case '-' -> result=n1-n2;
            case '*' -> result=n1*n2;
            case '/' ->{
                            if(n2==0){
                                System.out.println("Can't divide by zero!");
                                isValidOperator=false;
                            }
                            else{
                                result=n1/n2;
                            }
            }
            case '^' -> result=Math.pow(n1, n2);
            default ->{
                        System.out.println("Enter valid operator!");
                        isValidOperator=false; 
                    }    

        }
        if(isValidOperator){
        System.out.println(result);
        }

        scanner.close();
    }
}
        
// ************************************************************
//            valid username           
// ************************************************************
import java.util.Scanner;
public class basic{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String username;
        System.out.print("Enter username:");
        username=scanner.nextLine();

        if(username.length()<4 || username.length()>12){
            System.out.println("username must contain 4 - 12 characters !");
        }
        else if(username.contains(" ")|| username.contains("_")){
            System.out.println("username not contain space or underscore!");
        }
        else{
            System.out.println("welcome "+username);
        }
        
        scanner.close();
    }
}

// ************************************************************
//                       
// ************************************************************
    import java.util.Scanner;
public class basic{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        scanner.close();
    }
}

// ************************************************************
//                       NUMBER GUESSING GAME
// ************************************************************
import java.util.Random;
import java.util.Scanner;
public class basic{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();

        int guess;
        int attempts=0;
        int number=random.nextInt(1,101); // random number
        
        do{
            System.out.print("Enter guess: ");
            guess=scanner.nextInt();
            attempts++;

            if(guess<number){
                System.out.println("too low ! try again!");
            }
            else if(guess>number){
                System.out.println("too high ! try again!");
            }
            else{
                System.out.println("CORRECT ! The number was "+number);
                System.out.println("# of attempts = "+attempts);
            }

        }while(guess!=number);

        System.out.println("You won!");
        scanner.close();
    }
}
   
// ************************************************************
//                       THREAD.SLEEP
// ************************************************************
    import java.util.Scanner;
public class basic{
    public static void main(String[] args) throws InterruptedException{
        Scanner scanner=new Scanner(System.in);
        for (int i = 5; i >0 ; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("HAPPY BIRTHDAY!!");
        scanner.close();
    }
}
 */
// ************************************************************
//                  METHOD     
// ************************************************************

 public class basic{
    public static void main(String[] args) {
        String name="Aparna";
        int age=22;

        happyBirthday(name, age);

        double number=2;
        System.out.println("square of number is "+square(number));
    }
    static void happyBirthday(String name, int age){
        System.out.printf("HBD %s\n",name);
        System.out.printf("You are %d now!!\n",age);
    }
    static double square(double number){
        return number*number;
    }
}
