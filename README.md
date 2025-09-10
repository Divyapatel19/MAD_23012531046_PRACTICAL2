Practical 2: Activity Life Cycle Demonstration

AIM:Create an Android Application to demonstrate functions of **Activity Life Cycle** and Basic UI.

This Android application demonstrates the Activity Life Cycle by showing how different lifecycle methods (onCreate(), onStart(), onResume(), onPause(), onStop(), and onDestroy()) are invoked when the activity changes states. The app also includes a basic UI with elements such as TextView, Button, and Toast messages to display the current lifecycle state to the user. This helps beginners understand how Android manages activity transitions and how to design apps that respond correctly to state changes.

## 📱 Screenshots & Descriptions  

| Screenshot 1 | Screenshot 2 |
|--------------|--------------|
| <img width="390" height="888" alt="image" src="https://github.com/user-attachments/assets/904389f6-ae03-46da-8bfd-a7fa07742b87" /> | <img width="390" height="888" alt="image" src="https://github.com/user-attachments/assets/ee7ed3bf-4ff4-4160-866e-ded7582a378f" /> |
| Activity resumed – `onResume()` called | Activity started – `onStart()` called |

| Screenshot 3 |
|--------------|
| <img width="390" height="888" alt="image" src="https://github.com/user-attachments/assets/4fdff725-112a-433e-94bc-f93c96aef282" /> | 
| Activity restarted – `onRestart()` followed by `onResume()` | 

| Screenshot | Description |
|------------|-------------|
| <img width="390" height="888" alt="image" src="https://github.com/user-attachments/assets/efda2809-5c9f-4063-8953-64dd9e839e61" /> | Logcat showing activity life cycle method calls sequence |





## ⚙️ Activity Life Cycle Methods

| Method       | Purpose |
|--------------|---------|
| `onCreate()` | Called when activity is first created. Initialize UI components here. |
| `onStart()`  | Activity is becoming visible to the user. |
| `onResume()` | Activity is now in the foreground and the user can interact with it. |
| `onPause()`  | Activity is partially hidden; another activity is in the foreground. |
| `onStop()`   | Activity is no longer visible to the user. |
| `onRestart()`| Called after `onStop()`, before starting again. |
| `onDestroy()`| Activity is destroyed and removed from memory. |



