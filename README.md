IMAD5122 PRACTICUM Project Overview
This Android app allows users to create and manage a simple music playlist. Users can input songs with details like title, artist, rating (1-5), and comments. The app supports viewing the full list of songs and calculating the average rating.
Features
- Add songs with title, artist, rating, and comments.
- Input validation ensuring rating is between 1 and 5.
- View detailed list of songs.
- Calculate and display average rating.
- Navigation between main input screen and detailed view screen.
- Simple, user-friendly interface.
Installation and Setup
1. Open the project in Android Studio.
2. Build the project.
3. Run the app on an emulator or a connected Android device running API level 21 or above.
Usage Instructions
1. On the main screen, fill in song details and click **Add** to save the song.
2. Use the **View** button to navigate to the detailed screen.
3. On the detailed screen:
   - Click **List** to display all songs.
   - Click **Average** to display the average rating of all songs.
   - Click **Back** to return to the main screen.
Code Details
- **MainActivity.kt**: Handles song input, validation, and passes song data to the detailed screen.
- **DetailedViewScreen.kt**: Displays song list and calculates average ratings.
- **Layouts**:
  - `activity_main.xml` for main screen UI.
  - `activity_detailed_view_screen.xml` for detailed view UI.
 
  - 🎵 App Name: Music Playlist Manager
This Android app helps users build and manage a custom list of their favorite songs. Each song entry includes:
- Title
- Artist
- Rating (1 to 5)
- Personal Comment

Users can:
- Add multiple songs.
- View all songs and their details.
- Calculate the average rating of their playlist.
🖥️ Screen 1: Main Screen (MainActivity)
🔹 Purpose:
The main screen is where users input song details.
🔹 UI Elements:
- EditText fields:
  - etTitle: Song title
  - etArtist: Artist name
  - etRating: Numeric rating (1–5)
  - etComment: Comment or personal note

- Buttons:
  - btnAdd: Adds the song to the list
  - btnView: Navigates to the detail screen
  - btnExit: Closes the app
🔹 Functionality:
- The user fills in the song details.
- Clicking Add will:
  - Validate the fields (especially rating must be between 1 and 5).
  - Add the song to 4 parallel ArrayLists.
- Clicking View sends all arrays via Intent to the next screen.
- Exit button shuts down the app.
📄 Screen 2: Detailed View Screen (DetailedViewScreen)
🔹 Purpose:
Displays all added songs and calculates the average rating.
🔹 UI Elements:
- TextView:
  - tvOutput: Used to display song details or average rating

- Buttons:
  - btnList: Lists all added songs with their details
  - btnAverage: Calculates and displays the average rating
  - btnBack: Navigates back to the main screen
🔹 Functionality:
- List Button:
  - Loops through the arrays and prints each song’s details in a formatted block.
- Average Button:
  - Calculates the average from ratingList and shows a message like:
    ⭐ Average Rating: 4.25/5
- Back Button:
  - Returns the user to the MainActivity screen.
🔁 How Data Flows:
All input data is stored in parallel ArrayLists.
These lists are passed from MainActivity to DetailedViewScreen using Intents:
- putStringArrayListExtra() for strings
- putIntegerArrayListExtra() for ratings


PICTURES
![image](https://github.com/user-attachments/assets/6bfe52cc-26c2-467d-9ebb-7990dcf5cac7)
![image](https://github.com/user-attachments/assets/bfe5a81a-214f-435b-afa1-f71fd04dafc5)
![image](https://github.com/user-attachments/assets/285b84c5-2327-41e3-93ef-c364063caf02)
![image](https://github.com/user-attachments/assets/2ce5304a-a591-4177-ac36-cb0808629a91)
![image](https://github.com/user-attachments/assets/ad0839ef-a45c-424f-bbf2-3e566432b2d8)
![image](https://github.com/user-attachments/assets/15e0c026-9e16-4809-a020-7a0cbceb5766)

gitHub Link:https://github.com/IIEWFL/imad5112-practicum-ST10488700-Lethimpumelelo-Yende.git

code attributions
//CODE ATTRIBUTION
//THIS METHOD WAS TAKEN FROM
//https://www.geeksforgeeks.org/creating-multiple-screen-applications-in-android/
// GEEKSFORGEEKS

//CODE ATTRIBUTTION
//THIS METHOD WAS TAKEN FROM
//https://blog.poespas.me/posts/2024/05/31/handling-screens-in-android-kotlin/
//UNKNOWNN ARTHOR

//CODE ATTRIBUTIONS
//THIS METHOD WAS TAKEN FROM
//https://www.kodeco.com/android/paths/multiscreen-app
//UNKNOWN ARTHOR

//CODE ATTRIBUTIONS
//THIS METHOD WAS TAKEN FROM
//https://developer.android.com/courses/unit/kotlin-basics-unit-1
//UNKNOWN ARTHOR







