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

public class WordAdapter extends ArrayAdapter<ReportCard> {

/**
 * Create a new {@link WordAdapter} object.
 * @param context is the current context (i.e. Activity) that the adapter is being created in.
 * @param avrrageMarks is the list of {@link ReportCard}s to be displayed.
 * */

    public WordAdapter(Context context, ArrayList<ReportCard> avrrageMarks) {
        super(context, 0, avrrageMarks);}

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        ReportCard currentWord = getItem(position);

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