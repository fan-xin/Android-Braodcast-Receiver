package com.fanxin.android.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Fan Xin <fanxin.hit@gmail.com>
 * 18/11/01  14:36
 */
public class CustomReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        Log.d("####","接收到的广播是： "+action );
        //启动Receiver的MainActivity
        Intent startIntent = new Intent();
        startIntent.setClass(context,BroadcastReceiverActivity.class);
        startIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        Log.d("####","启动新的Activity! " );
        context.startActivity(startIntent);
    }
}
