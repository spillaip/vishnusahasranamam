package com.vaishnavism.vishnusahasranaamam.tamil;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: MainActivity */
class VcAdapter extends BaseAdapter {
    Context context;
    ArrayList<SingleRow> list = new ArrayList<>();

    VcAdapter(Context c) {
        this.context = c;
        String[] pasuram_en = c.getResources().getStringArray(R.array.srivishnusahasranaamam);
        int[] imgs = {R.drawable.bhagavan, R.drawable.om1, R.drawable.bhagavan, R.drawable.om2, R.drawable.vyas, R.drawable.bhagavan, R.drawable.om3, R.drawable.om1, R.drawable.bhagavan, R.drawable.vaishampaayana, R.drawable.ydhuistira, R.drawable.ydhuistira, R.drawable.bheeshma, R.drawable.bheeshma, R.drawable.bheeshma, R.drawable.bheeshma, R.drawable.bheeshma, R.drawable.bheeshma, R.drawable.bheeshma, R.drawable.bheeshma, R.drawable.bheeshma, R.drawable.bheeshma, R.drawable.bheeshma, R.drawable.bheeshma, R.drawable.bheeshma, R.drawable.bheeshma, R.drawable.bheeshma, R.drawable.bheeshma, R.drawable.om1, R.drawable.bhagavan, R.drawable.bhagavan, R.drawable.bhagavan, R.drawable.bhagavan, R.drawable.bhagavan, R.drawable.bhagavan, R.drawable.om2, R.drawable.p01, R.drawable.p02, R.drawable.p03, R.drawable.p04, R.drawable.p05, R.drawable.p06, R.drawable.p07, R.drawable.p08, R.drawable.p09, R.drawable.p10, R.drawable.p11, R.drawable.p12, R.drawable.p13, R.drawable.p14, R.drawable.p15, R.drawable.p16, R.drawable.p17, R.drawable.p18, R.drawable.p19, R.drawable.p20, R.drawable.p21, R.drawable.p22, R.drawable.p23, R.drawable.p24, R.drawable.p25, R.drawable.p26, R.drawable.p27, R.drawable.p28, R.drawable.p29, R.drawable.p30, R.drawable.p31, R.drawable.p32, R.drawable.p33, R.drawable.p34, R.drawable.p35, R.drawable.p36, R.drawable.p37, R.drawable.p38, R.drawable.p39, R.drawable.p40, R.drawable.p41, R.drawable.p42, R.drawable.p43, R.drawable.p04, R.drawable.p45, R.drawable.p01, R.drawable.p02, R.drawable.p03, R.drawable.p04, R.drawable.p05, R.drawable.p06, R.drawable.p07, R.drawable.p08, R.drawable.p09, R.drawable.p10, R.drawable.p11, R.drawable.p12, R.drawable.p13, R.drawable.p14, R.drawable.p15, R.drawable.p16, R.drawable.p17, R.drawable.p18, R.drawable.p19, R.drawable.p20, R.drawable.p21, R.drawable.p22, R.drawable.p23, R.drawable.p24, R.drawable.p25, R.drawable.p26, R.drawable.p27, R.drawable.p28, R.drawable.p29, R.drawable.p30, R.drawable.p31, R.drawable.p32, R.drawable.p33, R.drawable.p34, R.drawable.p35, R.drawable.p36, R.drawable.p37, R.drawable.p38, R.drawable.p39, R.drawable.p40, R.drawable.p41, R.drawable.p42, R.drawable.p43, R.drawable.p04, R.drawable.p45, R.drawable.p01, R.drawable.p02, R.drawable.p03, R.drawable.p04, R.drawable.p05, R.drawable.p06, R.drawable.p07, R.drawable.p08, R.drawable.p09, R.drawable.p10, R.drawable.p11, R.drawable.p12, R.drawable.p13, R.drawable.p14, R.drawable.p15, R.drawable.p16, R.drawable.p17, R.drawable.p18, R.drawable.om1, R.drawable.om2, R.drawable.om3, R.drawable.om1, R.drawable.om2, R.drawable.om3, R.drawable.om1, R.drawable.om2, R.drawable.om3, R.drawable.om1, R.drawable.om2, R.drawable.om3, R.drawable.om1, R.drawable.om2, R.drawable.om3, R.drawable.om1, R.drawable.om2, R.drawable.om3, R.drawable.om1, R.drawable.om2, R.drawable.om3, R.drawable.om1, R.drawable.om2, R.drawable.om3, R.drawable.om1, R.drawable.arjuna, R.drawable.bhagavan, R.drawable.vyas, R.drawable.vyas, R.drawable.parvati, R.drawable.shiva, R.drawable.brahma, R.drawable.om2, R.drawable.sanjaya, R.drawable.bhagavan, R.drawable.bhagavan, R.drawable.bhagavan, R.drawable.om1, R.drawable.ic_launcher};
        for (int i = 0; i < pasuram_en.length; i++) {
            this.list.add(new SingleRow(pasuram_en[i], imgs[i]));
        }
    }

    public int getCount() {
        return this.list.size();
    }

    public Object getItem(int i) {
        return this.list.get(i);
    }

    public long getItemId(int i) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View row = ((LayoutInflater) this.context.getSystemService("layout_inflater")).inflate(R.layout.single_row, viewGroup, false);
        ImageView img = (ImageView) row.findViewById(R.id.imageView1);
        SingleRow temp = (SingleRow) this.list.get(i);
        ((TextView) row.findViewById(R.id.textView1)).setText(temp.pasuram);
        img.setImageResource(temp.img);
        return row;
    }
}
