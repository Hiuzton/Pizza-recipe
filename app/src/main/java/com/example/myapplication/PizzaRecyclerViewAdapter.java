package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PizzaRecyclerViewAdapter extends RecyclerView.Adapter<PizzaRecyclerViewAdapter.PizzaRecipeViewHolder> {

    ArrayList<PizzaItem> pizzaItems;
    Context context;

    public PizzaRecyclerViewAdapter(ArrayList<PizzaItem> pizzaItems, Context context) {
        this.pizzaItems = pizzaItems;
        this.context=context;
    }

    class PizzaRecipeViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener{

        public ImageView imageView;
        public TextView  title;
        public TextView description;


        public PizzaRecipeViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            imageView=itemView.findViewById(R.id.imageView);
            title=itemView.findViewById(R.id.textTitle);
            description=itemView.findViewById(R.id.textDescription);

        }

        @Override
        public void onClick(View view) {

            int position=getAdapterPosition();
            PizzaItem pizzaItem=pizzaItems.get(position);

            Intent intent=new Intent(context, RecipeActivity.class);
            intent.putExtra("imageResource", pizzaItem.getImageResource());
            intent.putExtra("title", pizzaItem.getTitle());
            intent.putExtra("description", pizzaItem.getDecription());
            intent.putExtra("recipe", pizzaItem.getRecipe());

            context.startActivity(intent);
        }
    }

    @NonNull
    @Override
    public PizzaRecyclerViewAdapter.PizzaRecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.pizza_items,
                parent, false);
        PizzaRecipeViewHolder pizzaRecipeViewHolder=new PizzaRecipeViewHolder(view);
        return pizzaRecipeViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PizzaRecipeViewHolder holder, int position) {
        PizzaItem pizzaItem=pizzaItems.get(position);

        holder.imageView.setImageResource(pizzaItem.getImageResource());
        holder.title.setText(pizzaItem.getTitle());
        holder.description.setText(pizzaItem.getDecription());
    }

    @Override
    public int getItemCount() {
        return pizzaItems.size();
    }

}
