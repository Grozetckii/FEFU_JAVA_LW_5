public class Stack<T> {
    private T[] arr;
    private int lastId;
    private final int MAX_SIZE = 10;

    public Stack(){
        lastId = -1;
        arr = (T[]) new Object[MAX_SIZE];
    }

    public T top() throws StackException{
        if(!isEmpty()){
            return arr[lastId];
        }else throw new StackException("Пустой стэк! Нет элемента в вершине.", lastId);
    }

    public void pop() throws StackException{
        if(!isEmpty()){
            arr[lastId] = null;
            lastId--;
        } else throw new StackException("Пустой стэк! Нечего удалять.", lastId);
    }

    public void push(T el) throws StackException{
        if(lastId + 1 < MAX_SIZE){
            lastId++;
            arr[lastId] = el;
        }else throw new StackException("Полный стэк. Максимум " + MAX_SIZE + " элементов.", lastId);
    }

    public void print() throws StackException{
        if(!isEmpty()){
            for(int i = lastId; i >= 0; i--){
                System.out.println(arr[i]);
            }
        }else throw new StackException("Пустой стэк! Нет элементов для печати.", lastId);
    }

    public T sum() throws StackException{
        if(!isEmpty()){
            if(arr[0] instanceof Integer){
                Integer res = 0;
                for (int i = lastId; i >= 0; i--){
                    res += (Integer) arr[i];
                }
                return (T)res;
            }else if(arr[0] instanceof Double){
                Double res = 0.0;
                for (int i = lastId; i >= 0; i--){
                    res += (Double) arr[i];
                }
                return (T)res;
            }else if(arr[0] instanceof String) {
                String res = "";
                for (int i = lastId; i >= 0; i--) {
                    res += (String) arr[i];
                }
                return (T) res;
            }else throw new StackException("Недопустимый тип для суммирования.", lastId);
        }else throw new StackException("Пустой стэк! Нечего суммировать.", lastId);
    }

    public boolean isEmpty(){
        return lastId == -1;
    }
}
