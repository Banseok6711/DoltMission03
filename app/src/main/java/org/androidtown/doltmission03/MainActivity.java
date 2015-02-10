package org.androidtown.doltmission03;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private static final int REQUEST_CODE=100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClicked(View v){

        EditText id = (EditText)findViewById(R.id.editText_Id);
        EditText pw = (EditText)findViewById(R.id.editText_Pw);

        //ID,PW 입력이 둘다 되있을 경우
        if(id.length()== 0) {
            Toast.makeText(getApplicationContext(),"ID를 입력하세요",Toast.LENGTH_SHORT).show();
        }
        else if(pw.length() == 0){
            Toast.makeText(getApplicationContext(),"Password를 입력하세요",Toast.LENGTH_SHORT).show();
        }else{
            Intent intent = new Intent(this,MenuActivity.class);
            startActivityForResult(intent, REQUEST_CODE);
        }

    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == REQUEST_CODE){

            if(resultCode == 1){
                String message=data.getStringExtra("MenuMessage");
                Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();

            }

        }

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
