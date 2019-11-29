package com.horsechip.newapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**   
  * Created with IntelliJ IDEA.
  * User: 郏高阳
  * Date: 13-6-5
  * Time: 下午8:25
  * To change this template use File | Settings | File Templates.
  */
public class BootBroadcastReceiver extends BroadcastReceiver {
    static final String ACTION = "android.intent.action.BOOT_COMPLETED";

        @Override
     public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(ACTION)) {
            Intent mainActivityIntent = new Intent(context, MainActivity.class);// 要启动的Activity
            mainActivityIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(mainActivityIntent);
            }
        }
    }