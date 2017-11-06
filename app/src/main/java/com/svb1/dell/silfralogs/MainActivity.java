package com.svb1.dell.silfralogs;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.svb1.dell.silfralogging.LogDebug.logDebug;
import static com.svb1.dell.silfralogging.LogError.logError;
import static com.svb1.dell.silfralogging.LogInfo.logInfo;

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
                logDebug("Silfra Debug");
                break;

            case R.id.debug_variable:
                String debug=StringD.getText().toString();
                logDebug(debug);
                break;

            case R.id.debug_null:
                logDebug(null);
                break;

            case R.id.info_text:
                logInfo("Silfra Info");
                break;

            case R.id.info_variable:
                String info=StringI.getText().toString();
                logInfo(info);
                break;

            case R.id.info_null:
                logInfo(null);
                break;

            case R.id.error_text:
                logError("Silfra Error");
                break;

            case R.id.error_variable:
                String error=StringE.getText().toString();
                logError(error);
                break;

            case R.id.error_null:
                logError(null);
                break;
        }
    }
}

