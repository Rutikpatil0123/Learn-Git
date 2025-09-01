package Example_Recursion;

public class Factorial {

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.factorial_Of_Number(5));
    }

    public int factorial_Of_Number(int n){

        if(n == 1 ){
            return 1;
        }

        return factorial_Of_Number(n-1)*n;
    }
}
