package Messages;

import java.text.MessageFormat;

/**
 * Created by pmazurek on 07.04.2017.
 */
public class Message {

     public static void showTaskNameMessage(String processName)
    {
        String message= MessageFormat.format("{0} example of usage:\n", processName);

        System.out.print(message);
    }

    public static void showElementPoopedFromStack(Object element)
    {
        String message= MessageFormat.format("{0} pooped from Stack\n", element.toString());

        System.out.print(message);
    }

    public static void showElementPeekedFromStack(Object element)
    {
        String message= MessageFormat.format("{0} peecked from Stack\n", element.toString());

        System.out.print(message);
    }

    public static void showAddedElements(int... ints)
    {
        for (int i : ints)
        {
            String message = MessageFormat.format("{0} added to Stack\n", i);

            System.out.print(message);
        }
    }

    public static void showStackSize(int  size)
    {
        String message= MessageFormat.format("Stack size is: {0}\n", size);

        System.out.print(message);
    }

    public static void showStackDefaltSize(int  size)
    {
        String message= MessageFormat.format("Stack {0} size is: {1}\n","default",size);

        System.out.print(message);
    }

    public static void showException(String exceptionType)
    {
        String message= MessageFormat.format("Process stopped because of {0} Exception\n", exceptionType);

        System.out.print(message);
    }

    public static void showOperationResult(Object result)
    {
        String message= MessageFormat.format("Result of the operation is: {0}\n", result.toString());

        System.out.print(message);
    }

    public static void showReversPolishNotationInputData(String inputData)
    {
        String message= MessageFormat.format("{0} added to Reverse Polish notation calculator\n", inputData);

        System.out.print(message);
    }
}
