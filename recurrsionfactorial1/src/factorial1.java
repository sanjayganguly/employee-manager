public class factorial1 {
public static int calfactorial(int n){
    if(n == 1| n == 0){
        return 1;
    }
    int factornm1 = calfactorial(n-1);
    int fact_n = n * factornm1;
    return fact_n;
}

    public static void main(String[] args) {
        int n = 5;
        int answer = calfactorial(n);
        System.out.println(answer);
}

}
