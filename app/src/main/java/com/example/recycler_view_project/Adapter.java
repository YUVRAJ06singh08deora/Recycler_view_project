package com.example.recycler_view_project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.viewHolder> {

    private List<ModelClass> userList;
    private SelectListner listner;
    public Adapter(List<ModelClass> userList,SelectListner listner) {
        this.userList = userList;
        this.listner=listner;
    }

    @NonNull
    @Override
    public Adapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false);
        return new viewHolder (view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.viewHolder holder, int position) {
        int resource = userList.get(position).getImageUser();
        String name = userList.get(position).getTextView1();
        String msg = userList.get(position).getTextView3();
        String time = userList.get(position).getTextView2();
        String line = userList.get(position).getDivider();

        holder.setData(resource, name, msg, time, line);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listner.onItemClicked(userList.get(position));
            }
        });
    }
    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{


        private ImageView imageView;
        private TextView textView;
        private TextView textView2;
        private TextView textView3;
        private TextView divider;
     private CardView cardView;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.imageUser);
            textView=itemView.findViewById(R.id.name_id);
            textView2=itemView.findViewById(R.id.timeTxt);
            textView3=itemView.findViewById(R.id.messageTxt);
            divider=itemView.findViewById(R.id.dividerLine);
            cardView=itemView.findViewById(R.id.image_view);

        }

        public void setData(int resource, String name, String msg, String time, String line) {
            imageView.setImageResource(resource);
            textView.setText(name);
            textView2.setText(time);
            textView3.setText(msg);
            divider.setText(line);
        }
    }
}
