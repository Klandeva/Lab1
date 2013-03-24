package com.example.horoskopfinal;

import java.util.ArrayList;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends Activity {

	ListView listView;
	String[] znaci;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		listView = (ListView)findViewById(R.id.listView);
		
		znaci = this.getResources().getStringArray(R.array.horoskop);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_view_row, R.id.listText,znaci);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(new ListClickHandler());

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	private class ListClickHandler implements OnItemClickListener
	{

		@Override
		public void onItemClick(AdapterView<?> Adapter, View view, int position,long arg3)
		{
			//TextView listText = (TextView)view.findViewById(R.id.listText);
			//String text = listText.getText().toString();
			
			Toast.makeText(com.example.horoskopfinal.MainActivity.this, Poraka(position), Toast.LENGTH_LONG).show();
			
		}
		
	}
	
	protected Integer Poraka(int index){
		
		ArrayList<Integer>  message = new ArrayList<Integer>();
		
		message.add(R.string.oven);
		message.add(R.string.bik);
		message.add(R.string.bliznaci);
		message.add(R.string.rak);
		message.add(R.string.lav);
		message.add(R.string.devica);
		message.add(R.string.vaga);
		message.add(R.string.skorpija);
		message.add(R.string.strelec);
		message.add(R.string.jarec);
		message.add(R.string.vodolija);
		message.add(R.string.ribi);
		
		return (Integer)message.get(index);
	}

}
