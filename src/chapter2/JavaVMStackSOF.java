package chapter2;

/**
 * @ClassNameJavaVMStackSOF
 * @Description TODO
 * @Author Github.KylinToDo
 * @Date 2019/9/21 20:05
 * @Version 1.0
 */
public class JavaVMStackSOF {
    private int stackLength=1;
    private void stackLeak(){
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVMStackSOF oom=new JavaVMStackSOF();
        try {
            oom.stackLeak();
        }catch (Throwable e){
            System.out.println("stack length: "+oom.stackLength);
            throw e;
        }
    }
}
