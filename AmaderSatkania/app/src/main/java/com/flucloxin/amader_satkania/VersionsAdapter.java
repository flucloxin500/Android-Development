package com.flucloxin.amader_satkania;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class VersionsAdapter extends RecyclerView.Adapter<VersionsAdapter.VersionVH> {

    List<Versions> versionsList;

    public VersionsAdapter(List<Versions> versionsList) {
        this.versionsList = versionsList;
    }

    @NonNull
    @Override
    public VersionVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);
        return new VersionVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VersionVH holder, int position) {


        Versions versions = versionsList.get(position);
        holder.codetxt.setText(versions.getCodeName());
        holder.versiontxt.setText(versions.getVersion());

        boolean isExpandable = versionsList.get(position).isExpandable();
        holder.expandable.setVisibility(isExpandable? View.VISIBLE: View.GONE);

    }

    @Override
    public int getItemCount() {
        return versionsList.size();
    }

    public class VersionVH extends RecyclerView.ViewHolder {

        TextView codetxt,versiontxt;
        LinearLayout lLayout;
        RelativeLayout expandable;

        public VersionVH(@NonNull View itemView) {
            super(itemView);
            codetxt = itemView.findViewById(R.id.code);
            versiontxt = itemView.findViewById(R.id.version);

            lLayout = itemView.findViewById(R.id.lLayout);
            expandable = itemView.findViewById(R.id.expandable);


            lLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Versions versions = versionsList.get(getAdapterPosition());
                    versions.setExpandable(!versions.isExpandable());
                    notifyItemChanged(getAdapterPosition());

                }
            });

        }
    }
}
