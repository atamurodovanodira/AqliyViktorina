package nodira.atamurodova.aqliyviktorina;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
public class SplashScreenActivity  extends AppCompatActivity{

        public static int SPLASH_TIMER = 300;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash_screen);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(SplashScreenActivity.this, LoginScreen.class);
                    startActivity(intent);
                    finish();
                }
            }, SPLASH_TIMER);
        }


}
