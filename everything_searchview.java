//Everything for SearchView in Java

//Supported SearchView Library
import android.widget.SearchView;

//Global
public static SearchView searchView;

//Initialization
searchView = findViewById(R.id.searchView);

//SearchView hint
searchView.setQueryHint("Google Search");

//SearchView smooth expand collapse animation
int id = searchView.getContext().getResources().getIdentifier("android:id/search_src_text", null, null);
TextView searchText = (TextView) searchView.findViewById(id);
Typeface myCustomFont = Typeface.createFromAsset(getAssets(),"font/montserrat_medium.ttf");
searchText.setTypeface(myCustomFont);
final int searchBarId = searchView.getContext().getResources().getIdentifier("android:id/search_bar", null, null);  // Remove this line
LinearLayout searchBar = (LinearLayout) searchView.findViewById(searchBarId);
searchBar.setLayoutTransition(new LayoutTransition());

//SearchView width match_parent
searchView.setMaxWidth( Integer.MAX_VALUE );

//Change color of underline in SearchView
View v = searchView.findViewById(search_plate);
v.setBackgroundColor(Color.parseColor("#000000"));
