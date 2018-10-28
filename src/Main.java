public class Main {
    public static void main(String[] args) {
        init();
    }

    public static void init() {

        ArrayCreation ac = new ArrayCreation();
        ArrayOperations ao = new ArrayOperations();

        do {
            int lenght = ac.getLenght();
            int array[] = new int[lenght];
            array = ac.getElements(lenght);
            String code;
            code = ao.getOperations();
            switch (code) {
                case "sort":
                    int move, pr;
                    do {
                        pr = 0;
                        for (int i = 0; i < lenght - 1; i++) {
                            if (array[i] > array[i + 1]) {
                                move = array[i];
                                array[i] = array[i + 1];
                                array[i + 1] = move;
                                pr++;
                            }
                        }
                    } while (pr != 0);

                    for (int i = 0; i < lenght; i++) {
                        System.out.print(array[i] + " ");
                    }
                    System.out.println();
                    break;
                case "revers": {
                    int array_r[] = new int[lenght];
                    int j = lenght - 1;
                    for (int i = 0; i < lenght; i++) {
                        array_r[i] = array[j];
                        j--;
                    }
                    for (int i = 0; i < lenght; i++) {
                        System.out.print(array_r[i] + " ");
                    }
                    System.out.println();
                    break;
                }
            }
        }while (1==1);
    }
}
