package com.example.firebase9a;

public class studentinfo {
    String prn, name , email;
    public studentinfo()
    {


    }
    public studentinfo(String stdPrn, String stdName, String stdEmail)
    {
        this.prn = stdPrn;
        this.name = stdName;
        this.email = stdEmail;
    }

    public String getPrn() {
        return prn;
    }

    public void setPrn(String prn) {
        this.prn = prn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
