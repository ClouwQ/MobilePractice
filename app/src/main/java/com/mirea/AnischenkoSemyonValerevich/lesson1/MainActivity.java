package com.mirea.AnischenkoSemyonValerevich.lesson1;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView tvOut;
    private Button btnWhoAmI;
    private Button btnItIsNotMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOut = findViewById(R.id.tvOut);
        btnWhoAmI = findViewById(R.id.btnWhoAmI);
        btnItIsNotMe = findViewById(R.id.btnItIsNotMe);

        View.OnClickListener oclBtnWhoAmI = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("Я 4-ый в списке группы!");
            }
        };
        btnWhoAmI.setOnClickListener(oclBtnWhoAmI);

        View.OnClickListener oclBtnItIsNotMe = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("Это не я!");
            }
        };
        btnItIsNotMe.setOnClickListener(oclBtnItIsNotMe);


        TextView tv = findViewById(R.id.textView2);
        Button button = findViewById(R.id.button);
        View.OnClickListener BtnClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("New text in MIREA");
            }
        };
        button.setOnClickListener(BtnClick);
    }
}
