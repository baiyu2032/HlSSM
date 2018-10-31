package cn.pojo;

public class Ucoupon {

  private long ucid;
  private long ucname;
  private java.sql.Timestamp uctime;
  private java.sql.Timestamp start;
  private java.sql.Timestamp end;
  private long uclogo;
  private String one;
  private String two;
  private String three;


  public long getUcid() {
    return ucid;
  }

  public void setUcid(long ucid) {
    this.ucid = ucid;
  }


  public long getUcname() {
    return ucname;
  }

  public void setUcname(long ucname) {
    this.ucname = ucname;
  }


  public java.sql.Timestamp getUctime() {
    return uctime;
  }

  public void setUctime(java.sql.Timestamp uctime) {
    this.uctime = uctime;
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


  public long getUclogo() {
    return uclogo;
  }

  public void setUclogo(long uclogo) {
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
