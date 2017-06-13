package su.pushnoe.papa.remindme;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends Activity {

    private Toolbar toollbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initToolbar();
    }

    private void initToolbar() {
        toollbar = (Toolbar) findViewById(R.id.toollbar);
        toollbar.setTitle(R.string.app_name);
        toollbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener(){
            @Override
            public boolean onMenuItemClick(MenuItem menuItem){
                return false;
            }
        });

        toollbar.inflateMenu(R.menu.menu);
    }
}
