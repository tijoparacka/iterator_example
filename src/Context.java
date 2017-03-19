import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by tijo on 19/3/17.
 */
public class Context {

    public static RDD parallelize(ArrayList list){
       Iterator listItr =  list.iterator();
        RDDIterator  itr = new RDDIterator(){

            @Override
            public boolean hasNext() {
                return listItr.hasNext();
            }

            @Override
            public Object next() {
                return listItr.next();
            }
        };
        return new RDD(itr);
    }
}
