public class MainActivity extends AppCompatActivity {

    private TextView quoteTextView;
    private Button quoteButton;
    private ArrayList<String> quotes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quoteTextView = findViewById(R.id.quote_text_view);
        quoteButton = findViewById(R.id.quote_button);

        quotes = new ArrayList<>();