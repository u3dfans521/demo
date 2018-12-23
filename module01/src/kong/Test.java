package kong;/*
 @Author: peter   
 @date 2018/12/21-22:15
*/

import java.util.ArrayList;

public class Test {
    public static final int tt = 123;
    public static final int zz = 999;
    public static final String ss = "清流";
    private static final int xx = 887;

    public static void main(String[] args) {
        System.out.println("狗蛋");
        System.out.println("args = [" + args + "]");
        System.out.println("Test.main");
        demo();
    }

    public static void demo() {
        int xx = 123;
        System.out.println("Test.demo");
        System.out.println("xx = " + xx);
        System.out.println("-----------------");
        System.out.println(xx);
        System.out.println("-----------------");
        System.out.println("牛逼");
        String[] arr = new String[]{"peter", "iwen", "jack", "tom"};
        System.out.println("************************");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("************************");
        for (String s : arr) {
            System.out.println(s);
        }
        System.out.println("---------------------");
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        ArrayList li = new ArrayList();
        li.add(111);
        li.add(222);
        li.add(333);
        for (Object o : li) {
            System.out.println(o);
        }
        System.out.println("##############");
        for (int i = 0; i < li.size(); i++) {

        }
        for (int i = li.size() - 1; i >= 0; i--) {

        }
//        条件判断语句的执行
        boolean jst = true;
        if (li == null) {
            System.out.println("empty");
        }
        if (li != null) {
            System.out.println("好的");
        }
        if (li != null) {

        }

        if (li == null) {

        }


    }
}
