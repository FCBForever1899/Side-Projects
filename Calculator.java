

public class Calculator {
    public static void main(String[] args){

        StdOut.println("Enter first integer: "); //Output: User enters first integer
        int num1 = StdIn.readInt(); // Input: num1 = entered first integer

        StdOut.println("Enter operation (+, -, x, /,): "); //Output: User enters operation
        String op = StdIn.readString(); //Input: op = entered operation

        StdOut.println("Enter second integer: "); //Output: User enters second integer
        int num2 = StdIn.readInt(); //Input: num2 = entered seond integer
        

        if("+".equals(op)){                         //Checks if user wants to add num1 and num2
            StdOut.println("Result: " + (num1 + num2));            //If op == +; Output: add num1 and num2
          }  else if("-".equals(op)){                         //Checks if user wants to subtract num1 and num2
                StdOut.println("Result: " + (num1 - num2));   //If op == -; Output: subtract num1 and num2
           } else if("x".equals(op)){                         //Moves on to next condition; Checks if user wants to multiply num1 and num2
                    StdOut.println("Result: " + (num1 * num2)); //If op == *; Output: multiply num1 and num2
            } else  if("/".equals(op)){                         //Moves on to next conditons; Checks if user wants to divide num1 and num2
                    if(num2 == 0){                              //If op == /, checks if num2 == 0
                        StdOut.println("Error:Can't divide by 0"); //If num2 == 0; Can't divide by 0
                     } else {                                       //Moves onto desired action
                        StdOut.println("Result: " +  (num1/num2));  // Divide num1/num2
                    }
                                
        }
             else{                                                       //If operator is entered incorrectly
                 StdOut.println("Error: Invalid operator");              //shows that an invalid operator is incorrect
        }

        if(!(num1 instanceof Integer) || !(num2 instanceof Integer)){   //Checks if num1 and num2 are inputed as actual integers #ChatGPT
            StdOut.println("Error: Must input two valid integers");     //If num1 or num2 are not integers; show error: they must be integers #ChatGPT
        }
        
        
       

       
                }
        
        
                
            }
        
            
   

    
   

