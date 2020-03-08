package kr.hs.emirim.jooyoung1948.memorymoney;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void signupOnClick(View view) {
        //회원가입 버튼 누르면 signup으로 가게하기 위함
        Intent signupIntnet = new Intent(getApplicationContext(), Signup.class);
        startActivity(signupIntnet);
    }

}
