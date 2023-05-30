package WritingAlgorithms;

public class Algorithms {
    public static void main(String[] args) {

//      CREATE ARRAY TO SORT
        int[] arrBubbleSort;
        arrBubbleSort = new int[5];
        arrBubbleSort[0] = 4;
        arrBubbleSort[1] = 1;
        arrBubbleSort[2] = 3;
        arrBubbleSort[3] = 9;
        arrBubbleSort[4] = 7;

//      CREATE NUMBER FOR LENGTH OF ARRAY
        int N = 5;

//      CALL FUNCTION THAT DOES BUBBLE SORTING
        bubbleSort(arrBubbleSort, N);

//      PRINT OUT THE SORTED ARRAY
        for (int num : arrBubbleSort) {
            System.out.println(num + " ");
        }


//      CREATE ARRAY FOR QUICKSORT TO SORT
        int[] arrQuickSort;
        arrQuickSort = new int[10];
        arrQuickSort[0] = 1;
        arrQuickSort[1] = 2;
        arrQuickSort[2] = 8;
        arrQuickSort[3] = 4;
        arrQuickSort[4] = 6;
        arrQuickSort[5] = 10;
        arrQuickSort[6] = 7;
        arrQuickSort[7] = 3;
        arrQuickSort[8] = 9;
        arrQuickSort[9] = 5;

        System.out.println(arrQuickSort.length-1);

//        CODE THAT TESTS TO SEE IF PARTITION FUNCTION WORKS PROPERLY
//        partition(arrQuickSort, 0, arrQuickSort.length-1);

//      CALL QUICKSORT FUNCTION
        quickSort(arrQuickSort, 0, arrQuickSort.length-1);

    }

//  BUBBLE SORT FUNCTION
    static int[] bubbleSort(int[] arr, int N) {
//      CREATES A FOR LOOP FOR THE INDEXES FOR VALUES IN THE ARRAY
        for (int i = 0; i < N - 1; i++) {
//          CREATES A FOR LOOP THAT LIMITS INDEXES OF J TO COMPARE OTHER VALUES TO
            for (int j = 0; j < N - i - 1; j++) {
//              COMPARES THE VALUES OF J AND THE NEXT VALUE
                if (arr[j] > arr[j + 1]) {
//                  CODE TO SWAP THE ADJACENT VALUES IF THE VALUE AT J IS GREATER THAN THE VALUE OF THE ARRAY AT J+1
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println();

        }
        return arr;
    }

//  CREATE PARTITION FUNCTION
    public static int partition(int[] arr, int lowIndex, int highIndex) {
//      SET THE PIVOT POINT TO BE THE VALUE OF THE VERY LAST INDEX OF THE ARRAY
        int pivot = arr[highIndex];
//      SET THE LEFT MOST POINT TO BE THE LOWEST INDEX
        int left_P = lowIndex;
//      SET THE RIGHT MOST POINT TO BE THE HIGHEST INDEX BEFORE THE PIVOT POINT
        int right_P = highIndex-1;
//      WHILE CONDITIONS ARE TRUE,
        while (true) {
//          CHECK VALUE OF THE LEFT POINT. IF IT IS LESS THAN THE VALUE OF THE PIVOT
//          AND IF LEFT POINT IS LESS THAN RIGHT POINT
            while (arr[left_P] <= pivot && left_P <= right_P) {
//              INCREMENT LEFT POINT TO THE RIGHT
                left_P++;
            }
//          CHECK VALUE OF THE RIGHT POINT. IF IT IS GREATER THAN THE VALUE OF THE PIVOT
//          AND IF THE LEFT POINT IS LESS THAN RIGHT POINT
            while (arr[right_P] >= pivot && left_P <= right_P) {
//              DECREMENT RIGHT POINT TO THE LEFT
                right_P--;
            }
//          CHECK TO SEE IF LEFT POINT IS EQUAL TO RIGHT POINT
            if(left_P >= right_P){
//              IF SO, BREAK THE WHILE LOOP.
                break;
            }
//          SWAPS THE VALUES TO THE LEFT OR RIGHT DEPENDING ON WHETHER THEY WERE HIGHER OR LOWER THAN THE PIVOT VALUE
            swap(arr, left_P, right_P);
            left_P++;
            right_P--;

        }
//          SWAPS THE VALUES OF THE PIVOT POINT AND VALUE AT THE HIGHEST INDEX
            swap(arr, left_P, highIndex);

//          PRINTS THE VALUES FROM THE ARRAY
            for (int num : arr) {
                System.out.println(num + " ");

        }return left_P;
    }

//  FUNCTION TO SWAP THE VALUES
    public static void swap(int []arr, int index1, int index2){
//      STORES THE VALUE OF THE ARRAY AT INDEX1 INTO A TEMP VARIABLE
        int temp = arr[index1];
//      STORES THE VALUE OF THE ARRAY AT INDEX 2 INTO THE ARRAY AT INDEX1
        arr[index1] = arr[index2];
//      STORES THE VALUE OF THE ARRAY OF INDEX1 INTO THE ARRAY AT INDEX2
        arr[index2] = temp;
    }

//  FUNCTION TO QUICKSORT
    public static void quickSort ( int arr[], int lowIndex, int highIndex){
//      CHECKS TO SEE IF THE LOWER INDEX IS STILL LESS THAN THE HIGHER INDEX
        if (lowIndex < highIndex) {
//          FINDS THE PARTITION INDEX BY RUNNING THE PARTITION FUNCTION
            int partitionIndex = partition(arr, lowIndex, highIndex);

//          RECALLS THE QUICKSORT FUNCTION TO THE VALUES LESS THAN THE PIVOT POINT
            quickSort(arr, lowIndex, partitionIndex - 1);
//          RECALLS THE QUICKSORT FUNCTION TO THE VALUES HIGHER THAN THE PIVOT POINT
            quickSort(arr, partitionIndex + 1, highIndex);

        }
    }
}
