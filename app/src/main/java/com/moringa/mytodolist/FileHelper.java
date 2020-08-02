package com.moringa.mytodolist;

import android.content.Context;

import java.io.FileOutputStream;
import java.util.ArrayList;

public class FileHelper {

    public static final String FILENAME = "listinfo.dat";

    public static void writeData(ArrayList<String> items, Context context) {

        FileOutputStream fos = context.openFileOutput(FILENAME, Context.MODE_PRIVATE);
    }
}
