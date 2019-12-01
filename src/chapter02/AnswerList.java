package chapter02;

/**
 * 一切都是对象
 */
public class AnswerList {

    int i;
    char c;

    static int t08;

    public void test01() {
        System.out.println(i);//0
        System.out.println(c);//null
        System.out.println('\u0000');//null
    }

    /**
     * static域只有一个实例
     */
    public void test08() {
        AnswerList[] als = new AnswerList[100];
        for (int i = 0; i < als.length; i++) {
            als[i].t08 = i;
        }
        for (int i = 0; i < als.length; i++){
            System.out.println(als[i].t08);
        }
    }

    /**
     * 打印命令行参数
     */
    public void test10(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

    /**
     * 主方法
     * @param args
     */
    public static void main(String[] args) {
        int x = 12;
        {
            //int x = 36; //error
        }
        AnswerList al = new AnswerList();
        //al.test01();
        //al.test08();
        al.test10(args);
    }
}
