package com.example.jelo.foodbook1.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jelo.foodbook1.R;
import com.example.jelo.foodbook1.model.GridCharacter;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by jelo on 7/23/2015.
 */
public class GridViewAdapter extends BaseAdapter {
   private ArrayList<GridCharacter> grdData;
    private Context context;
    private LayoutInflater inflater;

    public GridViewAdapter(Context context,ArrayList<GridCharacter>data) {
        this.context=context;
        this.grdData=data;
        this.inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return this.grdData.size();
    }

    @Override
    public Object getItem(int position) {
        return grdData.get(position);
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
            viewHolder=new ViewHolder();
            itemView=View.inflate(context, R.layout.gridview_item, null);
            ImageView imageView= (ImageView) itemView.findViewById(R.id.grdImageView);
            TextView nameView = (TextView) itemView.findViewById(R.id.grdTextview);

            viewHolder.imageView=imageView;
            viewHolder.nameView=nameView;
            itemView.setTag(viewHolder);
        }else {
            itemView=convertView;
            viewHolder=(ViewHolder)itemView.getTag();
        }
GridCharacter tevzi = (GridCharacter) getItem(position);
        viewHolder.nameView.setText(tevzi.getName());
        Picasso.with(context)
                .load(tevzi.getImage())
                .resize(670,500)
                .centerCrop()
                .into(viewHolder.imageView);

        return itemView;
    }
private class ViewHolder{
ImageView imageView;
    TextView nameView;


    }

}
