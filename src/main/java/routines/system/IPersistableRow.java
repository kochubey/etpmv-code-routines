package routines.system;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public interface IPersistableRow<R> {

    void writeData(ObjectOutputStream out);

    void readData(ObjectInputStream in);

}
