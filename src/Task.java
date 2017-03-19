import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;

/**
 * Created by tijo on 19/3/17.
 */
public class Task {
    RDD rdd  ;

    Task(RDD rdd ){
        this.rdd = rdd;
    }
    /*@Override
    public Iterator iterator() {
        return null;
    }*/

    void call(){

        RDDIterator itr = rdd.compute();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }


}


