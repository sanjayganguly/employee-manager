import java.util.*;
// IMPORT STACK CLASS

public class floorplan {
    int top;
    int maxsize = 5; // DECLARE SIZE OF THE FLOORS TO BE TAKEN FOR COMPARISON IN STACK
    int[] stack_array = new int[maxsize]; // ARRAY THAT WILL HOLD OUR MAIN STACK ELEMENTS

    int[] stack_max = new int[maxsize]; // ARRAY THAT WILL HOLD OUR TEMPORARY STACK ELEMENTS

    floorplan() {
        top = -1;
    }
    boolean isEmpty() {
        return (top < 0);
    }

    boolean push(int value) {  // PUSH METHOD
        if (top == maxsize - 1) {
            System.out.println("THE STACK IS FULL");
            return false;
        } else {
            top++;
            stack_array[top] = value;
            stack_max[top] = value;
            return true;
        }
        if(value>stack_max.peek()) stack_max.push(value);
        else stack_max.push (stack_max.peek());
        }
        static int getMax() {
        return stack_max.peek();
        }
        static void pop () {
         stack_array.pop();
         stack_max.pop();
        }
         void getFloor(){
         System.out.println("THE FLOOR TO BE ASSEMBLED IS : " +maxsize);
            }

        boolean pop() { // POP METHOD
        if (top == -1) {
            System.out.println("THE STACK IS EMPTY");
            return false;
        } else {
            System.out.println(("THE FLOOR OF SIZE :" + stack_array[top--] + " CAN BE ASSEMBLED"));
            return true;
        }
    }
            static void pop() {
            stack_array.pop();
            stack_max.pop();
        }

         public void display() {
        System.out.println("PRINTTIG ALL THE STACK ELEMENTS");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack_array[i] + " ");
            }
         }
            //MAIN CLASS
            public static void main(String[] args) {
            floorplan stack = new floorplan();
            System.out.println("THE FLOOR SIZE AWAILABLE DAYWISE AS NEEDED TO BUILD \n BUILDING IS TO BE PUSHED");
            //PUSH THE ELEMENTS
            stack.push(4);
                System.out.println(getMax());
            stack.push(5);
                System.out.println(getMax());
            stack.push(1);
                System.out.println(getMax());
            stack.push(2);
                System.out.println(getMax());
            stack.push(3);
                System.out.println(getMax());
            stack.display();

            System.out.println("FLOORS REMAINED AFTER THE STAGE " + stack.top + " ");

        }
}
