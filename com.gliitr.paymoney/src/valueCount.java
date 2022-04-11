


public class valueCount {
    private final int[] transactions;
    public valueCount (int [] transaction) {
        this.transactions = transaction;
    }
    public int testTarvegAcieved (int target){
    int sum = 0;
    for (int index = 0; index < transactions.length; index++){
sum = sum + transactions[index];
if (sum >= target){
    return index + 1;
    }

    }
    return -1;
    }
    //No of Transactions needed to be calculated and displayed
    //against total given volume of Transaction
    public static void main( String[] args){
        int[] transactions = {20,12,31};
        int target = 21;
        //int target = 19;
        //int target = 100;
    valueCount paymentProcess = new valueCount(transactions);

    int index = paymentProcess.testTarvegAcieved(target);

    if (index != -1){
    System.out.println("The target is achieved after :" +index+ " transactions");
    }
    else{
    System.out.println("The given target is not achieved eve after " +index+ " entire transaction");
    }

    }

}
