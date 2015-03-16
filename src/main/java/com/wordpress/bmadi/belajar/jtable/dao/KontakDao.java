package com.wordpress.bmadi.belajar.jtable.dao;

import com.wordpress.bmadi.belajar.jtable.model.Kontak;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KontakDao {
    
    public List<Kontak> cariSemua(){
        try {
            List<Kontak> hasil = new ArrayList<Kontak>();
            Kontak k = new Kontak();
            k.setId(1);
            k.setNama("Madi Andi");
            k.setTanggalLahir(new Date());
            k.setAlamat("Jl.Gosling");
            k.setAktif(Boolean.TRUE);
            hasil.add(k);
            
            Kontak k1 = new Kontak();
            k1.setId(2);
            k1.setNama("Dima ");
            k1.setTanggalLahir(new SimpleDateFormat("yyyy-MM-dd").parse("1994-08-17"));
            k1.setAlamat("Jl.Gosling");
            k1.setAktif(Boolean.FALSE);
            hasil.add(k1);
            return hasil;
        } catch (ParseException ex) {
            Logger.getLogger(KontakDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    
}
