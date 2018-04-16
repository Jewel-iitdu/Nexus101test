package ratul.jewel.nexus101;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    public Button button_teacher, button_student, button_admin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login();
    }

    protected void login(){

        button_teacher = findViewById(R.id.button_teacher);
        button_student = findViewById(R.id.button_student);
        button_admin = findViewById(R.id.button_admin);

        button_teacher.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v){
                Intent login = new Intent(MainActivity.this, TeacherLoginActivity.class);
                startActivity(login);

            }

            });
        button_student.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v){
                Intent login = new Intent(MainActivity.this, StudentLoginActivity.class);
                startActivity(login);
            }

        });
        button_admin.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v){
                Intent login = new Intent(MainActivity.this, AdminLoginActivity.class);
                startActivity(login);
            }

        });

    }
}
