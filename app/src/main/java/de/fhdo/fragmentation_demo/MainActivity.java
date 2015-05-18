package de.fhdo.fragmentation_demo;

import android.graphics.Point;
import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView t1 = (TextView)findViewById(R.id.tv01);
        TextView t2 = (TextView)findViewById(R.id.tv02);
        TextView t3 = (TextView)findViewById(R.id.tv03);
        TextView t4 = (TextView)findViewById(R.id.tv04);

        t1.setText(Build.VERSION.RELEASE);
        t2.setText(Build.VERSION.CODENAME);

        Integer sdk = Build.VERSION.SDK_INT;
        t3.setText(sdk.toString());

        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        t4.setText("Screen size: " + size.x + "x" + size.y + " Pixels");
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
