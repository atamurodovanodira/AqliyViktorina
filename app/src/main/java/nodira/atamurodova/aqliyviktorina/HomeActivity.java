package nodira.atamurodova.aqliyviktorina;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.android.material.bottomnavigation.BottomNavigationView;
public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        Button game1 = findViewById(R.id.game1);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.setSelectedItemId(R.id.bottom_home);
        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.bottom_home:
                    return true;
                case R.id.bottom_profile:
                    startActivity(new Intent(getApplicationContext(), ProfilActivity.class));
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    finish();
                    return true;
                case R.id.bottom_settings:
                    startActivity(new Intent(getApplicationContext(), SettingActivity.class));
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    finish();
                    return true;
                case R.id.bottom_about:
                    startActivity(new Intent(getApplicationContext(), AboutActivity.class));
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    finish();
                    return true;
            }
            return false;
        });
        game1.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, AddPlayers.class);
            startActivity(intent);
        });

        Button game2 = findViewById(R.id.game2);

        game2.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, GameTwoActivity.class);
            startActivity(intent);
        });

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})

        Button game3 = findViewById(R.id.game3);

        game3.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, LudoActivity.class);
            startActivity(intent);
        });

    }

}
