package com.wordpress.bmadi.belajar.jtable.tablemodel;

import com.wordpress.bmadi.belajar.jtable.model.Kontak;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class KontakTableModel extends AbstractTableModel {

    private List<Kontak> dataKontak;
    
    public List<Kontak> getData(){
        return dataKontak;
    }

    public KontakTableModel(List<Kontak> dataKontak) {
        this.dataKontak = dataKontak;
    }

    public int getRowCount() {
        return dataKontak.size();
    }

    public int getColumnCount() {
        return 4;
    }

    public Object getValueAt(int baris, int kolom) {
        Kontak k = dataKontak.get(baris);
        if (kolom == 0) {
            return k.getNama();
        }

        if (kolom == 1) {
            return k.getTanggalLahir();
        }

        if (kolom == 2) {
            return k.getAlamat();
        }

        if (kolom == 3) {
            return k.getAktif();
        }
        return "undefined";
    }

    @Override
    public String getColumnName(int kolom) {
        if (kolom == 0) {
            return "Nama";
        }

        if (kolom == 1) {
            return "Tanggal Lahir";
        }

        if (kolom == 2) {
            return "Alamat";
        }

        if (kolom == 3) {
            return "Status";
        }
        return "undefined";

    }

}
