package com.carazem.web;

import java.util.List;

/**
 * Created by RENT on 2016-07-26.
 */
public class PaginatedData<T> {

    private int size;

    private List<T> data;

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
