import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class Saver {
    public static void serialize() throws IOException {
        // kyc k=new Kyc();

        ObjectOutputStream out=null;
        try {
            out=new ObjectOutputStream(new FileOutputStream("out.txt"));
        }
        finally {
            out.close();
        }
    }

    public static void deserialize() throws IOException, ClassNotFoundException {
        ObjectInputStream in=null;
        try {
            in=new ObjectInputStream(new FileInputStream("out.txt"));
        }
        finally {
            in.close();
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        serialize();
        deserialize();
    }
}