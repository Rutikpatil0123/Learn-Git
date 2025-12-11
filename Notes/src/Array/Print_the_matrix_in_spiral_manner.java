package Array;
import java.util.ArrayList;
import java.util.List;

public class Print_the_matrix_in_spiral_manner {

    public static void main(String[] args) {
        int[][] matrix = {
            { 1,  2,  3,  4 },
            { 5,  6,  7,  8 },
            { 9, 10, 11, 12 },
            { 13,14, 15, 16 }
        };

        List l = spiralOrder(matrix);
        printList(l);
       
    }

    public static void printList(List l){
        for(int i = 0; i < l.size(); i++){
            System.out.print(l.get(i) + " -> ");
        }
        System.out.println();
    }

    public static List<Integer> spiralOrder(int[][] matrix){

        List<Integer> list = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;

        while(top <= bottom && left <=right){

            for(int i = left; i <= right; i++){
                list.add(matrix[top][i]);
            }
            top++;

            for(int j = top; j <= bottom; j++){
                list.add(matrix[j][right]);
            }
            right--;

            if(top <= bottom){
                for(int h = right; h >= left; h--){
                    list.add(matrix[bottom][h]);
                }
                bottom--;
            }

            if(left <= right){
                for(int g = bottom; g >= top; g--){
                    list.add(matrix[g][left]);
                }
                left++;
            }

    }
    return list;
   
}
}
