package github.Jaybo.chapter.chapter2;

/**
 * @ClassNameJavaVMStackOOM
 * @Description TODO
 * @Author Github.KylinToDo
 * @Date 2019/9/21 20:16
 * @Version 1.0
 */
public class JavaVMStackOOM {
    private void dontStop() {
        while (true) {
        }
    }

    public void stackLeakByThread() {
        while (true) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }

    public static void main(String[] args) {
        JavaVMStackOOM javaVMStackOOM = new JavaVMStackOOM();
        javaVMStackOOM.stackLeakByThread();
    }
}
