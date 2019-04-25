package sg.edu.rp.c346.p02_holiday;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class holidayAdapter extends ArrayAdapter<Holiday> {

    private ArrayList<Holiday> holiday;
    private Context context;
    private TextView tvDate;
    private TextView tvHoliday;
    private ImageView ivType;

    public holidayAdapter(Context context, int resource, ArrayList<Holiday> objects){
        super(context, resource, objects);
        holiday = objects;
        this.context = context;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.date_row, parent, false);

        tvDate = rowView.findViewById(R.id.tvDate);
        tvHoliday = rowView.findViewById(R.id.tvHoliday);
        ivType = rowView.findViewById(R.id.imtypes);

        Holiday current = holiday.get(position);

        tvHoliday.setText(current.getName());
        tvDate.setText(current.getDate());
        if (current.getName() == "New Year's Day"){
            ivType.setImageResource(R.drawable.nyd);
        }else{
            ivType.setImageResource(R.drawable.labour);
        }
        return rowView;
    }

}

