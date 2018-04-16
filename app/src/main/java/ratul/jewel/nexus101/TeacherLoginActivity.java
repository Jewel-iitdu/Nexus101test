package ratul.jewel.nexus101;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TeacherLoginActivity extends AppCompatActivity {

    private Button teacher_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teacher_login);
        teacherMenu();
    }

    protected void teacherMenu(){
        teacher_login = findViewById(R.id.teacher_login);
        teacher_login.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v){
                Intent teacherMenu = new Intent(TeacherLoginActivity.this, TeacherMenuActivity.class);
                startActivity(teacherMenu);


            }

        });
    }
}
