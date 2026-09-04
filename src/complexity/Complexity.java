package complexity;

public class Complexity {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,2,13,4};
        int target = 13;

        for (int i = 0; i < arr1.length; i++){
            if (arr1[i] == target){
                System.out.println(i);
            }
        }
    }
}
