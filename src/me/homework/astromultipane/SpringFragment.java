package me.homework.astromultipane;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class SpringFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_season, container, false);
		ImageView image = (ImageView) v.findViewById(R.id.season);
		image.setImageResource(R.drawable.s1);
		return v;
	}

}
