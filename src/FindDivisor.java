public class FindDivisor {

    public static void main(String[] args) {
        long res;
        res= numberOfDivisors(30);
        System.out.println(" No of divisors of 30=>"+res);
        res= numberOfDivisors(12);
        System.out.println(" No of divisors of 12=>"+res);
        res= numberOfDivisors(39);
        System.out.println(" No of divisors of 39=>"+res);
        res= numberOfDivisors(45);
        System.out.println(" No of divisors of 45=>"+res);
    }

    public static long numberOfDivisors(int n) {
        //1 and n are default divisors so nDiv = 2 initially
        if(n== 0)
            return 0;

        long nDiv = 2;
        for(long i=2;i<=n/i;i++){
            if(n %i == 0){
                nDiv +=2; //directly considering  divisiors a and n/a
            }
        }
        return nDiv;
    }
}
