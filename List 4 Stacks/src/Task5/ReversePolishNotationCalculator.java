package Task5;

import Exceptions.UndefinedOperatorException;
import Messages.Message;
import Task2.ListStack;

/**
 * Created by pmazurek on 08.04.2017.
 *
 * Stack is able to count any arithmetic expression (containing math operators)
 */
public class ReversePolishNotationCalculator {

    //<editor-fold desc="Elements">
    private ListStack stack;

    private double result=0;
    //</editor-fold>

    //<editor-fold desc="Constructors">
    public ReversePolishNotationCalculator()
    {
        this.stack= new ListStack();
    }
    //</editor-fold>

    public double calculateExpression(String expression)
    {
        int i=0;

        String substring;

        int substringBegenning=0;
        int substringEnd=0;

        while (i<expression.length())
        {
            if (expression.charAt(i)!=' ') {
                substringEnd++;
                i++;
                continue;
            }

            else {

                substring = expression.substring(substringBegenning, substringEnd);

                if (substring.charAt(0) == '/' || substring.charAt(0) == '+' || substring.charAt(0) =='*' || substring.charAt(0) == '-') {
                    addOperator(substring.charAt(0));
                }
                else {
                    double result = Double.parseDouble(substring);
                    addNumber(result);
                }

                substringBegenning= substringEnd+1;
                substringEnd+=1;
                i++;
            }

        }

       return getResult();


    }


    public void addNumber(double number)
    {
        stack.push(number);
    }

    public void addOperator(char operator) throws UndefinedOperatorException
    {
        double firstNumber;
        double secondNumber;

        if(operator!='=')
        {
            secondNumber=(double)stack.pop();
            firstNumber=(double)stack.pop();

            switch (operator) {
                case '+':
                    stack.push(firstNumber + secondNumber);
                    break;

                case '-':
                    stack.push(firstNumber - secondNumber);
                    break;

                case '*':
                    stack.push(firstNumber * secondNumber);
                    break;

                case '/':
                    stack.push(firstNumber / secondNumber);
                    break;

                default:
                    throw new UndefinedOperatorException();

            }
        }

        else
            getResult();

    }

    public double getResult()
    {
        Message.showOperationResult(stack.peek());
        return (double)stack.peek();
    }


}
