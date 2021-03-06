package com.example.matthewkay.inclasslab3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by MatthewKay on 2/15/18.
 */

public class CourseAdapter extends BaseAdapter{
    private Context mContext;
    private LayoutInflater mInflater;
    private ArrayList<Course> mDataSource;


    public CourseAdapter(Context context,ArrayList<Course> courses ){
        mContext = context;
        mDataSource = courses;
        mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);



    }


    @Override
    public int getCount() {
        return mDataSource.size();
    }

    @Override
    public Object getItem(int i) {
        return mDataSource.get(i);

    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View rowview = mInflater.inflate(android.R.layout.simple_expandable_list_item_2, viewGroup);

        TextView courseNumberView = rowview.findViewById(android.R.id.text1);
        TextView courseNameView = rowview.findViewById(android.R.id.text2);

        Course course = (Course) getItem(position);
        courseNumberView.setText(course.getCourseNum());
        courseNameView.setText(course.getCourseName());


        return rowview;
    }
}
