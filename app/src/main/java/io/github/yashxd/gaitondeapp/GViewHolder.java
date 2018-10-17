package io.github.yashxd.gaitondeapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class GViewHolder extends RecyclerView.ViewHolder {

    private TextView nameTv;
    private TextView deathTypeTv;

    public GViewHolder(View itemView) {
        super(itemView);
        nameTv = itemView.findViewById(R.id.tv_name);
        deathTypeTv = itemView.findViewById(R.id.tv_death_type);
    }

    public void populate(GModel badGuy) {
        nameTv.setText(badGuy.getPersonName());
        deathTypeTv.setText(badGuy.getDeathType());
    }
}
