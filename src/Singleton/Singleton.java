package Singleton;

/**
 * Created by dell on 2016/5/2.
 */
public class Singleton {

    /**
     * 第一步私有构造函数
     */
    private Singleton(){

    }
    private static class SingleHolder {
        /**
         * 第二部单例
         * 这块使用静态内部类初始化有几个好处，
         * 1.静态内部类加载时懒加载规则，所以只有使用了才会加载
         * 2.线程安全
         */
        private static Singleton single = new Singleton();
    }

    /**
     * 获取单例的方法
     * @return 单例
     */
    public static Singleton getInstance(){
        return SingleHolder.single;
    }

}
