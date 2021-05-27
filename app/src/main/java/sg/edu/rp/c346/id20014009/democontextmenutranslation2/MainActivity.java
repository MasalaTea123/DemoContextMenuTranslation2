package sg.edu.rp.c346.id20014009.democontextmenutranslation2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView textViewTranslatedText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        textViewTranslatedText=findViewById(R.id.textViewTranslatedText);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registerForContextMenu(textViewTranslatedText);
    }

    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        getMenuInflater().inflate(R.menu.menu_main, menu);


    }
    public boolean onContextItemSelected(MenuItem item) {
        int id=item.getItemId();
            if (id==R.id.EnglishSelection) { //check whether the selected menu item ID is 0
                //code for action
                textViewTranslatedText.setText("Hello");
                return true; //menu item successfully handled
            } else if (id==R.id.italianSelection) { //check if the selected menu item ID is 1
                //code for action
                textViewTranslatedText.setText("Ciao");
                return true;  //menu item successfully handled
            }


            if (id==R.id.EnglishSelection)){ //check whether the selected menu item ID is 0
            //code for action
            textViewTranslatedText.setText("Bye");
            return true; //menu item successfully handled
        
            } else if (id==R.id.italianSelection) { //check if the selected menu item ID is 1
                //code for action
                textViewTranslatedText.setText("Addio");
                return true;  //menu item successfully handled
            }


        return super.onContextItemSelected(item); //pass menu item to the superclass implementation
    }


}