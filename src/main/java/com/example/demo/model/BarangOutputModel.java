package com.example.demo.model;


import java.math.BigDecimal;
import java.util.Date;

public class BarangOutputModel {

  private BigDecimal id;
  private String kdBarang;
  private String namaBarang;
  private String merkBarang;
  private String tahunPembelian;
  private String keterangan;
  private String kondisi;
  private String createdBy;
  private Date createdDate;
  private String stsBarang;
  private String kondisiDbPenari;
  private String jenisBarang;
  private String keteranganDbPenari;


  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }


  public String getKdBarang() {
    return kdBarang;
  }

  public void setKdBarang(String kdBarang) {
    this.kdBarang = kdBarang;
  }


  public String getNamaBarang() {
    return namaBarang;
  }

  public void setNamaBarang(String namaBarang) {
    this.namaBarang = namaBarang;
  }


  public String getMerkBarang() {
    return merkBarang;
  }

  public void setMerkBarang(String merkBarang) {
    this.merkBarang = merkBarang;
  }


  public String getTahunPembelian() {
    return tahunPembelian;
  }

  public void setTahunPembelian(String tahunPembelian) {
    this.tahunPembelian = tahunPembelian;
  }


  public String getKeterangan() {
    return keterangan;
  }

  public void setKeterangan(String keterangan) {
    this.keterangan = keterangan;
  }


  public String getKondisi() {
    return kondisi;
  }

  public void setKondisi(String kondisi) {
    this.kondisi = kondisi;
  }


  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public Date getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  public String getStsBarang() {
    return stsBarang;
  }

  public void setStsBarang(String stsBarang) {
    this.stsBarang = stsBarang;
  }

  public String getKondisiDbPenari() {
    return kondisiDbPenari;
  }

  public void setKondisiDbPenari(String kondisiDbPenari) {
    this.kondisiDbPenari = kondisiDbPenari;
  }

  public String getJenisBarang() {
    return jenisBarang;
  }

  public void setJenisBarang(String jenisBarang) {
    this.jenisBarang = jenisBarang;
  }

  public String getKeteranganDbPenari() {
    return keteranganDbPenari;
  }

  public void setKeteranganDbPenari(String keteranganDbPenari) {
    this.keteranganDbPenari = keteranganDbPenari;
  }

}
