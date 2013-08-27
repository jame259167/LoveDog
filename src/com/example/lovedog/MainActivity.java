package com.example.lovedog;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	TextView textView1;
	Button button1,button2,button3,button4,button5,button6,button7;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		button1 = (Button)findViewById(R.id.button1);
		button2 = (Button)findViewById(R.id.button2);
		button3 = (Button)findViewById(R.id.button3);
		button4 = (Button)findViewById(R.id.button4);
		button5 = (Button)findViewById(R.id.button5);
		button6 = (Button)findViewById(R.id.button6);
		button7 = (Button)findViewById(R.id.button7);
	}
	
	public void Dog (View v){
		
		Intent intent = new Intent(MainActivity.this,MainActivityA.class);
		
		startActivity(intent);
		finish();
	}
	
	public void Dog1 (View v){
		
		Intent intent = new Intent(MainActivity.this,MainActivityB.class);
		
		startActivity(intent);
		finish();
	}

	public void Dog2 (View v){
	
		Intent intent = new Intent(MainActivity.this,MainActivityC.class);
	
		startActivity(intent);
		finish();
	}
	
	public void Dog3 (View v){
		
		Intent intent = new Intent(MainActivity.this,MainActivityD.class);
	
		startActivity(intent);
		finish();
	}
	
	public void Dog4 (View v){
		
		Intent intent = new Intent(MainActivity.this,MainActivityF.class);
	
		startActivity(intent);
		finish();
	}
	
	public void Exit (View v){
		
		finish();
		
	}
	
	public void Next (View v){
		
		Intent intent = new Intent(MainActivity.this,MainActivityE.class);
		
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
