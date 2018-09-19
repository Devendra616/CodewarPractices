import java.util.ArrayList;
import java.util.List;

public class BinaryArrayToNumber {

   /* public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        String res = "";
        for (int i : binary)
            res += i;

        return Integer.parseInt(res, 2);
    }*/

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {

        int size = binary.size();
        int number=0;
        for(int i=0;i<size;i++){
            if(binary.get(i) == 1)
                number += Math.pow(2,size-i-1);
        }

        return number;
    }

    public static void main(String[] args) {
        List<Integer> lst= new ArrayList<>();
        lst.add(1);lst.add(0);lst.add(1);lst.add(1);lst.add(0);
        int res = ConvertBinaryArrayToInt(lst);
        System.out.print(res);
    }

}
