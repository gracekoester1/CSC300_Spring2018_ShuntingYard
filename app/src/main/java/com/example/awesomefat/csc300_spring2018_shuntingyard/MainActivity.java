package com.example.awesomefat.csc300_spring2018_shuntingyard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //"10+3-2" -> turn into a queue of NumNodes and OpNodes
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue('+');
        q.enqueue(3);
        System.out.println(q.dequeue() instanceof NumNode);
        System.out.println(q.dequeue() instanceof OpNode);
        System.out.println(q.dequeue() instanceof OpNode);
    }



    public int detect()
    {

        int num;
        String temp = "";
        String q = q.getText().toString();
        for(int i = 0; i < q.length(); i++)
        {
            if(i == char)
            {
                this.charBox.setText(i);
            }
            else if(i == int)

            {
           this.intBox.setText(i);
             }

             catch(Exception e)
            {
                Toast.makeText(this, e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
            }

    }

}
