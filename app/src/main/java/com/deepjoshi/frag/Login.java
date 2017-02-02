package com.deepjoshi.frag;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class Login extends AppCompatActivity {
Button B1,B2;
    SingUp sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        B1=(Button)findViewById(R.id.Singin);
        B2=(Button)findViewById(R.id.Singup);

B1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
      SingIn si= new SingIn();
        android.support.v4.app.FragmentManager fm=getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.fragLoc,si);

        ft.commit();

    }
});
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 sp=new SingUp();
               // sp=new Fragment();
                android.support.v4.app.FragmentManager fm=getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.fragLoc,sp);
               // ft.add(headlines_fragment,sp);
               // ft.add(R.id.headlines_fragment,sp);
                ft.addToBackStack(null);
                ft.commit();
            }
        });
    }
}
