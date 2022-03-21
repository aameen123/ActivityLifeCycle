package com.example.activitylifecycle;

import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContriesAdaptor extends RecyclerView.Adapter<ContriesAdaptor.ContriesVH>
{
    public static String TAG=ContriesAdaptor.class.getSimpleName();
    String[] mCountries;
    public ContriesAdaptor(String [] Countries)
    {
        mCountries=Countries;
    }

    @NonNull
    @Override
    public ContriesVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.i(TAG,"aamir ahmed is buying a  row plank from market");//9
    View row_plank= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_plank,parent,false);
        return new ContriesVH(row_plank);
    }

    @Override
    public int getItemCount() {
        Log.i(TAG,"abhijeet counting the no of items in the data");//9
        return mCountries.length;
    }
    @Override
    public void onBindViewHolder(@NonNull ContriesVH holder, int position) {
        Log.i(TAG,"akshat jain is writing on a row plank");//9
        holder.tvRow.setText(mCountries[position]);
    }
    public class ContriesVH  extends RecyclerView.ViewHolder{
        TextView tvRow;
        public ContriesVH(@NonNull View itemView) {
            super(itemView);
            Log.i(TAG,"ameen receive a row plank in box");//9
            tvRow = itemView.findViewById(R.id.tvRow);//12a
        }
    }
}
