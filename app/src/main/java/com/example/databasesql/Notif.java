package com.example.databasesql;

import android.content.Context;
import android.widget.Toast;

public class Notif {
    public static void notif (Context context, String message)
    {
        Toast.makeText(context,message,Toast.LENGTH_LONG).show();
    }
}