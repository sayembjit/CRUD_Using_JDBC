package com.mottakin.main.model;

public class Birthday {
    private Integer id;
    private String name;
    private String date_inserted;

    public Birthday() {
    }

    public Birthday(Integer id, String name, String date_inserted) {
        this.id = id;
        this.name = name;
        this.date_inserted = date_inserted;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate_inserted() {
        return date_inserted;
    }

    public void setDate_inserted(String date_inserted) {
        this.date_inserted = date_inserted;
    }
}
