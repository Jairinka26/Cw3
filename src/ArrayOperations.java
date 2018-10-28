import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayOperations {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String getOperations(){
        boolean pr = false;
        String code=null;
        do {
            try {
                System.out.println("Ведите код операци");
                code = reader.readLine();
                if (code.equals("exit"))
                    System.exit(0);
                else if (!code.equals("sort") & !code.equals("revers"))
                    System.out.println("Неправильная команда. Возможные операции sort и revers");
                    else
                    pr = true;
            }
            catch (IOException e) {
                System.out.println("Ошибка ввода");
            }
        }while (pr == false);

        return code;
    }


}
