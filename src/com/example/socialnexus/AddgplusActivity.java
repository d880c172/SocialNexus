package com.example.socialnexus;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

public class AddgplusActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.addgplus);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.addgplus, menu);
		return true;
	}
	
	public void verify(View view)
	{
		
	}
}
