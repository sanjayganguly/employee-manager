


public class Main {
    public static void main(String[] args) {
        int[] inputArray ={3,4,2,1,9,8,7}

                // Sort the data using mergeSort
        mergeSort(inputArray);
        //
        //printArray(inputArray);
        //left rotate the array
        leftRotateNyMid(inputArray, searchKey){

        }

        //search by key
        private static void searchByKey(inputArray, int length, searchKey){
// find the pivot
        int pivotIndex = findPivot(inputArray, startIndex = 0, endIndex - 1)
        }
        private static void leftRotateByMid(int[] inputArray){
            //input Array - {1,2,3,4,7,8,9};
            // identify the mid element
            //creat tow sub arrays - left array[0-mid+1]

            int midiIndex = inputArray.length/2;

            int[]leftHalf = new int[midiIndex+1]
            for (int index = 0; index<= midIndex; index++){
                leftHalf[index] = inputArray[index];

            }
                //right array mid - end
            int[] rightHalf = new int[inputArray.length-(midiIndex+1)];
            for(int index = midiIndex+1,j=0, index <= inputArray.length;index++, j++){
                rightHalf[j] = inputArray[index];
            }
//rewrite the array element
            //first right half element to copied and then left element to be copied
            for(int i = 0; i< rightHalf.length; i++ ){
                inputArray[i]=rightHalf[i];

            }

            for(i=0, )

        }


        private static void mergeSOrt(int [] inputArray){
            //divide
            int endIndex = inputArray.length -1;
            int startIndex = 0;
            int midIndex = (startIndex + endIndex)/2;
            //check rr[mid] and arr [mid+1]
            if (mid<endIndex && iputArray[mid] > in\[mid+1]){
                return mid;
            }
            else if(startIndex<mid && inputArray[mid-1] >inputArray[mid]){

            }
            int elementMidIndex = inputArray[midIndex];

            merge(inputArray,startIndex,endIndex)
            //base condition
            //recursion
            //merge
        }
        public satic void divide (int[] inputArray, int startIndex, int endIndex){
            if(startIndex < endIndex){
                int midIndex = (startIndex + endIndex)/2;
                divide(inputArray,startIndex,midIndex);
                divide(inputArray, midIndex +1, endIndex);

                //conquer te array
                conquer(inputArray,startIndex,midIndex, endIndex);
                //find the size
            }
        }
        privar static void conquer(int[] inputArray, int startIndex, int midIndex, int endIndex);
        int[] merged =new int[ endIndex - startIndex +1];

        inteindex1 = startIndex;
        int index2 = midIndex;
        int mergedArrayIndex{
            else{
                merged[mergedArrayIndex]=inputArray[index2];
                mergedArrayIndex++;
                index2++;
            }
            for ((int index = 0; j=startIndex; index<merged.length; index++,j++){
                inputArray[j]=merged[index];

            })
        }

        }


}
