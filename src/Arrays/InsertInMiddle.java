package Arrays;

public class InsertInMiddle {
    public static void main(String[] args) {

        int[] array = {2,3,4,6,7,8};
        int element = 5;
        int pos = 4;

        array = insert(array,element,pos);

        for (int ele : array) {
            System.out.println(ele + " ");
        }


    }

    private static int[] insert(int[] array, int element, int pos) {
        int num = array.length;
        int[] newArray = new int[num+1];
        int i;

        for(i=0;i<num+1;i++){

            if(i < pos-1){
                newArray[i] = array[i];
            }else if(i == pos-1){
                newArray[i] = element;
            }else if (i > pos-1){
                newArray[i] = array[i-1];
            }

        }

        return newArray;
    }
}
