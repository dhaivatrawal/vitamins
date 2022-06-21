package com.zedr.dhaivat.vitamins;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    LinearLayout llone,llthree,llfour,llfive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llone=findViewById(R.id.llone);
        llthree=findViewById(R.id.llthree);
        llfour=findViewById(R.id.llfour);
        llfive=findViewById(R.id.llfive);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.btn);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String play = "https://play.google.com/store/apps/collection/cluster?clp=igM4ChkKEzgwMjI3ODMwODE5MjM0NDY3NTcQCBgDEhkKEzgwMjI3ODMwODE5MjM0NDY3NTcQCBgDGAA%3D:S:ANO1ljKP1O8&gsr=CjuKAzgKGQoTODAyMjc4MzA4MTkyMzQ0Njc1NxAIGAMSGQoTODAyMjc4MzA4MTkyMzQ0Njc1NxAIGAMYAA%3D%3D:S:ANO1ljLhPUE&hl=en";
//                Intent isl =new Intent(Intent.ACTION_VIEW,Uri.parse(play));
//                startActivity(isl);
//            }
//        });

        if (!isconnected(MainActivity.this)) building(MainActivity.this).show();
        else
        {
            pauseScreen();
        }

       llone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),One.class);
                startActivity(intent);
            }
        });

        llthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),Three.class);
                startActivity(intent);
            }
        });
        llfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),Four.class);
                startActivity(intent);
            }
        });
        llfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),Five.class);
                startActivity(intent);
            }
        });

        //------------------------------//

        ImageView btn = (ImageView) findViewById(R.id.btnShow);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(MainActivity.this, v);
                popup.setOnMenuItemClickListener(MainActivity.this);
                popup.inflate(R.menu.menu_scrolling);
                popup.show();
            }
        });

    }
    private void pauseScreen() {
    }

    public boolean isconnected(Context context)
    {
        ConnectivityManager cm=(ConnectivityManager) context.getSystemService(context.CONNECTIVITY_SERVICE);
        NetworkInfo netinfo= cm.getActiveNetworkInfo();

        if(netinfo !=null && netinfo.isConnectedOrConnecting())
        {
            android.net.NetworkInfo wifi=cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
            android.net.NetworkInfo mobile=cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

            if((mobile != null && mobile.isConnectedOrConnecting()) || (wifi != null && wifi.isConnectedOrConnecting()))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else {
            return false;
        }
    }

    public AlertDialog.Builder building(Context c)
    {
        AlertDialog.Builder builder =new AlertDialog.Builder(c);
        builder.setCancelable(false);
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setTitle("No Internet Connection");
        builder.setMessage("You need to have Mobile Data or Wifi to access this. Press OK to exit");

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        return builder;
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {

            final Dialog dialog = new Dialog(this);
            dialog.setContentView(R.layout.custom);

            // set the custom dialog components - text, image and button
            TextView title_law = (TextView) dialog.findViewById(R.id.title_law);
            title_law.setText("Vitamins");
            TextView text = (TextView) dialog.findViewById(R.id.text);
            text.setText("This app is basically on different Vitamins and their sources and Benefits.");
            ImageView image = (ImageView) dialog.findViewById(R.id.image);
            image.setImageResource(R.mipmap.applogo);

            Button dialogButton = (Button) dialog.findViewById(R.id.dialogButtonOK);
            // if button is clicked, close the custom dialog
            dialogButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                }
            });

            dialog.show();


        }
        if (id == R.id.action_rate) {
            Intent a = new Intent(Intent.ACTION_SEND);
            final  String appPackageNAm = getApplicationContext().getPackageName();
            String strAppLink ="";
            try {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("market://details?id=" + appPackageNAm)));
            } catch (android.content.ActivityNotFoundException e) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://play.google.com/store/apps/details?id=" + appPackageNAm)));
            }
        }
        if (id == R.id.action_share) {
            Intent a = new Intent(Intent.ACTION_SEND);
            final  String appPackageNAme = getApplicationContext().getPackageName();
            String strAppLink ="";

            try
            {
                strAppLink = "http://play.google.com/store/apps/details?id=" + appPackageNAme;
            }
            catch (android.content.ActivityNotFoundException anfe)
            {
                strAppLink = "https:/play.google.com/store/apps/details?id=" + appPackageNAme;
            }
            a.setType("text/link");
            String sharebody = "This app is basically on Indian Laws which every Indians should know so that they became aware about the Indian Law System."+ " " +
                    " Please Comment and Rate Us. " + "Download this Exclusive application and Share it." + "\n"+""+strAppLink;
            String sharesub = "APP NAME ";
            a.putExtra(Intent.EXTRA_SUBJECT,sharesub);
            a.putExtra(Intent.EXTRA_TEXT,sharebody);
            startActivity(Intent.createChooser(a,"Share Using"));
        }
        if (id == R.id.action_more) {
            Intent intent= new Intent(getApplicationContext(),moreapps.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
