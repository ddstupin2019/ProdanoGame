package com.example.prodanotest2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class Finishst extends AppCompatActivity {

    Button vozrat;
    TextView play1,play2,play3,play4,play5,play6,rez1,rez2,rez3,rez4,rez5,rez6;
    TableRow tb4,tb5,tb6;
    Integer maxPlayer;
    ArrayList<Output> bds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finishst);
        init();
        rezout();

    }

    private void init(){

        tb4=findViewById(R.id.tableRow4);
        tb5=findViewById(R.id.tableRow5);
        tb6=findViewById(R.id.tableRow6);

        play1=findViewById(R.id.player1);
        play2=findViewById(R.id.player2);
        play3=findViewById(R.id.player3);
        play4=findViewById(R.id.player4);
        play5=findViewById(R.id.player5);
        play6=findViewById(R.id.player6);

        rez1=findViewById(R.id.TextView1);
        rez2=findViewById(R.id.TextView2);
        rez3=findViewById(R.id.TextView3);
        rez4=findViewById(R.id.TextView4);
        rez5=findViewById(R.id.TextView5);
        rez6=findViewById(R.id.TextView6);

        vozrat=findViewById(R.id.button);
        vozrat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity2.database.database.setDatabaseVersion(MainActivity2.database.database.getDatabaseVersion()+1);
                Intent intent = new Intent(Finishst.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
    private ArrayList<Card> mon() {
        ArrayList<Card> c = new ArrayList<>();
        Bitmap b = BitmapFactory.decodeResource(getResources(), R.drawable.img_cm_0);
        Card z = new Card(true, 0, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_cm_0);
        z = new Card(true, 0, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_cm_2);
        z = new Card(true, 2, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_cm_2);
        z = new Card(true, 2, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_cm_3);
        z = new Card(true, 3, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_cm_3);
        z = new Card(true, 3, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_cm_4);
        z = new Card(true, 4, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_cm_4);
        z = new Card(true, 4, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_cm_5);
        z = new Card(true, 5, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_cm_5);
        z = new Card(true, 5, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_cm_6);
        z = new Card(true, 6, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_cm_6);
        z = new Card(true, 6, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_cm_7);
        z = new Card(true, 7, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_cm_7);
        z = new Card(true, 7, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_cm_8);
        z = new Card(true, 8, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_cm_8);
        z = new Card(true, 8, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_cm_9);
        z = new Card(true, 9, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_cm_9);
        z = new Card(true, 9, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_cm_10);
        z = new Card(true, 10, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_cm_10);
        z = new Card(true, 10, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_cm_11);
        z = new Card(true, 11, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_cm_11);
        z = new Card(true, 11, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_cm_12);
        z = new Card(true, 12, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_cm_12);
        z = new Card(true, 12, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_cm_13);
        z = new Card(true, 13, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_cm_13);
        z = new Card(true, 13, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_cm_14);
        z = new Card(true, 14, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_cm_14);
        z = new Card(true, 14, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_cm_15);
        z = new Card(true, 15, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_cm_15);
        z = new Card(true, 15, b);
        c.add(z);
        return c;
    }
    private void rezout(){
        tb4.setVisibility(View.INVISIBLE);
        tb5.setVisibility(View.INVISIBLE);
        tb6.setVisibility(View.INVISIBLE);
        maxPlayer=MainActivity2.database.getMaxPlayer();
        bds=MainActivity2.database.getNames();
        Output o;
        for (int i = 0; i < maxPlayer; i++) {
            switch (i){
                case 0:
                    o=bds.get(i);
                    Log.d("asdfgh", o.getName());
                    play1.setText(o.getName());
                    rez1.setText(String.valueOf(o.getBalance()+sum(o.getMoncol())));
                    break;
                case 1:
                    o=bds.get(i);
                    Log.d("asdfgh", o.toString());
                    play2.setText(o.getName());
                    rez2.setText(String.valueOf(o.getBalance()+sum(o.getMoncol())));
                    break;
                case 2:
                    o=bds.get(i);
                    Log.d("asdfgh", o.toString());
                    play3.setText(o.getName());
                    rez3.setText(String.valueOf(o.getBalance()+sum(o.getMoncol())));
                    break;
                case 3:
                    tb4.setVisibility(View.VISIBLE);
                    o=bds.get(i);
                    Log.d("asdfgh", o.toString());
                    play4.setText(o.getName());
                    rez4.setText(String.valueOf(o.getBalance()+sum(o.getMoncol())));
                    break;
                case 4:
                    tb5.setVisibility(View.VISIBLE);
                    o=bds.get(i);
                    Log.d("asdfgh", o.toString());
                    play5.setText(o.getName());
                    rez5.setText(String.valueOf(o.getBalance()+sum(o.getMoncol())));
                    break;
                case 5:
                    tb6.setVisibility(View.VISIBLE);
                    o=bds.get(i);
                    Log.d("asdfgh", o.toString());
                    play6.setText(o.getName());
                    rez6.setText(String.valueOf(o.getBalance()+sum(o.getMoncol())));
                    break;
            }

        }
    }
    private Integer sum(ArrayList<Integer> inp){
        ArrayList<Card> monCol=mon();
        Integer a = 0;
        for (int i = 0; i < inp.size(); i++) {
            a+=monCol.get(inp.get(i)-1).col;
        }
        return a;
    }

}