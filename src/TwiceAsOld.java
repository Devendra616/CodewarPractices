/*
    Your function takes two arguments:
        current father's age (years)
        current age of his son (years)
Сalculate how many years ago the father was twice as old as his son (or in how many years he will be twice as old).
 */
public class TwiceAsOld {

    public static int TwiceAsOld(int dadYears, int sonYears){

        return Math.abs(2*sonYears - dadYears);
    }

    public static void main(String[] args) {
        System.out.println(TwiceAsOld(30,7));
        System.out.println(TwiceAsOld(30,0));
        System.out.println(TwiceAsOld(53,10));
    }
}
