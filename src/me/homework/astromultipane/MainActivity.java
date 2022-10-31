package me.homework.astromultipane;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		int screenOrientation = 
				getResources().getConfiguration().orientation;
		
		if (screenOrientation == getResources().getConfiguration().ORIENTATION_PORTRAIT) {
			View details = findViewById(R.id.details);
			if (details.getVisibility() == View.VISIBLE) {
				details.setVisibility(View.GONE);
			}
		}
	}
}
