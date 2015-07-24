package com.example.jelo.foodbook1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.jelo.foodbook1.adapters.ListViewAdapter;
import com.example.jelo.foodbook1.dasaxelebebi.ListInfo;
import com.example.jelo.foodbook1.model.ListCharacter;

import java.util.ArrayList;


public class ListActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ArrayList<ListCharacter> listViewData = getMeateData();

        ListViewAdapter adapter = new ListViewAdapter(this,listViewData);
        ListView listView = (ListView) findViewById(R.id.listView);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Intent intent  = new Intent(getApplicationContext(),DetailActivity.class);

        startActivity(intent);
    }
});

    }
    private ArrayList<ListCharacter>getMeateData(){
        ArrayList<ListCharacter> list = new ArrayList<>();
        for (int i = 0;i< ListInfo.lstnames.length;i++){
            ListCharacter baba = new ListCharacter(ListInfo.lstnames[i],ListInfo.lstimages[i],ListInfo.descriptions[i]);
            list.add(baba);

        }
       return list;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
