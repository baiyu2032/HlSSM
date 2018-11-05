package cn.pojo;

public class User {
  /**
   * 用户编号
   */
  private long uid;
  /**
   * 微信唯一标识
   */
  private String uopenid;

  /**
   * 用户名
   */
  private String uname;


  /**
   * 退货售后
   */
  private String uafter;
  /**
   * 用户标识
   */
  private String ulogo;
  /**
   * 用户码
   */
  private String usernum;
  /**
   * 冗余2
   */
  private String two;
  /**
   * 冗余3
   */
  private String three;


  public long getUid() {
    return uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
  }


  public String getUopenid() {
    return uopenid;
  }

  public void setUopenid(String uopenid) {
    this.uopenid = uopenid;
  }


  public String getUname() {
    return this.uname;
  }

  public void setUname(String uname) {
    this.uname = uname;
  }


  public String getUafter() {
    return uafter;
  }

  public void setUafter(String uafter) {
    this.uafter = uafter;
  }


  public String getUlogo() {
    return ulogo;
  }

  public void setUlogo(String ulogo) {
    this.ulogo = ulogo;
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

  public String getUsernum() {
    return usernum;
  }

  public void setUsernum(String usernum) {
    this.usernum = usernum;
  }
}
