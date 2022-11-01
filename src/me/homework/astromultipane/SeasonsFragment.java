package me.homework.astromultipane;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SeasonsFragment extends Fragment {
	Jdays jd = new Jdays();
	EditText year;
	EditText zone;
	TextView tv1, tv2, tv3, tv4;
	Button runButton;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View myView = inflater.inflate(R.layout.seasons_fragment, container, false);

		year = (EditText) myView.findViewById(R.id.editText1);
		zone = (EditText) myView.findViewById(R.id.editText2);
		tv1 = (TextView) myView.findViewById(R.id.textView2);
		tv2 = (TextView) myView.findViewById(R.id.textView3);
		tv3 = (TextView) myView.findViewById(R.id.textView4);
		tv4 = (TextView) myView.findViewById(R.id.textView5);
		runButton = (Button) myView.findViewById(R.id.seasonsRun);
		runButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				double m1, m2, m3, m4, ve, ss, ae, ws;
				int mYear = 0;
				int lZone = 0;
				if (!year.getText().toString().equals("")) {
					mYear = Integer.parseInt(year.getText().toString());
				}
				if (!zone.getText().toString().equals("")) {
					lZone = Integer.parseInt(zone.getText().toString());
				}
				double dt = lZone / 24.0;
				m1 = (mYear - 2000.) / 1000.;
				m2 = m1 * m1;
				m3 = m2 * m1;
				m4 = m3 * m1;
				ve = 2451623.80984 + 365242.37404 * m1 + 0.05169 * m2 - 0.00411 * m3 - 0.00057 * m4 + dt; // �����
				ss = 2451716.56767 + 365241.62603 * m1 + 0.00325 * m2 + 0.00888 * m3 - 0.00030 * m4 + dt; // ����
				ae = 2451810.21715 + 365242.01767 * m1 - 0.11575 * m2 + 0.00337 * m3 + 0.00078 * m4 + dt; // �����
				ws = 2451900.05952 + 365242.74049 * m1 - 0.06223 * m2 - 0.00823 * m3 + 0.00032 * m4 + dt; // ����

				tv1.setText("Весеннее равноденствие\n" + jd.format(ve, Jdays.DMYHM));
				tv2.setText("Летнее солнцестояние\n" + jd.format(ss, Jdays.DMYHM));
				tv3.setText("Осеннее равноденствие\n" + jd.format(ae, Jdays.DMYHM));
				tv4.setText("Зимнее солнцестояние\n" + jd.format(ws, Jdays.DMYHM));
				
			}
		});

		return myView;
	}

//	public void onclick(View v) {
//		double m1, m2, m3, m4, ve, ss, ae, ws;
//		int mYear = 0;
//		int lZone = 0;
//		if (!year.getText().toString().equals("")) {
//			mYear = Integer.parseInt(year.getText().toString());
//		}
//		if (!zone.getText().toString().equals("")) {
//			lZone = Integer.parseInt(zone.getText().toString());
//		}
//		double dt = lZone / 24.0;
//		m1 = (mYear - 2000.) / 1000.;
//		m2 = m1 * m1;
//		m3 = m2 * m1;
//		m4 = m3 * m1;
//		ve = 2451623.80984 + 365242.37404 * m1 + 0.05169 * m2 - 0.00411 * m3 - 0.00057 * m4 + dt; // �����
//		ss = 2451716.56767 + 365241.62603 * m1 + 0.00325 * m2 + 0.00888 * m3 - 0.00030 * m4 + dt; // ����
//		ae = 2451810.21715 + 365242.01767 * m1 - 0.11575 * m2 + 0.00337 * m3 + 0.00078 * m4 + dt; // �����
//		ws = 2451900.05952 + 365242.74049 * m1 - 0.06223 * m2 - 0.00823 * m3 + 0.00032 * m4 + dt; // ����
//
//		tv1.setText("Весеннее равноденствие\n" + jd.format(ve, Jdays.DMYHM));
//		tv2.setText("Летнее солнцестояние\n" + jd.format(ss, Jdays.DMYHM));
//		tv3.setText("Осеннее равноденствие\n" + jd.format(ae, Jdays.DMYHM));
//		tv4.setText("Зимнее солнцестояние\n" + jd.format(ws, Jdays.DMYHM));
//	}
}
