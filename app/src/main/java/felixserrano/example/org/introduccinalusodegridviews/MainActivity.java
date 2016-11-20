package felixserrano.example.org.introduccinalusodegridviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private TextView seleccion;

    private static final String[] items = {"En",
            "un", "lugar", "de", "la", "Mancha", "de", "cuyo", "nombre", "no", "quiero", "acordarme", "no",
            "ha", "mucho", "tiempo", "que", "vivía", "un", "hidalgo", "de", "los", "de", "lanza", "en",
            "astillero", "adarga", "antigua", "rocín", "flaco", "y", "galgo", "corredor" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seleccion = (TextView)findViewById(R.id.seleccion);
        GridView gridView = (GridView)findViewById(R.id.grid);
        gridView.setAdapter(new ArrayAdapter<String>(this,R.layout.celda,items));
        gridView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        seleccion.setText(items[i]);
    }
}
