package org.androidtown.doltmission03;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MenuActivity extends ActionBarActivity {

    private static final int REQUEST_CODE=200;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

   }

    public void onButtonClicked(View v){

        Intent intent = null;
        switch (v.getId()){
            case R.id.button2:
                intent=new Intent(this,ClientManageActivity.class);
                startActivityForResult(intent, REQUEST_CODE);
                break;
            case R.id.button3:
                intent=new Intent(this,ProfitManageActivity.class);
                startActivityForResult(intent, REQUEST_CODE);
                break;
            case R.id.button4:
                intent=new Intent(this,ProductManageActivity.class);
                startActivityForResult(intent, REQUEST_CODE);
                break;
            case R.id.button_Login:
                intent = new Intent(this,MainActivity.class);
                intent.putExtra("MenuMessage","Called From Menu");
                setResult(1,intent);
                finish();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == REQUEST_CODE){
            if(resultCode == 1){
                String message= data.getStringExtra("message");
                Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();
            }

        }

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
