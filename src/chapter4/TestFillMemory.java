package chapter4;

import java.util.ArrayList;

/**
 * @ClassNameTestFillMemory
 * @Description TODO
 * @Author Github.KylinToDo
 * @Date 2019/9/24 14:16
 * @Version 1.0
 */
public class TestFillMemory {
    static class OOMObject{
        public byte[] placeholder=new byte[64*1024];
    }
    public static void fillHeap(int num) throws InterruptedException{
        ArrayList<OOMObject> list = new ArrayList<>();
        for (int i=0;i<num;i++){
            Thread.sleep(50);
            list.add(new OOMObject());
        }
        System.gc();
    }

    public static void main(String[] args) throws InterruptedException {
        fillHeap(1000);
    }
}
