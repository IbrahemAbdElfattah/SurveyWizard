package com.example.iaa.surveywizard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by IAA on 3/7/2018.
 */
public class questionSecondAdapter extends ArrayAdapter<Question> {
    public questionSecondAdapter(Context context, ArrayList<Question> questionses) {
        super(context, 0, questionses);
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.question_list2, parent, false);
        }


        Question currentQuestion;
        currentQuestion = getItem(position);

        TextView textView = (TextView) listItemView.findViewById(R.id.textView3);

        textView.setText(currentQuestion.getmQuestionBody());

        Button button = (Button) listItemView.findViewById(R.id.button);
        Button button2 = (Button) listItemView.findViewById(R.id.button2);


        /*button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyQuestions.questionsList.remove(position);
            }
        });*/



        return listItemView;
    }

}
