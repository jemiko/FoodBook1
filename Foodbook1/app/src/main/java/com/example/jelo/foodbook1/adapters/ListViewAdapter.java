package com.example.jelo.foodbook1.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jelo.foodbook1.R;
import com.example.jelo.foodbook1.model.ListCharacter;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by jelo on 7/23/2015.
 */
public class ListViewAdapter extends BaseAdapter {
    private ArrayList<ListCharacter>lstData;
    private Context context;
    private LayoutInflater inflater;

    public  ListViewAdapter(Context context,ArrayList<ListCharacter>data){
        this.context=context;
        this.lstData=data;
        this.inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return this.lstData.size();
    }

    @Override
    public Object getItem(int position) {
        return lstData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
    View itemView;
        ViewHolder viewHolder;
        if(convertView==null){
            itemView=View.inflate(context, R.layout.listview_item,null);
            viewHolder=new ViewHolder();
            ImageView imageView = (ImageView) itemView.findViewById(R.id.lstImageview);
            TextView  nameView = (TextView) itemView.findViewById(R.id.lsttextView);

            viewHolder.imageView = imageView;
            viewHolder.nameView=nameView;

            itemView.setTag(viewHolder);

        }else {
            itemView=convertView;
            viewHolder=(ViewHolder)itemView.getTag();

        }


ListCharacter fish=(ListCharacter)getItem(position);
        viewHolder.nameView.setText(fish.getName());
        Picasso.with(context)
                .load(fish.getImage())
                .resize(400,350)
                .centerCrop()
                .into(viewHolder.imageView);



        return itemView;
    }
private class ViewHolder {
    ImageView imageView;
    TextView nameView;
}

}
