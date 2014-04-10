package com.ivency.snake;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

/**
 * MainActivity.java
 *
 * @author Monkey
 * @date 2014年4月10日 下午10:58:24
 * @describe 
 */
public class MainActivity extends Activity {
	
	private Button button_startGame;
	private Button button_score;
	private Button button_exit;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initViews();
		addListener();
	}

	/**
	 * 获取界面元素
	 */
	private void initViews() {
		button_startGame = (Button) findViewById(R.id.startGame);
		button_score = (Button) findViewById(R.id.score);
		button_exit = (Button) findViewById(R.id.exit);
	}

	/**
	 * 给界面元素添加监听器
	 */
	private void addListener() {
		OnClickListener listener_startGame = new Button.OnClickListener(){
			public void onClick(View v) {
				//TODO: startGame();
			}
		};
		button_startGame.setOnClickListener(listener_startGame);
		
		OnClickListener listener_score = new Button.OnClickListener(){
			public void onClick(View v) {
				//TODO: showScore();
			}
		};
		button_score.setOnClickListener(listener_score);
		
		OnClickListener listener_exit = new Button.OnClickListener(){
			public void onClick(View v) {
				//TODO: exit();
			}
		};
		button_exit.setOnClickListener(listener_exit);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.about) {
			Toast.makeText(getApplicationContext(), "author:Monkey",
					Toast.LENGTH_SHORT).show();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
