package io.github.yashxd.gaitondeapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

// Adapter :
public class GAdapter extends RecyclerView.Adapter<GViewHolder> {
    List<GModel> hitList;

    public GAdapter(List<GModel> hitList) {
        this.hitList = hitList;
    }

    @NonNull
    @Override
    public GViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        // view_g => name of the layout file
        View view = inflater.inflate(R.layout.view_g, parent, false);
        GViewHolder holder = new GViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull GViewHolder holder, int position) {
        GModel badGuy = hitList.get(position);
        holder.populate(badGuy);
    }

    @Override
    public int getItemCount() {
        return hitList.size();
    }
}
