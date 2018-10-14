package bus.hack.com.busqr;

import android.content.Intent;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread background = new Thread() {
            public void run() {

                try {
                    sleep(3*1000);

                    Intent i=new Intent(getBaseContext(), BusdetailsActivity.class);
                    startActivity(i);

                    finish();

                } catch (Exception e) {

                }
            }
        };


        background.start();

    }

    @Override
    protected void onDestroy() {

        super.onDestroy();

    }
}


