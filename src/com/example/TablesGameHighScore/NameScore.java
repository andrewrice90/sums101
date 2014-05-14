package com.example.TablesGameHighScore;

import com.example.sums101.R;
import com.example.sums101.R.layout;
import com.example.sums101.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class NameScore extends Activity {

	public static final String EXTRA_MESSAGE6 = "MESSAGE6";
	public static final String EXTRA_MESSAGE7 = "MESSAGE7";

	

	TextView score;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_name_score);
		Intent intent = getIntent();
		score =  (TextView)findViewById(R.id.textScore1);
		String message = intent.getStringExtra(SumMachinePart2.EXTRA_MESSAGE5);
		score.setText(message);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.name_score, menu);
		return true;
	}

	public void submitScore_Clicked(View sender) {
		//Create new Activity
		Intent intent = new Intent(this, HighScore.class);
		TextView winner = (TextView)findViewById(R.id.winnerName);
		String winString = winner.getText().toString();

		intent.putExtra(EXTRA_MESSAGE6,score.getText());
		intent.putExtra(EXTRA_MESSAGE7, winString);

		
		startActivity(intent);
	}

}
