package com.example.mindicator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }

  /*  public void onStart() {
        super.onStart();
        Toast.makeText( this,"onStartexit",Toast.LENGTH_LONG ).show();
    }
    public void onResume() {
        super.onResume();
        Toast.makeText( this,"onResumeexit",Toast.LENGTH_LONG ).show();
    }*/

   /* public void onPause() {
        super.onPause();
        Toast.makeText( this,"onPauseexit",Toast.LENGTH_LONG ).show();
    }*/
    public void onStop() {
        super.onStop();
        Intent intent=new Intent( this,ThankYou_Activity.class );
        startActivity( intent );
        Toast.makeText( this,"onStopexit",Toast.LENGTH_LONG ).show();

    }
  /*  public void onDestroy() {
        super.onDestroy();
        Toast.makeText( this,"onDestroyexit",Toast.LENGTH_LONG ).show();
    }*/
}
