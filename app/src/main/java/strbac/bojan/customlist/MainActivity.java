package strbac.bojan.customlist;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CharacterAdapter adapter = new CharacterAdapter(this);
        adapter.AddCharacter(new Model(("BOJAN"),getResources().getDrawable(R.drawable.eric_cartman)));

        ListView list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);
    }

}
