package com.example.dependency;

import android.util.Log;

public class functionality {
        public static final String TAG = "Liberary App";

        public functionality() {
        }

        public functionality(String str) {
            Log.e(TAG, str);
            Log.e(TAG, "Successful");
            Log.e(TAG, "Successful build 2");
            Log.e(TAG, "Successful build 3");
            Log.e(TAG, "Successful build 4");

        }
}
