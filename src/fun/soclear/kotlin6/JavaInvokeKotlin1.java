package fun.soclear.kotlin6;

import java.util.ArrayList;
import java.util.List;

public class JavaInvokeKotlin1 {
    public static void main(String[] args) {
        List<String> list1 = InfluenceKt.myFilter(new ArrayList<>());
        System.out.println(list1);

        List<Integer> list2 = InfluenceKt.myFilter2(new ArrayList<>());
        System.out.println(list2);

        MyClass me = new MyClass();
        System.out.println(me.getA());
        System.out.println(me.getAValue());


        MyClass2 class20= new MyClass2(1);
        MyClass2 class21 =new MyClass2(1,"welcome");
    }
}
