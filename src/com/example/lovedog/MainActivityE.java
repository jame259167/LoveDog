package com.example.lovedog;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityE extends Activity {
	
	TextView textView1;
	Button button1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main6);
		
		button1 = (Button)findViewById(R.id.button1);
	}
	
	public void Dog (View v){
		
		Intent intent = new Intent(MainActivityE.this,MainActivityG.class);
		
		startActivity(intent);
		finish();
	}
	
	public void Dog1 (View v){
		
		Intent intent = new Intent(MainActivityE.this,MainActivityH.class);
		
		startActivity(intent);
		finish();
	}

	public void Dog2 (View v){
	
		Intent intent = new Intent(MainActivityE.this,MainActivityI.class);
	
		startActivity(intent);
		finish();
	}
	
	public void Dog3 (View v){
		
		Intent intent = new Intent(MainActivityE.this,MainActivityJ.class);
	
		startActivity(intent);
		finish();
	}
	
	public void Dog4 (View v){
		
		Intent intent = new Intent(MainActivityE.this,MainActivityK.class);
	
		startActivity(intent);
		finish();
	}
	
	public void Exit (View v){
		
		finish();
		
	}
	
	public void Back (View v){
		
		Intent intent = new Intent(MainActivityE.this,MainActivity.class);
		
		startActivity(intent);
		finish();
	}
		

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
