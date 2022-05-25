package com.example.prodanotest2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity4 extends AppCompatActivity implements View.OnClickListener {

LinearLayout st1;
ImageView st1im1,st1im2,st1im3,st1im4,st1im5,st1im6;
TextView st1plname;
ImageButton st1ib1,st1ib2,st1ib3,st1ib4,st1ib5,st1ib6,st1ib7,st1ib8,st1ib9,st1ib10;

LinearLayout st2, linearLayout4,linearLayout5,linearLayout6;
ImageView st2im1,st2im2,st2im3,st2im4,st2im5,st2im6,st2im7,st2im8,st2im9,st2im10,st2im11, st2im12;
TextView st2tv1,st2tv2,st2tv3,st2tv4,st2tv5,st2tv6;
Button st2bt;

Boolean oneshod=true;
Integer i=0,i1=0,maxPlayer;
ArrayList<Output> bds;
ArrayList<Integer> cart, razdacha,monCol;
ArrayList<Dimaspas> zbrosCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Log.d("snolj", String.valueOf(MainActivity2.database.getNedCol(1)));
        Log.d("snolj", String.valueOf(MainActivity2.database.getNedCol(2)));
        Log.d("snolj", String.valueOf(MainActivity2.database.getNedCol(3)));
        init();
        cart=new ArrayList<>();
        zbrosCard = new ArrayList<>();
        maxPlayer=MainActivity2.database.getMaxPlayer();
        monCol=coloda();
        stadia1();

    }
    private void init(){

        st1=findViewById(R.id.stadi1);

        st1ib1=findViewById(R.id.mycart1);
        st1ib2=findViewById(R.id.mycart2);
        st1ib3=findViewById(R.id.mycart3);
        st1ib4=findViewById(R.id.mycart4);
        st1ib5=findViewById(R.id.mycart5);
        st1ib6=findViewById(R.id.mycart6);
        st1ib7=findViewById(R.id.mycart7);
        st1ib8=findViewById(R.id.mycart8);
        st1ib9=findViewById(R.id.mycart9);
        st1ib10=findViewById(R.id.mycart10);

        st1ib1.setOnClickListener(this);
        st1ib2.setOnClickListener(this);
        st1ib3.setOnClickListener(this);
        st1ib4.setOnClickListener(this);
        st1ib5.setOnClickListener(this);
        st1ib6.setOnClickListener(this);
        st1ib7.setOnClickListener(this);
        st1ib8.setOnClickListener(this);
        st1ib9.setOnClickListener(this);
        st1ib10.setOnClickListener(this);

        st1im1=findViewById(R.id.cart1);
        st1im2=findViewById(R.id.cart2);
        st1im3=findViewById(R.id.cart3);
        st1im4=findViewById(R.id.cart4);
        st1im5=findViewById(R.id.cart5);
        st1im6=findViewById(R.id.cart6);

        st1plname=findViewById(R.id.textView1);

        //стадиа 2

        st2=findViewById(R.id.stadi2);

        linearLayout4=findViewById(R.id.linearLayout4);
        linearLayout5=findViewById(R.id.linearLayout5);
        linearLayout6=findViewById(R.id.linearLayout6);


        st2im1=findViewById(R.id.st2ris1);
        st2im2=findViewById(R.id.st2ris2);
        st2im3=findViewById(R.id.st2ris3);
        st2im4=findViewById(R.id.st2ris4);
        st2im5=findViewById(R.id.st2ris6);
        st2im6=findViewById(R.id.st2ris7);
        st2im7=findViewById(R.id.st2ris8);
        st2im8=findViewById(R.id.st2ris9);
        st2im9=findViewById(R.id.st2ris10);
        st2im10=findViewById(R.id.st2ris11);
        st2im11=findViewById(R.id.st2ris12);
        st2im12=findViewById(R.id.st2ris13);

        st2tv1=findViewById(R.id.st2na1);
        st2tv2=findViewById(R.id.st2na2);
        st2tv3=findViewById(R.id.st2na3);
        st2tv4=findViewById(R.id.st2na4);
        st2tv5=findViewById(R.id.st2na5);
        st2tv6=findViewById(R.id.st2na6);

        st2bt=findViewById(R.id.st2Bt1);
        st2bt.setOnClickListener(this);
    }

    private void otrtextst1(String name){
        st1plname.setText(name);
    }

    private void otrCartNedst1(ArrayList<Integer> input) {//сколько игроков карт
        ArrayList<Card> ned = ned();
        st1ib1.setImageBitmap(null);
        st1ib2.setImageBitmap(null);
        st1ib3.setImageBitmap(null);
        st1ib4.setImageBitmap(null);
        st1ib5.setImageBitmap(null);
        st1ib6.setImageBitmap(null);
        st1ib7.setImageBitmap(null);
        st1ib8.setImageBitmap(null);
        st1ib9.setImageBitmap(null);
        st1ib10.setImageBitmap(null);

        for (int i = 0; i < input.size(); i++) {
            switch (i) {
                case 0:
                    st1ib1.setImageBitmap(ned.get(input.get(i)-1).cartinca);
                    break;
                case 1:
                    st1ib2.setImageBitmap(ned.get(input.get(i)-1).cartinca);
                    break;
                case 2:
                    st1ib3.setImageBitmap(ned.get(input.get(i)-1).cartinca);
                    break;
                case 3:
                    st1ib4.setImageBitmap(ned.get(input.get(i)-1).cartinca);
                    break;
                case 4:
                    st1ib5.setImageBitmap(ned.get(input.get(i)-1).cartinca);
                    break;
                case 5:
                    st1ib6.setImageBitmap(ned.get(input.get(i)-1).cartinca);
                    break;
                case 6:
                    st1ib7.setImageBitmap(ned.get(input.get(i)-1).cartinca);
                    break;
                case 7:
                    Log.d("snolj", "lol"+input.get(i));
                    st1ib8.setImageBitmap(ned.get(input.get(i)-1).cartinca);
                    break;
                case 8:
                    st1ib9.setImageBitmap(ned.get(input.get(i)-1).cartinca);
                    break;
                case 9:
                    st1ib10.setImageBitmap(ned.get(input.get(i)-1).cartinca);
                    break;
            }
        }
    }

    private void otrCartMonst1(ArrayList<Integer> input){
        ArrayList<Card> mon=mon();
        for (int i = 0; i < input.size(); i++) {
            switch (i){
                case 0:
                    st1im1.setImageBitmap(mon.get(input.get(i)-1).cartinca);
                    break;
                case 1:
                    st1im2.setImageBitmap(mon.get(input.get(i)-1).cartinca);
                    break;
                case 2:
                    st1im3.setImageBitmap(mon.get(input.get(i)-1).cartinca);
                    break;
                case 3:
                    st1im4.setImageBitmap(mon.get(input.get(i)-1).cartinca);
                    break;
                case 4:
                    st1im5.setImageBitmap(mon.get(input.get(i)-1).cartinca);
                    break;
                case 5:
                    st1im6.setImageBitmap(mon.get(input.get(i)-1).cartinca);
                    break;
            }

        }

    }

    private void stadia1() {
        Log.d("snolj","st1");
        st1.setVisibility(View.VISIBLE);
        st2.setVisibility(View.GONE);
        if(oneshod){
            oneshod=false;
            for (int c= 0; c < maxPlayer; c++) {
                cart.add(monCol.get(i1*maxPlayer+c));
            }
            Collections.sort(cart);
            bds=MainActivity2.database.getNames();

        }
        otrCartMonst1(cart);
        otrtextst1(bds.get(i).getName());
        otrCartNedst1(bds.get(i).getNedcol());
        }

    private void stadia2(Integer num){
        zbrosCard.add(new Dimaspas(i+1,num, bds.get(i).getName()));
        i++;
        Log.d("zaeb", String.valueOf(i));
        if(i==maxPlayer){
            Log.d("logf", "stadia2");
            oneshod=true;
            i=0;
            i1++;
            endRoz();
        }else {
            stadia1();
        }



    }

    private void endRoz(){
        Log.d("zaeb", "endroz");
        if(i1==30/maxPlayer) {
            Intent intent = new Intent(MainActivity4.this, Finishst.class);
            startActivity(intent);
            return;
        }
        st1.setVisibility(View.GONE);
        st2.setVisibility(View.VISIBLE);
        zbrosCard=sort(zbrosCard);
        otrMonColst2(cart);
        otrNedcolandName(zbrosCard);
        cart.clear();
        zbrosCard.clear();
    }

    private ArrayList<Dimaspas> sort(ArrayList<Dimaspas> inp) {
        for (int i = 0; i < inp.size(); i++) {
            for (int j = 0; j < inp.size()-1; j++) {
                if(inp.get(j).getNedzn()>inp.get(j+1).getNedzn()){
                    Integer a=inp.get(j).getNedzn();
                    inp.get(j).setNedzn(inp.get(j+1).getNedzn());
                    inp.get(j+1).setNedzn(a);
                }
            }
        }
        return inp;
    }
    ArrayList<Integer> a;
    Output o;
    private void otrNedcolandName(ArrayList<Dimaspas> inp){
        ArrayList<Card> ned=ned();
        linearLayout4.setVisibility(View.INVISIBLE);
        linearLayout5.setVisibility(View.INVISIBLE);
        linearLayout6.setVisibility(View.INVISIBLE);
        for (int i = 0; i < inp.size(); i++) {
            switch (i){
                case 0:
                    o=MainActivity2.database.getPlayer(inp.get(i).getId());
                    a=o.getMoncol();
                    a.add(cart.get(i));
                    o.setMoncol(a);
                    MainActivity2.database.ubdate(o,inp.get(i).getId());
                    st2tv1.setText(inp.get(i).getName());
                    st2im1.setImageBitmap(ned.get(inp.get(i).getNedzn()-1).cartinca);
                    break;
                case 1:
                    o=MainActivity2.database.getPlayer(inp.get(i).getId());
                    a=o.getMoncol();
                    a.add(cart.get(i));
                    o.setMoncol(a);
                    MainActivity2.database.ubdate(o,inp.get(i).getId());
                    st2tv2.setText(inp.get(i).getName());
                    st2im3.setImageBitmap(ned.get(inp.get(i).getNedzn()-1).cartinca);
                    break;
                case 2:
                    o=MainActivity2.database.getPlayer(inp.get(i).getId());
                    a=o.getMoncol();
                    a.add(cart.get(i));
                    o.setMoncol(a);
                    MainActivity2.database.ubdate(o,inp.get(i).getId());
                    st2tv3.setText(inp.get(i).getName());
                    st2im5.setImageBitmap(ned.get(inp.get(i).getNedzn()-1).cartinca);;
                    break;
                case 3:
                    o=MainActivity2.database.getPlayer(inp.get(i).getId());
                    a=o.getMoncol();
                    a.add(cart.get(i));
                    o.setMoncol(a);
                    MainActivity2.database.ubdate(o,inp.get(i).getId());
                    linearLayout4.setVisibility(View.VISIBLE);
                    st2tv4.setText(inp.get(i).getName());
                    st2im7.setImageBitmap(ned.get(inp.get(i).getNedzn()-1).cartinca);
                    break;
                case 4:
                    o=MainActivity2.database.getPlayer(inp.get(i).getId());
                    a=o.getMoncol();
                    a.add(cart.get(i));
                    o.setMoncol(a);
                    linearLayout5.setVisibility(View.VISIBLE);
                    MainActivity2.database.ubdate(o,inp.get(i).getId());
                    st2tv5.setText(inp.get(i).getName());
                    st2im9.setImageBitmap(ned.get(inp.get(i).getNedzn()-1).cartinca);
                    break;
                case 5:
                    o=MainActivity2.database.getPlayer(inp.get(i).getId());
                    a=o.getMoncol();
                    a.add(cart.get(i));
                    o.setMoncol(a);
                    MainActivity2.database.ubdate(o,inp.get(i).getId());
                    linearLayout6.setVisibility(View.VISIBLE);
                    st2tv6.setText(inp.get(i).getName());
                    st2im11.setImageBitmap(ned.get(inp.get(i).getNedzn()-1).cartinca);
                    break;
            }
        }
    }

    private void otrMonColst2(ArrayList<Integer> inp){
        ArrayList<Card> mon=mon();
        for (int i = 0; i < inp.size(); i++) {
            switch (i){
                case 0:
                    st2im2.setImageBitmap(mon.get(inp.get(i)-1).cartinca);
                    break;
                case 1:
                    st2im4.setImageBitmap(mon.get(inp.get(i)-1).cartinca);
                    break;
                case 2:
                    st2im6.setImageBitmap(mon.get(inp.get(i)-1).cartinca);
                    break;
                case 3:
                    st2im8.setImageBitmap(mon.get(inp.get(i)-1).cartinca);
                    break;
                case 4:
                    st2im10.setImageBitmap(mon.get(inp.get(i)-1).cartinca);
                    break;
                case 5:
                    st2im12.setImageBitmap(mon.get(inp.get(i)-1).cartinca);
                    break;
            }
        }
    }

            private ArrayList<Integer> coloda() {
                ArrayList<Integer> sd = new ArrayList<>();
                final Integer max = 30, min = 1;
                for (int i = 0; i < 30; i++) {
                    Integer a = (int) (Math.random() * ((max - min) + 1)) + min;
                    while (true) {
                        if (ty(a, sd)) {
                            a = (int) (Math.random() * ((max - min) + 1)) + min;
                        } else {
                            sd.add(a);
                            break;
                        }
                    }
                }
                return sd;
            }

            private boolean ty(int a, ArrayList<Integer> sd) {
                for (int i = 0; i < sd.size(); i++) {
                    if (sd.get(i) == a) {
                        return true;
                    }
                }
                return false;
            }

    private ArrayList<Card> ned() {
        ArrayList<Card> c = new ArrayList<>();
        Bitmap b = BitmapFactory.decodeResource(getResources(), R.drawable.img_1_4);
        Card z = new Card(true, 1, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_2_4);
        z = new Card(true, 2, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_3_4);
        z = new Card(true, 3, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_4_4);
        z = new Card(true, 4, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_5_4);
        z = new Card(true, 5, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_6_4);
        z = new Card(true, 6, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_7_4);
        z = new Card(true, 7, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_8_4);
        z = new Card(true, 8, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_9_4);
        z = new Card(true, 9, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_10_4);
        z = new Card(true, 10, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_11_4);
        z = new Card(true, 11, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_12_4);
        z = new Card(true, 12, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_13_4);
        z = new Card(true, 13, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_14_4);
        z = new Card(true, 14, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_15_4);
        z = new Card(true, 15, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_16_4);
        z = new Card(true, 16, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_17_4);
        z = new Card(true, 17, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_18_4);
        z = new Card(true, 18, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_19_4);
        z = new Card(true, 19, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_20_4);
        z = new Card(true, 20, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_21_4);
        z = new Card(true, 21, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_22_4);
        z = new Card(true, 22, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_23_4);
        z = new Card(true, 23, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_24_4);
        z = new Card(true, 24, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_25_4);
        z = new Card(true, 25, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_26_4);
        z = new Card(true, 26, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_27_4);
        z = new Card(true, 27, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_28_4);
        z = new Card(true, 28, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_29_4);
        z = new Card(true, 29, b);
        c.add(z);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.img_30_4);
        z = new Card(true, 30, b);
        c.add(z);
        return c;
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

    private void whotCart(Integer zn){
        ArrayList<Integer> a=bds.get(i).getNedcol();
        if(zn-1<a.size()){
            Log.d("snolj", "zn = "+zn);
            Integer s=a.get(zn-1);
            a.remove(zn-1);
            Log.d("snolj", a.toString());
            bds.get(i).setNedcol(a);
            MainActivity2.database.ubdate(bds.get(i),i+1);
            stadia2(s);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.mycart1:
                Log.d("snolj", "bt1");
                whotCart(1);
                break;
            case R.id.mycart2:
                Log.d("snolj", "bt2");
                whotCart(2);
                break;
            case R.id.mycart3:
                Log.d("snolj", "bt3");
                whotCart(3);
                break;

            case R.id.mycart4:
                Log.d("snolj", "bt4");
                whotCart(4);
                break;
            case R.id.mycart5:
                Log.d("snolj", "bt5");
                whotCart(5);
                break;
            case R.id.mycart6:
                whotCart(6);
                break;
            case R.id.mycart7:
                whotCart(7);
                break;
            case R.id.mycart8:
                whotCart(8);
                break;
            case R.id.mycart9:
                whotCart(9);
                break;
            case R.id.mycart10:
                whotCart(10);
                break;
            case R.id.st2Bt1:
                stadia1();
                break;
        }

    }
}