package li.lanovo.welcome;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import li.lanovo.welcome.R;


public class MainActivity extends Activity implements View.OnClickListener {
    // private Button bt1;
    //private Button bt2;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginButton = (Button) findViewById(R.id.button);

        loginButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button: {
                Intent intent = new Intent(MainActivity.this, HomeActivty.class);
                startActivity(intent);
            }
            break;
        }
    }


}