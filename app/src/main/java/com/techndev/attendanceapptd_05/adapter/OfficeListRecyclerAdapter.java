package com.techndev.attendanceapptd_05.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.techndev.attendanceapptd_05.R;
import com.techndev.attendanceapptd_05.activity.OfficeActivity;
import com.techndev.attendanceapptd_05.databinding.OfficeAccessListLayoutBinding;
import com.techndev.attendanceapptd_05.listener.ItemClcikListener;
import com.techndev.attendanceapptd_05.model.OfficeListDataModel;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

public class OfficeListRecyclerAdapter extends RecyclerView.Adapter<OfficeListRecyclerAdapter.ViewHolder> {

    private Context context;
    private List<OfficeListDataModel> dataModel;

    ItemClcikListener clickListener;

    public OfficeListRecyclerAdapter(Context context, List<OfficeListDataModel> dataModel) {
        this.context = context;
        this.dataModel = dataModel;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder((OfficeAccessListLayoutBinding) DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.office_access_list_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String orgName = dataModel.get(position).getOrganizationName();
        String address = String.valueOf(dataModel.get(position).getAddress());



        holder.binding.orgName.setText(orgName);
        holder.binding.orgAddress.setText(address);

    }

    @Override
    public int getItemCount() {
        return dataModel.size();
    }

    public void setItemClickListener(ItemClcikListener itemClickListener) {
        clickListener=itemClickListener;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        OfficeAccessListLayoutBinding binding;
        public ViewHolder(OfficeAccessListLayoutBinding layoutBinding) {
            super(layoutBinding.getRoot());
            binding=layoutBinding;
        }

        @Override
        public void onClick(View view){
            if (clickListener != null) clickListener.onItemClick(getAdapterPosition());

        }


    }
}
