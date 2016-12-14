package edu.testelement;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class PageFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private static final String ARG_DATA = "data";
    private TextView tv_sex;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.list_item, container, false);

        tv_sex = (TextView)v.findViewById(R.id.tv_sex);
        ArrayList<Person> data = (ArrayList<Person>) getArguments().get(ARG_DATA);
        tv_sex.setText(data.get(0).getSex());

        mRecyclerView = (RecyclerView)v.findViewById(R.id.rv);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(llm);
        RecViewAdapter adapter = new RecViewAdapter(data);
        //ViewAdapter adapter = new ViewAdapter((ArrayList<Person>) getArguments().get(ARG_DATA));
        mRecyclerView.setAdapter(adapter);
        return v;
    }

    public static PageFragment newInstance (ArrayList<Person> data){
        PageFragment fragment = new PageFragment();
        Bundle b = new Bundle();
        b.putSerializable(ARG_DATA, data);
        fragment.setArguments(b);
        return fragment;
    }

    /*public static class DataViewHolder extends RecyclerView.ViewHolder{

        //private ImageView image;
        private TextView tv_name, tv_status;
        private ImageView image;

        public DataViewHolder(View itemView) {
            super(itemView);
            tv_name = (TextView)itemView.findViewById(R.id.name);
            tv_status = (TextView)itemView.findViewById(R.id.status);
            image = (ImageView)itemView.findViewById(R.id.image);
        }
    }

    public class ViewAdapter  extends RecyclerView.Adapter<DataViewHolder>{
        private  ArrayList<Person> data;

        public ViewAdapter(ArrayList<Person> data) {
            this.data = data;
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
            holder.image.setImageResource(R.mipmap.ic_launcher);
        }

        @Override
        public int getItemCount() {
            return 2;
        }

    }*/
}
