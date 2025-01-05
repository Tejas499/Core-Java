public class RECURSION
{
    public static int BIN_TO_DEC(int n){
        int num=0;
        int bit=0;
        int i=0;
        while(n!=0){
            bit=n%10;
            if(bit==1){
                num+=(int)Math.pow(2,i);

            }
            i++;
            n=n/10;
        }
        return num;
    }
    public static void increment(int n){
        n++;
    }
    public static void main(String[] args) {
//        System.out.println(BIN_TO_DEC(1010));
//        int n=9;
//        increment(n);
//        System.out.println(n);
    }
}
