import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1 );
        arr.add(2);
        Function function1 = new Function() {
            @Override
            public Object apply(Object o) {
                return ((int)o +2);
            }
        };
        Function function2 = new Function() {
            @Override
            public Object apply(Object o) {
                return ((int)o * 10);
            }
        };

       ArrayList<Integer> ar =  new ArrayList<Integer>();
       ar.add(1);
       ar.add(2);
        RDD rdd1 =Context.parallelize(ar);
        RDD rdd2 = rdd1.transform(function2 );
        Task t = new Task(rdd2);
        t.call();
    }
}
