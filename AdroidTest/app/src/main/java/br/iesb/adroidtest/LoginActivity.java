package br.iesb.adroidtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button b = (Button) findViewById(R.id.button5);
        View.OnClickListener x = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
    

                startActivity(new Intent (LoginActivity.this, MainActivity.class));
            }
        };

        b.setOnClickListener(x);
    }

    /*public void chamarCadastro(View parametro){

    }*/
    public void chamarEscolas(View parametro){
        Intent it = new Intent (this, Principal.class);
        startActivity(it);
    }
}
