package com.android.tcp_client;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {
	public final static String Server_IP = "com.android.TCP_Client.ip";
	public final static String Server_port = "com.android.TCP_Client.port";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}


	public void Clientview(View view) {
		Intent intent = new Intent(this, Clientwindow.class);
		EditText editText = (EditText) findViewById(R.id.display);
		String ip = editText.getText().toString();
		EditText editText1 = (EditText) findViewById(R.id.display1);
		String port = editText1.getText().toString();
		intent.putExtra(Server_IP, ip);
		intent.putExtra(Server_port, port);
	    startActivity(intent);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
