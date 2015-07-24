package com.example.jelo.foodbook1;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.jelo.foodbook1.adapters.GridViewAdapter;
import com.example.jelo.foodbook1.dasaxelebebi.GridInfo;
import com.example.jelo.foodbook1.model.GridCharacter;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grd_main);

        ArrayList<GridCharacter> gridViewData= getGridViewData();
        GridViewAdapter adapter = new GridViewAdapter(this,gridViewData);
        GridView gridView= (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),ListActivity.class);
                startActivity(intent);
            }
        });
    }

    private ArrayList<GridCharacter>getGridViewData(){
     ArrayList<GridCharacter> list=new ArrayList<>();
        for (int i=0;i< GridInfo.infnames.length;i++){
            GridCharacter grd = new GridCharacter(GridInfo.infnames[i],GridInfo.infimages[i]);
            list.add(grd);
        }

        return list;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
