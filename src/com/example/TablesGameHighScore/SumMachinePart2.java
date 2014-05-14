package com.example.TablesGameHighScore;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.example.sums101.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SumMachinePart2 extends Activity {

	public static final String EXTRA_MESSAGE5 = "MESSAGE5";


	TextView num1, num2, num3, num4, num5, num6;
	TextView operator1, operator2, operator3, operator4, operator5, operator6;
	TextView ran1, ran2, ran3, ran4, ran5, ran6;
	private Random randomG;
	TextView ans1, ans2, ans3, ans4, ans5, ans6;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sum_machine_part2);

			
		num1 =  (TextView)findViewById(R.id.editText01);
		num2 =  (TextView)findViewById(R.id.editText02);
		num3 =  (TextView)findViewById(R.id.editText03);
		num4 =  (TextView)findViewById(R.id.editText04);
		num5 =  (TextView)findViewById(R.id.editText05);
		num6 =  (TextView)findViewById(R.id.editText06);


		operator1 = (TextView)findViewById(R.id.op1);
		operator2 = (TextView)findViewById(R.id.op2);
		operator3 = (TextView)findViewById(R.id.op3);
		operator4 = (TextView)findViewById(R.id.op4);
		operator5 = (TextView)findViewById(R.id.op5);
		operator6 = (TextView)findViewById(R.id.op6);

		ran1 = (TextView)findViewById(R.id.ran1);
		ran2 = (TextView)findViewById(R.id.ran2);
		ran3 = (TextView)findViewById(R.id.ran3);
		ran4 = (TextView)findViewById(R.id.ran4);
		ran5 = (TextView)findViewById(R.id.ran5);
		ran6 = (TextView)findViewById(R.id.ran6);


		//set Text as tables selected and operator selected
		Intent intent = getIntent();
		String message = intent.getStringExtra(SumMachine.EXTRA_MESSAGE2);
		String message2 = intent.getStringExtra(SumMachine.EXTRA_MESSAGE4);

		num1.setText(message2);
		num2.setText(message2);
		num3.setText(message2);
		num4.setText(message2);
		num5.setText(message2);
		num6.setText(message2);

		operator1.setText(message);
		operator2.setText(message);
		operator3.setText(message);
		operator4.setText(message);
		operator5.setText(message);
		operator6.setText(message);


		//Generate random number for the sum
		List<String> ranNums = new ArrayList<String>();
		randomG = new Random();

		ranNums.add("1");
		ranNums.add("2");
		ranNums.add("3");
		ranNums.add("4");
		ranNums.add("5");
		ranNums.add("6");
		ranNums.add("7");
		ranNums.add("8");
		ranNums.add("9");
		ranNums.add("10");
		ranNums.add("11");
		ranNums.add("12");

		int num1 = randomG.nextInt(ranNums.size());
		int num2 = randomG.nextInt(ranNums.size());
		int num3 = randomG.nextInt(ranNums.size());
		int num4 = randomG.nextInt(ranNums.size());
		int num5 = randomG.nextInt(ranNums.size());
		int num6 = randomG.nextInt(ranNums.size());


		ran1.setText(Integer.toString(num1));
		ran2.setText(Integer.toString(num2));
		ran3.setText(Integer.toString(num3));
		ran4.setText(Integer.toString(num4));
		ran5.setText(Integer.toString(num5));
		ran6.setText(Integer.toString(num6));

		}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sum_machine_part2, menu);
		return true;
	}

	static int accumulator = 0;
	static short operationDoer = 0;

	public void submit_Clicked(View sender) {
		//Create new Activity
		Intent intent = new Intent(this, NameScore.class);
		
		ans1 = (TextView)findViewById(R.id.ans1);
		ans2 = (TextView)findViewById(R.id.ans2);
		ans3 = (TextView)findViewById(R.id.ans3);
		ans4 = (TextView)findViewById(R.id.ans4);
		ans5 = (TextView)findViewById(R.id.ans5);
		ans6 = (TextView)findViewById(R.id.ans6);
		

			TextView num1 = (TextView)findViewById(R.id.editText01);
			String numString = num1.getText().toString();
			int num1Int = Integer.parseInt(numString);
			TextView operator1 = (TextView)findViewById(R.id.op1);
			String oper1 = operator1.getText().toString();
			TextView secNum1 = (TextView)findViewById(R.id.ran1);
			int secNumInt1 =  Integer.parseInt(secNum1.getText().toString());
			int realAnswer = 0;


			int total = 0;
			
			//doing the maths of no. 1
			if(oper1.equals("+")) {
				realAnswer = num1Int + secNumInt1;

				TextView answer1 = (TextView)findViewById(R.id.ans1);
				String fAnswer1 = answer1.getText().toString();
				int finalAnswer1 = Integer.parseInt(fAnswer1);

				if(realAnswer == finalAnswer1) {
					String finAns = Integer.toString(finalAnswer1);
					answer1.setText(finAns);
					answer1.setBackgroundColor(Color.GREEN);
					total = total + 1;
				}
				else {
					answer1.setText(Integer.toString(realAnswer));
					answer1.setBackgroundColor(Color.RED);
				}			
			}

			else if(oper1.equals("*")) {
				realAnswer = num1Int * secNumInt1;

				TextView answer1 = (TextView)findViewById(R.id.ans1);
				String fAnswer1 = answer1.getText().toString();
				int finalAnswer1 = Integer.parseInt(fAnswer1);

				if(realAnswer == finalAnswer1) {
					String finAns = Integer.toString(finalAnswer1);
					answer1.setText(finAns);
					answer1.setBackgroundColor(Color.GREEN);
					total ++;
				}
				else {
					answer1.setText(Integer.toString(realAnswer));
					answer1.setBackgroundColor(Color.RED);
				}	
			}

			
				else if(oper1.equals("-")) {
					realAnswer = num1Int - secNumInt1;

					TextView answer1 = (TextView)findViewById(R.id.ans1);
					String fAnswer1 = answer1.getText().toString();
					int finalAnswer1 = Integer.parseInt(fAnswer1);

					if(realAnswer == finalAnswer1) {
						String finAns = Integer.toString(finalAnswer1);
						answer1.setText(finAns);
						answer1.setBackgroundColor(Color.GREEN);
						total ++;
					}
				else {
					answer1.setText(Integer.toString(realAnswer));
					answer1.setBackgroundColor(Color.RED);
				}			
			}


		else {
			ans1.setText("0");
			ans1.setBackgroundColor(Color.RED);
		}
			
			//doing the maths of no. 2
			TextView num2 = (TextView)findViewById(R.id.editText02);
			String numString2 = num1.getText().toString();
			int num1Int2 = Integer.parseInt(numString2);
			TextView operator2 = (TextView)findViewById(R.id.op2);
			String oper2 = operator1.getText().toString();
			TextView secNum2 = (TextView)findViewById(R.id.ran2);
			int secNumInt2 =  Integer.parseInt(secNum2.getText().toString());
			int realAnswer2 = 0;


			if(oper2.equals("+")) {
				realAnswer2 = num1Int2 + secNumInt2;

				TextView answer2 = (TextView)findViewById(R.id.ans2);
				String fAnswer2 = answer2.getText().toString();
				int finalAnswer2 = Integer.parseInt(fAnswer2);

				if(realAnswer2 == finalAnswer2) {
					String finAns2 = Integer.toString(finalAnswer2);
					answer2.setText(finAns2);
					answer2.setBackgroundColor(Color.GREEN);
					total ++;
				}
				else {
					answer2.setText(Integer.toString(realAnswer2));
					answer2.setBackgroundColor(Color.RED);
				}			
			}

			else if(oper2.equals("*")) {
				realAnswer2 = num1Int2 * secNumInt2;

				TextView answer2 = (TextView)findViewById(R.id.ans2);
				String fAnswer2 = answer2.getText().toString();
				int finalAnswer2 = Integer.parseInt(fAnswer2);

				if(realAnswer2 == finalAnswer2) {
					String finAns2 = Integer.toString(finalAnswer2);
					answer2.setText(finAns2);
					answer2.setBackgroundColor(Color.GREEN);
					total ++;
				}
				else {
					answer2.setText(Integer.toString(realAnswer2));
					answer2.setBackgroundColor(Color.RED);
				}	
			}

			
				else if(oper2.equals("-")) {
					realAnswer2 = num1Int2 - secNumInt2;

					TextView answer2 = (TextView)findViewById(R.id.ans2);
					String fAnswer2 = answer2.getText().toString();
					int finalAnswer2 = Integer.parseInt(fAnswer2);

					if(realAnswer2 == finalAnswer2) {
						String finAns2 = Integer.toString(finalAnswer2);
						answer2.setText(finAns2);
						answer2.setBackgroundColor(Color.GREEN);
						total ++;
					}
				else {
					answer2.setText(Integer.toString(realAnswer2));
					answer2.setBackgroundColor(Color.RED);
				}			
			}


		else {
			ans2.setText("0");
			ans2.setBackgroundColor(Color.RED);
		}
			//doing the maths of no. 3
			TextView num3 = (TextView)findViewById(R.id.editText03);
			String numString3 = num3.getText().toString();
			int num1Int3 = Integer.parseInt(numString3);
			TextView operator3 = (TextView)findViewById(R.id.op3);
			String oper3 = operator3.getText().toString();
			TextView secNum3 = (TextView)findViewById(R.id.ran3);
			int secNumInt3 =  Integer.parseInt(secNum3.getText().toString());
			int realAnswer3 = 0;


			if(oper3.equals("+")) {
				realAnswer3 = num1Int3 + secNumInt3;

				TextView answer3 = (TextView)findViewById(R.id.ans3);
				String fAnswer3 = answer3.getText().toString();
				int finalAnswer3 = Integer.parseInt(fAnswer3);

				if(realAnswer3 == finalAnswer3) {
					String finAns3 = Integer.toString(finalAnswer3);
					answer3.setText(finAns3);
					answer3.setBackgroundColor(Color.GREEN);
					total ++;
				}
				else {
					answer3.setText(Integer.toString(realAnswer3));
					answer3.setBackgroundColor(Color.RED);
				}			
			}

			else if(oper3.equals("*")) {
				realAnswer3 = num1Int3 * secNumInt3;

				TextView answer3 = (TextView)findViewById(R.id.ans3);
				String fAnswer3 = answer3.getText().toString();
				int finalAnswer3 = Integer.parseInt(fAnswer3);

				if(realAnswer3 == finalAnswer3) {
					String finAns3 = Integer.toString(finalAnswer3);
					answer3.setText(finAns3);
					answer3.setBackgroundColor(Color.GREEN);
					total ++;
				}
				else {
					answer3.setText(Integer.toString(realAnswer3));
					answer3.setBackgroundColor(Color.RED);
				}	
			}

			
				else if(oper3.equals("-")) {
					realAnswer3 = num1Int3 - secNumInt3;

					TextView answer3 = (TextView)findViewById(R.id.ans3);
					String fAnswer3 = answer3.getText().toString();
					int finalAnswer3 = Integer.parseInt(fAnswer3);

					if(realAnswer3 == finalAnswer3) {
						String finAns3 = Integer.toString(finalAnswer3);
						answer3.setText(finAns3);
						answer3.setBackgroundColor(Color.GREEN);
						total ++;
					}
				else {
					answer3.setText(Integer.toString(realAnswer3));
					answer3.setBackgroundColor(Color.RED);
				}			
			}


		else {
			ans3.setText("0");
			ans3.setBackgroundColor(Color.RED);
		}
			
			//doing the maths of no. 4
			TextView num4 = (TextView)findViewById(R.id.editText04);
			String numString4 = num4.getText().toString();
			int num1Int4 = Integer.parseInt(numString4);
			TextView operator4 = (TextView)findViewById(R.id.op4);
			String oper4 = operator4.getText().toString();
			TextView secNum4 = (TextView)findViewById(R.id.ran4);
			int secNumInt4 =  Integer.parseInt(secNum4.getText().toString());
			int realAnswer4 = 0;


			if(oper4.equals("+")) {
				realAnswer4 = num1Int4 + secNumInt4;

				TextView answer4 = (TextView)findViewById(R.id.ans4);
				String fAnswer4 = answer4.getText().toString();
				int finalAnswer4 = Integer.parseInt(fAnswer4);

				if(realAnswer4 == finalAnswer4) {
					String finAns4 = Integer.toString(finalAnswer4);
					answer4.setText(finAns4);
					answer4.setBackgroundColor(Color.GREEN);
					total ++;
				}
				else {
					answer4.setText(Integer.toString(realAnswer4));
					answer4.setBackgroundColor(Color.RED);
				}			
			}

			else if(oper4.equals("*")) {
				realAnswer4 = num1Int4 * secNumInt4;

				TextView answer4 = (TextView)findViewById(R.id.ans4);
				String fAnswer4 = answer4.getText().toString();
				int finalAnswer4 = Integer.parseInt(fAnswer4);

				if(realAnswer4 == finalAnswer4) {
					String finAns4 = Integer.toString(finalAnswer4);
					answer4.setText(finAns4);
					answer4.setBackgroundColor(Color.GREEN);
					total ++;
				}
				else {
					answer4.setText(Integer.toString(realAnswer4));
					answer4.setBackgroundColor(Color.RED);
				}	
			}
			
				else if(oper4.equals("-")) {
					realAnswer4 = num1Int4 - secNumInt4;

					TextView answer4 = (TextView)findViewById(R.id.ans4);
					String fAnswer4 = answer4.getText().toString();
					int finalAnswer4 = Integer.parseInt(fAnswer4);

					if(realAnswer4 == finalAnswer4) {
						String finAns4 = Integer.toString(finalAnswer4);
						answer4.setText(finAns4);
						answer4.setBackgroundColor(Color.GREEN);
						total ++;
					}
				else {
					answer4.setText(Integer.toString(realAnswer4));
					answer4.setBackgroundColor(Color.RED);
				}			
			}


		else {
			ans4.setText("0");
			ans4.setBackgroundColor(Color.RED);
		}
			
			//doing the maths of no. 5
			TextView num5 = (TextView)findViewById(R.id.editText05);
			String numString5 = num5.getText().toString();
			int num1Int5 = Integer.parseInt(numString5);
			TextView operator5 = (TextView)findViewById(R.id.op5);
			String oper5 = operator5.getText().toString();
			TextView secNum5 = (TextView)findViewById(R.id.ran5);
			int secNumInt5 =  Integer.parseInt(secNum5.getText().toString());
			int realAnswer5 = 0;


			if(oper5.equals("+")) {
				realAnswer5 = num1Int5 + secNumInt5;

				TextView answer5 = (TextView)findViewById(R.id.ans5);
				String fAnswer5 = answer5.getText().toString();
				int finalAnswer5 = Integer.parseInt(fAnswer5);

				if(realAnswer5 == finalAnswer5) {
					String finAns5 = Integer.toString(finalAnswer5);
					answer5.setText(finAns5);
					answer5.setBackgroundColor(Color.GREEN);
					total ++;
				}
				else {
					answer5.setText(Integer.toString(realAnswer5));
					answer5.setBackgroundColor(Color.RED);
				}			
			}

			else if(oper5.equals("*")) {
				realAnswer5 = num1Int5 * secNumInt5;

				TextView answer5 = (TextView)findViewById(R.id.ans5);
				String fAnswer5 = answer5.getText().toString();
				int finalAnswer5 = Integer.parseInt(fAnswer5);

				if(realAnswer5 == finalAnswer5) {
					String finAns5 = Integer.toString(finalAnswer5);
					answer5.setText(finAns5);
					answer5.setBackgroundColor(Color.GREEN);
					total ++;
				}
				else {
					answer5.setText(Integer.toString(realAnswer5));
					answer5.setBackgroundColor(Color.RED);
				}	
			}
			
				else if(oper5.equals("-")) {
					realAnswer5 = num1Int5 - secNumInt5;

					TextView answer5 = (TextView)findViewById(R.id.ans5);
					String fAnswer5 = answer5.getText().toString();
					int finalAnswer5 = Integer.parseInt(fAnswer5);

					if(realAnswer5 == finalAnswer5) {
						String finAns5 = Integer.toString(finalAnswer5);
						answer5.setText(finAns5);
						answer5.setBackgroundColor(Color.GREEN);
						total ++;
					}
				else {
					answer5.setText(Integer.toString(realAnswer5));
					answer5.setBackgroundColor(Color.RED);
				}			
			}


		else {
			ans5.setText("0");
			ans5.setBackgroundColor(Color.RED);
		}
			
			//doing the maths of no. 6
			TextView num6 = (TextView)findViewById(R.id.editText06);
			String numString6 = num6.getText().toString();
			int num1Int6 = Integer.parseInt(numString6);
			TextView operator6 = (TextView)findViewById(R.id.op6);
			String oper6 = operator6.getText().toString();
			TextView secNum6 = (TextView)findViewById(R.id.ran6);
			int secNumInt6 =  Integer.parseInt(secNum6.getText().toString());
			int realAnswer6 = 0;


			if(oper6.equals("+")) {
				realAnswer6 = num1Int6 + secNumInt6;

				TextView answer6 = (TextView)findViewById(R.id.ans6);
				String fAnswer6 = answer6.getText().toString();
				int finalAnswer6 = Integer.parseInt(fAnswer6);

				if(realAnswer6 == finalAnswer6) {
					String finAns6 = Integer.toString(finalAnswer6);
					answer6.setText(finAns6);
					answer6.setBackgroundColor(Color.GREEN);
					total ++;
				}
				else {
					answer6.setText(Integer.toString(realAnswer6));
					answer6.setBackgroundColor(Color.RED);
				}			
			}

			else if(oper6.equals("*")) {
				realAnswer6 = num1Int6 * secNumInt6;

				TextView answer6 = (TextView)findViewById(R.id.ans6);
				String fAnswer6 = answer6.getText().toString();
				int finalAnswer6 = Integer.parseInt(fAnswer6);

				if(realAnswer6 == finalAnswer6) {
					String finAns6 = Integer.toString(finalAnswer6);
					answer6.setText(finAns6);
					answer6.setBackgroundColor(Color.GREEN);
					total ++;
				}
				else {
					answer6.setText(Integer.toString(realAnswer6));
					answer6.setBackgroundColor(Color.RED);
				}	
			}
			
				else if(oper6.equals("-")) {
					realAnswer6 = num1Int6 - secNumInt6;

					TextView answer6 = (TextView)findViewById(R.id.ans6);
					String fAnswer6 = answer6.getText().toString();
					int finalAnswer6 = Integer.parseInt(fAnswer6);

					if(realAnswer6 == finalAnswer6) {
						String finAns6 = Integer.toString(finalAnswer6);
						answer6.setText(finAns6);
						answer6.setBackgroundColor(Color.GREEN);
						total ++;
					}
				else {
					answer6.setText(Integer.toString(realAnswer6));
					answer6.setBackgroundColor(Color.RED);
				}			
			}


		else {
			ans6.setText("0");
			ans6.setBackgroundColor(Color.RED);
		}
			
			intent.putExtra(EXTRA_MESSAGE5,Integer.toString(total));
			startActivity(intent);

	}

}
