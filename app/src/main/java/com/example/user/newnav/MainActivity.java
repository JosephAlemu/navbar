package com.example.user.newnav;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import android.content.ClipData;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private ActionBarDrawerToggle toggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drawer);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Home");
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.navigation_view);

        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_drawer, R.string.close_drawer);
        drawerLayout.addDrawerListener(toggle);

        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.navigation_view);

        navigationView.setNavigationItemSelectedListener(this);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent Intent;

        switch (item.getItemId()) {

            case R.id.messages_id:
                Toast.makeText(this, "Overflow Menu messages  Clicked", Toast.LENGTH_SHORT).show();
                Intent = new Intent(this, all_mail.class);
                startActivity(Intent);
                break;
            case R.id.notification:
                Toast.makeText(this, "Overflow Menu notificationClicked", Toast.LENGTH_SHORT).show();
                Intent = new Intent(this, MainActivity.class);
                startActivity(Intent);
                break;
            case R.id.log_id:
                Toast.makeText(this, "Overflow Menu Log out Clicked", Toast.LENGTH_SHORT).show();
                Intent = new Intent(this, MainActivity.class);
                startActivity(Intent);
                break;
            case R.id.setting_id:
                Toast.makeText(this, "Overflow Menu settiing Clicked", Toast.LENGTH_SHORT).show();
                Intent = new Intent(this, MainActivity.class);
                startActivity(Intent);
                break;
        }
        if (toggle.onOptionsItemSelected(item)) {
            return true;
        }

        return super.onOptionsItemSelected(item);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Intent Intent;
        int id = item.getItemId();
        if (id == R.id.inbox_id) {

            Toast.makeText(this, "Inbox Clicked", Toast.LENGTH_SHORT).show();

            Intent = new Intent(this, Inbox.class);
            startActivity(Intent);


        } else if (id == R.id.starred_id) {

            Toast.makeText(this, "Starred Clicked", Toast.LENGTH_SHORT).show();

            Intent = new Intent(this, starred.class);
            startActivity(Intent);


        } else if (id == R.id.sent_id) {

            Toast.makeText(this, "Sent Clicked", Toast.LENGTH_SHORT).show();
            Intent = new Intent(this, sent_mail.class);
            startActivity(Intent);
        } else if (id == R.id.drafts_id) {

            Toast.makeText(this, "Drafts Clicked", Toast.LENGTH_SHORT).show();
            Intent = new Intent(this, drafts.class);
            startActivity(Intent);
        } else if (id == R.id.allmail_id) {

            Toast.makeText(this, "Mail Clicked", Toast.LENGTH_SHORT).show();
            Intent = new Intent(this, all_mail.class);
            startActivity(Intent);
        } else if (id == R.id.trash_id) {

            Toast.makeText(this, "Trash Clicked", Toast.LENGTH_SHORT).show();
            Intent = new Intent(this, trash.class);
            startActivity(Intent);
        } else if (id == R.id.spam_id) {

            Toast.makeText(this, "Spam Clicked", Toast.LENGTH_SHORT).show();
            Intent = new Intent(this, spam.class);
            startActivity(Intent);


        }
        return false;
    }

}