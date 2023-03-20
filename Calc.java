import javax.swing.*;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String mathsymbol;
        int numofnum;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        boolean quit = false;
        while (true) {
            System.out.print("How many Numbers up to 5 are you using, or Type quit to quit the program:");
            String quitter = input.nextLine();

            if (quitter.equalsIgnoreCase("quit")) {
                break;
            } else {
                try {

                    numofnum = Integer.parseInt(quitter);

                    if (numofnum >= 1) {
                        System.out.println("What is your First Number?: ");
                        num1 = Integer.parseInt(input.nextLine());
                    }
                    if (numofnum >= 2) {
                        System.out.println("What is your Second Number?: ");
                        num2 = Integer.parseInt(input.nextLine());
                    }
                    if (numofnum >= 3) {

                        System.out.println("What is your Third Number?: ");
                        num3 = Integer.parseInt(input.nextLine());
                    }
                    if (numofnum >= 4) {

                        System.out.println("What is your Fourth Number?: ");
                        num4 = Integer.parseInt(input.nextLine());
                    }
                    if (numofnum >= 5) {
                        System.out.println("What is your Fifth Number?:");
                        num5 = Integer.parseInt(input.nextLine());


                    }System.out.print("What type of Math Equation do you want solved?: ");{
                        mathsymbol = input.nextLine();

                    } if (mathsymbol.equals("addition") || mathsymbol.equals("+") || mathsymbol.equals("add")) {

                        System.out.println("performing addition......");
                        System.out.println(num1 + num2 + num3 + num4 + num5);




                    } else if (mathsymbol.equals("multiplication") || mathsymbol.equals("*") || mathsymbol.equals("multi")) {
                        if (numofnum == 2) {
                            int solution = num1 * num2;
                            System.out.println("your multiplcation answer is: " + solution);
                        }
                         else if (numofnum == 3){
                             int solution1 = num1 * num2 * num3;
                             System.out.println("your multiplcation answer is: " + solution1);
                        } else if (numofnum == 4) {
                             int solution2 = num1 * num2 * num3 * num4;
                             System.out.print("Your multiplcation answer is:" + solution2);
                        }
                         else if (numofnum == 5){
                             int solution3 = num1 * num2 * num3 * num4 * num5;
                             System.out.print("You multiplcation answer is" + solution3);
                        }else{
                             return;
                        }


                    }else if (mathsymbol.equals("subtraction") || mathsymbol.equals("-") || mathsymbol.equals("minus")) {
                        System.out.println("Performing Subtraction");
                        System.out.println(num1 - num2 - num3 - num4 - num5);
                        int pie2 = num1 - num2 - num3 - num4 - num5;
                        if (pie2 >= 0){
                            return;
                        }





                    }else if (mathsymbol.equals("division") || mathsymbol.equals("/") || mathsymbol.equals("divide")) {
                        if (numofnum == 2) {
                            if (num1 == 0 || num2 ==0) {
                                System.out.println("your answer is undefined");

                            }double solution = (double) num1 / num2;
                            System.out.println("your quotient answer is: " + solution);
                        } else if (numofnum == 3) {
                            if (num1 == 0 || num2 ==0 || num3 == 0) {
                                System.out.println("your answer is undefined");

                            }double solution1 = (double) num1 / num2 / num3;
                            System.out.println("your quotient answer is: " + solution1);
                        } else if (numofnum == 4) {
                            if (num1 == 0 || num2 ==0 || num3 == 0 || num4 == 0) {
                                System.out.println("your answer is undefined");

                            }double solution2 = (double) num1 / num2 / num3 / num4;
                            System.out.print("Your quotient answer is:" + solution2);
                        } else if (numofnum == 5) {
                            if (num1 == 0 || num2 == 0 || num3 == 0 || num4 == 0 || num5 == 0) {
                                System.out.println("your answer is undefined");

                            }
                            double solution3 = (double) num1 / num2 / num3 / num4 / num5;
                            System.out.print("You quotient answer is" + solution3);
                        }else{
                                return;
                            }



                        }else if (mathsymbol.equals("power") || mathsymbol.equals("^") || mathsymbol.equals("**")) {
                            if (numofnum == 2) {
                                double result = Math.pow(num1, num2);
                                System.out.println("your power solution is:" + result);
                            }else{
                                return;
                        }
                    }else{
                        System.out.println("you entered an invalid input: please use a specified math symbol");
                        return;


                    }


            } catch(NumberFormatException e){
                System.out.println("Invalid input. Please enter a number or quit.");
            }
        }




        }


    }
}
