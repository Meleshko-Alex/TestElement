package edu.testelement;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecViewAdapter extends RecyclerView.Adapter<RecViewAdapter.DataViewHolder>{
    private  ArrayList<Person> data;

    public RecViewAdapter(ArrayList<Person> data) {
        this.data = data;
    }

    public static class DataViewHolder extends RecyclerView.ViewHolder{

        //private ImageView image;
        private TextView tv_name, tv_status, tv_sex;
        private ImageView image;

        public DataViewHolder(View itemView) {
            super(itemView);
            tv_name = (TextView)itemView.findViewById(R.id.name);
            tv_status = (TextView)itemView.findViewById(R.id.status);
            //tv_sex = (TextView)itemView.findViewById(R.id.tv_sex);
            image = (ImageView)itemView.findViewById(R.id.image);
        }
    }


    @Override
    public DataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_item, parent, false);
        DataViewHolder dvh = new DataViewHolder(v);
        return dvh;
    }

    @Override
    public void onBindViewHolder(DataViewHolder holder, int position) {
        holder.tv_name.setText(data.get(position).getName());
        holder.tv_status.setText(data.get(position).getStatus());
        //holder.tv_sex.setText(data.get(position).getSex());
        holder.image.setImageResource(R.mipmap.ic_launcher);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

}

