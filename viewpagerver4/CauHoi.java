package com.nvk.viewpagerver4;

public class CauHoi {
    private String cauMot;
    private String cauHai;
    private String cauBa;
    private String cauBon;

    public CauHoi() {
    }

    public CauHoi(String cauMot, String cauHai, String cauBa, String cauBon) {
        this.cauMot = cauMot;
        this.cauHai = cauHai;
        this.cauBa = cauBa;
        this.cauBon = cauBon;
    }

    public String getCauMot() {
        return cauMot;
    }

    public void setCauMot(String cauMot) {
        this.cauMot = cauMot;
    }

    public String getCauHai() {
        return cauHai;
    }

    public void setCauHai(String cauHai) {
        this.cauHai = cauHai;
    }

    public String getCauBa() {
        return cauBa;
    }

    public void setCauBa(String cauBa) {
        this.cauBa = cauBa;
    }

    public String getCauBon() {
        return cauBon;
    }

    public void setCauBon(String cauBon) {
        this.cauBon = cauBon;
    }
}
