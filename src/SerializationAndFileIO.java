import POJO.students;

import java.io.*;

public class SerializationAndFileIO {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        students student1 = new students("Ankur",2,18,23432423);

        String Filename = "objStudent.txt";
        File file = new File(Filename);
        //Writing on a file : Serialization
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(student1);
        fos.close();
        oos.close();

        //reading on a file : De-Serialization
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        //Casting the fetched object
        students student2 = (students) ois.readObject();
        fis.close();
        ois.close();
        System.out.println("students " + student2.toString());
    }
}
