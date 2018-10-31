package cn.pojo;


import java.util.ArrayList;
import java.util.List;

public class Brand {

  private long bid;
  private String bname;
  private String one;
  private String two;
  private String three;
  private List<Goods> glist=new ArrayList<Goods>();

  public List<Goods> getGlist() {
    return this.glist;
  }

  public void setGlist(List<Goods> glist) {
    this.glist = glist;
  }

  public long getBid() {
    return bid;
  }

  public void setBid(long bid) {
    this.bid = bid;
  }


  public String getBname() {
    return bname;
  }

  public void setBname(String bname) {
    this.bname = bname;
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
