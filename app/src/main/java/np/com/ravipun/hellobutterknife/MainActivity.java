package np.com.ravipun.hellobutterknife;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_greeting)
    TextView greetingTV;
    @BindView(R.id.btn_auto_greeting)
    Button autoGreetBtn;
    @BindView(R.id.btn_reset)
    Button resetBtn;
    @BindView(R.id.btn_use_custom_greeting)
    Button customGreetBtn;
    @BindView(R.id.et_custom_greet)
    EditText customGreetET;
    @BindView(R.id.btn_use_this_greeting)
    Button useCustomGreetBtn;

    @BindString(R.string.default_greeting)
    String defaultGreeting;
    @BindString(R.string.good_morning)
    String goodMorning;
    @BindString(R.string.good_afternoon)
    String goodAfterNoon;
    @BindString(R.string.good_evening)
    String goodEvening;
    @BindString(R.string.good_night)
    String goodNight;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_reset)
    void reset() {

        greetingTV.setText(defaultGreeting);

        customGreetET.setVisibility(View.INVISIBLE);
        useCustomGreetBtn.setVisibility(View.INVISIBLE);
    }

    @OnClick(R.id.btn_use_custom_greeting)
    void showETandBtnForCustomGreeting() {
        customGreetET.setVisibility(View.VISIBLE);
        useCustomGreetBtn.setVisibility(View.VISIBLE);
    }

    @OnClick(R.id.btn_use_this_greeting)
    void setCustomGreeting() {
        greetingTV.setText(customGreetET.getText().toString().trim());
    }

    @OnClick(R.id.btn_auto_greeting)
    void setAutoGreeting() {
        int hrs = getCurrentHourIn24HrsFormat();
        greetAppropriately(hrs);
    }

    private int getCurrentHourIn24HrsFormat() {
        Calendar instance = Calendar.getInstance();
        return instance.get(Calendar.HOUR_OF_DAY); //returns int of hours in 24 hr format.
    }

    private void greetAppropriately(int hrs) {
        //This is probably subject to where you are or what your preferences are.
        Log.d("hrs ", String.valueOf(hrs));
        if (hrs < 12) {
            greetingTV.setText(goodMorning);
        } else if (hrs >= 12 && hrs < 15) {
            greetingTV.setText(goodAfterNoon);
        } else if (hrs >= 15 && hrs <= 19) {
            greetingTV.setText(goodEvening);
        } else if (hrs > 19) {
            Log.d("I am ", "here");
            greetingTV.setText(goodNight);
        }
    }

}
