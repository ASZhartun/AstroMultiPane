package me.homework.astromultipane;

import android.app.Activity;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainMenuFragment extends Fragment {
	
	OnSideBarSelectedItemListener activity;

	String[] storage = new String[] { "Thousands", "Seasons", "Moon Phase", "Horo" };

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
		
		vMenu.setOnItemClickListener(new OnItemClickListener() {
		    public void onItemClick(AdapterView<?> listView, View itemView, int itemPosition, long itemId)
		        {           
		    		activity.onClickSideBarItem(itemPosition);
		        }
		    });
		return v;
	}
	
	
	
	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		super.onAttach(activity);
		try {
			this.activity = (OnSideBarSelectedItemListener) activity;
		} catch (ClassCastException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	public interface OnSideBarSelectedItemListener {
		public void onClickSideBarItem(int pos);
	}

}
