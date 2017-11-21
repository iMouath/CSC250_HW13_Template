package com.example.awesomefat.csc250_hw13_template;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Screen2 extends AppCompatActivity
{
    int[] ar;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_screen2);
        //String theName = this.getIntent().getStringExtra("myName");

        ar = this.getIntent().getIntArrayExtra("myAR");
//        sortArray(ar);
        Arrays.sort(ar); //faster obviously
        ViewGroup theVLL = (ViewGroup)this.findViewById(R.id.theVerticalLinearLayout);

        for(int i = 0; i < ar.length; i++)
        {
            TextView tv = new TextView(this);
            tv.setText("" + ar[i]);
            theVLL.addView(tv);
        }
    }
    private void sortArray(int[] ar){
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < ar.length - j; i++) {
                if (ar[i] > ar[i + 1]) {
                    tmp = ar[i];
                    ar[i] = ar[i + 1];
                    ar[i + 1] = tmp;
                    swapped = true;
                }
            }
        }

    }
}
