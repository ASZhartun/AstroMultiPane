package me.homework.astromultipane;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class DetailsActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		setContentView(R.layout.detail_activity);
		
		int pos = getIntent().getIntExtra("position", 0);
		
		FragmentManager fm = getSupportFragmentManager();
		FragmentTransaction transaction = fm.beginTransaction();
		switch (pos) {
		case 0:
			transaction.replace(R.id.detail_content, new ThousandsFragment());
			transaction.commit();
			break;
		case 1:
			transaction.replace(R.id.detail_content, new SeasonsFragment());
			transaction.commit();
			break;
		case 2:
			transaction.replace(R.id.detail_content, new MoonPhaseFragment());
			transaction.commit();
			break;
		case 3:
			transaction.replace(R.id.detail_content, new HoroFragment());
			transaction.commit();
			break;
		default:
			transaction.commit();
			break;
		}
		
	}

}
