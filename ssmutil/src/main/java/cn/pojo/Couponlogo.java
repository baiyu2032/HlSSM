package cn.pojo;

public class Couponlogo {
  /**
   * 编号
   */
  private Integer clid;
  /**
   * 优惠券状态 0.未领取 1.已领取
   */
  private String clname;


  public Integer getClid() {
    return clid;
  }

  public void setClid(Integer clid) {
    this.clid = clid;
  }


  public String getClname() {
    return clname;
  }

  public void setClname(String clname) {
    this.clname = clname;
  }

}
