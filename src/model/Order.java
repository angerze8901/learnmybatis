package model;

/**
 * @Description:
 * @author:wangze
 * @CreateDate: 2016Äê6ÔÂ21ÈÕ
 * @version: V1.0
 */
public class Order
{
    private int id;

    private String orderNo;

    private float price;

    public Order(final int id, final String orderNo, final float price)
    {
        super();
        this.id = id;
        this.orderNo = orderNo;
        this.price = price;
    }

    public Order()
    {
        super();
    }

    public int getId()
    {
        return id;
    }

    public void setId(final int id)
    {
        this.id = id;
    }

    public String getOrderNo()
    {
        return orderNo;
    }

    public void setOrderNo(final String orderNo)
    {
        this.orderNo = orderNo;
    }

    public float getPrice()
    {
        return price;
    }

    public void setPrice(final float price)
    {
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "Order [id=" + id + ", orderNo=" + orderNo + ", price=" + price + "]";
    }

}
