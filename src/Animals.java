import java.util.Scanner;

public interface Animals {
    static Scanner sc = new Scanner(System.in);

    public void name();

    public void  years();

    static void finish() {
        sc.close();
    }


}


