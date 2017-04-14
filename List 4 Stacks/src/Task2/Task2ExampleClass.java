package Task2;

import Messages.Message;

/**
 * Created by pmazurek on 07.04.2017.
 */
public class Task2ExampleClass {

    //<editor-fold desc="Elements">
    ListStack stack;
    //</editor-fold>

    //<editor-fold desc="Constructors">
    public Task2ExampleClass()
    {
        this.stack= new ListStack();
    }
    //</editor-fold>

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
        
        
    }



}
