package com.company.myapp.adapter;

import android.view.View;
import android.widget.TextView;

import com.company.myapp.R;
import com.ghy.baseapp.base.AbsAdapterItem;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by GHY on 2016/5/10.
 */
public class ListView1Adapter extends AbsAdapterItem<String> {
    @Override
    public int getItemLayout() {
        return R.layout.item_list_view_test1;
    }

    @Override
    public void init(View contentView) {

        ButterKnife.bind(this,contentView);

    }

    @Bind(R.id.item_tv_test1)
    TextView itemTvTest1;

    @Override
    public void bindData(String s) {
        itemTvTest1.setText(s);
    }

}
