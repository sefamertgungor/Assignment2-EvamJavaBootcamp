package com.company.model;
//Donus olarak birden fazla parametre olacagi icin fatura metotlarından donusleri Response sinifi kullanarak aliyoruz.
//Gerekli alanlar tanimlandi ve bu alanlar disaridan erisilmemesi icin private tanimlandi.
public class Response {

    private String code;
    private String date;

    public Response(String code, String date) {
        this.code = code;
        this.date = date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
