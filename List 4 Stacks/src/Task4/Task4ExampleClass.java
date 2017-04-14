package Task4;

import Messages.Message;

/**
 * Created by pmazurek on 07.04.2017.
 */
public class Task4ExampleClass {

    DynamicStack stack;

    public Task4ExampleClass(int defaultStackSize)
    {
        stack= new DynamicStack(defaultStackSize);
    }

    public void showTask()
    {
        Message.showTaskNameMessage("Task 4");

        Message.showStackSize(stack.size());

        stack.push(1);
        stack.push(2);
        stack.push(3);
        Message.showAddedElements(1,2,3);

        Message.showStackSize(stack.size());

        Message.showElementPoopedFromStack(stack.pop());
        Message.showElementPoopedFromStack(stack.pop());
        Message.showStackDefaltSize(stack.defaultSize());
        Message.showElementPeekedFromStack(stack.peek());


        Message.showStackSize(stack.size());

        Message.showAddedElements(4,5,6,7,8,9,10);

        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
//        stack.push(9);
//        stack.push(10);

        Message.showStackSize(stack.size());
        Message.showStackDefaltSize(stack.defaultSize());

    }

}
