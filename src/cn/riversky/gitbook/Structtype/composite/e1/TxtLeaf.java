package cn.riversky.gitbook.Structtype.composite.e1;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/4.
 */
public class TxtLeaf extends Kongjian {
    private String name;
    public TxtLeaf(String name) {
        this.name=name;
    }

    @Override
    void visit() {
        System.out.println("TxtLeaf:"+name);
    }
}
