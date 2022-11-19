package com.example.studentregistration;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;

public class MyHelper extends SQLiteOpenHelper {

   public  MyHelper(Context PageName,String DatabaseName,SQLiteDatabase.CursorFactory PageCursor,int DBVersion)
   {
       super(PageName,DatabaseName,PageCursor,DBVersion);
   }

@Override
    public void onCreate(SQLiteDatabase db)
{
    db.execSQL("create table studata(stname varchar(50),usn varchar(50),email varchar(50),phone varchar(10),dept varchar(30),pswd varchar(15));");
}

@Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){
       db.execSQL("drop table if exists studata");
       onCreate(db);
}




}
