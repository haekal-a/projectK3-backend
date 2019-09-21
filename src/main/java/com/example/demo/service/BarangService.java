package com.example.demo.service;

import com.example.demo.model.BarangOutputModel;
import com.example.demo.repo.dbsimakbmn.IMasterBmnRepo;
import com.example.demo.repo.dbsimakbmn.IMasterBmnRepoCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class BarangService {

    private IMasterBmnRepo masterBmnRepo;
    private IMasterBmnRepoCustom masterBmnRepoCustom;

    @Autowired
    public BarangService(IMasterBmnRepo masterBmnRepo, IMasterBmnRepoCustom masterBmnRepoCustom){
        this.masterBmnRepo = masterBmnRepo;
        this.masterBmnRepoCustom = masterBmnRepoCustom;
    }

    public List<BarangOutputModel> getBarangByKondisiAndStatus (String kondisi, String status){
        List<BarangOutputModel> list = new ArrayList<>();
        List<Object[]> data = masterBmnRepoCustom.getBarangByKondisiAndStatus(kondisi, status);
        for (Object[] o : data){
            BarangOutputModel output = new BarangOutputModel();
            output.setId(new BigDecimal((Integer) o[0]));
            output.setKdBarang((String) o[1]);
            output.setNamaBarang((String) o[2]);
            output.setMerkBarang((String) o[3]);
            output.setTahunPembelian((String) o[4]);
            output.setKeterangan((String) o[5]);
            output.setKondisi((String) o[6]);
            output.setCreatedBy((String) o[7]);
            output.setCreatedDate((Date) o[8]);
            output.setStsBarang(String.valueOf(o[9]));
            output.setKondisiDbPenari(String.valueOf(o[10]));
            output.setJenisBarang((String) o[11]);
            list.add(output);
        }
        return list;
    }
}