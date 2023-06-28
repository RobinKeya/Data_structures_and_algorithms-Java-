package Hard;

public class CountTwos {
    private int countTwos(int n){
        int count =0;
        for (int i =0; i<=n; i++){
            String tmp = String.valueOf(i);
            for (int y = 0; y< tmp.length(); y++){
                if (tmp.charAt(y)== '2'){
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args){
        CountTwos obj = new CountTwos();
        System.out.print(obj.countTwos(25));
    }
}
