package com.titinsumarni202102246.recyclerviewa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView _recyclerView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _recyclerView1 = (RecyclerView)findViewById(R.id.recyclerView1);

        List<NegaraModel> negaraModelList = new ArrayList<>();

        NegaraModel nma = new NegaraModel();
        nma.setNama("Albania");
        nma.setDeskripsi("Negara ini menggunakan bendera berwarna merah");
        nma.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/48/Albania-Flag-icon.png");
        negaraModelList.add(nma);

        nma = new NegaraModel();
        nma.setNama("Hungary");
        nma.setDeskripsi("Negara ini bernama hungaria di dalam bahasa indonesia");
        nma.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/48/Hungary-Flag-icon.png");
        negaraModelList.add(nma);

        nma = new NegaraModel();
        nma.setNama("Slovenia");
        nma.setDeskripsi("Slovenia terletak di Eropa Tengah dan Tenggara menyentuh Pegunungan Alpen dan berbatasan dengan Laut Mediterania. Slovenia terletak di antara 45°-47° Lintang Utara, dan 13°-17° Bujur Timur.");
        nma.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/48/Slovenia-Flag-icon.png");
        negaraModelList.add(nma);

        nma = new NegaraModel();
        nma.setNama("Belgium");
        nma.setDeskripsi("Belgium sebuah negara yang terletak di Benua Eropa, tepatnya di bagian barat benua Eropa");
        nma.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/48/Belgium-Flag-icon.png");
        negaraModelList.add(nma);

        nma = new NegaraModel();
        nma.setNama("Canada");
        nma.setDeskripsi("Negara Canada merupakan negara paling utara di kawasan Amerika Utara. Kerajaan ini terdiri dalam 10 provinsi dan 3 teritori, dengan menganut sistem desentralisasi.");
        nma.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/48/Canada-Flag-icon.png");
        negaraModelList.add(nma);

        RecyclerView.LayoutManager lm = new LinearLayoutManager(MainActivity.this);
        _recyclerView1.setLayoutManager(lm);

        NegaraAdapter na = new NegaraAdapter(getApplicationContext(), negaraModelList);
        _recyclerView1.setAdapter(na);
    }
}