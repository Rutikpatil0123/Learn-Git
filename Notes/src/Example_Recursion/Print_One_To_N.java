package Example_Recursion;

public class Print_One_To_N {

    public static void main(String[] args) {
        Print_One_To_N p = new Print_One_To_N();
        p.print_Zero_To_N(5);
        p.print_N_To_Zero(6);
    }

    public void print_Zero_To_N(int n){

        if( n == 0){
            return;
        }
        print_Zero_To_N(n-1);

        System.out.println(n);
    }

    public void print_N_To_Zero(int n){

        if(n == 0){
            return;
        }

        System.out.println(n);

        print_N_To_Zero(n-1);
    }
}
