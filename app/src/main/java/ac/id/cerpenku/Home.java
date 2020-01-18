package ac.id.cerpenku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    public static int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
//        listener();
    }

    private void listener() {
        findViewById(R.id.btn_Islami).setOnClickListener(v ->
            startActivity(new Intent(Home.this, MainActivity22.class))
        );
    }

    public void listCerita(View view) {
        Intent intent = new Intent(Home.this, MainActivity2.class);
        startActivity(intent);
        setIndex(1);
    }



    public void listCerita2(View view) {
        Intent intent = new Intent(Home.this, MainActivity2.class);
        startActivity(intent);
        setIndex(2);
    }


    public void listCerita3(View view) {
        Intent intent = new Intent(Home.this, MainActivity2.class);
        startActivity(intent);
        setIndex(3);
    }

    private int setIndex(int i) {
        index = i;
        return index;
    }
}
