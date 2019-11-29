package com.example.listexample;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;


public class CustomListAdapter extends BaseAdapter {

    private List<AlarmItem>listData;
    private LayoutInflater layoutInflater;
    private Context context;

    public CustomListAdapter(Context aContext,  List<AlarmItem> listData) {
        this.context = aContext;
        this.listData = listData;
        layoutInflater = LayoutInflater.from(aContext);
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.list_item_layout, null);
            holder = new ViewHolder();
            holder.alarmNumber = (TextView) convertView.findViewById(R.id.tvNumberOfAlarm);
            holder.alarmName = (TextView) convertView.findViewById(R.id.tvAlarmInfo);
            holder.alarmInfo = (TextView) convertView.findViewById(R.id.tvAlarmName);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
    }
        AlarmItem alarmItem = this.listData.get(position);
        holder.alarmNumber.setText(alarmItem.getAlarmNumber());
        holder.alarmName.setText(alarmItem.getAlarmName());
        holder.alarmInfo.setText(alarmItem.getAlarmInfo());



        return convertView;}

    static class ViewHolder {
        TextView alarmNumber;
        TextView alarmName;
        TextView alarmInfo;
    }
}
