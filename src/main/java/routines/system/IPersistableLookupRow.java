package routines.system;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public interface IPersistableLookupRow<R> {

    void writeKeysData(ObjectOutputStream out);

    void readKeysData(ObjectInputStream in);

    void writeValuesData(DataOutputStream dataOut, ObjectOutputStream objectOut);

    void readValuesData(DataInputStream dataIn, ObjectInputStream objectIn);

    void copyDataTo(R other);

    void copyKeysDataTo(R other);

}
