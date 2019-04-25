package sg.edu.rp.c346.p02_holiday;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class typesAdapter  extends ArrayAdapter<Types> {
    private ArrayList<Types> type;
    private Context context;
    private TextView tvTypes;

    public typesAdapter(Context context, int resource, ArrayList<Types> objects){
        super(context, resource, objects);
        type = objects;
        this.context = context;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.types_row,parent,false);

        tvTypes = rowView.findViewById(R.id.tvTypes);

        Types currentTypes = type.get(position);
        tvTypes.setText(currentTypes.getTypes());
        return rowView;


    }
}
