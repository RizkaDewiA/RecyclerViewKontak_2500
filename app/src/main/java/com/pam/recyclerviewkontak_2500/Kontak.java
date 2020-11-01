package com.pam.recyclerviewkontak_2500;

public class Kontak {
    private String nama, no_kontak;

    public Kontak(String nama, String no_kontak) {
        this.nama = nama;
        this.no_kontak = no_kontak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNo_kontak() {
        return no_kontak;
    }

    public void setNo_kontak(String no_kontak) {
        this.no_kontak = no_kontak;
    }
}
