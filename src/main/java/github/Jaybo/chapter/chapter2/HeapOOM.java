package github.Jaybo.chapter.chapter2;

import java.util.ArrayList;

/**
 * @ClassNameHeapOOM
 * @Description TODO
 * @Author Github.KylinToDo
 * @Date 2019/9/21 19:56
 * @Version 1.0
 */
public class HeapOOM {
    static class OOMObject{}

    public static void main(String[] args) {
        ArrayList<OOMObject> list = new ArrayList<>();
        while (true){
            list.add(new OOMObject());
        }
    }
}
