package sas.edu.hello_spring.model;

import java.time.LocalDateTime;

public class Group {

    String id;
    String name;
    String desc;
    Cafedra cafedra;
    LocalDateTime createdAt, updatedAt;

    public Group(){

    }

    public Group(String name, String desc, Cafedra cafedra) {
        this.name = name;
        this.desc = desc;
        this.cafedra = cafedra;
    }

    public Group(String id, String name, String desc, Cafedra cafedra) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.cafedra = cafedra;
    }

    public Group(String id, String name, String desc, Cafedra cafedra, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.cafedra = cafedra;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public Cafedra getCafedra() {
        return cafedra;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setCafedra(Cafedra cafedra) {
        this.cafedra = cafedra;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
