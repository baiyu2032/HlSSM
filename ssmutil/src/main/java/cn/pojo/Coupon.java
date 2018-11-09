package cn.pojo;

public class Coupon {
  /**
   * 优惠券ID
   */
  private Integer cid;
  /**
   * 优惠券名称
   */
  private String cname;
  /**
   * 发放数量
   */
  private Integer num;
  /**
   * 订单满减
   */
  private double sum;
  /**
   * 每人限领 0.不限量
   */
  private Integer maxget;
  /**
   * 生效时间
   */
  private java.sql.Timestamp start;
  /**
   * 过期时间
   */
  private java.sql.Timestamp end;
  /**
   * 使用描述
   */
  private String cinfo;
  /**
   * 冗余数据
   */
  private String one;
  private String two;
  private String three;

  public Integer getCid() {
    return cid;
  }

  public void setCid(Integer cid) {
    this.cid = cid;
  }

  public String getCname() {
    return cname;
  }

  public void setCname(String cname) {
    this.cname = cname;
  }

  public Integer getNum() {
    return num;
  }

  public void setNum(Integer num) {
    this.num = num;
  }

  public double getSum() {
    return sum;
  }

  public void setSum(double sum) {
    this.sum = sum;
  }

  public Integer getMaxget() {
    return maxget;
  }

  public void setMaxget(Integer maxget) {
    this.maxget = maxget;
  }

  public java.sql.Timestamp getStart() {
    return start;
  }

  public void setStart(java.sql.Timestamp start) {
    this.start = start;
  }

  public java.sql.Timestamp getEnd() {
    return end;
  }

  public void setEnd(java.sql.Timestamp end) {
    this.end = end;
  }

  public String getCinfo() {
    return cinfo;
  }

  public void setCinfo(String cinfo) {
    this.cinfo = cinfo;
  }

  public String getOne() {
    return one;
  }

  public void setOne(String one) {
    this.one = one;
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
