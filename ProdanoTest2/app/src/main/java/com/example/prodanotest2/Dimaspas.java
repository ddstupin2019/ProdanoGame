package com.example.prodanotest2;

public class Dimaspas {
    private Integer id;
    private Integer nedzn;
    private String name;

    public Dimaspas(Integer id, Integer nedzn, String name) {
        this.id = id;
        this.nedzn = nedzn;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNedzn() {
        return nedzn;
    }

    public void setNedzn(Integer nedzn) {
        this.nedzn = nedzn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
