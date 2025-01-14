import java.util.ArrayList;
import java.util.List;
public class MyProgram {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        for (int i=0;i<50;i++){
            list.add(i);
        }

        for (int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }


    }
}
