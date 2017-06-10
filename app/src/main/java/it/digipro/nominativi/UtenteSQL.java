package it.digipro.nominativi;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Siem Group Scrl on 06/06/2017.
 */

public class UtenteSQL extends SQLiteOpenHelper {

    String sql = "CREATE TABLE Nominativi, Id INTEGER, Nominativo TEXT, Telefono TEXT";

    public UtenteSQL(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
       db.execSQL("DROP TABLE IF EXISTS Nominativi");
        db.execSQL(sql);
    }
}
