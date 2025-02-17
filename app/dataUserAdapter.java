import android.content.Context;

public class dataUserAdapter {



    public class DataUserAdapter extends RecyclerView.Adapter<DataUserAdapter.MyViewHolder>  {

        Context context;
        ArrayList<User> userList;
        private FirebaseServices fbs;



        public DataUserAdapter(Context context, ArrayList<DataUser> restList) {
            this.context = context;
            this.userList = restList;
            this.fbs = FirebaseServices.getInstance();
        }



        @NonNull

        public DataUserAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
            View v= LayoutInflater.from(context).inflate(R.layout.user_item,parent,false);
            return  new DataUserAdapter.MyViewHolder(v);
        }


        public void onBindViewHolder(@NonNull MyViewHolder holder, int position)
        {
            DataUser user = userList.get(position);
            holder.tvMusicGenre.setText(user.getMusicGenre());
            holder.tvTaskDays.setText(user.getTaskDays());
        }


        public int getItemCount(){
            return userList.size();
        }

        public static class MyViewHolder extends RecyclerView.ViewHolder{
            TextView tvMusicGenre, tvTaskDays;
            public MyViewHolder(@NonNull View itemView) {
                super(itemView);
                tvMusicGenre=itemView.findViewById(R.id.tvMusicGenreUserItem);
                tvTaskDays=itemView.findViewById(R.id.tvTaskDaysUserItem);

            }
        }
    }

}
