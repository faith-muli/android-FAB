package com.example.faith.lib;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;



public class MainActivity extends ActionBarActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView icon = new ImageView(this);
            icon.setImageDrawable(getResources().getDrawable(R.drawable.icon));

        FloatingActionButton actionButton = new FloatingActionButton.Builder(this).setContentView(icon).build();

        SubActionButton.Builder itemBuilder = new SubActionButton.Builder(this);

        ImageView icon1= new ImageView (this);
        ImageView icon2= new ImageView (this);
        ImageView icon3= new ImageView (this);


        icon1.setImageDrawable(getResources().getDrawable(R.drawable.icon));
        icon2.setImageDrawable(getResources().getDrawable(R.drawable.imgicn));
        icon3.setImageDrawable(getResources().getDrawable(R.drawable.imgicn));


       // SubActionButton button=itemBuilder.setContentView(ItemIcon).build();

        FloatingActionMenu newFloat= new FloatingActionMenu.Builder(this)
                                        .addSubActionView(itemBuilder.setContentView(icon1).build())
                                        .addSubActionView(itemBuilder.setContentView(icon2).build())
                                        .addSubActionView(itemBuilder.setContentView(icon3).build())
                                        .attachTo(actionButton)
                                        .build();


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
