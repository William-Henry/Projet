package com.example.projet;

import java.util.List;

public class RestF1Response {
    private int count;
    private String next;
    private String previous;
    private List<F1> results;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public List<F1> getResults() {
        return results;
    }

    public void setResults(List<F1> results) {
        this.results = results;
    }
}
