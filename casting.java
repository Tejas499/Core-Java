public class casting {
    public static void main(String[] args) {
        //small to big aalowed but not big to small
       //explicit casting
        float before= 123.10F;
        System.out.println(before);
        int after=(int)before;
        System.out.println(after);
        //implicit casting
        int first=4;
        System.out.println(first);
        float last=first;
        System.out.println(last);

        //constant variables
        float PI=3.14F;
        PI++;


    }
}
