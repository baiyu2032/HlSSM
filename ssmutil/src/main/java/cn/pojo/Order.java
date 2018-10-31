package cn.pojo;

public class Order {

  private long oid;
  private long onum;
  private long ogoods;
  private long ouser;
  private String olocal;
  private java.sql.Timestamp ostart;
  private java.sql.Timestamp oend;
  private long ologo;
  private String one;
  private String two;
  private String three;


  public long getOid() {
    return oid;
  }

  public void setOid(long oid) {
    this.oid = oid;
  }


  public long getOnum() {
    return onum;
  }

  public void setOnum(long onum) {
    this.onum = onum;
  }


  public long getOgoods() {
    return ogoods;
  }

  public void setOgoods(long ogoods) {
    this.ogoods = ogoods;
  }


  public long getOuser() {
    return ouser;
  }

  public void setOuser(long ouser) {
    this.ouser = ouser;
  }


  public String getOlocal() {
    return olocal;
  }

  public void setOlocal(String olocal) {
    this.olocal = olocal;
  }


  public java.sql.Timestamp getOstart() {
    return ostart;
  }

  public void setOstart(java.sql.Timestamp ostart) {
    this.ostart = ostart;
  }


  public java.sql.Timestamp getOend() {
    return oend;
  }

  public void setOend(java.sql.Timestamp oend) {
    this.oend = oend;
  }


  public long getOlogo() {
    return ologo;
  }

  public void setOlogo(long ologo) {
    this.ologo = ologo;
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
