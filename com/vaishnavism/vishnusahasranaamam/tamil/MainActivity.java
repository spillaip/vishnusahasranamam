package com.vaishnavism.vishnusahasranaamam.tamil;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class MainActivity extends Activity {
    ListView lv;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.lv = (ListView) findViewById(R.id.listView1);
        this.lv.setAdapter(new VcAdapter(this));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_activity_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings /*2131361795*/:
                break;
            case R.id.action_play /*2131361796*/:
                new Intent();
                Intent intent = Intent.makeMainSelectorActivity("android.intent.action.MAIN", "android.intent.category.APP_MUSIC");
                intent.addFlags(268435456);
                startActivity(intent);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
}
