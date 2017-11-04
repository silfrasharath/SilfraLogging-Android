package com.svb1.dell.silfralogging;

import android.util.Log;

/**
 * Created by dell on 11/4/2017.
 */

public class LogDebug {
    public static void silfraLogs(String message){
        String TAG=" ";
        try {
            if(message.equals("")){
                Log.d(TAG,"Required Message");           //Printing a message on LogCat debug if the parameter 'message' doesnt have a value in it
            }else {
                Log.d(TAG, message);                          //printing the message content on LogCat Debug
            }
        }
        catch (Exception e){                                  //Exceptions (Eg: Null pointer Exception if parameter h null) catching done here
            String s="Silfra Exception:"+e.toString();        //Appending string "Silfra Exception:" with error message caught
            Log.d(TAG,s);                                      //prining string with error message on LogCat debug
        }
    }
}
