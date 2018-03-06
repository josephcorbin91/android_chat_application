package jco.goldenrule.Activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.WindowManager;
import android.widget.LinearLayout;


import jco.goldenrule.R;


public class SettingsActivity extends AppCompatActivity {


    private Context mContext;

    private LinearLayout backgroundLayout;


    protected void setStatusBarTranslucent(boolean makeTranslucent){
        if(makeTranslucent){
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
        else{
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_settings_page);


        /*TODO
        Organization name that would include th users organization id.
         */



        this.mContext=getApplicationContext();
        setStatusBarTranslucent(true);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    private void initializeUIComponents(){




    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(getApplicationContext(),HomeActivity.class));

    }
}
