package sg.edu.rp.c346.p02_holiday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import sg.edu.rp.c346.p02_holiday.Types;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<Types> al;
    ArrayAdapter aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.lvTypes);


        al = new ArrayList<Types>();
        al.add(new Types("Secular"));

        aa = new typesAdapter(this,R.layout.types_row, al);
        lv.setAdapter(aa);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Types selectedTypes = al.get(position);
                String type = selectedTypes.toString();

                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("type",type);
                startActivity(i);
            }
        });



    }
}
