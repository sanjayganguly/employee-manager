public class Recursion1 {

    public static void printNum(int i){
        if(i==0) {
            return;
        }
        System.out.println(i);
        printNum(i-1);
    }




    public static void main(String[] args) {
    int i=5;
            printNum(i);
    }
}
