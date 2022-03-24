package com.example.pro;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    DatabaseHelper myDb;
    EditText editName,editSurname,editMarks,editTextId;
    Button add,viewall,delete,update;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDb=new DatabaseHelper(this);
        editName=(EditText) findViewById(R.id.e1);
        editSurname=(EditText) findViewById(R.id.e2);
        editMarks=(EditText) findViewById(R.id.e3);
        editTextId=(EditText) findViewById(R.id.e4);
        add=(Button) findViewById(R.id.button);
        viewall=(Button) findViewById(R.id.button2);
        delete=(Button) findViewById(R.id.button4);
        update=(Button) findViewById(R.id.button3);
        AddData();
        viewalldata();
        deletedata();
        updatedata();
    }

    private void updatedata() {
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isUpdate = myDb.updatedata(editTextId.getText().toString(),editName.getText().toString(),editSurname.getText().toString(),editMarks.getText().toString());
                if(isUpdate==true)
                    Toast.makeText(MainActivity.this,"Data Updated",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(MainActivity.this,"Data Not Updated",Toast.LENGTH_LONG).show();

            }
        });
    }

    private void deletedata() {
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer deleteRows = myDb.deletedata(editTextId.getText().toString());
                if(deleteRows>0)
                    Toast.makeText(MainActivity.this,"Data Deleted",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(MainActivity.this,"Data Not Deleted",Toast.LENGTH_LONG).show();

            }
        });
    }

    private void viewalldata() {
        viewall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor res=myDb.getAllData();
                if(res.getCount()==0)
                {
                    //show msg
                    showMessage("Error","Nothing found");
                    return;


                }
                StringBuffer b=new StringBuffer();
                while(res.moveToNext()){
                    b.append("Id:"+res.getString(0)+"\n");
                    b.append("Name:"+res.getString(1)+"\n");
                    b.append("Surname:"+res.getString(2)+"\n");
                    b.append("Marks:"+res.getString(3)+"\n");



                }
                showMessage("Data",b.toString());

            }
        });
    }

    private void showMessage(String title, String message) {

        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }

    private void AddData() {
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isInserted=myDb.insertData(editName.getText().toString(),editSurname.getText().toString(),editMarks.getText().toString());
                if(isInserted==true)
                {
                    Toast.makeText(MainActivity.this,"Data inserted",Toast.LENGTH_LONG).show();

                }
                else
                    Toast.makeText(MainActivity.this,"Data not inserted",Toast.LENGTH_LONG).show();

            }
        });

    }
}