package com.svb1.dell.silfralogs;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.svb1.dell.silfralogging.LogDebug;
import com.svb1.dell.silfralogging.LogError;
import com.svb1.dell.silfralogging.LogInfo;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button TextD,VariableD,NullD,TextI,VariableI,NullI,TextE,VariableE,NullE;
    EditText StringD,StringI,StringE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextD=(Button) findViewById(R.id.debug_text);
        VariableD=(Button) findViewById(R.id.debug_variable);
        NullD=(Button) findViewById(R.id.debug_null);

        TextI=(Button)findViewById(R.id.info_text);
        VariableI=(Button)findViewById(R.id.info_variable);
        NullI=(Button)findViewById(R.id.info_null);

        TextE=(Button)findViewById(R.id.error_text);
        VariableE=(Button)findViewById(R.id.error_variable);
        NullE=(Button)findViewById(R.id.error_null);

        StringD=(EditText)findViewById(R.id.variable1);
        StringI=(EditText)findViewById(R.id.variable2);
        StringE=(EditText)findViewById(R.id.variable3);

        TextD.setOnClickListener(this);
        VariableD.setOnClickListener(this);
        NullD.setOnClickListener(this);
        TextI.setOnClickListener(this);
        VariableI.setOnClickListener(this);
        NullI.setOnClickListener(this);
        TextE.setOnClickListener(this);
        VariableE.setOnClickListener(this);
        NullE.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id=view.getId();

        switch (id){
            case R.id.debug_text:
                LogDebug.silfraLogs("Silfra Debug");
                break;

            case R.id.debug_variable:
                String debug=StringD.getText().toString();
                LogDebug.silfraLogs(debug);
                break;

            case R.id.debug_null:
                LogDebug.silfraLogs(null);
                break;

            case R.id.info_text:
                LogInfo.silfraLogs("Silfra Info");
                break;

            case R.id.info_variable:
                String info=StringI.getText().toString();
                LogInfo.silfraLogs(info);
                break;

            case R.id.info_null:
                LogInfo.silfraLogs(null);
                break;

            case R.id.error_text:
                LogError.silfraLogs("Silfra Error");
                break;

            case R.id.error_variable:
                String error=StringE.getText().toString();
                LogError.silfraLogs(error);

                break;

            case R.id.error_null:
                LogError.silfraLogs(null);
                break;
        }
    }
}

