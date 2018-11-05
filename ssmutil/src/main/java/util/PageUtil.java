package util;

import cn.pojo.Goods;

import java.util.ArrayList;
import java.util.List;

public class PageUtil {
    private int index;	// 当前页码
    private int pageSize;	// 每页条目数
    private int totalCount;	// 总记录数
    private int totalPageCount;	// 总页数
    private List<Goods> jList = new ArrayList<Goods>();
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    public int getPageSize() {
        return pageSize;
    }
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
    public int getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
        this.totalPageCount = totalCount % pageSize == 0
                ? totalCount / pageSize
                : (totalCount / pageSize) + 1;
    }
    public List<Goods> getjList() {
        return jList;
    }
    public void setjList(List<Goods> gList) {
        this.jList = gList;
    }
    public int getTotalPageCount() {
        return totalPageCount;
    }


}
