/**
 * Created by grigo on 7/3/2023
 *
 * @author : grigo
 * @date : 7/3/2023
 * @projects : Testclass1
 */
public class StackOfIntegers {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    public StackOfIntegers(){
        this(DEFAULT_CAPACITY);

    }
    public StackOfIntegers(int capacity){
        elements = new int[capacity];

    }

    public void push(int value){
        if (size >= elements.length){
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }

    public boolean empty(){
        return size == 0;
    }
    public int pop(){
        return elements[--size];
    }
    public int peek(){
        return elements[size -1];
    }
    public int getSize(){
        return size;
    }


}
