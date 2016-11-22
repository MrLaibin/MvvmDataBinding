package com.mrlaibin.franke.mvvmdatabinding;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.mrlaibin.franke.mvvmdatabinding.databinding.ItemBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by franke on 16/11/16.
 */

public class MainAdapter extends BaseAdapter {
    private Context mContext;
    private List<News> mList;
    private LayoutInflater mInflater;
    public View.OnClickListener itemClickListener;
    private ItemBinding binding;

    public MainAdapter(Context context) {
        this.mContext = context;
        this.mList = new ArrayList();
        this.mInflater = LayoutInflater.from(context);
    }

    public void reload(List list) {
        this.mList = list;

    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {

            binding = DataBindingUtil.inflate(mInflater, R.layout.item, parent, false);
            convertView = binding.getRoot();
            convertView.setTag(binding);
        } else {
            binding = (ItemBinding) convertView.getTag();
        }
        binding.setVariable(com.mrlaibin.franke.mvvmdatabinding.BR.stroie, mList.get(position));
        binding.setAdapter(this);
        return convertView;

    }
    public void setOnclickListener(View.OnClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }
}
