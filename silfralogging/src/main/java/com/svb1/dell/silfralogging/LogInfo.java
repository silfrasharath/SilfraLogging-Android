package com.svb1.dell.silfralogging;

import android.util.Log;

/**
 * Created by dell on 11/4/2017.
 */

public class LogInfo {
    public static void logInfo(String message){
        String TAG=" ";
        try {
            if(message.equals("")){
                Log.i(TAG,"Required Message");          //Printing an error message on LogCat Error if parameter 'message' has nothing in it
            }else {
                Log.i(TAG, message);                          //Printing the message content on LogCat Error
            }
        }
        catch (Exception e){                                  //Catching any exceptions (Eg: Null Pointer Exception if parameter has null)
            String s="Exception LogInfo:"+e.toString();        //Appending string "Exception LogInfo:" with caught exception's message
            Log.i(TAG,s);                                     //Printing string with error message on to LogCat error
        }
    }
}
