package Arrays;

public class InsertAtBeginning {

    public static void main(String[] args) {

        int[] array = {4,5,6};

        int element =  1;
        int pos = 0;

        //Before
        for (int i: array) {
            System.out.print(i + "  ");
        }
        System.out.println();

        // Insert element at beginning
        array = insert(array,pos,element);

        //After
        for (int i: array) {
            System.out.print(i + "  ");
        }

    }

    private static int[] insert(int[] array, int pos, int element) {
        int num = array.length;
        int[] newArray = new int[num + 1];
        int i;

       // copy all elements to next index in new array
//       while(num > pos){
//           newArray[num] = array[num-1] ;
//
//           num = num-1;
//       }
        for(i=newArray.length - 1; i > 0 ; i--){

            newArray[i] = array[i-1];
        }

       // at 1st pos insert element
       newArray[pos] = element;

        return newArray;
    }
}
