package strbac.bojan.customlist;

import android.graphics.drawable.Drawable;

/**
 * Created by student on 27.3.2018.
 */

public class Model {
    public Drawable mImage;
    public String mName;

    public Model( String mName, Drawable mImage) {
        this.mImage = mImage;
        this.mName = mName;
    }

    public Drawable getmImage() {
        return mImage;
    }

    public String getmName() {
        return mName;
    }

    public void setmImage(Drawable mImage) {
        this.mImage = mImage;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }
}
