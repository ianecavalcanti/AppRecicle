package com.android.user.apprecicle.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.user.apprecicle.Model.KeywordItem;
import com.android.user.apprecicle.R;

import java.util.List;


/**
 * Created by Mai Thanh Hiep on 4/25/2016.
 */
public class KeywordsAdapter extends ArrayAdapter<KeywordItem> {
    Context context;
    List<KeywordItem> keywordItems;
    int resource;

    public KeywordsAdapter(Context context, int resource, List<KeywordItem> objects) {
        super(context, resource, objects);
        this.context = context;
        this.keywordItems = objects;
        this.resource = resource;
    }

    @Override
    public int getCount() {
        return keywordItems.size();
    }

    @Override
    public KeywordItem getItem(int position) {
        return keywordItems.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            v = LayoutInflater.from(context).inflate(resource, null);
        }

        KeywordItem keywordItem = getItem(position);
        if (keywordItem != null) {
            ImageView imageViewIcon = (ImageView) v.findViewById(R.id.ivKeyword);
            TextView txtKeyword = (TextView) v.findViewById(R.id.txtKeyword);
            imageViewIcon.setImageResource(keywordItem.icon);
            txtKeyword.setText(keywordItem.text);
        }
        return v;
    }

    private void setData(List<KeywordItem> keywordItems) {
        this.keywordItems = keywordItems;
    }
}