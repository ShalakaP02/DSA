package Arrays;

public class InsertAtEnd {
    public static void main(String[] args) {

        int[] array = {2,3,4,5,1,8};
        int element =  6;
        int pos = array.length;

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
        int[] newArray = new  int[num + 1];
        int i;

        // copy all elements as it is in new array
        for(i=0;i<num;i++){
            newArray[i] = array[i];
        }

        // at the end insert new element
        newArray[num]=element;

        return newArray;
    }
}
