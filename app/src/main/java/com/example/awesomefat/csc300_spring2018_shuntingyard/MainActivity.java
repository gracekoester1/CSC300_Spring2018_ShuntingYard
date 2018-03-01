package com.example.awesomefat.csc300_spring2018_shuntingyard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);2

        //"10+3-2" -> turn into a queue of NumNodes and OpNodes
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue('+');
        q.enqueue(3);
        System.out.println(q.dequeue() instanceof NumNode);
        System.out.println(q.dequeue() instanceof OpNode);
        System.out.println(q.dequeue() instanceof OpNode);
    }



    private String removeSpaces(String s)
    {
        String answer = "";
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) != ' ')
            {
                answer = answer + s.charAt(i);
            }
        }
        return answer;
    }

    private void testQ()
    {
        while(!this.q.isEmpty())
        {
            Node n = this.q.dequeue();
            if(n instanceof NumNode)
            {
                NumNode temp = (NumNode)n;
                System.out.println(temp.getPayload());
            }
            else
            {
                OpNode temp = (OpNode)n;
                System.out.println(temp.getPayload());
            }
        }
    }

    private void parseString(String s)
    {
        String currNumber = "";
        String digits = "0123456789";
        for(int i = 0; i < s.length(); i++)
        {
            if(digits.indexOf(s.charAt(i)) != -1)
            {
                currNumber = currNumber + s.charAt(i);

            }
            else
            {
                if (this.q.enqueue = 0)
                {
                    this.q.enqueue(Integer.parseInt(currNumber));
                }
                else
                {
                    String ind = this.q.enqueue;
                    if (ind.charAt(currNumber) = digits)
                    {
                        this.polishET.setText("" + currNumber);
                    }
                    else if (ind == '+' || ind == '-')
                    {
                        if (currNumber == '/' || currNumber == 'x')
                        {
                            this.polishET.setText("" +currNumber);
                        }
                    }
                    else if (ind == 'x' || '/')
                    {
                        if (currNumber == '+' || currNumber == '-')
                        {
                            this.polishET.setText("" +currNumber);
                    }
                    else
                    {
                        if (ind == currNumber)
                        {
                            this.polishET.setText("" + currNumber);
                            currNumber = currNumber+1;
                        }
                    }

                    }
                }

                currNumber = "";
                this.q.enqueue(s.charAt(i));
            }
        }
        this.q.enqueue(Integer.parseInt(currNumber));
        this.testQ();


    }





    public void onClickMeButtonPressed(View v)
    {
        EditText inputET = (EditText)this.findViewById(R.id.inputET);
        String valueWithoutSpaces = this.removeSpaces(inputET.getText().toString());
        this.parseStringTok(inputET.getText().toString());
    }





}
