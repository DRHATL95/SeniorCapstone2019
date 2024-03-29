package com.example.telemedicine.ui.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.telemedicine.R;

public class ImageAdapter extends BaseAdapter
{
    private Context mContext;
    private final int[] Imageid;
    private final String[] web;
    public ImageAdapter(Context c, String[] web, int[] Imageid )
    {
        mContext = c;
        this.Imageid = Imageid;
        this.web=web;
    }

    @Override
    public int getCount()
    {
        return Imageid.length;
    }
    @Override
    public Object getItem(int position)
    {
        return position;
    }
    @Override
    public long getItemId(int position)
    {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater)
                mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View gridView;
        if (view == null)
        {
            gridView = new View(mContext);
            // get layout from mobile.xml
            gridView = inflater.inflate(R.layout.grid_layout, null);
            // set value into textview
            TextView textView = (TextView)
                    gridView.findViewById(R.id.grid_item_label);
            textView.setText(web[i]);
            // set image based on selected text
            ImageView imageView = (ImageView)
                    gridView.findViewById(R.id.grid_item_image);
            imageView.setImageResource(Imageid[i]);
        }
        else
        {
            gridView = (View) view;
        }
        return gridView;
    }
}