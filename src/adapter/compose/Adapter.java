package adapter.compose;

/**
 * Created by dell on 2016/4/23.
 */
public class Adapter implements  ITargetable{
    private  Source source;
    //依赖注入
    public Adapter(Source source){
        this.source =source;
    }
    public void  printA(){
        source.printA();
    }
    public void printB(){
        System.out.println("this is compose Adapter B");
    }
}
