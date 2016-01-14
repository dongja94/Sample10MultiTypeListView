package com.example.dongja94.samplemultitypelistview;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by dongja94 on 2016-01-14.
 */
public class DateView extends FrameLayout {
    public DateView(Context context) {
        super(context);
        init();
    }

    ImageView iconView;
    TextView messageView;
    DateData data;
    private void init() {
        inflate(getContext(), R.layout.view_date, this);
        messageView = (TextView)findViewById(R.id.text_message);
    }

    public void setData(DateData data) {
        this.data = data;
        messageView.setText(data.message);
    }
}
