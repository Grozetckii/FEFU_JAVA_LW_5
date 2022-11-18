public class StackException extends Exception{
    private final int stackSize;

    public int getStackSize() {
        return stackSize;
    }

    public StackException(String message, int stackSize){
        super(message);
        this.stackSize = stackSize + 1;
    }
}
