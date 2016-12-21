package com.android.wikiforkancolle;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class KanmusuAdapter extends ArrayAdapter<Kanmusu>{
	private int resourceID;
	private int count = 0;
	
	public KanmusuAdapter(Context context, int textViewResourceID, List<Kanmusu> objects) {
		super(context, textViewResourceID, objects);
		resourceID = textViewResourceID;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Kanmusu kanmusu = getItem(position);
		View view;
		ViewHolder viewHolder;
		if(convertView == null){
			view = LayoutInflater.from(getContext()).inflate(resourceID, null);
			viewHolder = new ViewHolder();
			viewHolder.KanmusuImg = (ImageView) view.findViewById(R.id.kanmusu_image);
			viewHolder.Kanmusuname = (TextView) view.findViewById(R.id.kanmusu_name);
			view.setTag(viewHolder);
		}else{
			view = convertView;
			viewHolder = (ViewHolder) view.getTag();
		}
		viewHolder.KanmusuImg.setImageResource(kanmusu.getImageID());
		viewHolder.Kanmusuname.setText(kanmusu.getName());
		return view;
	}
	
	class ViewHolder{
		ImageView KanmusuImg;
		
		TextView Kanmusuname;
	}
	
}
