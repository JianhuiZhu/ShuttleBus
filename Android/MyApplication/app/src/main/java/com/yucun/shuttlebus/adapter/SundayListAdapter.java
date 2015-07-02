package com.yucun.shuttlebus.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.parse.ParseQueryAdapter;
import com.yucun.shuttlebus.R;
import com.yucun.shuttlebus.model.Saturday;
import com.yucun.shuttlebus.model.Sunday;

/**
 * Created by yucunli on 2015-07-02.
 */
public class SundayListAdapter extends ParseQueryAdapter<Sunday> {

    private LayoutInflater inflater;

    public SundayListAdapter(Context context,
                               ParseQueryAdapter.QueryFactory<Sunday> queryFactory) {
        super(context, queryFactory);
        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getItemView(Sunday sunday, View view, ViewGroup parent) {
        ViewHolder holder;
        if (view == null) {
            view = inflater.inflate(R.layout.list_item_day, parent, false);
            holder = new ViewHolder();
            holder.departTime = (TextView) view
                    .findViewById(R.id.departTime);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        TextView departTime = holder.departTime;
        departTime.setText(sunday.getDepart_time());

        return view;
    }

    private static class ViewHolder {
        TextView departTime;
    }

}