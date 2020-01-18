package ac.id.cerpenku;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;



public class MainActivity2 extends AppCompatActivity {
    ListView listView;
    public static String judul;
    public static int kode;
    final ArrayList<String> lst = new ArrayList<>();
    String y;
    int p = Home.index;
    public static int q;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listView = (ListView) findViewById(R.id.list);

        setList(p);
        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, lst);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                setcont(position);
            }
        });
    }

    public String setjudul(String jdl) {
        judul = jdl;
        return judul;
    }

    public int setkode(int code) {
        kode = code;
        return kode;
    }

    public void setcont(int code) {
        setkode(code);
        y = lst.get(code);
        setjudul(y);
        Intent intent = new Intent(MainActivity2.this, MainActivity22.class);
        startActivity(intent);
    }

    public void setList(int val) {
        if (val == 1) {
            lst.add("Si Kancil Mencuri Timun");
            lst.add("Si Kancil dan Kerbau");
            lst.add("Si Kancil dan Buaya");
            lst.add("Timun Mas");
            lst.add("Bawang Merah dan Bawang Putih");
            lst.add("Kerbau dan Monyet Licik");
            lst.add("Semut dan Belalang yang Malas");
            lst.add("Kelinci dan Kura-Kura");
            lst.add("Si Kancil dan Raja Monyet");
            setQ(1);
        } else {
            lst.add("Gembala Pembohong dan Serigala");
            lst.add("Urashima Taro");
            lst.add("Hansel dan Grethel");
            lst.add("Pemerah Susu dan Embernya");
            setQ(2);
        }
    }

    public int setQ(int u) {
        q = u;
        return q;
    }

}
