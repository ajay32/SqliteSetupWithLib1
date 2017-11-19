package me.shalvah.dbtest;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.amitshekhar.DebugDB;

public class MainActivity extends AppCompatActivity
	{

		@Override
		protected void onCreate(Bundle savedInstanceState)
		{
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main);
			Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
			setSupportActionBar(toolbar);
			//you can debug this library database too..because internally it is storing data as android has got a syntax.
			Toast.makeText(MainActivity.this,DebugDB.getAddressLog()+ "", Toast.LENGTH_LONG).show();


		}

		public void launch(View view)
		{
			Context context = view.getContext();
			Intent intent;
			switch (view.getId())
			{
				case R.id.studentsBtn:
					intent = new Intent(context, StudentListActivity.class);
					break;
				default:
					intent = new Intent(context, CourseListActivity.class);
					break;
			}
			context.startActivity(intent);
		}
	}
