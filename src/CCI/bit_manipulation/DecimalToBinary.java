package CCI.bit_manipulation;

public class DecimalToBinary {
    private static String convertToBinary(double n){
        if (n < 0 || n > 1)return "ERROR";
        StringBuilder results = new StringBuilder();
        results.append("0.");
        while (n !=0){
            if (results.length() > 32) return "ERROR";
            double tmp = n *2;
            if (tmp >= 1){
                results.append("1");
                n = tmp -1;
            }else {
                results.append("0");
                n = tmp;
            }
        }
        return results.toString();
    }
    public static void main(String[] args){
        System.out.print(convertToBinary(0.75));
    }
}
