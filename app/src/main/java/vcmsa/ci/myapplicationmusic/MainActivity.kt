package vcmsa.ci.myapplicationmusic

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    // Declarations
    private lateinit var songTitle: ArrayList<String>
    private lateinit var artistName: ArrayList<String>
    private lateinit var ratingList: ArrayList<Int>
    private lateinit var commentList: ArrayList<String>

    private lateinit var etTitle: EditText
    private lateinit var etArtist: EditText
    private lateinit var etRating: EditText
    private lateinit var etComment: EditText
    private lateinit var btnAdd: Button
    private lateinit var btnView: Button
    private lateinit var btnExit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        songTitle = intent.getStringArrayListExtra("songTitle") ?: arrayListOf()
        artistName = intent.getStringArrayListExtra("artistName") ?: arrayListOf()
        ratingList = intent.getIntegerArrayListExtra("rating") ?: arrayListOf()
        commentList = intent.getStringArrayListExtra("comment") ?: arrayListOf()

        etTitle = findViewById(R.id.etTitle)
        etArtist = findViewById(R.id.etArtist)
        etRating = findViewById(R.id.etRating)
        etComment = findViewById(R.id.etComment)

        btnAdd = findViewById(R.id.btnAdd)
        btnView = findViewById(R.id.btnView)
        btnExit = findViewById(R.id.btnExit)

        btnAdd.setOnClickListener {
            val title = etTitle.text.toString().trim()
            val artist = etArtist.text.toString().trim()
            val rating = etRating.text.toString().toIntOrNull() ?: 0
            val comment = etComment.text.toString().trim()

            if (title.isNotEmpty() && artist.isNotEmpty() && rating in 1..5) {
                songTitle.add(title)
                artistName.add(artist)
                ratingList.add(rating)
                commentList.add(comment)
                Toast.makeText(this, "✅ Song added!", Toast.LENGTH_SHORT).show()
                // Input fields are NOT cleared here
            } else {
                Toast.makeText(this, "⚠ Please fill all fields correctly (Rating 1-5).", Toast.LENGTH_SHORT).show()
            }
        }

        btnExit.setOnClickListener {
            finishAffinity()
            exitProcess(0)
        }

        btnView.setOnClickListener {
            val intent = Intent(this, DetailedViewScreen::class.java)
            intent.putStringArrayListExtra("songTitle", songTitle)
            intent.putStringArrayListExtra("artistName", artistName)
            intent.putIntegerArrayListExtra("rating", ratingList)
            intent.putStringArrayListExtra("comment", commentList)
            startActivity(intent)
        }
    }
}
