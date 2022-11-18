/**Разработать класс-дженерик для хранения данных.
 Данные должны храниться в поле-массиве, ограниченном максимальным размером (например, 10 элементов).
 Реализовать методы добавления данных и удаления данных (например, по принципу стека).
 Методы должны генерировать исключение при попытке добавить данное в уже заполненный контейнер и удалить из пустого контейнера.
 Для этого создать свои классы исключений. Кроме этого реализовать метод сортировки элементов.
 Метод генерирует исключение при попытке сортировать пустой контейнер или если все его элементы - равны;**/

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Double> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();
        try{
            stack.push(1);
            stack.push(2);
            stack.push(0);
            stack.push(8);
            stack.push(5);
            stack.push(9);
            stack.push(10);
            stack.push(11);
            stack.push(12);
            stack.push(13);
            stack.push(13);
            stack.push(13);
            stack.push(13);
            stack.push(13);
            System.out.println(stack.sum());
            stack.pop();
            stack.print();
        }catch (StackException ex){
            System.out.println(ex.getMessage());
            System.out.println("Всего " + ex.getStackSize() + " элементов в стэке.");
        }

        try{
            stack1.push(1.0);
            stack1.push(2.0);
            stack1.push(0.0);
            stack1.push(8.0);
            stack1.push(5.0);
            stack1.push(9.0);
            System.out.println(stack1.sum());
            stack1.pop();
            stack1.print();
        }catch (StackException ex){
            System.out.println(ex.getMessage());
            System.out.println("Всего " + ex.getStackSize() + " элементов в стэке.");
        }

        try{
            stack2.push("Один");
            stack2.push("Два");
            stack2.push("Ноль");
            stack2.push("Восемь");
            stack2.push("Пять");
            stack2.push("Девять");
            System.out.println(stack2.sum());
            stack2.pop();
            stack2.print();
        }catch (StackException ex){
            System.out.println(ex.getMessage());
            System.out.println("Всего " + ex.getStackSize() + " элементов в стэке.");
        }
    }
}
