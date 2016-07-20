package thegenuinegourav.jsonparser;

import android.widget.TextView;
import java.util.ArrayList;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;


public class CelebsAdapter extends ArrayAdapter<Celebs> {
    ArrayList<Celebs> actorList;
    LayoutInflater vi;
    int Resource;
    ViewHolder holder;

    public CelebsAdapter(Context context, int resource, ArrayList<Celebs> objects) {
        super(context, resource, objects);
        vi = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        Resource = resource;
        actorList = objects;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        if (v == null) {
            holder = new ViewHolder();
            v = vi.inflate(Resource, null);
            holder.name = (TextView) v.findViewById(R.id.tvName);
            holder.followers = (TextView) v.findViewById(R.id.followers);
            holder.profession = (TextView) v.findViewById(R.id.profession);
            v.setTag(holder);
        } else {
            holder = (ViewHolder) v.getTag();
        }

        holder.name.setText(actorList.get(position).getName());
        holder.followers.setText("Followers: " + actorList.get(position).getfollowers());
        holder.profession.setText("Profession:  " + actorList.get(position).getprofession());
        return v;

    }

    static class ViewHolder {
        public TextView name;
        public TextView followers;
        public TextView profession;
    }

}
