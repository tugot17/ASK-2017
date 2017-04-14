package Task5;

/**
 * Created by pmazurek on 08.04.2017.
 */
public class Task5ExampleClass {

    ReversePolishNotationCalculator calculator= new ReversePolishNotationCalculator();

    public void showTask()
    {
        calculator.calculateExpression("12 2 3 4 * 10 5 / + * + ");


//        Message.showReversPolishNotationInputData("2 3 + 5 * =");
//        calculator.addNumber(2);
//        calculator.addNumber(3);
//        calculator.addOperator('+');
//        calculator.addNumber(5);
//        calculator.addOperator('*');
//        calculator.addOperator('=');

//        Message.showReversPolishNotationInputData(" 12 2 3 4 * 10 5 / + * + =");
//        calculator.addNumber(12);
//        calculator.addNumber(2);
//        calculator.addNumber(3);
//        calculator.addNumber(4);
//        calculator.addOperator('*');
//        calculator.addNumber(10);
//        calculator.addNumber(5);
//        calculator.addOperator('/');
//        calculator.addOperator('+');
//        calculator.addOperator('*');
//        calculator.addOperator('+');
//        calculator.addOperator('=');
    }


}
