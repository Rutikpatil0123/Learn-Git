package Array;

public class  Set_Matrix_Zeroes {

    public static void main(String[] args) {
        Integer[][] testOne = solution(new Integer[][] {{1,1,1},{1,0,1},{1,1,1}});
        printMatrix(testOne);

        Integer[][] testTwo = solution(new Integer[][] {{0,1,2,0},{3,4,5,2},{1,3,1,5}});
        printMatrix(testTwo);

        Integer[][] testThree = optimizedSolution(new Integer[][] {{1,1,1},{1,0,1},{1,1,1}});
        printMatrix(testThree);

        Integer[][] testFour = optimizedSolution(new Integer[][] {{0,1,2,0},{3,4,5,2},{1,3,1,5}});
        printMatrix(testFour);


    }

    public static Integer[][] solution(Integer[][] nums){

        Boolean[][] flag = new Boolean[nums.length][nums[0].length];
       
        for(Integer i = 0; i < flag.length; i++){
            for(Integer j = 0; j < flag[0].length; j++){
                flag[i][j] = false;
            }
        }
        Integer [][] ans = new Integer[nums.length][nums[0].length];

        for(Integer i = 0; i < nums.length; i++){
            for(Integer j = 0; j < nums[i].length; j++){

                if(nums[i][j] == 0){
                    for(Integer a = 0; a < nums.length; a++){
                        flag[a][j] = true;
                    }

                    for(Integer b = 0; b < nums[0].length; b++){
                        flag[i][b] = true;
                    }
                }
            }
        }

        for(Integer i = 0; i < flag.length; i++){
            for(Integer j = 0; j < flag[0].length; j++){
                if(flag[i][j] == true){
                    ans[i][j] = 0;
                }else{
                    ans[i][j] = 1;
                }
            }
        }
        printMatrix(flag);
        return ans;
    }

    public static <T> void printMatrix(T[][] matrix){

        for(Integer i = 0; i < matrix.length; i++){
            for(Integer j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " -> ");
            }
            System.out.println();
        }
    }

    public static Integer[][] optimizedSolution(Integer[][] matrix){
        Boolean[] column = new Boolean[matrix[0].length];
        Boolean[] row = new Boolean[matrix.length];

        for(Integer i = 0 ; i < row.length; i++){
            row[i] = false;
        }

        for(Integer i = 0 ; i < column.length; i++){
            column[i] = false;
        }

        for(Integer i = 0; i < matrix.length; i++){
            for(Integer j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        for(Integer i = 0; i < matrix.length; i++){
            for(Integer j = 0; j < matrix[0].length; j++){
                if(row[i] || column[j]){
                    matrix[i][j] = 0;
                }
            }
        }

        System.out.println("Check ans");

        return matrix;
    }

    }

    /*
        Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0. You must do it in place.
Examples:

Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]

Output: [[1,0,1],[0,0,0],[1,0,1]]

Explanation:

Element at position (1,1) is 0, so set entire row 1 and column 1 to 0.

Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]

Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]

Explanation:

There are two zeroes: (0,0) and (0,3).

    Row 0 → all elements become 0
    Column 0 and column 3 → all elements become 0
    */
   


