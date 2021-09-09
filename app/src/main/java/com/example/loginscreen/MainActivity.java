package com.example.loginscreen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etuserName, etEmail, etPassword, etConfirmPassword;
    Button btnLogin;
    CheckBox cbCorrect;

    private static final String USER_NAME_KEY = "user name key";
    private static final String EMAIL_KEY = "email key";
    private static final String PASSWORD_KEY = "password key";
    private static final String CONFIRM_PASSWORD_KEY = "confirm password key";

    private static final String CHECK_BOX_KEY = "check box";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etuserName = findViewById(R.id.etuserName);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        etConfirmPassword = findViewById(R.id.etConfirmPassword);

        cbCorrect = findViewById(R.id.cbCorrect);

        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "SignUp Successfully", Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        String userName = etuserName.getText().toString();
        String email = etEmail.getText().toString();
        String password = etPassword.getText().toString();
        String confirmPassword = etConfirmPassword.getText().toString();

        String checkNox = cbCorrect.getText().toString();

        outState.putString(USER_NAME_KEY, userName);
        outState.putString(EMAIL_KEY, email);
        outState.putString(PASSWORD_KEY, password);
        outState.putString(CONFIRM_PASSWORD_KEY, confirmPassword);

        outState.putString(CHECK_BOX_KEY, checkNox);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        etuserName.setText(savedInstanceState.getString(USER_NAME_KEY));
        etEmail.setText(savedInstanceState.getString(EMAIL_KEY));
        etPassword.setText(savedInstanceState.getString(PASSWORD_KEY));
        etConfirmPassword.setText(savedInstanceState.getString(CONFIRM_PASSWORD_KEY));

        cbCorrect.setText(savedInstanceState.getString(CHECK_BOX_KEY));

    }
}
//TODO:1.Create an project
//TODO:2.Design an xml layout
// TODO:3. Design portrait xml layout
//TODO:4.In Main activity Define class and make objects of edit_text,buttons etc. line No 16,17,18
// TODO:5. findViewById of all objects like button,editText etc.                  LINE NO 33-40
//TODO: 6.Create a method of onSaveInstance                                       line no 52
//TODO:7.Now make a string , make variable and convert it into String             Line No 56-61
//TODO:8.Now make keys global for every editText,checkbox which you want to restore like [ private static final String LOGIN_KEY="login key" ]  Line No 20-25
//TODO:9.Now type outstate.putString(KEY_NAME,String variable)                    Line No 63-68
//TODO:10.Create an method of onRestoreInstances                                  Line No 71
//TODO 11.Here take an object of editText,checkBox and do something like this [ etlogin.setText(savedOnInstancesState.getString(KET_OF_THAT_EDIT_TEXT)); ] Line No 75-80