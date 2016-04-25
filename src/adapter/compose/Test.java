package adapter.compose;

/**
 * Created by dell on 2016/4/23.
 * 通过依赖注入 使得Adapter获得Source的printA方法 可以扩展使用Source中的其他方法 ，如果全部使用的话并且没有包依赖问题可以通过继承适配
 */
public class Test {
    public static void main(String[] args) {
        adapter.compose.ITargetable iTargetable = new adapter.compose.Adapter(new Source());
        iTargetable.printA();
        iTargetable.printB();
    }
}
