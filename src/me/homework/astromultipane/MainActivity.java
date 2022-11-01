package me.homework.astromultipane;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends FragmentActivity implements MainMenuFragment.OnSideBarSelectedItemListener {
	
	Fragment thousands;
	Fragment seasons;
	Fragment moonPhase;
	Fragment horo;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		thousands = new ThousandsFragment();
		seasons = new SeasonsFragment();
		moonPhase = new MoonPhaseFragment();
		horo = new HoroFragment();

		int screenOrientation = getResources().getConfiguration().orientation;

		if (screenOrientation == getResources().getConfiguration().ORIENTATION_PORTRAIT) {
			View details = findViewById(R.id.details);
			if (details.getVisibility() == View.VISIBLE) {
				details.setVisibility(View.GONE);
			}
		}
	}

	@Override
	public void onClickSideBarItem(int pos) {
		FragmentManager fm = getSupportFragmentManager();
		FragmentTransaction transaction = fm.beginTransaction();
		switch (pos) {
		case 0:
			transaction.replace(R.id.details, thousands);
			transaction.commit();
			break;
		case 1:
			transaction.replace(R.id.details, seasons);
			transaction.commit();
			break;
		case 2:
			transaction.replace(R.id.details, moonPhase);
			transaction.commit();
			break;
		case 3:
			transaction.replace(R.id.details, horo);
			transaction.commit();
			break;
		default:
			transaction.commit();
			break;
		}

	}
}
