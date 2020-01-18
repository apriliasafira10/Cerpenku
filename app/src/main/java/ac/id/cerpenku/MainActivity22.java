package ac.id.cerpenku;

import android.os.Bundle;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity22 extends AppCompatActivity {

    int indexGen = MainActivity2.q;
    int kd = MainActivity2.kode;
    String ttl = MainActivity2.judul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);

        TextView tittle = (TextView) findViewById(R.id.title);
        tittle.setText(ttl);
        TextView helloTxt = (TextView) findViewById(R.id.story);
        helloTxt.setText(readTxt(kd));

    }

    private String readTxt(int kode) {
        InputStream inputStream;
        if (indexGen == 1) {
            if (kode == 0) {
                inputStream = getResources().openRawResource(R.raw.jin);
            } else if (kode == 1) {
                inputStream = getResources().openRawResource(R.raw.cara);
            } else if (kode == 2) {
                inputStream = getResources().openRawResource(R.raw.kembar);
            } else if (kode == 3) {
                inputStream = getResources().openRawResource(R.raw.timunmas);
            } else if (kode == 4) {
                inputStream = getResources().openRawResource(R.raw.bawangpr);
            } else if (kode == 5) {
                inputStream = getResources().openRawResource(R.raw.monkerbau);
            } else if (kode == 6) {
                inputStream = getResources().openRawResource(R.raw.sembelalang);
            } else if (kode == 7) {
                inputStream = getResources().openRawResource(R.raw.kelkur);
            } else  {
                inputStream = getResources().openRawResource(R.raw.kancmon);
            }
        } else {
            if (kode == 0) {
                inputStream = getResources().openRawResource(R.raw.istgf);
            } else if (kode == 1) {
                inputStream = getResources().openRawResource(R.raw.sedekah);
            } else if (kode == 2) {
                inputStream = getResources().openRawResource(R.raw.hansel);
            } else {
                inputStream = getResources().openRawResource(R.raw.daydreamer);
            }
        }

        System.out.println(inputStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        int i;
        try {
            i = inputStream.read();
            while (i != -1) {
                byteArrayOutputStream.write(i);
                i = inputStream.read();
            }
            inputStream.close();
        } catch (IOException e) {

            e.printStackTrace();
        }

        return byteArrayOutputStream.toString();
    }
}
