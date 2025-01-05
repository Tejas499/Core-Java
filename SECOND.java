import java.util.Arrays;
public class SECOND {
    public static void main(String[] args) {
        //ARRAYS
        //no garbage value assign if noot initialize it get null
//        int[] marks=new int[3];

        int[] marks={67,48,89};
//        marks[0]=67;
//        marks[1]=48;
//        marks[2]=89;
        System.out.println(marks.length);
        Arrays.sort(marks);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

    }
}
