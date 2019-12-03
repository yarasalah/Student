package com.example.studentassigment;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.stdview>  {

    Context context ;
    List<Student> std ;

    public StudentAdapter(Context context  , List<Student> std) {
        this.context = context;
        this.std = std;
    }

    @NonNull
    @Override
    public stdview onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_row_student ,parent , false );
        return new stdview(view);
    }

    @Override
    public void onBindViewHolder(@NonNull stdview holder, int position) {
        holder.setData(std.get(position));
    }

    @Override
    public int getItemCount() {
        return std.size();
    }




    class stdview extends RecyclerView.ViewHolder{

        TextView std_id , std_name  , std_level,std_avg;
        public stdview(@NonNull View itemView) {
            super(itemView);
            std_id = itemView.findViewById(R.id.std_id);
            std_name = itemView.findViewById(R.id.std_name);
            std_level = itemView.findViewById(R.id.std_level);
            std_avg = itemView.findViewById(R.id.std_avg);

        }

        public void setData(final Student std) {
            std_id.setText(std.getId());
            std_name.setText(std.getName());
            std_level.setText(std.getLevel());
            std_avg.setText(std.getAvg());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
//                    Toast.makeText(context, std.getId(), Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(itemView.getContext() ,Activity_Student.class);
                    intent.putExtra("ID",std.getId());
                    intent.putExtra("Name",std.getName());
                    intent.putExtra("Level",std.getLevel());
                    intent.putExtra("Average",std.getAvg());
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}

