public class printsum {

    public static void printSum(int i, int n, int sum) {
        if(i == n){ //base condition
            sum += i;//base condition
            System.out.println(sum);//base condition
            return;//base condition
        }// else
        sum += i;
        printSum(i+1, n, sum);
//mathematical formula for sum of n no is = (n.n+1)/2

    }
    public static void main(String[] args) {
       printSum(1, 5, 0);
    } // initialiation
}
