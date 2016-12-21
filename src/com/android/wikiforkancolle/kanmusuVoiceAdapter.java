package com.android.wikiforkancolle;

import java.util.List;

import com.android.wikiforkancolle.KanmusuAdapter.ViewHolder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class kanmusuVoiceAdapter extends ArrayAdapter<kanmusuVoice> {
	private int resourceID;

	public kanmusuVoiceAdapter(Context context, int textViewResourceID,
			List<kanmusuVoice> objects) {
		super(context, textViewResourceID, objects);
		resourceID = textViewResourceID;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		kanmusuVoice kanmusuvoice = getItem(position);
		View view;
		ViewHolder viewHolder;
		if (convertView == null) {
			view = LayoutInflater.from(getContext()).inflate(resourceID, null);
			viewHolder = new ViewHolder();
			viewHolder.situation = (TextView) view.findViewById(R.id.situation);
			viewHolder.lines = (TextView) view.findViewById(R.id.lines);
			view.setTag(viewHolder);
		} else {
			view = convertView;
			viewHolder = (ViewHolder) view.getTag();
		}
		viewHolder.situation.setText(kanmusuvoice.situation);
		viewHolder.lines.setText(kanmusuvoice.lines);
		return view;
	}

	class ViewHolder {
		TextView situation;

		TextView lines;
	}
}
