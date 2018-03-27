package strbac.bojan.customlist;

import android.content.Context;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import strbac.bojan.customlist.R;

/**
 * Created by student on 27.3.2018.
 */

public class CharacterAdapter extends BaseAdapter{

    private Context mContext;
    private ArrayList<Model> mCharacters;

    public CharacterAdapter(Context context) {
        mContext = context;
        mCharacters = new ArrayList<Model>();
    }

    public void AddCharacter(Model model) {
        mCharacters.add(model);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mCharacters.size();
    }

    @Override
    public Object getItem(int position) {
        Object rv = null;
        try {
            rv = mCharacters.get(position);
        }catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        return rv;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //View view = convertView;

        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.row_item, null);
            ViewHolder holder = new ViewHolder();
            holder.image = (ImageView) convertView.findViewById(R.id.picure1_id);
            holder.name = (TextView) convertView.findViewById(R.id.text1_id);
            convertView.setTag(holder);
        }

        Model model = (Model) getItem(position);
        ViewHolder holder = (ViewHolder) convertView.getTag();
        //ANDROID KLASE SU DONJE DVE
        holder.image.setImageDrawable(model.mImage);
        holder.name.setText(model.mName);

        return convertView;
    }

    private class ViewHolder {
        public ImageView image = null;
        public TextView name = null;
    }

}
