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

public class HighScore extends Activity {

	TextView score;
	TextView scorer;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_high_score);
		Intent intent = getIntent();
		//set score
		score =  (TextView)findViewById(R.id.score1);
		String message = intent.getStringExtra(NameScore.EXTRA_MESSAGE6);
		score.setText(message);
		//set score name
		scorer =  (TextView)findViewById(R.id.textScore1);
		String message2 = intent.getStringExtra(NameScore.EXTRA_MESSAGE7);
		scorer.setText(message2);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.high_score, menu);
		return true;
	}

	public void finish(View v) {
		
		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);
	}

}
