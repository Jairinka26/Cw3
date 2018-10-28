import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayCreation {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int lenght;
    int[] array;

    int getLenght(){
        boolean pr = false;
        do {
            try {
                System.out.println("Ведите длину массива");
                lenght = Integer.parseInt(reader.readLine());
                pr = true;
            }
            catch (NumberFormatException e) {
                System.out.println("Длина массива должна быть целым числом");
            }
            catch (IOException e) {
                System.out.println("Ошибка ввода");
            }
        }while (pr == false);
        return lenght;
    }

    int[] getElements(int alenght){
        array = new int[alenght];
        boolean pr1;
        int element=0;
        for (int i = 0; i < alenght ; i++) {
            pr1=false;
            do {
                try {
                    System.out.println("Ведите элемент массива");
                    element = Integer.parseInt(reader.readLine());
                    pr1=true;
                } catch (NumberFormatException e) {
                    System.out.println("Элемент должен быть целым числом");
                } catch (IOException e) {
                    System.out.println("Ошибка ввода");
                }
                array[i] = element;
            } while (pr1 == false);
        }
        return array;
    }
}
