package com.example.numberapplicationshapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void testNumber(View view){
        EditText editText = (EditText) findViewById(R.id.editText2);
        if(!editText.getText().toString().isEmpty()){
            Number mynumber = new Number();
            mynumber.number = Integer.parseInt(editText.getText().toString());
            if(mynumber.issqaure() && mynumber.istrainguaular()){
                String message = editText.getText().toString();
                Toast.makeText(MainActivity.this,message += " is square and triangular",Toast.LENGTH_SHORT).show();

            }else if (mynumber.issqaure()){
                String message = editText.getText().toString();
                Toast.makeText(MainActivity.this,message  += " is square but is not triangular",Toast.LENGTH_SHORT).show();
            }else if (mynumber.istrainguaular()){
                String message = editText.getText().toString();
                Toast.makeText(MainActivity.this,message += " is triangular but is not square ",Toast.LENGTH_SHORT).show();
            }else{
                String message = editText.getText().toString();
                Toast.makeText(MainActivity.this,message  += " is neither  square and triangular",Toast.LENGTH_SHORT).show();
            }


        }else{
            Toast.makeText(MainActivity.this,"Please Enter Number",Toast.LENGTH_LONG).show();
        }
        editText.getText().clear();

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
