public class ExceptionHandling {

    public static void main(String[] args) {
        int[] marks={67,48,89};
        int i=5;//0
        int j=0;
        try{
            j=10/i;
            System.out.println(i);
            System.out.println(marks[i]);

        }
        catch(ArithmeticException e){
            System.out.println(" ARIIHEMETIC HAPPENING ");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("LiMiT ME REH LE BHAI");

        }
        catch(Exception e){//parent exception class
            System.out.println(" EXCEPTION HERE : "+ e);
        }
        System.out.println("j::"+j);
        System.out.println(" DONE ");
        
    }
       
}