package chapter06;

/**
 * 构造器为private的类，可以阻止别人创建；但在该类的static成员内可以创建
 * 引出单例模式
 */
public class Lunch {

   void testStatic() {
       Soup1 soup1 = Soup1.makeSoup();
   }

   void testSingleton() {
       Soup2.access().f();
   }
}
