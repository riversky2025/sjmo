package cn.riversky.proxy.e7;

/**
 * Created by admin on 2017/12/12.
 */
public class Order {
    /**
     * 订单订购的产品名称
     */
    private String productName;
    /**
     * 订单订购的数量
     */
    private int orderNum;
    /**
     * 创建订单的人员
     */
    private String orderUser;

    public Order() {
    }

    public Order(String productName, int orderNum, String orderUser) {
        this.productName = productName;
        this.orderNum = orderNum;
        this.orderUser = orderUser;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName,String user) {
        this.productName = productName;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum,String user) {
        this.orderNum = orderNum;
    }

    public String getOrderUser() {
        return orderUser;
    }

    public void setOrderUser(String orderUser,String user) {
        this.orderUser = orderUser;
    }

    @Override
    public String toString() {
        return "Order{" +
                "productName='" + productName + '\'' +
                ", orderNum=" + orderNum +
                ", orderUser='" + orderUser + '\'' +
                '}';
    }
}
