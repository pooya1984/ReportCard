package com.example.android.reportcard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Pooya on 6/3/2017.
 *
 */

public class WordAdapter extends ArrayAdapter<Word> {

/**
 * Create a new {@link WordAdapter} object.
 * @param context is the current context (i.e. Activity) that the adapter is being created in.
 * @param avrregeMarks is the list of {@link Word}s to be displayed.
 * */

    public WordAdapter(Context context, ArrayList<Word> avrregeMarks) {
        super(context, 0, avrregeMarks);}

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word currentWord = getItem(position);

        TextView matheTextView = (TextView) listItemView.findViewById(R.id.mathemathics);
        matheTextView.setText(currentWord.getMathe());

        TextView asseOneTextView = (TextView) listItemView.findViewById(R.id.Asse_one);
        asseOneTextView.setText(currentWord.getAsseOne());

        TextView asseTwoTextViw = (TextView) listItemView.findViewById(R.id.Asse_two);
        asseTwoTextViw.setText(currentWord.getAsseTwo());

        TextView finalTextView = (TextView) listItemView.findViewById(R.id.finaly);
        finalTextView.setText(currentWord.getFinay());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }


        return listItemView;

    }

}