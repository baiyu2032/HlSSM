package cn.pojo;

public class Order {
  /**
   * 订单ID
   */
  private long oid;
  /**
   * 订单编号
   */
  private String onum;
  /**
   * 订单商品
   */
  private long ogoods;
  /**
   * 订单地址
   */
  private String olocal;
  /**
   * 订单标识
   */
  private long ologo;
  /**
   * 订单备注
   */
  private String oremark;
    /**
     * 订单生成日期
     */
  private String odate;
    /**
     * 订单运费
     */
  private int ofreight;
    /**
     * 订单优惠券
     */
  private String ocoupon;

  public long getOid() {
    return oid;
  }
  public void setOid(long oid) {
    this.oid = oid;
  }

  public String getOnum() {
    return onum;
  }
  public void setOnum(String onum) {
    this.onum = onum;
  }
  public long getOgoods() {
    return ogoods;
  }
  public void setOgoods(long ogoods) {
    this.ogoods = ogoods;
  }
  public String getOlocal() {
    return olocal;
  }
  public void setOlocal(String olocal) {
    this.olocal = olocal;
  }
  public long getOlogo() {
    return ologo;
  }
  public void setOlogo(long ologo) {
    this.ologo = ologo;
  }
  public String getOremark() {
    return oremark;
  }
    public String getOdate() {
        return odate;
    }
    public void setOdate(String odate) {
        this.odate = odate;
    }
    public int getOfreight() {
        return ofreight;
    }
    public void setOfreight(int ofreight) {
        this.ofreight = ofreight;
    }
    public String getOcoupon() {
        return ocoupon;
    }
    public void setOcoupon(String ocoupon) {
        this.ocoupon = ocoupon;
    }
}
