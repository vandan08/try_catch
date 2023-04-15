import java.util.*;
public class exam2 {
    public static void main(String[] args) {
        int a=1020;
        int b =0;
        try {
            int c = a/b;
            System.out.println(c);
        }

        catch (Exception e){
            System.out.println("We failed to divide. Reason :"+e);
        }

        System.out.println("Byee byeee ");
    }
}



