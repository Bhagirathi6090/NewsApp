package com.example.bhagi.newsapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomArrayAdapter extends ArrayAdapter<News> {

    public CustomArrayAdapter(Context context, ArrayList<News> news) {
        super(context, 0, news);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        News news = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        TextView sectionTextView = convertView.findViewById(R.id.section_name_txt);
        sectionTextView.setText(news.getSectionName());

        TextView titleView = convertView.findViewById(R.id.title_txt);
        titleView.setText(news.getWebTitle());

        TextView publishDate = convertView.findViewById(R.id.date_txt);
        publishDate.setText(news.getWebPublicationDate());

        TextView authorTextView = convertView.findViewById(R.id.author_name_txt);
        authorTextView.setText(news.getAuthorName());

        return convertView;
    }

}
