import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner teclado = new Scanner(System.in);
        javaclass aux= new javaclass();

        System.out.println("Will we sleep in?");
        System.out.println("Is it a weekday? Type yes or no:");
        String weekday= teclado.nextLine();
        boolean wd=false;
        System.out.println("Are we on vacation? Type yes or no:");
        String vacation= teclado.nextLine();
        
        boolean vct=false;

        if (weekday.equals("yes")){
            
            wd=true;
        }

        if (vacation.equals("yes")){
            
            vct=true;
        }
        
        System.out.println(aux.sleepIn(wd, vct));
        teclado.close();
    }
}
