public class fibonacci {

public static void printfib (int a, int b, int n){
    if(n == 0) {
        return;
    }
    int c = a + b;
    System.out.println(c);
    printfib(b, c, n-1);// here value of a will go to b and value of c from formula above and
    // value of n is also reduced by 1 for next step counting

}
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        printfib(a, b, n-2);// term will start after first two o and 1 confirmed calls so n-2
    }
}
