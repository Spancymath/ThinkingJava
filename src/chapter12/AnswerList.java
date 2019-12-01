package chapter12;

import utils.P;

/**
 * 通过异常处理错误
 */
public class AnswerList {

    public void test01() {
        try {
            throw new Exception("It's too hard.");
        } catch (Exception e) {
            P.println(e + "catch it.");
        } finally {
            P.println("finised.");
        }
    }

    public void test02() {
        AnswerList al = null;
        try {
            al.test01();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void test03() {
        int[] array = new int[10];
        int i = 0;
        try {
            while (true) {
                P.print(array[i++]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            P.println("");
            P.println(e);
        }
    }

    public void test04() {
        String x = "Inner detail.";
        Exception e = new Exception(x) {
            public String detail;
            {
                detail = x;
            }

            public String toString() {
                return detail;
            }
        };

        P.println(e.toString());

        try {
            throw new MyException("zhang");
        } catch (MyException e1) {
            P.println(e1.info);
        }
    }

    void test05() {
        int temprature = 100;
        while (true) {
            try {
                eat(temprature);
                break;
            } catch (Exception e) {
                temprature = cooling(temprature);
            }
        }

        P.println("done.");

    }

    void eat(int temprature) throws Exception {
       if (temprature > 50) {
           throw new Exception("It's too hot.");
       }
       P.println("Delicious.");
    }

    int cooling(int tempreture) {
        P.println("cooling...");
        return tempreture - 1;
    }

    void test10() {
        try {
            g();
        } catch (MyException e) {
            e.printStackTrace(System.out);
            throw new RuntimeException(e);
        }
    }

    void g() throws MyException {
        String detail = "new Exception";
        throw new MyException(detail) {
            {
                //super(detail);
                P.println(this);
            }
        };
    }

    void test21() {
        try {
            Derived derived = new Derived();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }
    }

    void address() {
        P.println(super.toString());
    }


    public static void main(String[] args) {
        AnswerList al = new AnswerList();
        //al.test01();
        //al.test02();
        //al.test03();
        //al.test04();
        //al.test05();
        /*try {
            al.test10();
        } catch (RuntimeException e) {
            e.printStackTrace(System.out);
        }*/
        //al.test10();
        //al.test21();

        //P.println(al.toString());
    }
}
