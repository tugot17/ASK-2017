package Task1;

import Messages.Message;

/**
 * Created by pmazurek on 07.04.2017.
 */
public class Task1ExampleClass {

    //<editor-fold desc="Elements">
    int maxStackSize;
    //</editor-fold>

    //<editor-fold desc="Constructors">
    public Task1ExampleClass(int maxStackSize)
    {
        this.maxStackSize = maxStackSize;
    }

    public Task1ExampleClass()
    {
        this.maxStackSize =10;
    }
    //</editor-fold>

    public void showTask()
    {
        Message.showTaskNameMessage("Task 1");

        ArrayStack stack= new ArrayStack(maxStackSize);

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


    }


}
