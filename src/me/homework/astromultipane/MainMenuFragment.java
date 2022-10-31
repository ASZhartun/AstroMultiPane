package me.homework.astromultipane;

import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainMenuFragment extends Fragment {

	String[] storage = new String[] { "Весна", "Лето", "Осень", "Зима" };

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_main_menu, container, false);
		ListView vMenu = (ListView) v.findViewById(R.id.menu_tab);

		vMenu.setAdapter(new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, storage));
		return v;
	}

}
