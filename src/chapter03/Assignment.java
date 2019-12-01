package chapter03;

/**
 * 对基本数据类型和对象复制的的不同
 */
public class Assignment {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 47;
        System.out.println("t1: " + t1.level + ", t2: " + t2.level);
        t1 = t2;
        System.out.println("t1: " + t1.level + ", t2: " + t2.level);
        t1.level = 27;
        System.out.println("t1: " + t1.level + ", t2: " + t2.level);
    }
}

class Tank {
    int level;
}
