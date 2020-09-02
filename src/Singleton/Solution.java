package Singleton;

public class Solution {
    public static void main(String[] args) {
        Singleton singleton = new Singleton();
        System.out.println(singleton);
        singleton = new Singleton();
        System.out.println(singleton);
//
        Singleton1 singleton1 = Singleton1.getInstance();
        System.out.println(singleton1);
        singleton1 = Singleton1.getInstance();
        System.out.println(singleton1);
//
//        Singleton2 singleton2 = Singleton2.getInstance();
//        System.out.println(singleton2);
//        singleton2 = Singleton2.getInstance();
//        System.out.println(singleton2);
//
//        Singleton3 singleton3 = Singleton3.getInstance();
//        System.out.println(singleton3);
//        singleton3 = Singleton3.getInstance();
//        System.out.println(singleton3);


//        Test1 t = new Test1();
//        Test1 t2 = new Test1();
//        Test1 t3 = new Test1();
//        Thread tt = new Thread(t);
//        Thread tt2 = new Thread(t2);
//        Thread tt3 = new Thread(t3);
//        Thread tt4 = new Thread(t);
//        Thread tt5 = new Thread(t);
//        tt.start();
//        tt2.start();
//        tt3.start();
//        tt4.start();
//        tt5.start();
    }
}
