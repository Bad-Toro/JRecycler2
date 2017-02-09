package com.mobileappscompany.training.recycler2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ferna on 2/9/2017.
 */

public class ClientAdapter extends RecyclerView.Adapter<ClientAdapter.ClientVH> {
    private List<Client> mClients;


    public class ClientVH extends RecyclerView.ViewHolder{
        public TextView cName;
        public TextView cPhone;

        public ClientVH(View itemView) {
            super(itemView);
            cName = (TextView) itemView.findViewById(R.id.tvN);
            cPhone = (TextView) itemView.findViewById(R.id.tvPh);
        }
    }

    public ClientAdapter(List<Client> mClients) {
        this.mClients = mClients;
    }

    @Override
    public ClientVH onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.client_item, parent, false);
        return new ClientVH(v);
    }

    @Override
    public void onBindViewHolder(ClientVH holder, int position) {
        Client thisC = mClients.get(position);

        holder.cName.setText(thisC.getName());
        holder.cPhone.setText(thisC.getPhone());

    }

    @Override
    public int getItemCount() {
        return mClients.size();
    }


}
