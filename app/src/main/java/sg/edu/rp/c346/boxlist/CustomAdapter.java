package sg.edu.rp.c346.boxlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 16003753 on 23/7/2018.
 */

public class CustomAdapter extends ArrayAdapter{

    Context parent_context;
    int layout_id;
    ArrayList<BoxItem> boxList;


    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<BoxItem> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        boxList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id,parent,false);
        ImageView ivImpt = rowView.findViewById(R.id.imageViewBox);
        BoxItem currentItem = boxList.get(position);
        if(currentItem.getColor().equals("blue")){
            ivImpt.setImageResource(R.drawable.blue_box);
        }
        else if(currentItem.getColor().equals("brown")){
            ivImpt.setImageResource(R.drawable.brown_box);
        }
        else if(currentItem.getColor().equals("orange")){
            ivImpt.setImageResource(R.drawable.orange_box);
        }

        return rowView;
    }

}
