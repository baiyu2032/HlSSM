package cn.pojo;

public class Ucouponlogo {
  /**
   * 编号
   */
  private long ucid;
  /**
   * 用户所有劵标识 0.未使用 1.被占用 2.已使用
   */
  private String ucname;


  public long getUcid() {
    return ucid;
  }

  public void setUcid(long ucid) {
    this.ucid = ucid;
  }


  public String getUcname() {
    return ucname;
  }

  public void setUcname(String ucname) {
    this.ucname = ucname;
  }

}
