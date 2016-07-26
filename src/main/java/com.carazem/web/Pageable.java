package com.carazem.web;

/**
 * Created by RENT on 2016-07-26.
 */
public class Pageable {

    private enum sortType {ASC, DESC};

    private int page;

    private int size;

    private sortType sortDir;

    public int offset(){
        return page * size;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public sortType getSortDir() {
        return sortDir;
    }

    public void setSortDir(sortType sortDir) {
        this.sortDir = sortDir;
    }
}