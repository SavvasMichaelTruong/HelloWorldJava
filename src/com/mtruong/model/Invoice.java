package com.mtruong.model;

import java.util.Date;

public class Invoice {
    private String title;
    private Date date;
    private double value;

    public Invoice(String title, Date date, double value) {
        this.title = title;
        this.date = date;
        this.value = value;
//        System.out.println("This Invoice instance contains " + this.toString());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "title='" + title + '\'' +
                ", date=" + date +
                ", value=" + value +
                '}';
    }
}
