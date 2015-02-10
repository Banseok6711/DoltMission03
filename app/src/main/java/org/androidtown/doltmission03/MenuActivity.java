package org.androidtown.doltmission03;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MenuActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

   }

    public void onButtonClicked(View v){

//        String message="";
//          String activityString="";
        Intent intent = null;
        switch (v.getId()){
            case R.id.button2:
//                activityString="ClientManageActivity.class";
                intent=new Intent(this,ClientManageActivity.class);
                break;
          /*      message=((Button)findViewById(R.id.button2)).getText().toString();
                break;*/
            case R.id.button3:
//                activityString="ProfitManageActivity.class";
                intent=new Intent(this,ProfitManageActivity.class);
                break;
                /*message=((Button)findViewById(R.id.button3)).getText().toString();
                break;*/
            case R.id.button4:
//                activityString="ProductManageActivity.class";
                intent=new Intent(this,ProductManageActivity.class);
                break;
                /*message=((Button)findViewById(R.id.button4)).getText().toString();
                break;*/
            case R.id.button_Login:
                finish();
        }

//        Intent intent = new Intent(this,activityString.getClass());
        startActivity(intent);


        /*
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("MenuMessage",message);
        setResult(1,intent);
        finish();
        */
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu, menu);
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
