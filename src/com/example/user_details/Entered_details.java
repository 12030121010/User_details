package com.example.user_details;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Entered_details extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_entered_details);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.entered_details, menu);
		return true;
	}

}
