package Task3;

import Messages.Message;

/**
 * Created by pmazurek on 07.04.2017.
 */
public class Task3ExampleClass {

    int maxStackSize;

    SinkingStack stack;

    public Task3ExampleClass(int maxStackSize)
    {
        this.maxStackSize= maxStackSize;
        this.stack= new SinkingStack(maxStackSize);
    }

    public void showTask()
    {
        Message.showTaskNameMessage("Task 2");

        Message.showStackSize(stack.size());

        stack.push(1);
        stack.push(2);
        stack.push(3);
        Message.showAddedElements(1,2,3);

        Message.showStackSize(stack.size());

        Message.showElementPoopedFromStack(stack.pop());
        Message.showElementPeekedFromStack(stack.peek());


        Message.showStackSize(stack.size());

        Message.showAddedElements(4,5,6,7);

        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        Message.showElementPeekedFromStack(stack.pop());
        Message.showElementPeekedFromStack(stack.pop());
        Message.showElementPeekedFromStack(stack.pop());


        Message.showStackSize(stack.size());



    }

}
