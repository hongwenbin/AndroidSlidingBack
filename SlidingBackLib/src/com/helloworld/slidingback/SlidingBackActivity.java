package com.helloworld.slidingback;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;


public class SlidingBackActivity extends Activity {
	protected SlidingBackLayout layout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setTheme(android.R.style.Theme_Translucent);    
		 //setTheme(android.R.style.Theme_Translucent);    
		super.onCreate(savedInstanceState);
		layout = (SlidingBackLayout) LayoutInflater.from(this).inflate(
			MResource.getIdByName(this, "layout", "slidingbacklayout"), null);
		layout.attachToActivity(this);
		
		 
		
	}
	
	
	@Override
	public void startActivity(Intent intent) {
		super.startActivity(intent);
		overridePendingTransition( MResource.getIdByName(this, "anim", "base_slide_right_in"), MResource.getIdByName(this, "anim", "base_slide_remain"));
	}


	@Override
	public void onBackPressed() {
		super.onBackPressed();
		overridePendingTransition(0,  MResource.getIdByName(this, "anim", "base_slide_right_out"));
	}


}
