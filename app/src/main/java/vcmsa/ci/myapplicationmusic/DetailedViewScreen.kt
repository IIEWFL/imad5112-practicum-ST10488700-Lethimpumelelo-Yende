package vcmsa.ci.myapplicationmusic

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailedViewScreen : AppCompatActivity() {

    private lateinit var btnBack: Button
    private lateinit var btnList: Button
    private lateinit var btnAverage: Button
    private lateinit var tvOutput: TextView

    private lateinit var songTitle: ArrayList<String>
    private lateinit var artistName: ArrayList<String>
    private lateinit var ratingList: ArrayList<Int>
    private lateinit var commentList: ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_detailed_view_screen)

        // Link UI elements
        btnBack = findViewById(R.id.btnBack)
        btnList = findViewById(R.id.btnList)
        btnAverage = findViewById(R.id.btnAverage)
        tvOutput = findViewById(R.id.tvOutput)

        // Get data from intent
        songTitle = intent.getStringArrayListExtra("songTitle") ?: arrayListOf()
        artistName = intent.getStringArrayListExtra("artistName") ?: arrayListOf()
        ratingList = intent.getIntegerArrayListExtra("rating") ?: arrayListOf()
        commentList = intent.getStringArrayListExtra("comment") ?: arrayListOf()

        // Handle system bar insets (optional UI polish)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Back to main screen
        btnBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        setContentView(R.layout.activity_detailed_view_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}