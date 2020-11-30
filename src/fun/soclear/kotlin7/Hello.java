package fun.soclear.kotlin7;


import java.io.FileNotFoundException;

public class Hello {
    public static void main(String[] args) throws FileNotFoundException {
        MyClass myClass= new MyClass();
        try {
            myClass.method();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
