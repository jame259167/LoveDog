package com.example.lovedog;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivityG extends Activity {
	
	Button button1,button2;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main7);
		
		button1 = (Button)findViewById(R.id.button1);
		button2 = (Button)findViewById(R.id.button2);
		
		final AlertDialog.Builder adb = new AlertDialog.Builder(this);
		final ImageButton imgb = (ImageButton)findViewById(R.id.imageButton1);
			imgb.setImageResource(R.drawable.ic6);
			imgb.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					AlertDialog  ad = adb.create();
					ad.setMessage("คุณสมบัติสุนัข"
							+"\nขนาดตัว = ใหญ่"
							+"\nดูแลรักษาความสะอาด = 1 ครั้ง/2 สัปดาห์"
							+"\nควมายาวขน = ปานกลาง"
							+"\nออกกำลังกาย = ทุกวัน"
							+"\nพละกำลัง/ความแข็งแรง = มาก"
							+"\nเป็นมิตรกับเด็ก = มาก"
							+"\nทนต่ออากาศร้อน = ปานกลาง"
							+"\nทนต่ออากาศหนาว = มาก"
							+"\nพื้นที่ในการเลี้ยง = มาก");
					ad.show();
					
				}
			});
		
	}
	
	public void Back (View v){
		
		Intent intent = new Intent(MainActivityG.this,MainActivityE.class);
		
		startActivity(intent);
		
		finish();
		
	}
	
	public void Exit (View v){
		finish();
	}
	

}
