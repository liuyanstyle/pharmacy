package com.ecust.pojo;

public class OrderItem {

    public int id;
    public int did;
    public int oid;

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public Drug drug;

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public int num;
    public Order order;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Drug getDrug() {
        return drug;
    }
    public void setDrug(Drug drug) {
        this.drug = drug;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public Order getOrder(){
        return order;
    }
    public void setOrder(Order order){
        this.order=order;
    }
}
