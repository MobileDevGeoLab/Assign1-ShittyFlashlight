package geolab.assign1.flashlight;

import android.graphics.Color;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;


public class MainActivity extends ActionBarActivity {

    private int color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        if(savedInstanceState != null)
//            color = savedInstanceState.getInt("Color");
//
//        RelativeLayout background = (RelativeLayout) findViewById(R.id.background);
//        background.setBackgroundColor(color);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("Color", color);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        if(savedInstanceState != null)
            color = savedInstanceState.getInt("Color");

        RelativeLayout background = (RelativeLayout) findViewById(R.id.background);
        background.setBackgroundColor(color);
    }

    public void changeColor(View v){
        color = Color.WHITE;
        switch(v.getId()){
            case R.id.red:
                color = Color.RED;
                break;
            case R.id.blue:
                color = Color.BLUE;
                break;
            case R.id.white:
                color = Color.WHITE;
                break;
            case R.id.green:
                color = Color.GREEN;
                break;
            case R.id.yellow:
                color = Color.YELLOW;
                break;
            default:
                break;
        }

        RelativeLayout background = (RelativeLayout) findViewById(R.id.background);
        background.setBackgroundColor(color);
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
