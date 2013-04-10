package com.android.inventorymanagement;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

    public final static String EXTRA_MESSAGE = "com.example.myapp.MESSAGE";
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO Auto-generated method stub
        switch(item.getItemId()){
            case R.id.editProvider:
                Intent intent = new Intent(this, ProviderActivity.class);
                intent.putExtra(EXTRA_MESSAGE, item.getTitle());
                startActivity(intent);
                break;
            default:
                break;
        }
        return false;
    }
    
    public void privoder(View view){
        Intent intent = new Intent(this, ProviderActivity.class);
        intent.putExtra(EXTRA_MESSAGE, "abcde");
        startActivity(intent);
    }
    
}
