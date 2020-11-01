package com.pam.recyclerviewkontak_2500;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class KontakAdapter extends RecyclerView.Adapter<KontakAdapter.ListViewHolder> {

    private ArrayList<Kontak> listKontak;

    public KontakAdapter(ArrayList<Kontak> listKontak){
        this.listKontak = listKontak;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Kontak kontak = listKontak.get(position);

        holder.txtNama.setText(kontak.getNama());
        holder.txtNo_kontak.setText(kontak.getNo_kontak());
    }

    @Override
    public int getItemCount() {
        return listKontak.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView txtNama;
        TextView txtNo_kontak;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNama = itemView.findViewById(R.id.txtNama);
            txtNo_kontak = itemView.findViewById(R.id.txtNo);
        }
    }
}
