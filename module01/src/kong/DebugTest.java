package kong;/*
 @Author: peter   
 @date 2018/12/23-16:53
*/

import java.util.HashMap;

public class DebugTest {
    public static void main(String[] args) {
        int var1=999;
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        HashMap<String,String> hmap=new HashMap<>();
        hmap.put("name","peter");
        hmap.put("age","25");
        hmap.put("country","UK");
        hmap.put("major","computer");
//        全部初始化完毕;
        String str=hmap.get("country");
        System.out.println("str = " + str);
        //移除某个项目；
        hmap.remove("major");
        System.out.println(hmap);
    }
}
