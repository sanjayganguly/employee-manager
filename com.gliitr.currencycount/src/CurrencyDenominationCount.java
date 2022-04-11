public class CurrencyDenominationCount {
static void bubbleSort (int[] notes){

    int n = notes.length;
    int temp = 0;
    for(int i=0; i<n; i++){
        for (int j=1; j<(n-1); j++){
            if(notes[j-1]>notes[j]){
                //swap the elements
                temp = notes[j-1];
                notes[j-1] = notes[j];
                notes[j]=temp;
            }
        }
    }
    }
    public static void main(String[] args){
        int[] notes ={60, 5, 12, 78, 25};
        bubbleSort(notes); //Sorting array elements using bubble sort
        int[] noteCounter = new int [notes.length];
        int amount = 128;
        for(int index = 0; index<notes.length; index++){
            if(amount >= notes[index]){
                noteCounter[index] = amount / notes[index];
                amount = amount - noteCounter[index]*notes[index];
                }
        }
        if(amount>0){
            System.out.println("Can not tender exact amount the balance still due is : " +amount);
        }
        else{
            for (int loop = 0; loop<notes.length; loop++){
                if(noteCounter[loop] !=0){
                    System.out.println("Your payment approach in order to give min no. of otes will be\n" +notes[loop]+ " : "+noteCounter[loop]);

                }
            }
        }
    }
}
