/**
 * Created by Катя on 30.01.2017.
 */
import java.io.File;
import java.util.List;

public interface DAO <T> {
    boolean add(T t);
    boolean edit(T t);
    boolean remove(T t);
    List<T> getBase();
}
