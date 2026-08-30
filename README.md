# Android Activity Life Cycle & Basic UI

## Practical: Activity Life Cycle and Basic UI Demonstration

### 🎯 AIM

Create an Android application to demonstrate the **functions of Activity Life Cycle** and **Basic User Interface (UI)**.

The application displays **"Hello World"** in a `TextView` positioned at the center of the Activity screen. The Activity demonstrates Android Activity Lifecycle methods using:

- Log messages
- Toast messages
- Snackbar messages

All Activity Lifecycle methods are printed in **Logcat**.

---

# 📱 Application Overview

This practical demonstrates the basic concepts of Android UI development and the **Activity Lifecycle**.

The main Activity contains a centered `TextView` with the following properties:

| Property | Value |
|---|---|
| Text | `Hello World` |
| Background | Yellow |
| Text Color | Holo Blue Bright |
| Text Size | `27sp` |
| Text Style | Bold + Italic |
| Alignment | Center |
| Layout | ConstraintLayout |

---

# 🎨 UI Design

The Activity screen uses a yellow background:

```xml
android:background="#FFFF00"
```

The `TextView` is configured with:

```xml
android:text="Hello World"
android:textColor="@android:color/holo_blue_bright"
android:textSize="27sp"
android:textStyle="bold|italic"
```

The `TextView` is positioned in the center of the Activity using **ConstraintLayout**.

---

# 🧩 Basic UI Components

## TextView

`TextView` is an Android UI component used to display text to the user.

Example:

```xml
<TextView
    android:id="@+id/textView"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Hello World"
    android:textColor="@android:color/holo_blue_bright"
    android:textSize="27sp"
    android:textStyle="bold|italic" />
```

---

# 🆔 Generating an ID

Every UI component that needs to be accessed from Java/Kotlin code should have a unique ID.

Example:

```xml
android:id="@+id/textView"
```

The `@+id/` syntax creates a new resource ID.

The TextView can then be accessed from code using:

```java
TextView textView = findViewById(R.id.textView);
```

---

# 📐 ConstraintLayout

`ConstraintLayout` is used as the root layout for positioning UI elements.

It allows views to be positioned relative to:

- Parent layout
- Other views
- Guidelines

Example:

```xml
<androidx.constraintlayout.widget.ConstraintLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#FFFF00">
```

The TextView can be centered using constraints:

```xml
app:layout_constraintTop_toTopOf="parent"
app:layout_constraintBottom_toBottomOf="parent"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintEnd_toEndOf="parent"
```

---

# 🔄 Activity Life Cycle

An Android Activity has a defined lifecycle controlled by the Android operating system.

The major lifecycle methods are:

```text
onCreate()
    ↓
onStart()
    ↓
onResume()
    ↓
  Running
    ↓
onPause()
    ↓
onStop()
    ↓
onDestroy()
```

If the stopped Activity becomes active again:

```text
onRestart()
    ↓
onStart()
    ↓
onResume()
```

---

# 📌 Activity Lifecycle Methods

## 1. onCreate()

Called when the Activity is first created.

Typical tasks include:

- Setting the layout
- Initializing UI components
- Initializing variables

Example:

```java
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    setContentView(R.layout.activity_main);

    Log.d("ActivityLifecycle", "onCreate");
}
```

---

## 2. onStart()

Called when the Activity becomes visible to the user.

```java
@Override
protected void onStart() {
    super.onStart();

    Log.d("ActivityLifecycle", "onStart");
}
```

---

## 3. onResume()

Called when the Activity enters the foreground and becomes interactive.

```java
@Override
protected void onResume() {
    super.onResume();

    Log.d("ActivityLifecycle", "onResume");
}
```

---

## 4. onPause()

Called when the Activity is partially obscured or is about to lose focus.

```java
@Override
protected void onPause() {
    super.onPause();

    Log.d("ActivityLifecycle", "onPause");
}
```

---

## 5. onStop()

Called when the Activity is no longer visible.

```java
@Override
protected void onStop() {
    super.onStop();

    Log.d("ActivityLifecycle", "onStop");
}
```

---

## 6. onRestart()

Called when a stopped Activity is about to start again.

```java
@Override
protected void onRestart() {
    super.onRestart();

    Log.d("ActivityLifecycle", "onRestart");
}
```

---

## 7. onDestroy()

Called when the Activity is being destroyed.

```java
@Override
protected void onDestroy() {
    super.onDestroy();

    Log.d("ActivityLifecycle", "onDestroy");
}
```

---

# 📝 Complete Lifecycle Logging Example

The lifecycle methods can be overridden to print messages in Logcat:

```java
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Log.d("ActivityLifecycle", "onCreate");
}

@Override
protected void onStart() {
    super.onStart();

    Log.d("ActivityLifecycle", "onStart");
}

@Override
protected void onResume() {
    super.onResume();

    Log.d("ActivityLifecycle", "onResume");
}

@Override
protected void onPause() {
    super.onPause();

    Log.d("ActivityLifecycle", "onPause");
}

@Override
protected void onStop() {
    super.onStop();

    Log.d("ActivityLifecycle", "onStop");
}

@Override
protected void onRestart() {
    super.onRestart();

    Log.d("ActivityLifecycle", "onRestart");
}

@Override
protected void onDestroy() {
    super.onDestroy();

    Log.d("ActivityLifecycle", "onDestroy");
}
```

---

# 🖥️ Log Message in Logcat

The `Log` class is used to print debugging information in Android Studio's **Logcat**.

Example:

```java
Log.d("ActivityLifecycle", "onCreate");
```

Where:

- `Log.d()` → Debug-level log
- `"ActivityLifecycle"` → Tag
- `"onCreate"` → Message

Typical output:

```text
ActivityLifecycle: onCreate
ActivityLifecycle: onStart
ActivityLifecycle: onResume
```

When the Activity is stopped, additional lifecycle methods can appear:

```text
ActivityLifecycle: onPause
ActivityLifecycle: onStop
```

---

# 🍞 Toast Message

A **Toast** is a small temporary message displayed to the user.

Example:

```java
Toast.makeText(
        this,
        "Activity Started",
        Toast.LENGTH_SHORT
).show();
```

Toast messages are useful for providing short feedback without interrupting the user's interaction.

---

# 📢 Snackbar Message

A **Snackbar** displays a brief message at the bottom of the screen.

Example:

```java
Snackbar.make(
        findViewById(android.R.id.content),
        "Activity Resumed",
        Snackbar.LENGTH_SHORT
).show();
```

Required import:

```java
import com.google.android.material.snackbar.Snackbar;
```

Unlike a Toast, a Snackbar is generally associated with a particular UI view and can also provide an optional action.

---

# 🔬 Demonstrating Lifecycle with Messages

The Activity can demonstrate lifecycle events using different messages.

For example:

```java
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Log.d("ActivityLifecycle", "onCreate");

    Toast.makeText(
            this,
            "onCreate Called",
            Toast.LENGTH_SHORT
    ).show();
}
```

Another lifecycle method:

```java
@Override
protected void onResume() {
    super.onResume();

    Log.d("ActivityLifecycle", "onResume");

    Snackbar.make(
            findViewById(android.R.id.content),
            "onResume Called",
            Snackbar.LENGTH_SHORT
    ).show();
}
```

---

# 🔁 Typical Lifecycle Flow

### When the application is launched:

```text
onCreate()
   ↓
onStart()
   ↓
onResume()
```

### When another Activity/dialog comes in front:

```text
onPause()
```

### When the Activity becomes completely hidden:

```text
onStop()
```

### When returning to the Activity:

```text
onRestart()
   ↓
onStart()
   ↓
onResume()
```

### When the Activity is destroyed:

```text
onDestroy()
```

> The exact lifecycle sequence can vary depending on what the user does and how Android manages the Activity.

---

# 📚 Study Topics

This practical covers:

- TextView
- TextView properties
- Toast Message
- Snackbar Message
- Android built-in resources
- Activity Lifecycle
- Log messages
- Logcat
- ConstraintLayout
- ConstraintLayout properties
- Generating IDs for UI components
- Basic Android UI development

---

# 🛠️ Technologies Used

- **Platform:** Android
- **IDE:** Android Studio
- **Language:** Java / Kotlin
- **UI:** XML
- **Layout:** ConstraintLayout
- **Material Components:** Snackbar
- **Debugging:** Logcat

---

# 📂 Suggested Project Structure

```text
ActivityLifecycleDemo/
│
├── app/
│   └── src/
│       └── main/
│           ├── java/
│           │   └── .../
│           │       └── MainActivity.java
│           │
│           ├── res/
│           │   ├── drawable/
│           │   ├── layout/
│           │   │   └── activity_main.xml
│           │   └── values/
│           │
│           └── AndroidManifest.xml
│
└── README.md
```

---

# ▶️ How to Run

### 1. Open the Project

Open the project in **Android Studio**.

### 2. Sync Gradle

Allow Android Studio to finish Gradle synchronization.

### 3. Start an Emulator or Connect a Device

You can use:

- Android Emulator
- Physical Android device

### 4. Run the Application

Click:

```text
Run ▶
```

and select the target device.

---

# 🔍 Viewing Lifecycle Logs

To view the lifecycle messages:

1. Run the application.
2. Open **Logcat** in Android Studio.
3. Search for:

```text
ActivityLifecycle
```

4. Observe lifecycle methods such as:

```text
onCreate
onStart
onResume
onPause
onStop
onRestart
onDestroy
```

---

# 🧪 Expected Output

The application should display:

```text
┌──────────────────────────────────┐
│                                  │
│                                  │
│          Hello World             │
│                                  │
│                                  │
└──────────────────────────────────┘
```

The screen should have:

- 🟨 Yellow background
- 🔵 Holo Blue Bright text
- **27sp** text size
- **Bold + Italic** text
- Centered TextView

Lifecycle events should appear in Android Studio **Logcat**.

Toast and Snackbar messages should also appear during the corresponding lifecycle events.

---

# 🎓 Learning Outcomes

After completing this practical, we understand:

- How to create a basic Android UI
- How to use `TextView`
- How to modify TextView properties
- How to create and use view IDs
- How to use `ConstraintLayout`
- How Android Activity Lifecycle works
- The purpose of `onCreate()`
- The purpose of `onStart()`
- The purpose of `onResume()`
- The purpose of `onPause()`
- The purpose of `onStop()`
- The purpose of `onRestart()`
- The purpose of `onDestroy()`
- How to generate Log messages
- How to monitor lifecycle events using Logcat
- How to display Toast messages
- How to display Snackbar messages
- How Android built-in resources can be used

---

# 📸 Screenshots

Add screenshots of your completed practical here.

### Application UI

```text
Add your application screenshot here
```

### Logcat

```text
Add your Logcat screenshot here
```

### Snackbar

```text
Add your Snackbar screenshot here
```

### Toast

```text
Add your Toast screenshot here
```

---

# 📖 References

- **Android TextView Documentation:**  
  https://developer.android.com/guide/topics/ui/look-and-feel/autosizing-textview

- **Android Activity Lifecycle:**  
  https://developer.android.com/guide/components/activities/activity-lifecycle

- **Android Logcat:**  
  https://developer.android.com/studio/debug/am-logcat

- **Android Toast Messages:**  
  https://developer.android.com/guide/topics/ui/notifiers/toasts

- **Android Snackbar:**  
  https://developer.android.com/training/snackbar/showing

---

# 👨‍💻 Practical Information

**Subject:** Mobile Application Development (MAD)

**Practical:** Activity Life Cycle & Basic UI

**University:** Ganpat University

**Project Type:** Android Application

---

# ✅ Conclusion

This practical successfully demonstrates the **Android Activity Lifecycle** along with basic Android UI development.

A `TextView` is created and styled according to the given requirements, while Activity Lifecycle methods are monitored through **Logcat**. **Toast** and **Snackbar** messages are also used to demonstrate user feedback during Activity lifecycle events.

This practical provides a foundation for understanding how Android Activities are created, displayed, paused, stopped, restarted, and destroyed.
