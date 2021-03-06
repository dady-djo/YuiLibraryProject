package ru.sviridov.yuilibrary;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainLibActivity extends Activity {

    private TextView viewById;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lib_main);
        setTitle(R.string.lib_title);

        confingAll();
    }

    public void confingAll() {
        viewById = (TextView) findViewById(R.id.tvInfo);
        viewById.setText(R.string.info_text);
        viewById.setTextColor(getResources().getColor(android.R.color.holo_blue_bright));
        Toast.makeText(this,"new branch feature 1",Toast.LENGTH_SHORT).show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public TextView getViewById() {
        return viewById;
    }
}
