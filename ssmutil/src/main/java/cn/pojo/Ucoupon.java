package cn.pojo;

public class Ucoupon {
  /**
   * 编号
   */
  private Integer ucid;
  /**
   * 优惠券编号
   */
  private Integer cid;
  /**
   * 用户编号
   */
  private Integer uname;
  /**
   * 生效时间
   */
  private java.sql.Timestamp start;
  /**
   * 过期时间
   */
  private java.sql.Timestamp end;
  /**
   * 优惠券标识 0.未领取 1.已领取
   */
  private Integer colo;
  /**
   * 用户所有劵标识 0.未使用 1.被占用 2.已使用
   */
  private Integer uclogo;
  private String one;
  private String two;
  private String three;


  public Integer getUcid() {
    return ucid;
  }

  public void setUcid(Integer ucid) {
    this.ucid = ucid;
  }


  public Integer getUcname() {
    return uname;
  }

  public void setUcname(Integer ucname) {
    this.uname = ucname;
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


  public Integer getColo() {
    return colo;
  }

  public void setColo(Integer colo) {
    this.colo = colo;
  }


  public Integer getUclogo() {
    return uclogo;
  }

  public void setUclogo(Integer uclogo) {
    this.uclogo = uclogo;
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
