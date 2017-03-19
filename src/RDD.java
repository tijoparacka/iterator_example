import java.util.Iterator;
import java.util.function.Function;

/**
 * Created by tijo on 19/3/17.
 */
public class RDD /*implements Iterator*/ {

    RDD parent;
    Function function;
    RDDIterator itr;

    RDD(RDD parent, Function function){
        this.parent =parent;
        this.function = function;
        this.itr = parent.itr;
    }
    RDD(RDDIterator itr){
        this.itr=itr;
    }
//
//    RDD(Function function){
//
//        this.function = function;
//
//    }

//    @Override
//    public boolean hasNext() {
//        return parentItr.hasNext();
//    }
//
//    @Override
//    public Object next() {
//        return function.apply(parentItr.next());
//
//    }

    public RDD transform(Function function){

        return new RDD(this,function);

    }
    public RDDIterator compute( ){

        return new RDDIterator() {
            @Override
            public boolean hasNext() {
               return itr.hasNext();

            }
            @Override
            public Object next() {
                return function.apply(itr.next());
            }
        };
    }

//    List call(){
//
//        while (this.hasNext()){
//           System.out.println( f.apply(this.next());
//        }
//        hasnext
//    }

}
