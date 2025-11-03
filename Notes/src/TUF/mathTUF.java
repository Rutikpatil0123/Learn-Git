package Math;



public class mathTUF {

    public static void main(String[] args) {
        //System.out.println("Hello");
        //System.out.println(findGCD(9, 12));
        //System.out.println(findGCD(11, 14));
        //System.out.println(OptimisedGCD(9, 12));
        //System.out.println(OptimisedGCD(11, 14));
        System.out.println(checkAmstringNumber(153));
       // System.out.println(checkPrimeNumebr(13));
       // System.out.println(checkPrimeNumebrOptimsed(11));
        System.out.println();
        printDivisorsOfNumber(54);

    }

    // Problem Statement: Given two integers N1 and N2, find their greatest common divisor.
    public static Integer findGCD(Integer a, Integer b){
        Integer ans = 1;

        for(Integer i = 1; i < Math.min(a, b); i++){
            if(a % i == 0 && b % i == 0){
                ans = i;
            }
        }

        return ans;

    }

    public static Integer OptimisedGCD(Integer a, Integer b){

        while (a > 0 && b > 0) {

            if(a > b){
                a = a%b;
            }else{
                b = b%a;
            }
        }
            if(a == 0){
                return b;
            }
            return a;
         
    }

    //Problem Statement: Given an integer N, return true it is an Armstrong number otherwise return false.

    //An Amrstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

    public static boolean checkAmstringNumber(Integer inpuInteger){

        Integer ans = 0;
        Integer power = countDigits(inpuInteger);
        System.out.println(power);
        Integer temp = inpuInteger;

        while (temp > 0) {
            Integer tempOne = temp%10;
            temp = temp/10;
            Double d =  Math.pow(tempOne, power);
            tempOne = d.intValue();
            ans += Integer.valueOf(tempOne);
           
        }
   
        System.out.println(ans);
        System.out.println(inpuInteger);
        if(ans.equals(inpuInteger)){
            return true;
        }

        return false;
    }

    public static Integer countDigits(Integer temp){
        Integer ans = 0;

        while (temp != 0) {
            ans++;
            temp = temp/10;
        }

        return ans;
    }

    // Problem Statement: Given an integer N, check whether it is prime or not. A prime number is a number that is only divisible by 1 and itself and the total number of divisors is 2.

    public static boolean checkPrimeNumebr(Integer inputInteger){
        boolean answer = true;
        for(Integer index = 2; index <= inputInteger/2; index++){
           
            if(inputInteger % index == 0){
                answer = false;
                return answer;
            }
        }
        return answer;
    }

    public static boolean checkPrimeNumebrOptimsed(Integer inputNuInteger){
        boolean answer = true;

        for(Integer i = 2; i < Math.sqrt(inputNuInteger); i++){
            if(inputNuInteger % i == 0){
                answer = false;
                return answer;
            }
        }

        return answer;
    }


    // Problem Statement: Given an integer N, return all divisors of N

    public static void printDivisorsOfNumber(Integer inputNInteger){
       
        for(Integer index = 1; index <= inputNInteger; index++){

           if (inputNInteger % index == 0) {

                System.out.print(index + "-> ");
           
           }
        }
    }
       
}
