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
  private String two;
  private String three;


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

  public void setOremark(String oremark) {
    this.oremark = oremark;
  }

  public String getTwo() {
    return two;
  }

  public void setTwo(String two) {
    this.two = two;
  }

  public String getThree() {
    return three;
  }

  public void setThree(String three) {
    this.three = three;
  }

}
