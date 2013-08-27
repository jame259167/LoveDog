package com.example.lovedog;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivityB extends Activity {
	
	Button button1,button2;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main2);
		
		button1 = (Button)findViewById(R.id.button1);
		button2 = (Button)findViewById(R.id.button2);
		
		final AlertDialog.Builder adb = new AlertDialog.Builder(this);
		final ImageButton imgb = (ImageButton)findViewById(R.id.imageButton1);
			imgb.setImageResource(R.drawable.ic2);
			imgb.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					AlertDialog  ad = adb.create();
					ad.setMessage("�س���ѵ��عѢ"
							+"\n��Ҵ��� = �˭�"
							+"\n�����ѡ�Ҥ������Ҵ = 1 ����/��͹"
							+"\n������Ǣ� = ���"
							+"\n�͡���ѧ��� = 2-3 ����/�ѻ����"
							+"\n��С��ѧ/�������ç = �ҡ"
							+"\n���ԵáѺ�� = �ҹ��ҧ"
							+"\n������ҡ����͹ = �ҹ��ҧ"
							+"\n������ҡ��˹�� = �ҹ��ҧ"
							+"\n��鹷��㹡������§ = �ҡ");
					ad.show();
					
				}
			});
		
	}
	
	public void Back (View v){
		
		Intent intent = new Intent(MainActivityB.this,MainActivity.class);
		
		startActivity(intent);
		
		finish();
		
	}
	
	public void Exit (View v){
		finish();
	}
	

}
