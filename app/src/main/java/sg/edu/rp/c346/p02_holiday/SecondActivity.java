package sg.edu.rp.c346.p02_holiday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {


    ListView lv;
    ArrayAdapter aa;
    ArrayList<Holiday> holidays;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent i = getIntent();


        TextView textViewType = findViewById(R.id.textViewType);
        String type =i.getStringExtra("type");
        textViewType.setText(type);

        lv = findViewById(R.id.lvDates);
        holidays = new ArrayList<Holiday>();
        holidays.add(new Holiday("New Year's Day", "1 Jan 2019"));
        holidays.add(new Holiday("Labour Day", "1 May 2019"));

        aa = new holidayAdapter(this, R.layout.date_row, holidays);
        lv.setAdapter(aa);


    }
}
