package github.Jaybo.chapter.chapter2;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @ClassNameDirectMemoryOOM
 * @Description TODO
 * @Author Github.KylinToDo
 * @Date 2019/9/21 22:53
 * @Version 1.0
 */
public class DirectMemoryOOM {
    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) throws Exception {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);
        while (true) {
            unsafe.allocateMemory(_1MB);
        }
    }
}
