package cn.pojo;

public class Goods {
    /**
     * 商品编号
     */
  private long gid;
    /**
     * 商品名称
     */
  private String gname;
    /**
     * 商品图片
     */
  private String gimg;
    /**
     *商品售出数量
     */
  private long gsum;
    /**
     * 商品价格
     */
  private long gmoney;
    /**
     * 商品品牌
     */
  private long gbra;
    /**
     * 商品信息
     */
  private String ginfo;
    /**
     * 商品库存
     */
  private long gnum;
    /**
     * 商品标识 0.下架 1.上架
     */
  private long glogo;
  private String ginfoimg;
  private String two;
  private String three;

  public Brand getBrand() {
    return this.brand;
  }

  public void setBrand(Brand brand) {
    this.brand = brand;
  }

  private Brand brand;


  public long getGid() {
    return gid;
  }

  public void setGid(long gid) {
    this.gid = gid;
  }


  public String getGname() {
    return gname;
  }

  public void setGname(String gname) {
    this.gname = gname;
  }


  public String getGimg() {
    return gimg;
  }

  public void setGimg(String gimg) {
    this.gimg = gimg;
  }


  public long getGsum() {
    return gsum;
  }

  public void setGsum(long gsum) {
    this.gsum = gsum;
  }


  public long getGmoney() {
    return gmoney;
  }

  public void setGmoney(long gmoney) {
    this.gmoney = gmoney;
  }


  public long getGbra() {
    return gbra;
  }

  public void setGbra(long gbra) {
    this.gbra = gbra;
  }


  public String getGinfo() {
    return ginfo;
  }

  public void setGinfo(String ginfo) {
    this.ginfo = ginfo;
  }


  public long getGnum() {
    return gnum;
  }

  public void setGnum(long gnum) {
    this.gnum = gnum;
  }


  public long getGlogo() {
    return glogo;
  }

  public void setGlogo(long glogo) {
    this.glogo = glogo;
  }

    public String getGinfoimg() {
        return this.ginfoimg;
    }

    public void setGinfoimg(String ginfoimg) {
        this.ginfoimg = ginfoimg;
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
