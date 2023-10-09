package com.smartosc.common.response;

import com.github.pagehelper.PageInfo;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class BaseResponsePage <T> implements Serializable {
    /**
     * 页号
     */
    private Integer pageNum;
    /**
     * 页大小
     */
    private Integer pageSize;
    /**
     * 总页数
     */
    private Integer totalPage;
    /**
     * 结果总数
     */
    private Long total;
    /**
     * 结果数据
     */
    private List<T> list;

    public static <T> BaseResponsePage<T> pagination(List<T> list, int pageNum, int pageSize, long totalRecord) {
        BaseResponsePage<T> result = new BaseResponsePage<T>();

        int totalPage = (int) Math.ceil(totalRecord / pageSize);
        int currentPageNum = totalPage >= pageNum ? pageNum : 1;
        result.setTotalPage(totalPage);
        result.setPageNum(currentPageNum);
        result.setPageSize(pageSize);
        result.setTotal(totalRecord);
        result.setList(list);

        return result;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BaseResponsePage)) {
            return false;
        }
        BaseResponsePage<?> that = (BaseResponsePage<?>) o;
        return getPageNum().equals(that.getPageNum()) &&
                getPageSize().equals(that.getPageSize()) &&
                getTotalPage().equals(that.getTotalPage()) &&
                getTotal().equals(that.getTotal()) &&
                getList().equals(that.getList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPageNum(), getPageSize(), getTotalPage(), getTotal(), getList());
    }

    @Override
    public String toString() {
        return "CommonPage{" +
                "pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                ", totalPage=" + totalPage +
                ", total=" + total +
                ", list=" + list +
                '}';
    }
}
