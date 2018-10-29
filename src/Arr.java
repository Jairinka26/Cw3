import java.util.ArrayList;
import java.util.List;

public class Arr {
        private List<Integer> list;
        public Arr(){
            list = new ArrayList<>();
        }

        public void mass(){
            for (int i = 0; i < 100 ; i++) {
                list.add(i);
            }

            for (int i = 0; i < 100 ; i++) {
                if (list.get(i) < 20)
                System.out.print(list.get(i)+" ");
            }
        }




}
