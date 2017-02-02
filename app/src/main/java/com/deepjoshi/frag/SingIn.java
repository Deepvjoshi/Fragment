package com.deepjoshi.frag;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class SingIn extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        container= (ViewGroup) inflater.inflate(R.layout.fragment_sing_in, container, false);
        final EditText ed=(EditText)container.findViewById(R.id.Singin_ETone);
        final String emp="deep@gmail.com";
        final String dj=ed.getText().toString();
        if (!dj.matches("deep"))
        {
            ed.setError("plz enter value");
        }


        Button bt=(Button)container.findViewById(R.id.Singin_BTone);
        final TextView tw=(TextView)container.findViewById(R.id.Singin_Tone);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (dj.matches(emp)) {
                    ed.setError("plz enter valid email");
                }
            }
        });

        return container;
    }


}
