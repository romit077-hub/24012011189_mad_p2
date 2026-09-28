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

```kotlin
val textView = findViewById<TextView>(R.id.textView)
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

---

## 2. onStart()

Called when the Activity becomes visible to the user.

---

## 3. onResume()

Called when the Activity enters the foreground and becomes interactive.

---

## 4. onPause()

Called when the Activity is partially obscured or is about to lose focus.

---

## 5. onStop()

Called when the Activity is no longer visible.

---

## 6. onRestart()

Called when a stopped Activity is about to start again.

---

## 7. onDestroy()

Called when the Activity is being destroyed.

---

# 🖥️ Log Message in Logcat

The `Log` class is used to print debugging information in Android Studio's **Logcat**.

Example:

```kotlin
Log.i("MainActivity", "onCreate function called.")
```

---

# 🍞 Toast Message

A **Toast** is a small temporary message displayed to the user.

Example:

```kotlin
Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
```

---

# 📢 Snackbar Message

A **Snackbar** displays a brief message at the bottom of the screen.

Example:

```kotlin
Snackbar.make(rootView, message, Snackbar.LENGTH_SHORT).show()
```

---

# 🛠️ Technologies Used

- **Platform:** Android
- **IDE:** Android Studio
- **Language:** Kotlin
- **UI:** XML
- **Layout:** ConstraintLayout
- **Material Components:** Snackbar
- **Debugging:** Logcat

---

# 👨‍💻 Practical Information

**Subject:** Mobile Application Development (MAD)

**Practical:** Activity Life Cycle & Basic UI (MAD Practical 2)

**Enrollment No:** `24012011189`

---

# ✅ Conclusion

This practical successfully demonstrates the **Android Activity Lifecycle** along with basic Android UI development.
