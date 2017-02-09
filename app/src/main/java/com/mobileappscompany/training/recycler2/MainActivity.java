package com.mobileappscompany.training.recycler2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    List<Client> cL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initClients();

        rv = (RecyclerView) findViewById(R.id.rV);
        rv.setHasFixedSize(true);

        RecyclerView.LayoutManager lM = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        rv.setLayoutManager(lM);

        ClientAdapter cA = new ClientAdapter(cL);
        rv.setAdapter(cA);


    }

    private void initClients(){
        cL = new ArrayList<>();
        cL.add(new Client("Joe", "123"));
        cL.add(new Client("Claudia", "21"));
        cL.add(new Client("Bob", "747"));
        cL.add(new Client("Laila", "22"));
    }

    public void onItemClicked(View view) {
        TextView cN, cPh;

        ViewGroup vG = (ViewGroup) view;

        cN = (TextView) vG.getChildAt(0);
        cPh = (TextView) vG.getChildAt(1);

        Toast.makeText(this, cN.getText().toString() +
                " with phone: " +
                cPh.getText().toString() +
                " was selected",
                Toast.LENGTH_SHORT)
                .show();

    }
}
