
package me.yeojoy.spannabletest;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class StringActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.string, menu);
        return true;
    }

}
