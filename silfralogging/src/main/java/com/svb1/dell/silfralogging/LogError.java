package com.svb1.dell.silfralogging;

import android.util.Log;

/**
 * Created by dell on 11/4/2017.
 */

public class LogError {
    public static void silfraLogs(String message){
        String TAG=" ";
        try {
            if(message.equals("")){
                Log.e(TAG,"Required Message");      //Printing an error message on LogCat Error if parametter 'message' have nothing in it
            }else {
                Log.e(TAG, message);                      //Print message contents in LogCat Error
            }
        }
        catch (Exception e){                               //Catching any exceptions (Eg: Null pointer Exception if parameter passed is null)
            String s="Silfra Exception:"+e.toString();      //Appending string "Silfra Exception:" with the caught exception's error
            Log.e(TAG,s);                                   //printing string with error message in LogCat Error
        }
    }
}
