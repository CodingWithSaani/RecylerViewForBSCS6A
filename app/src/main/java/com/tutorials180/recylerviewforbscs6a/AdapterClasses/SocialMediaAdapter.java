package com.tutorials180.recylerviewforbscs6a.AdapterClasses;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tutorials180.recylerviewforbscs6a.ModelClass.SocialMediaModelClass;
import com.tutorials180.recylerviewforbscs6a.R;

import java.util.ArrayList;

public class SocialMediaAdapter extends RecyclerView.Adapter<SocialMediaAdapter.SocialMediaViewHolder>{

    private Context context;
    private ArrayList<SocialMediaModelClass> objectArrayList;

    public SocialMediaAdapter(Context context, ArrayList<SocialMediaModelClass> objectArrayList) {
        this.context = context;
        this.objectArrayList = objectArrayList;
    }

    @NonNull
    @Override
    public SocialMediaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View singleRow= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.single_row,parent,false);
        return new SocialMediaViewHolder(singleRow);
    }

    @Override
    public void onBindViewHolder(@NonNull SocialMediaViewHolder holder, int position) {
        SocialMediaModelClass objectSocialMediaModelClass
                =objectArrayList.get(position);

        holder.contentPicIV.setImageResource(objectSocialMediaModelClass.
                getContentPicReference());

        holder.saveIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "save is clicked", Toast.LENGTH_SHORT).show();
            }
        });


        holder.likeIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "like is clicked", Toast.LENGTH_SHORT).show();
            }
        });

        holder.dislikeIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "WE HATE RV", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return objectArrayList.size();
    }

    public class SocialMediaViewHolder extends RecyclerView.ViewHolder
    {

        ImageView contentPicIV,likeIV,dislikeIV,saveIV;

        public SocialMediaViewHolder(@NonNull View itemView) {
            super(itemView);
            contentPicIV=itemView.findViewById(R.id.singleRow_contentPicIV);
            likeIV=itemView.findViewById(R.id.likeIV);

            dislikeIV=itemView.findViewById(R.id.dislikeIV);
            saveIV=itemView.findViewById(R.id.saveIV);
        }
    }
}
